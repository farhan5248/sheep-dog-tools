package org.farhan.mbt.converter;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
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
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier.Keyword;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.BlockStmt;

public class UMLToJavaConverter extends ToCodeConverter {

	private CucumberJavaWrapper tgtWrp;
	private CucumberProject tgtPrj;

	public UMLToJavaConverter(String layer, UMLProject source, CucumberProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	@Override
	protected void selectObjects() throws Exception {
		srcPrj.loadObjects(layer);
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		if (!srcPrj.getObjects(layer).isEmpty()) {
			UMLClassWrapper ucw = (UMLClassWrapper) srcPrj.getObjects(layer).getFirst();
			Class c = (Class) ucw.get();
			if (c.getOwnedBehaviors().isEmpty()) {
				// if the class is empty, this model was created from a graph model. In that
				// case, the existing java code is not reversed when creating the UML model.
				// There might still be classes created to prevent the dangling reference errors
				// but they'll be empty so we just skip this layer
				return new ArrayList<ConvertibleObject>();
			}
		}
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject co) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) co;
		Class c = (Class) ucw.get();
		String path = convertObjectName(c.getQualifiedName());
		tgtWrp = (CucumberJavaWrapper) tgtPrj.createObject(path);
		CompilationUnit cu = (CompilationUnit) tgtWrp.get();
		cu.setStorage(tgtWrp.getFile().toPath());
		ClassOrInterfaceDeclaration javaClassType = new ClassOrInterfaceDeclaration();
		javaClassType.setName(c.getName());
		javaClassType.setPublic(true);
		cu.addType(javaClassType);
		if (layer.contentEquals(srcPrj.THIRD_LAYER)) {
			javaClassType.setInterface(true);
		}
		cu.setPackageDeclaration(convertJavaPathToJavaPackage(removeJavaClassFromJavaPath(path)));
		convertComments(c);
	}

	@Override
	protected void convertImports(ConvertibleObject co) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) co;
		Class c = (Class) ucw.get();
		CompilationUnit cu = (CompilationUnit) tgtWrp.get();
		for (ElementImport ei : c.getElementImports()) {
			Class importedClass = (Class) ei.getImportedElement();
			String qualifiedName = importedClass.getQualifiedName();
			// If a third layer class is being referenced from the second layer, use its
			// factory instead
			if (importedClass.getQualifiedName().startsWith("pst::" + tgtPrj.THIRD_LAYER + "::")) {
				String componentName = getComponentName(qualifiedName);
				cu.addImport("org.farhan.common." + componentName + "Factory");
			}
		}
		if (layer.contentEquals(srcPrj.SECOND_LAYER)) {
			// TODO add these when the UML model is being created so that only the loop of
			// imports is used
			cu.addImport("io.cucumber.java.en.Given");
			cu.addImport("io.cucumber.datatable.DataTable");
		} else if (layer.contentEquals(srcPrj.THIRD_LAYER)) {
			cu.addImport("java.util.HashMap");
		}
	}

	@Override
	protected void convertBehaviours(ConvertibleObject co) throws Exception {
		UMLClassWrapper ucw = (UMLClassWrapper) co;
		Class c = (Class) ucw.get();
		CompilationUnit cu = (CompilationUnit) tgtWrp.get();
		for (Behavior aBehavior : getSortedBehaviors(c.getOwnedBehaviors())) {
			Interaction anInteraction = (Interaction) aBehavior;
			if (!anInteraction.getName().endsWith("InputOutputs")) {
				MethodDeclaration aMethod = cu.getType(0).addMethod(anInteraction.getName(), Keyword.PUBLIC);
				if (layer.contentEquals(srcPrj.SECOND_LAYER)) {
					convertAnnotation(anInteraction, aMethod);
					convertInteractionMessages(anInteraction, aMethod.createBody());
				} else {
					aMethod.removeBody();
				}
				convertParameters(anInteraction, aMethod);
				convertComments(anInteraction, aMethod);
			}
		}
	}

	private EList<Behavior> getSortedBehaviors(EList<Behavior> ownedBehaviors) {
		// sort the behaviors before writing the file so that git comparisons are easier
		Map<String, Behavior> sortedBehaviors = new TreeMap<String, Behavior>();
		for (int i = ownedBehaviors.size() - 1; i >= 0; i--) {
			Behavior aBehavior = ownedBehaviors.get(i);
			sortedBehaviors.put(aBehavior.getName(), aBehavior);
			ownedBehaviors.remove(i);
		}
		for (Entry<String, Behavior> entry : sortedBehaviors.entrySet()) {
			ownedBehaviors.add(entry.getValue());
		}
		return ownedBehaviors;
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, Object stepList) throws Exception {
		BlockStmt body = (BlockStmt) stepList;
		if (layer.contentEquals(srcPrj.SECOND_LAYER)) {
			for (Message m : anInteraction.getMessages()) {
				convertMessage(m, body);
			}
		}
	}

	@Override
	protected void convertMessage(Message m, Object aStepList) {
		BlockStmt body = (BlockStmt) aStepList;
		String step = ";";
		Class layer2Class = (Class) m.getOwner().getOwner();
		String componentName = getComponentName(layer2Class.getQualifiedName());
		String layer3ClassName = layer2Class.getName().replaceFirst(componentName, "").replaceFirst("Steps$", "");
		step = componentName + "Factory" + ".get(\"" + layer3ClassName + "\")." + m.getName();
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
		pathName = pathName.replace("pst::" + tgtPrj.SECOND_LAYER,
				tgtPrj.getDir(tgtPrj.SECOND_LAYER).getAbsolutePath());
		pathName = pathName.replace("pst::" + tgtPrj.THIRD_LAYER, tgtPrj.getDir(tgtPrj.THIRD_LAYER).getAbsolutePath());
		pathName = pathName.replace("::", File.separator);
		pathName = pathName + tgtPrj.getFileExt(tgtPrj.SECOND_LAYER);
		return pathName;
	}

	private String getComponentName(String qualifiedName) {
		String factoryName = qualifiedName;
		factoryName = factoryName.replace("pst" + "::" + srcPrj.THIRD_LAYER + "::", "");
		factoryName = factoryName.replace("pst" + "::" + srcPrj.SECOND_LAYER + "::", "");
		factoryName = factoryName.split("::")[0];
		factoryName = StringUtils.capitalize(factoryName);
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
		if (anInteraction.getOwnedParameter("dataTable", null) != null) {
			aMethod.addParameter("DataTable", "dataTable");
		} else {
			for (Parameter p : anInteraction.getOwnedParameters()) {
				if (p.getName().contentEquals("keyMap")) {
					aMethod.addParameter("HashMap<String, String>", Utilities.toLowerCamelCase(p.getName()));
				} else {
					aMethod.addParameter("String", Utilities.toLowerCamelCase(p.getName()));
				}
			}
		}
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
				((CompilationUnit) tgtWrp.get()).getType(0).setJavadocComment(comment);
			}
		}
	}

	private String removeJavaClassFromJavaPath(String path) {
		return path.replaceAll("\\" + File.separator + "[^\\" + File.separator + "]*$", "");
	}

	private String convertJavaPathToJavaPackage(String path) {

		String importName = path;
		importName = importName.replace(tgtPrj.getFileExt(layer), "");
		importName = importName.replace(tgtPrj.getDir(tgtPrj.THIRD_LAYER).getAbsolutePath(),
				"org.farhan." + tgtPrj.THIRD_LAYER);
		importName = importName.replace(tgtPrj.getDir(tgtPrj.SECOND_LAYER).getAbsolutePath(),
				"org.farhan." + tgtPrj.SECOND_LAYER);
		importName = importName.replace(File.separator, ".");
		return importName;
	}

}
