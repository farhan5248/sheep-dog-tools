package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLLayerConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUMLMojo extends ToUMLConversionMojo {

	@Override
	protected ArrayList<ToUMLLayerConverter> getLayerConverters() {
		ArrayList<ToUMLLayerConverter> converters = new ArrayList<ToUMLLayerConverter>();
		converters.add(new CucumberToUMLFirstLayerConverter(Project.firstLayerPackageName));
		converters.add(new CucumberToUMLOtherLayerConverter(Project.secondLayerPackageName));
		converters.add(new CucumberToUMLOtherLayerConverter(Project.thirdLayerPackageName));
		return converters;
	}

	@Override
	protected void initProjects() {
		UMLProject.init();
		CucumberProject.init();
	}

	@Override
	protected void save() throws Exception {
		UMLProject.writeFiles();
	}

}
