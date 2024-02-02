package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.ToUMLLayerConverter;
import org.farhan.mbt.core.UMLToConversionMojo;
import org.farhan.mbt.core.UMLToFirstLayerConverter;
import org.farhan.mbt.core.UMLToLayerConverter;
import org.farhan.mbt.core.UMLToOtherLayerConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberMojo extends UMLToConversionMojo {

	@Override
	protected ArrayList<UMLToLayerConverter> getLayerConverters() {
		ArrayList<UMLToLayerConverter> converters = new ArrayList<UMLToLayerConverter>();
		converters.add(new UMLToCucumberFirstLayerConverter(Project.firstLayerPackageName));
		converters.add(new UMLToCucumberOtherLayerConverter(Project.secondLayerPackageName));
		converters.add(new UMLToCucumberOtherLayerConverter(Project.thirdLayerPackageName));
		return converters;
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
