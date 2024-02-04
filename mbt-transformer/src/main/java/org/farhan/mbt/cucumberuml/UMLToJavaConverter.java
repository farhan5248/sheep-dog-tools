package org.farhan.mbt.cucumberuml;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.mbt.core.UMLToOtherLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberJavaFile;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.PackageFactory;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.UMLProject;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

public class UMLToJavaConverter extends UMLToOtherLayerConverter {

	private CucumberJavaFile aJavaFile;
	private String layer;

	CucumberProject targetProject;

	public UMLToJavaConverter(String layer, UMLProject sourceProject, CucumberProject targetProject) {
		this.layer = layer;
		this.sourceProject = sourceProject;
		this.targetProject = targetProject;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected ArrayList<Class> selectLayerFiles() throws Exception {
		return PackageFactory.getPackagedClasses(sourceProject.theSystem.getNestedPackage(getLayer()));
	}

	@Override
	protected ArrayList<Class> getLayerObjects(String layer) {
		return sourceProject.getLayerClasses(layer);
	}

	@Override
	protected void convertObject(Class layerClass) throws Exception {
		String path = convertClassQualifiedNameToPath(layerClass.getQualifiedName());
		aJavaFile = targetProject.createCucumberJavaFile(new File(path));
		aJavaFile.javaClass = new CompilationUnit();
		aJavaFile.javaClass.setStorage(aJavaFile.getFile().toPath());
		aJavaFile.javaClass.addType(new ClassOrInterfaceDeclaration());
		ClassOrInterfaceDeclaration javaClassType = (ClassOrInterfaceDeclaration) aJavaFile.javaClass.getType(0);
		javaClassType.setName(layerClass.getName());
		javaClassType.setPublic(true);
		if (isSecondLayer(layerClass)) {
			javaClassType.addExtendedType("TestSteps");
		} else {
			// TODO check that this works, maybe nearest package is better. Also this
			// assumes there's no other middle packages so make a method that gets that.
			// Also update convertImports
			javaClassType.addExtendedType(StringUtils.capitalize(layerClass.getPackage().getName()));
		}
		aJavaFile.javaClass.setPackageDeclaration(convertJavaPathToJavaPackage(removeJavaClassFromJavaPath(path)));
		convertComments(layerClass);
	}

	@Override
	protected void convertImports(Class layerClass) throws Exception {
		for (ElementImport ei : layerClass.getElementImports()) {
			Class importedClass = (Class) ei.getImportedElement();
			String qualifiedName = importedClass.getQualifiedName();
			// If a third layer class is being referenced from the second layer, use its
			// factory instead
			if (isThirdLayer(importedClass)) {
				String factoryName = getFactoryName(qualifiedName);
				aJavaFile.javaClass.addImport("org.farhan.common.objects." + factoryName);
			} else if (isSecondLayer(importedClass)) {
				String javaPath = convertClassQualifiedNameToPath(qualifiedName);
				String packageName = convertJavaPathToJavaPackage(javaPath).replace("pst.", "");
				aJavaFile.javaClass.addImport(packageName);
			}
		}
		if (isSecondLayer(layerClass)) {
			// TODO add these when the UML model is being created so that only the loop of
			// imports is used
			aJavaFile.javaClass.addImport("io.cucumber.java.en.Given");
			aJavaFile.javaClass.addImport("io.cucumber.datatable.DataTable");
			aJavaFile.javaClass.addImport("org.farhan.common.stepdefs.TestSteps");
		} else if (isThirdLayer(layerClass)) {
			aJavaFile.javaClass.addImport("java.util.HashMap");
			aJavaFile.javaClass.addImport("io.cucumber.java.PendingException");
			aJavaFile.javaClass
					.addImport("org.farhan.common." + StringUtils.capitalize(layerClass.getPackage().getName()));
		}
	}

	@Override
	protected void convertAttributes(Class layerClass) throws Exception {

	}

	@Override
	protected void convertBehaviours(Class layerClass) throws Exception {
		for (Behavior aBehavior : layerClass.getOwnedBehaviors()) {
			if (aBehavior instanceof Interaction) {
				Interaction anInteraction = (Interaction) aBehavior;
				if (!anInteraction.getName().endsWith("Attributes")) {
					Class aClass = (Class) anInteraction.getOwner();
					MethodDeclaration aMethod = aJavaFile.javaClass.getType(0).addMethod(anInteraction.getName(),
							Keyword.PUBLIC);
					if (isSecondLayer(aClass)) {
						convertAnnotation(anInteraction, aMethod);
					}
					convertParameters(anInteraction, aMethod);
					convertComments(anInteraction, aMethod);
					convertInteractionMessages(anInteraction, aMethod.createBody());
				}
			}
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
		BlockStmt body = (BlockStmt) stepList;
		if (isSecondLayer((Class) anInteraction.getOwner())) {
			for (Message m : anInteraction.getMessages()) {
				// TODO this needs to first set the factory and then keep appending methods to
				// it. Don't create the factory in convertFromMessage again and again.
				convertMessage(m, body);
			}
		} else {
			body.addStatement("throw new PendingException();");
		}
	}

	@Override
	protected void convertMessage(Message m, Object aStepList) {
		BlockStmt body = (BlockStmt) aStepList;
		String step = ";";
		Interaction nextLayerMethod = (Interaction) m.getSignature();
		if (nextLayerMethod != null) {
			Class className = (Class) nextLayerMethod.getOwner();
			String factoryName = getFactoryName(className.getQualifiedName());
			step = factoryName + ".get(\"" + className.getName() + "\")." + m.getName();
		}
		step += "(";
		for (ValueSpecification vs : m.getArguments()) {
			LiteralString ls = (LiteralString) vs;
			step += ls.getValue() + ", ";
		}
		step = Utilities.removeLastComma(step);
		step += ");";
		body.addStatement(step);
	}

	@Override
	protected String convertClassQualifiedNameToPath(String qualifiedName) {
		String pathName = qualifiedName;
		pathName = pathName.replace("pst::" + targetProject.secondLayerName,
				targetProject.getLayerDir(targetProject.secondLayerName).getAbsolutePath());
		pathName = pathName.replace("pst::" + targetProject.thirdLayerName,
				targetProject.getLayerDir(targetProject.thirdLayerName).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + ".java";
		return pathName;
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

	private String getFactoryName(String qualifiedName) {
		String factoryName = qualifiedName;
		factoryName = factoryName
				.replace(sourceProject.theSystem.getName() + "::" + sourceProject.thirdLayerName + "::", "");
		factoryName = factoryName.split("::")[0];
		factoryName = StringUtils.capitalize(factoryName) + "Factory";
		return factoryName;
	}

	private void convertAnnotation(Interaction anInteraction, MethodDeclaration aMethod) {
		if (!anInteraction.getEAnnotations().isEmpty()) {
			String annotationBody = anInteraction.getEAnnotations().get(0).getSource();
			annotationBody = "\"" + annotationBody.replace("@Given(\"", "").replace("\")", "") + "\"";
			aMethod.addSingleMemberAnnotation("Given", annotationBody);
		}
	}

	private void convertParameters(Interaction anInteraction, MethodDeclaration aMethod) {
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

	private void convertComments(Interaction anInteraction, MethodDeclaration aMethod) {
		if (anInteraction.getOwnedComments().size() > 0) {
			String comment = anInteraction.getOwnedComments().get(0).getBody();
			if (!comment.isEmpty()) {
				aMethod.setJavadocComment(comment);
			}
		}
	}

	private void convertComments(Class aClass) {
		if (aClass.getOwnedComments().size() > 0) {
			String comment = aClass.getOwnedComments().get(0).getBody();
			if (!comment.isEmpty()) {
				aJavaFile.javaClass.getType(0).setJavadocComment(comment);
			}
		}
	}

	private boolean isSecondLayer(Class layerClass) {
		if (layerClass.getQualifiedName().startsWith("pst::" + targetProject.secondLayerName + "::")) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isThirdLayer(Class layerClass) {
		if (layerClass.getQualifiedName().startsWith("pst::" + targetProject.thirdLayerName + "::")) {
			return true;
		} else {
			return false;
		}
	}

	private String removeJavaClassFromJavaPath(String path) {
		return path.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
	}

	private String convertJavaPathToJavaPackage(String path) {

		String importName = path;
		importName = importName.replace(".java", "");

		importName = importName.replace(targetProject.getLayerDir(targetProject.thirdLayerName).getAbsolutePath(),
				"org.farhan." + targetProject.thirdLayerName);
		importName = importName.replace(targetProject.getLayerDir(targetProject.secondLayerName).getAbsolutePath(),
				"org.farhan." + targetProject.secondLayerName);
		importName = importName.replace(File.separator, ".");
		return importName;
	}

}
