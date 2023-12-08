package org.farhan.validation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.farhan.validation.uml.ArgumentFactory;
import org.farhan.validation.uml.ClassFactory;
import org.farhan.validation.uml.CommentFactory;
import org.farhan.validation.uml.ElementImportFactory;
import org.farhan.validation.uml.InteractionFactory;
import org.farhan.validation.uml.MessageFactory;
import org.farhan.validation.uml.PackageFactory;
import org.farhan.validation.uml.ParameterFactory;
import org.farhan.validation.uml.UMLStuffDoer;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.expr.BinaryExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.stmt.Statement;

public class OtherLayerConverter extends LayerConverter {

	private JavaFile aCucumberJavaFile;

	public OtherLayerConverter(Model theSystem) {
		this.theSystem = theSystem;
	}

	@Override
	public final ArrayList<File> selectLayerFiles(String layer) {
		ArrayList<File> layerFiles = new ArrayList<File>();
		Package upperLayerPackage = PackageFactory.getPackageRecursively(theSystem,
				"pst::Logical::" + layer);
		if (upperLayerPackage != null) {
			// get all classes from previous layer
			ArrayList<Class> upperLayerClasses = PackageFactory.getPackagedClasses(upperLayerPackage);
			// get all imported classes referenced in previous layer
			HashMap<String, Class> importedClasses = new HashMap<String, Class>();
			for (Class c : upperLayerClasses) {
				for (ElementImport ei : c.getElementImports()) {
					Class importedClass = (Class) ei.getImportedElement();
					importedClasses.put(importedClass.getName(), importedClass);
				}
			}
			// Loop through imported classes and get file paths of files
			for (Class c : importedClasses.values()) {

				if (!c.getQualifiedName().contains("::io::cucumber::") && !c.getQualifiedName().contains("::common::")
						&& !c.getQualifiedName().contains("::libraries::")) {
					layerFiles.add(new File(convertClassQualifiedNameToPath(c.getQualifiedName())));
				}
			}
		}

		return layerFiles;
	}

	@Override
	protected File getLayerDir() {
		return UMLStuffDoer.javaDir;
	}

	@Override
	protected String getLayerFileType() {
		return ".java";
	}

	@Override
	protected Class convertToClass(File aFile) throws Exception {
		aCucumberJavaFile = new JavaFile(aFile);
		aCucumberJavaFile.readFile();
		String qualifiedName = convertPathToClassQualifiedName(aFile.getAbsolutePath());
		Class layerClass = ClassFactory.getClass(theSystem, qualifiedName);
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
		if (aCucumberJavaFile.javaClass.getTypes().size() > 0) {
			Optional<Comment> comment = aCucumberJavaFile.javaClass.getType(0).getComment();
			if (comment.isPresent()) {
				CommentFactory.getComment(layerClass, comment.get().getContent());
			}
			for (ImportDeclaration i : aCucumberJavaFile.javaClass.getImports()) {
				String anImportName = convertImportToClassQualifiedName(i.getNameAsString());
				ElementImportFactory.getElementImport(layerClass, anImportName);
			}
		}
	}

	@Override
	protected void convertToAttributes(Class layerClass) throws Exception {
		// There are no Java attributes
	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {
		if (aCucumberJavaFile.javaClass.getTypes().size() > 0) {
			for (MethodDeclaration md : aCucumberJavaFile.javaClass.getType(0).getMethods()) {
				Interaction anInteraction = InteractionFactory.getInteraction(layerClass, md.getNameAsString(), true);

				String body;
				if (md.getJavadocComment().isPresent()) {
					body = md.getJavadocComment().get().getContent().replace(" * ", "");
				} else {
					body = "";
				}
				anInteraction.createOwnedComment().setBody(body);
				if (md.getAnnotations().size() > 0) {
					anInteraction.createEAnnotation(md.getAnnotation(0).toString());
				}
				for (Parameter p : md.getParameters()) {
					ParameterFactory.getParameter(anInteraction, p.getNameAsString(), "", "in");
				}
				convertToInteractionMessages(anInteraction, md.getBody().get().getStatements());
			}
		}
	}

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {
		for (Object o : steps) {
			Statement s = (Statement) o;
			if (s.getChildNodes().get(0) instanceof MethodCallExpr) {
				MethodCallExpr mce = (MethodCallExpr) s.getChildNodes().get(0);
				convertToMessage(anInteraction, mce);
			} else {
				// TODO handle VariableDeclarationExpr for List<List<String>> data =
				// dataTable.asLists(String.class);
			}
		}
	}

	@Override
	protected void convertToMessage(Interaction anInteraction, Object o) {
		MethodCallExpr mce = (MethodCallExpr) o;
		Class owningClass = (Class) anInteraction.getOwner();
		String importAlias = mce.getChildNodes().get(0).toString();
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importAlias);
		String qualifiedName;
		if (classImport != null) {
			qualifiedName = classImport.getImportedElement().getQualifiedName();
		} else {
			// TODO this is a temp hack for displayKeyword in layer 2
			qualifiedName = "pst::Logical::common::BusinessProcessModelTasks";
		}
		Class importedClass = ClassFactory.getClass(theSystem, qualifiedName);
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, mce.getName().asString());
		for (Expression e : mce.getArguments()) {
			// TODO make tests for these
			String arg = "";
			if (e instanceof NameExpr) {
				arg = e.asNameExpr().getNameAsString();
			} else if (e instanceof StringLiteralExpr) {
				arg = "\"" + e.asStringLiteralExpr().asString().replace("\"", "\\\"") + "\"";
			} else if (e instanceof BinaryExpr) {
				arg = e.asBinaryExpr().toString();
			} else if (e instanceof ObjectCreationExpr) {
				arg = e.asObjectCreationExpr().toString();
			} else if (e instanceof MethodCallExpr) {
				arg = e.asMethodCallExpr().toString();
			} else {
				// This is done purposely so that I can discover new expressions
				arg = e.asNameExpr().getNameAsString();
			}
			ArgumentFactory.getArgument(theMessage, arg, arg);

		}
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		return UMLStuffDoer.convertQualifiedNameToJavaPath(qualifiedName);
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		return UMLStuffDoer.convertJavaPathToQualifiedName(pathName);
	}

	@Override
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		return qualifiedName.replace("pst::Logical::", "").replace("::", ".");
	}

	@Override
	protected String convertImportToClassQualifiedName(String importName) {
		return importName.replace(".", "::").replace("", "pst::Logical::");
	}

}