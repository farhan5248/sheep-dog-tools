package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLLayerConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUMLMojo extends ToUMLConversionMojo {

	CucumberProject sourceProject;
	UMLProject targetProject;
	
	@Override
	protected ArrayList<ToUMLLayerConverter> getLayerConverters() {
		ArrayList<ToUMLLayerConverter> converters = new ArrayList<ToUMLLayerConverter>();
		converters.add(new CucumberToUMLFirstLayerConverter(sourceProject.firstLayerName, sourceProject, targetProject));
		converters.add(new CucumberToUMLOtherLayerConverter(sourceProject.secondLayerName, sourceProject, targetProject));
		converters.add(new CucumberToUMLOtherLayerConverter(sourceProject.thirdLayerName, sourceProject, targetProject));
		return converters;
	}

	@Override
	protected void initProjects() {
		sourceProject = new CucumberProject();
		targetProject = new UMLProject();
	}

	@Override
	protected void save() throws Exception {
		targetProject.save();
	}

}
