package org.farhan.mbt.cucumber;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.TestProject;

public class CucumberPathConverter {

	private TestProject model;
	private CucumberProject project;

	public CucumberPathConverter(TestProject model, CucumberProject project) {
		this.model = model;
		this.project = project;
	}

	public String createUMLPath(String path) {
		String qualifiedName = path.replace(",", "").trim();
		qualifiedName = qualifiedName.replaceFirst(project.getFileExt(project.TEST_CASES) + "$", "");
		qualifiedName = qualifiedName.replaceFirst("^" + project.getDir(project.TEST_CASES), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + model.TEST_CASES + qualifiedName;
		return qualifiedName;
	}

	public String getUMLPath(String path) {
		for (ConvertibleObject co : model.getObjects(model.TEST_CASES)) {
			if (createFilePath(co.getPath(), project.TEST_CASES).contentEquals(path)) {
				return co.getPath();
			}
		}
		for (ConvertibleObject co : model.getObjects(model.TEST_STEPS)) {
			if (createFilePath(co.getPath(), project.TEST_STEPS).contentEquals(path)) {
				return co.getPath();
			}
			if (createFilePath(co.getPath(), project.TEST_OBJECTS).contentEquals(path)) {
				return co.getPath();
			}
		}
		return null;
	}

	public String createFilePath(String path, String layer) {
		String[] pathParts = path.split("::");
		String componentName = pathParts[2];
		String objectName = pathParts[pathParts.length - 1];
		String newComponentName = getComponentName(path);
		String newObjectName = getObjectName(path);

		if (layer.contentEquals(model.TEST_CASES)) {
			path = path.replace("pst::" + model.TEST_CASES, "");
		} else {
			if (layer.contentEquals(model.TEST_STEPS)) {
				path = path.replace("pst::" + model.TEST_STEPS + "::" + componentName,
						"::" + newComponentName.toLowerCase());
				path = path.replaceFirst(objectName + "$", newComponentName + newObjectName + "Steps");
			}
			if (layer.contentEquals(model.TEST_OBJECTS)) {
				path = path.replace("pst::" + model.TEST_STEPS + "::" + componentName,
						"::" + newComponentName.toLowerCase());
				path = path.replaceFirst(objectName + "$", newObjectName);
			}
			path = path.replace(" ", "");
			path = path.replace("-", "");
		}

		path = path.replace("::", "/");
		path = project.getDir(layer) + path + project.getFileExt(layer);

		return path;
	}

	private String getComponentName(String path) {
		String[] pathParts = path.split("::");
		String name = pathParts[2].replaceFirst("\\s[^\\s]+$", "");
		name = removeDelimiterAndCapitalize(name, "\\.");
		name = removeDelimiterAndCapitalize(name, "\\-");
		name = removeDelimiterAndCapitalize(name, " ");
		return name;
	}

	private String getObjectName(String path) {
		String[] pathParts = path.split("::");
		String name = pathParts[pathParts.length - 1];
		name = removeDelimiterAndCapitalize(name, "\\.");
		name = removeDelimiterAndCapitalize(name, "\\-");
		name = removeDelimiterAndCapitalize(name, " ");
		return name;
	}

	private String removeDelimiterAndCapitalize(String name, String delimiter) {
		String[] parts = name.split(delimiter);
		StringBuilder sb = new StringBuilder();
		for (String part : parts) {
			sb.append(part.substring(0, 1).toUpperCase()).append(part.substring(1));
		}
		return sb.toString();
	}
}
