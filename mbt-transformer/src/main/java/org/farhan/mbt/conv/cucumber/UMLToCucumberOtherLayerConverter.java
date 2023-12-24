package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.conv.core.Project;
import org.farhan.conv.core.UMLToOtherLayerConverter;
import org.farhan.conv.core.Utilities;
import org.farhan.mbt.conv.uml.PackageFactory;
import org.farhan.mbt.conv.uml.ParameterFactory;
import org.farhan.mbt.conv.uml.UMLNameTranslator;
import org.farhan.mbt.conv.uml.UMLProject;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

public class UMLToCucumberOtherLayerConverter extends UMLToOtherLayerConverter {

	private CucumberJavaFile aJavaFile;

	@Override
	protected ArrayList<Class> selectLayerClasses(String layerSelectionCriteria) throws Exception {

		return PackageFactory.getPackagedClasses(UMLProject.theSystem.getNestedPackage(layerSelectionCriteria));
	}

	@Override
	protected void convertFromClass(Class layerClass) throws Exception {
		// TODO maybe CucumberProject should handle creating a new object and adding it
		// to the list
		String path = CucumberNameConverter.convertQualifiedNameToJavaPath(layerClass.getQualifiedName());
		aJavaFile = new CucumberJavaFile(new File(path));
		if (isSecondLayer(layerClass)) {
			CucumberProject.secondLayerFiles.add(aJavaFile);
		} else if (isThirdLayer(layerClass)) {
			CucumberProject.thirdLayerFiles.add(aJavaFile);
		} else {
			throw new Exception("Java files are only in layer 2 or 3");
		}

		aJavaFile.javaClass = new CompilationUnit();
		aJavaFile.javaClass.setStorage(aJavaFile.getFile().toPath());
		aJavaFile.javaClass.addType(new ClassOrInterfaceDeclaration());
		ClassOrInterfaceDeclaration javaClassType = (ClassOrInterfaceDeclaration) aJavaFile.javaClass.getType(0);
		javaClassType.setName(layerClass.getName());
		javaClassType.setPublic(true);
		if (isSecondLayer(layerClass)) {
			javaClassType.addExtendedType("BusinessProcessModelTasks");
		} else if (isThirdLayer(layerClass)) {
			// TODO UMLNameTranslator must be a mess by now...
			javaClassType.addExtendedType(UMLNameTranslator.getOtherLayerAppName(layerClass.getQualifiedName()));
		}

		aJavaFile.javaClass.setPackageDeclaration(convertJavaPathToJavaPackage(removeJavaClassFromJavaPath(path)));
		convertFromUMLPSTComments(layerClass);
	}

	@Override
	protected void convertFromImports(Class layerClass) throws Exception {
		if (isSecondLayer(layerClass)) {
			// TODO maybe add these when the UML model is being created?
			aJavaFile.javaClass.addImport("io.cucumber.java.en.Given");
			aJavaFile.javaClass.addImport("io.cucumber.java.PendingException");
			aJavaFile.javaClass.addImport("io.cucumber.datatable.DataTable");
			aJavaFile.javaClass.addImport("org.farhan.common.BusinessProcessModelTasks");
		} else if (isThirdLayer(layerClass)) {
			aJavaFile.javaClass.addImport("java.util.HashMap");
			aJavaFile.javaClass.addImport("io.cucumber.java.PendingException");
			aJavaFile.javaClass.addImport(
					"org.farhan.common." + UMLNameTranslator.getOtherLayerAppName(layerClass.getQualifiedName()));
		}
	}

	@Override
	protected void convertFromAttributes(Class layerClass) throws Exception {

	}

	@Override
	protected void convertFromBehaviours(Class layerClass) throws Exception {
		for (Behavior aBehavior : layerClass.getOwnedBehaviors()) {

			if (aBehavior instanceof Interaction) {
				Interaction anInteraction = (Interaction) aBehavior;
				if (!anInteraction.getName().endsWith("Attributes")) {
					convertFromUMLPSTInteraction(anInteraction);
				}
			}
		}
	}

	@Override
	protected void convertFromInteractionMessages(Interaction anInteraction, Collection<?> steps) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void convertFromMessage(Interaction anInteraction, Object anObject) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertPathToClassQualifiedName(String pathName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertClassQualifiedNameToImport(String qualifiedName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String convertImportToClassQualifiedName(String importName) {
		// TODO Auto-generated method stub
		return null;
	}

	private void convertFromUMLPSTInteraction(Interaction anInteraction) throws Exception {

		Class aClass = (Class) anInteraction.getOwner();
		MethodDeclaration aMethod = aJavaFile.javaClass.getType(0).addMethod(anInteraction.getName(), Keyword.PUBLIC);
		if (isSecondLayer(aClass)) {
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
		if (ParameterFactory.getParameter(anInteraction, "dataTable") != null) {
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
					resource = UMLNameTranslator.getOtherLayerAppName(aClass.getQualifiedName());
				}
				step = resource + "." + m.getName();
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

	private ArrayList<String> getParameters(Interaction anInteraction) {

		ArrayList<String> paramNames = new ArrayList<String>();
		for (Parameter p : anInteraction.getOwnedParameters()) {
			if (p.getDirection().toString().contentEquals("in")) {
				paramNames.add(p.getName());
			}
		}
		return paramNames;
	}

	// TODO put this in a Factory
	private void convertFromUMLPSTComments(Class aClass) {
		if (aClass.getOwnedComments().size() > 0) {
			String comment = getComment(aClass.getOwnedComments().get(0));
			if (!comment.isEmpty()) {
				aJavaFile.javaClass.getType(0).setJavadocComment(comment);
			}
		}
	}

	// TODO put this in a Factory
	private String getComment(Comment comment) {
		return comment.getBody().replaceAll("^## ", "").trim();
	}

	private boolean isSecondLayer(Class layerClass) {
		if (layerClass.getQualifiedName().contains("::" + Project.secondLayerPackageName + "::")) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isThirdLayer(Class layerClass) {
		if (layerClass.getQualifiedName().contains("::" + Project.thirdLayerPackageName + "::")) {
			return true;
		} else {
			return false;
		}
	}

	private static String removeJavaClassFromJavaPath(String path) {
		return path.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
	}

	private static String convertJavaPathToJavaPackage(String path) {

		String importName = path;
		importName = importName.replace(".java", "");
		importName = importName.replace(CucumberProject.getFourthLayerDir().getAbsolutePath(),
				"org.farhan." + Project.fourthLayerPackageName);
		importName = importName.replace(CucumberProject.getThirdLayerDir().getAbsolutePath(),
				"org.farhan." + Project.thirdLayerPackageName);
		importName = importName.replace(CucumberProject.getSecondLayerDir().getAbsolutePath(),
				"org.farhan." + Project.secondLayerPackageName);
		importName = importName.replace(File.separator, ".");
		return importName;
	}

}
