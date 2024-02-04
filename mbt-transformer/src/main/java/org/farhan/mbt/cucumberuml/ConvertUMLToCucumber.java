package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.UMLToConversionMojo;
import org.farhan.mbt.core.UMLToConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumber extends UMLToConversionMojo {

	// TODO move these into the converters themselves, think about how to read the
	// UML file before writing the next layer to it
	UMLProject sourceProject;
	CucumberProject targetProject;

	@Override
	protected ArrayList<UMLToConverter> getLayerConverters() {
		ArrayList<UMLToConverter> converters = new ArrayList<UMLToConverter>();
		converters
				.add(new UMLToFeatureConverter(sourceProject.firstLayerName, sourceProject, targetProject));
		converters
				.add(new UMLToJavaConverter(sourceProject.secondLayerName, sourceProject, targetProject));
		converters
				.add(new UMLToJavaConverter(sourceProject.thirdLayerName, sourceProject, targetProject));
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
