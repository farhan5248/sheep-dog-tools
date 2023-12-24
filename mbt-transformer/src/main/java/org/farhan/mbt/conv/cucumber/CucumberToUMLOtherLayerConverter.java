package org.farhan.mbt.conv.cucumber;

import java.util.Collection;
import java.util.Optional;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.farhan.mbt.conv.core.ConvertibleFile;
import org.farhan.mbt.conv.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.conv.uml.AnnotationFactory;
import org.farhan.mbt.conv.uml.ArgumentFactory;
import org.farhan.mbt.conv.uml.ClassFactory;
import org.farhan.mbt.conv.uml.CommentFactory;
import org.farhan.mbt.conv.uml.ElementImportFactory;
import org.farhan.mbt.conv.uml.InteractionFactory;
import org.farhan.mbt.conv.uml.MessageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLProject;

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

public class CucumberToUMLOtherLayerConverter extends ToUMLOtherLayerConverter {

	private CucumberJavaFile aCucumberJavaFile;

	@Override
	protected Class convertToClass(ConvertibleFile layerFile) throws Exception {
		aCucumberJavaFile = (CucumberJavaFile) layerFile;
		aCucumberJavaFile.read();
		String qualifiedName = convertAbsolutePathToQualifiedName(aCucumberJavaFile.getFile().getAbsolutePath());
		Class layerClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
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
				String anImportName = convertImportNameToQualifiedName(i.getNameAsString());
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
					AnnotationFactory.getAnnotation(anInteraction, md.getAnnotation(0).toString());
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
			qualifiedName = "pst::common::BusinessProcessModelTasks";
		}
		// TODO, the Factory classes shouldn't need theSystem passed to each method,
		// they should interact with the project collection managing methods directly
		Class importedClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
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
			ArgumentFactory.getArgument(theMessage, arg, "", true);

		}
	}

	@Override
	protected String convertQualifiedNameToAbsolutePath(String qualifiedName) {
		return CucumberNameConverter.convertQualifiedNameToJavaPath(qualifiedName);
	}

	@Override
	protected String convertAbsolutePathToQualifiedName(String pathName) {
		return CucumberNameConverter.convertJavaPathToQualifiedName(pathName);
	}

	@Override
	protected String convertQualifiedNameToImportName(String qualifiedName) {
		return qualifiedName.replace("pst::", "org::farhan::").replace("::", ".");
	}

	@Override
	protected String convertImportNameToQualifiedName(String importName) {
		return importName.replace(".", "::").replace("org::farhan::", "pst::");
	}
}
