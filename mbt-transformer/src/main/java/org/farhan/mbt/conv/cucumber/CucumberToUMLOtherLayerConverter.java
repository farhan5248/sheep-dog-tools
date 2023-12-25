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
		String qualifiedName = convertAbsolutePathToQualifiedName(aCucumberJavaFile.getFile().getAbsolutePath());
		Class layerClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
		return layerClass;
	}

	@Override
	protected void convertToImports(Class layerClass) throws Exception {
		if (aCucumberJavaFile.javaClass.getTypes().size() > 0) {
			// Wrap this in CommentFactory.getComment. getComment should do nothing if the
			// content is empty
			Optional<Comment> comment = aCucumberJavaFile.javaClass.getType(0).getComment();
			if (comment.isPresent()) {
				CommentFactory.getComment(layerClass, comment.get().getContent());
			}

			for (ImportDeclaration i : aCucumberJavaFile.javaClass.getImports()) {
				String anImportName = convertImportNameToQualifiedName(i.getNameAsString());
				ElementImport ei = ElementImportFactory.getElementImport(layerClass, anImportName);
			}
		}
	}

	@Override
	protected void convertToBehaviours(Class layerClass) throws Exception {
		for (MethodDeclaration md : aCucumberJavaFile.javaClass.getType(0).getMethods()) {
			Interaction anInteraction = InteractionFactory.getInteraction(layerClass, md.getNameAsString(), true);

			// Wrap this in CommentFactory.getComment. getComment should do nothing if the
			// content is empty
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

	@Override
	protected void convertToInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {
		for (Object o : steps) {
			Statement s = (Statement) o;
			if (s.getChildNodes().get(0) instanceof MethodCallExpr) {
				MethodCallExpr mce = (MethodCallExpr) s.getChildNodes().get(0);
				convertToMessage(anInteraction, mce);
			}
		}
	}

	@Override
	protected void convertToMessage(Interaction anInteraction, Object o) {
		MethodCallExpr mce = (MethodCallExpr) o;
		Class owningClass = (Class) anInteraction.getOwner();
		// get the factory class
		String importAlias = mce.getChildNodes().getFirst().getChildNodes().getFirst().toString();
		// get the factory class import statement
		ElementImport classImport = ElementImportFactory.getElementImportByAlias(owningClass, importAlias);
		// get the full name
		String qualifiedName = classImport.getImportedElement().getQualifiedName();
		// get the class from the next layer
		Class importedClass = ClassFactory.getClass(UMLProject.theSystem, qualifiedName);
		Message theMessage = MessageFactory.getMessage(anInteraction, importedClass, mce.getName().asString());
		mce.getArguments();
		for (Expression e : mce.getArguments()) {
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
				// TODO throw an exception to find new expressions
				arg = e.asNameExpr().getNameAsString();
			}
			// when reading java source, the name of the arguments isn't known so I use the
			// value as the name
			ArgumentFactory.getArgument(theMessage, arg, arg, true);
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
		String qualifiedName = importName.replace(".", "::");
		if (qualifiedName.startsWith("org::farhan::")) {
			return qualifiedName.replace("org::farhan::", "pst::");
		} else {
			return "pst::" + qualifiedName;
		}
	}
}
