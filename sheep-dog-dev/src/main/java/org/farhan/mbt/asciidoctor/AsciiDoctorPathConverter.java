package org.farhan.mbt.asciidoctor;

import org.apache.commons.lang3.StringUtils;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.UMLModel;

public class AsciiDoctorPathConverter {

	private UMLModel model;
	private AsciiDoctorProject project;

	public AsciiDoctorPathConverter(UMLModel model, AsciiDoctorProject project) {
		this.model = model;
		this.project = project;
	}

	public String createUMLPath(String path) {
		String projectLayer, modelLayer;
		if (path.startsWith(project.getDir(project.TEST_STEPS))) {
			projectLayer = project.TEST_STEPS;
			modelLayer = model.TEST_STEPS;
		} else {
			projectLayer = project.TEST_CASES;
			modelLayer = model.TEST_CASES;
		}
		String qualifiedName = path.replace(",", "").trim();
		qualifiedName = qualifiedName.replaceFirst(project.getFileExt(projectLayer) + "$", "");
		qualifiedName = qualifiedName.replaceFirst("^" + project.getDir(projectLayer), "");
		qualifiedName = qualifiedName.replace("/", "::");
		qualifiedName = "pst::" + modelLayer + qualifiedName;
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
		}
		return null;
	}

	public String createFilePath(String umlPath, String layer) {

		if (layer.contentEquals(model.TEST_CASES)) {
			umlPath = umlPath.replace("pst::" + model.TEST_CASES, "");
		}
		if (layer.contentEquals(model.TEST_STEPS)) {
			umlPath = umlPath.replace("pst::" + model.TEST_STEPS, "");
		}
		umlPath = umlPath.replace("::", "/");
		umlPath = project.getDir(layer) + umlPath + project.getFileExt(layer);

		return umlPath;
	}
}
