package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.UMLToConversionMojo;
import org.farhan.mbt.core.UMLToLayerConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberMojo extends UMLToConversionMojo {

	// TODO move these into the converters themselves, think about how to read the
	// UML file before writing the next layer to it
	UMLProject sourceProject;
	CucumberProject targetProject;

	@Override
	protected ArrayList<UMLToLayerConverter> getLayerConverters() {
		ArrayList<UMLToLayerConverter> converters = new ArrayList<UMLToLayerConverter>();
		converters
				.add(new UMLToCucumberFirstLayerConverter(sourceProject.firstLayerName, sourceProject, targetProject));
		converters
				.add(new UMLToCucumberOtherLayerConverter(sourceProject.secondLayerName, sourceProject, targetProject));
		converters
				.add(new UMLToCucumberOtherLayerConverter(sourceProject.thirdLayerName, sourceProject, targetProject));
		return converters;
	}

	@Override
	protected void save() throws Exception {
		targetProject.save();
	}

	@Override
	protected void initProjects() throws Exception {

		sourceProject = new UMLProject();
		targetProject = new CucumberProject();

		// TODO move this to select layer objects
		sourceProject.load();
	}

}
