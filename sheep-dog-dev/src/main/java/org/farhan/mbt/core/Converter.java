package org.farhan.mbt.core;

import java.util.ArrayList;

import org.farhan.mbt.cucumber.CucumberProject;

public abstract class Converter {

	protected String tags = "";
	protected ConvertibleProject project;
	protected UMLModel model;
	protected ObjectRepository fa;

	public Converter(String tags, ObjectRepository fa) {
		this.tags = tags;
		this.fa = fa;
	}

	public ArrayList<String> getObjectNames() {
		// TODO this is temp hack until I figure out how to manage the objects, the
		// project files and model better
		ArrayList<String> objects = new ArrayList<String>();
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			objects.add(getPath((UMLClassWrapper) co, model.TEST_CASES));
		}
		// TODO another hack until I implement more layers in the uml model or create
		// different models. There shouldn't be a reference to Cucumber Project here.
		if (project instanceof CucumberProject) {
			for (ConvertibleObject co : model.getObjects(model.TEST_OBJECTS)) {
				objects.add(getPath((UMLClassWrapper) co, model.TEST_STEPS));
				objects.add(getPath((UMLClassWrapper) co, model.TEST_OBJECTS));
			}
		}
		return objects;
	}

	private String getPath(UMLClassWrapper srcObj, String tgtLayer) {
		String path = srcObj.getQualifiedName();
		String[] pathParts = path.split("::");
		String componentName = pathParts[2];
		String objectName = pathParts[pathParts.length - 1];

		if (tgtLayer.contentEquals(model.TEST_CASES)) {
			path = path.replace("pst::" + model.TEST_CASES, "");
		}
		if (tgtLayer.contentEquals(model.TEST_STEPS)) {
			path = path.replace("pst::" + model.TEST_OBJECTS + "::" + componentName,
					"::" + componentName.toLowerCase());
			path = path.replace(objectName, Utilities.upperFirst(componentName) + objectName + "Steps");
		}
		if (tgtLayer.contentEquals(model.TEST_OBJECTS)) {
			path = path.replace("pst::" + model.TEST_OBJECTS + "::" + componentName,
					"::" + componentName.toLowerCase());
		}

		path = path.replace("::", "/");
		path = project.getDir(tgtLayer) + path + project.getFileExt(tgtLayer);

		return path;
	}

	public abstract String convertObject(String tags, String path, String content) throws Exception;

	public abstract void initProjects() throws Exception;

	// TODO this is temp until I delete the second layer of feature files
	protected String convertSrcPath(String path, String layer) {
		return convertPath(path, project, model, layer);
	}

	protected String convertSrcPath(String path) {
		return convertPath(path, project, model);
	}

	protected String findQualifiedName(String path) {
		// TODO temp hack. If I only keep the two source adoc layers as UML classes and
		// want to have "view" for the other layers, then I'll probably have to use
		// similar approaches to find a matching object because of the one to many
		// relationship
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			if (getPath((UMLClassWrapper) co, project.TEST_CASES).contentEquals(path)) {
				return ((UMLClassWrapper) co).getQualifiedName();
			}
		}
		for (ConvertibleObject co : model.getObjects(model.TEST_OBJECTS)) {
			if (getPath((UMLClassWrapper) co, project.TEST_STEPS).contentEquals(path)) {
				return ((UMLClassWrapper) co).getQualifiedName();
			}
			if (getPath((UMLClassWrapper) co, project.TEST_OBJECTS).contentEquals(path)) {
				return ((UMLClassWrapper) co).getQualifiedName();
			}
		}
		return null;
	}

	private String convertPath(String path, ConvertibleProject filesPrj, ConvertibleProject modelPrj) {
		String layer = "";
		if (path.startsWith(filesPrj.getDir(filesPrj.TEST_OBJECTS))) {
			layer = filesPrj.TEST_OBJECTS;
		} else if (path.startsWith(filesPrj.getDir(filesPrj.TEST_STEPS))) {
			layer = filesPrj.TEST_STEPS;
		} else if (path.startsWith(filesPrj.getDir(filesPrj.TEST_CASES))) {
			layer = filesPrj.TEST_CASES;
		}
		return convertPath(path, filesPrj, modelPrj, layer);
	}

	private String convertPath(String path, ConvertibleProject filesPrj, ConvertibleProject modelPrj, String layer) {
		String qualifiedName = path.replace(",", "").trim();
		qualifiedName = qualifiedName.replace(filesPrj.getFileExt(layer), "");
		qualifiedName = qualifiedName.replace(filesPrj.getDir(layer), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + layer + qualifiedName;
		return qualifiedName;
	}
}
