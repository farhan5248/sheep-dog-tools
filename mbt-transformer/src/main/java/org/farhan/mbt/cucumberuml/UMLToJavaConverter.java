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
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToCodeConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.ParameterFactory;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

public class UMLToJavaConverter extends ToCodeConverter {

	private CucumberJavaWrapper aJavaFile;
	private String layer;

	CucumberProject target;

	public UMLToJavaConverter(String layer, UMLProject source, CucumberProject target) {
		this.layer = layer;
		this.source = source;
		this.target = target;
	}

	@Override
	protected String getLayer() {
		return layer;
	}

	@Override
	protected void selectObjects() throws Exception {
		source.loadObjects(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return source.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject co) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) co;
		String path = convertObjectName(ucw.theClass.getQualifiedName());
		aJavaFile = (CucumberJavaWrapper) target.createObject(path);
		aJavaFile.javaClass = new CompilationUnit();
		aJavaFile.javaClass.setStorage(aJavaFile.getFile().toPath());
		aJavaFile.javaClass.addType(new ClassOrInterfaceDeclaration());
		ClassOrInterfaceDeclaration javaClassType = (ClassOrInterfaceDeclaration) aJavaFile.javaClass.getType(0);
		javaClassType.setName(ucw.theClass.getName());
		javaClassType.setPublic(true);
		if (isSecondLayer(ucw.theClass)) {
			javaClassType.addExtendedType("TestSteps");
		} else {
			// TODO check that this works, maybe nearest package is better. Also this
			// assumes there's no other middle packages so make a method that gets that.
			// Also update convertImports
			javaClassType.addExtendedType(StringUtils.capitalize(ucw.theClass.getPackage().getName()));
		}
		aJavaFile.javaClass.setPackageDeclaration(convertJavaPathToJavaPackage(removeJavaClassFromJavaPath(path)));
		convertComments(ucw.theClass);
	}

	@Override
	protected void convertImports(ConvertibleObject co) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) co;
		for (ElementImport ei : ucw.theClass.getElementImports()) {
			Class importedClass = (Class) ei.getImportedElement();
			String qualifiedName = importedClass.getQualifiedName();
			// If a third layer class is being referenced from the second layer, use its
			// factory instead
			if (isThirdLayer(importedClass)) {
				String factoryName = getFactoryName(qualifiedName);
				aJavaFile.javaClass.addImport("org.farhan.common.objects." + factoryName);
			} else if (isSecondLayer(importedClass)) {
				String javaPath = convertObjectName(qualifiedName);
				String packageName = convertJavaPathToJavaPackage(javaPath).replace("pst.", "");
				aJavaFile.javaClass.addImport(packageName);
			}
		}
		if (isSecondLayer(ucw.theClass)) {
			// TODO add these when the UML model is being created so that only the loop of
			// imports is used
			aJavaFile.javaClass.addImport("io.cucumber.java.en.Given");
			aJavaFile.javaClass.addImport("io.cucumber.datatable.DataTable");
			aJavaFile.javaClass.addImport("org.farhan.common.stepdefs.TestSteps");
		} else if (isThirdLayer(ucw.theClass)) {
			aJavaFile.javaClass.addImport("java.util.HashMap");
			aJavaFile.javaClass.addImport("io.cucumber.java.PendingException");
			aJavaFile.javaClass
					.addImport("org.farhan.common." + StringUtils.capitalize(ucw.theClass.getPackage().getName()));
		}
	}

	@Override
	protected void convertAttributes(ConvertibleObject co) throws Exception {

	}

	@Override
	protected void convertBehaviours(ConvertibleObject co) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) co;
		for (Behavior aBehavior : ucw.theClass.getOwnedBehaviors()) {
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
	protected String convertObjectName(String fullName) {
		String pathName = fullName;
		pathName = pathName.replace("pst::" + target.SECOND_LAYER,
				target.getDir(target.SECOND_LAYER).getAbsolutePath());
		pathName = pathName.replace("pst::" + target.THIRD_LAYER,
				target.getDir(target.THIRD_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + target.getFileExt(target.SECOND_LAYER);
		return pathName;
	}

	private String getFactoryName(String qualifiedName) {
		String factoryName = qualifiedName;
		factoryName = factoryName.replace(source.theSystem.getName() + "::" + source.THIRD_LAYER + "::", "");
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
		if (layerClass.getQualifiedName().startsWith("pst::" + target.SECOND_LAYER + "::")) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isThirdLayer(Class layerClass) {
		if (layerClass.getQualifiedName().startsWith("pst::" + target.THIRD_LAYER + "::")) {
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
		importName = importName.replace(target.getFileExt(layer), "");
		// TODO if I keep org.farhan, then there's no need for these two lines.
		importName = importName.replace(target.getDir(target.THIRD_LAYER).getAbsolutePath(),
				"org.farhan." + target.THIRD_LAYER);
		importName = importName.replace(target.getDir(target.SECOND_LAYER).getAbsolutePath(),
				"org.farhan." + target.SECOND_LAYER);
		importName = importName.replace(File.separator, ".");
		return importName;
	}

}
