package org.farhan.validation;

import java.io.File;
import java.util.ArrayList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.validation.uml.UMLStuffDoer;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.utils.SourceRoot;

public class JavaFile {

	File aFile;
	SourceRoot javaSrcDir;
	public CompilationUnit javaClass;
	ClassOrInterfaceDeclaration javaClassType;

	public JavaFile(File aFile) {
		this.aFile = aFile;
		javaSrcDir = new SourceRoot(UMLStuffDoer.javaDir.toPath());
		javaClass = new CompilationUnit();
		javaClassType = new ClassOrInterfaceDeclaration();
	}

	public static String getName(String qualifiedName) {
		return Utilities.regexFind("(.*::)?([^:]+)", qualifiedName, 2);
	}

	public static String getOtherLayerAppName(String qualifiedName) {
		String packageName = Utilities.regexFind("pst::Logical::components::([^:]+)", qualifiedName, 1,
				"UnknownApplication");
		// This name is in lower case but we need the upper case version so let's get it
		// from the class name
		String className = getName(qualifiedName);
		// Now strip out anything that isn't part of the app name
		String appName = className.substring(0, packageName.length());
		return appName;
	}

	public void convertFromUMLPSTClass(Class aClass) throws Exception {

		javaClass.setStorage(aFile.toPath());
		javaSrcDir.add(javaClass);
		javaClass.addType(javaClassType);
		javaClassType.setName(UMLStuffDoer.getJavaClassName(aClass.getName()));
		javaClassType.setPublic(true);
		if (aClass.getQualifiedName().contains("::subsystems::")) {
			javaClassType.addExtendedType("BusinessProcessModelTasks");
		} else if (aClass.getQualifiedName().contains("::components::")) {
			// TODO This should be done in the Java PST. Robot doesn't have inheritance so
			// its PST doesn't capture this. Fix it later.
			javaClassType.addExtendedType(getOtherLayerAppName(aClass.getQualifiedName()));
		}
		// Set the package name
		String pathName = UMLStuffDoer.convertQualifiedNameToJavaPath(aClass.getQualifiedName());
		pathName = pathName.replace(UMLStuffDoer.javaDir.getAbsolutePath() + File.separator, "");
		pathName = pathName.replace(File.separator, ".");
		pathName = pathName.replaceAll("." + UMLStuffDoer.getJavaClassName(aClass.getName()) + ".java$", "")
				.toLowerCase();
		javaClass.setPackageDeclaration(pathName);
		convertFromUMLPSTComments(aClass);
		convertFromUMLPSTImports(aClass);
		convertFromUMLPSTBehaviors(aClass);
		javaSrcDir.saveAll(UMLStuffDoer.getSecondLayerDir().toPath());
	}

	private void convertFromUMLPSTBehaviors(Class aClass) throws Exception {
		for (Behavior aBehavior : aClass.getOwnedBehaviors()) {

			if (aBehavior instanceof Interaction) {
				Interaction anInteraction = (Interaction) aBehavior;
				// TODO This if statement is a temp hack until I handle inheritance in the model
				if (!anInteraction.getName().endsWith("Attributes")) {
					convertFromUMLPSTInteraction(anInteraction);
				}
			}
		}
	}

	private void convertFromUMLPSTInteraction(Interaction anInteraction) throws Exception {

		Class aClass = (Class) anInteraction.getOwner();
		MethodDeclaration aMethod = javaClassType.addMethod(getMethodName(anInteraction.getName(), true),
				Keyword.PUBLIC);
		if (aClass.getQualifiedName().contains("::subsystems::")) {
			// Annotations
			if (!anInteraction.getEAnnotations().isEmpty()) {
				String annotationBody = anInteraction.getEAnnotations().get(0).getSource();
				// Strip out the non-body and then put the quotes back
				annotationBody = "\"" + annotationBody.replace("@Given(\"", "").replace("\")", "") + "\"";
				aMethod.addSingleMemberAnnotation("Given", annotationBody);
			}
		} else {
			// second layer can't be static for reflection API to work
			aMethod.setStatic(true);
		}
		// Parameters
		if (anInteraction.getName().endsWith("AsFollows")) {
			aMethod.addParameter("DataTable", "dataTable");
		} else {
			for (String p : getParameters(anInteraction)) {
				if (p.contentEquals("keyMap")) {
					aMethod.addParameter("HashMap<String, String>", Utilities.toLowerCamelCase(p));
				} else {
					aMethod.addParameter("String", Utilities.toLowerCamelCase(p));
				}
			}
		}

		convertFromUMLPSTInteractionComments(anInteraction, aMethod);

		convertFromUMLPSTInteractionMessages(anInteraction, aMethod);
	}

