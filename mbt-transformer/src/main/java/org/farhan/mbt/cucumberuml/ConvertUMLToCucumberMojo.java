package org.farhan.mbt.cucumberuml;

import org.farhan.mbt.core.UMLToConversionMojo;
import org.farhan.mbt.core.UMLToFirstLayerConverter;
import org.farhan.mbt.core.UMLToOtherLayerConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberMojo extends UMLToConversionMojo {

	@Override
	protected UMLToOtherLayerConverter getOtherLayerConverter() {
		return new UMLToCucumberOtherLayerConverter();
	}

	@Override
	protected UMLToFirstLayerConverter getFirstLayerConverter() {
		return new UMLToCucumberFirstLayerConverter();
	}

	@Override
	protected void writeFiles() throws Exception {
		CucumberProject.writeFiles();
	}

	@Override
	protected void initProjects() throws Exception {
		CucumberProject.init();
		UMLProject.init();
		UMLProject.readFiles();
	}

}