	private void convertFromUMLPSTInteractionMessages(Interaction anInteraction, MethodDeclaration aMethod)
			throws Exception {
		Class aClass = (Class) anInteraction.getOwner();
		BlockStmt body = aMethod.createBody();
		if (anInteraction.getMessages().size() == 0) {
			body.addStatement("throw new PendingException();");
		} else {

			for (Message m : anInteraction.getMessages()) {

				String step = ";";
				Interaction keyword = (Interaction) m.getSignature();
				String resource;
				if (keyword != null) {
					// for layer 2
					resource = ((Class) keyword.getOwner()).getName();
				} else {
					// for layer 3
					resource = getOtherLayerAppName(aClass.getQualifiedName());
				}
				step = resource + "." + getMethodName(m.getName(), true);
				step += "(";
				for (ValueSpecification vs : m.getArguments()) {
					LiteralString ls = (LiteralString) vs;
					step += ls.getValue() + ", ";
				}
				step = Utilities.removeLastComma(step);
				step += ");";
				body.addStatement(step);
			}
		}
	}

	private void convertFromUMLPSTInteractionComments(Interaction anInteraction, MethodDeclaration aMethod) {
		if (anInteraction.getOwnedComments().size() > 0) {
			String comment = getComment(anInteraction.getOwnedComments().get(0));
			if (!comment.isEmpty()) {
				aMethod.setJavadocComment(comment);
			}
		}
	}

	private void convertFromUMLPSTImports(Class aClass) {
		// add cucumber imports for second layer
		if (aClass.getQualifiedName().contains("::subsystems::")) {
			// TODO the UML model should create these
			javaClass.addImport("io.cucumber.java.en.Given");
			javaClass.addImport("io.cucumber.java.PendingException");
			javaClass.addImport("io.cucumber.datatable.DataTable");
			javaClass.addImport("common.BusinessProcessModelTasks");
		} else if (aClass.getQualifiedName().contains("::components::")) {
			javaClass.addImport("java.util.HashMap");
			javaClass.addImport("io.cucumber.java.PendingException");
			javaClass.addImport("common." + getOtherLayerAppName(aClass.getQualifiedName()));
		}

		for (ElementImport ei : aClass.getElementImports()) {
			// TODO Don't import libraries, there really shouldn't be any at this point when
			// converting
			if (!ei.getImportedElement().getQualifiedName().contains("::libraries::")) {
				javaClass.addImport(UMLStuffDoer.convertJavaPathToJavaImport(
						UMLStuffDoer.convertQualifiedNameToJavaPath(ei.getImportedElement().getQualifiedName())));
			}
		}
	}

	private void convertFromUMLPSTComments(Class aClass) {
		if (aClass.getOwnedComments().size() > 0) {
			String comment = getComment(aClass.getOwnedComments().get(0));
			if (!comment.isEmpty()) {
				javaClassType.setJavadocComment(comment);
			}
		}
	}

	private ArrayList<String> getParameters(Interaction anInteraction) {

		ArrayList<String> paramNames = new ArrayList<String>();
		for (Parameter p : anInteraction.getOwnedParameters()) {
			if (p.getDirection().toString().contentEquals("in")) {
				paramNames.add(p.getName());
			}
		}
		return paramNames;
	}

	private String getComment(Comment comment) {
		return comment.getBody().replaceAll("^## ", "").trim();
	}

	public static String getMethodName(String name, boolean keepNumbers) {
		// remove arguments
		String newName = name.replaceAll("\\s{2,}.*", "");
		// remove variables
		newName = newName.replaceAll(" \\$\\{[^\\}]*\\}", "");
		// remove pound sign
		newName = newName.replace("#", "hash");
		// TODO remove anything not a number or letter, make a test before doing so

		// change first letter to upper case
		newName = Utilities.toUpperCamelCase(newName);
		if (keepNumbers) {
			newName = newName.replaceAll("[^a-zA-Z0-9]", "");
		} else {
			newName = newName.replaceAll("[^a-zA-Z]", "");
		}
		// change first character to lower case
		newName = newName.substring(0, 1).toLowerCase() + newName.substring(1);
		return newName;
	}

	public void readFile() {
		if (aFile.exists()) {
			javaClass = javaSrcDir.parse(UMLStuffDoer.convertJavaPathToJavaPackage(aFile.getAbsolutePath()),
					aFile.getName());
		}
	}

}
