package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUML extends ToUMLConversionMojo {

	CucumberProject sourceProject;
	UMLProject targetProject;
	
	@Override
	protected ArrayList<ToUMLConverter> getLayerConverters() {
		ArrayList<ToUMLConverter> converters = new ArrayList<ToUMLConverter>();
		converters.add(new FeatureToUMLConverter(sourceProject.firstLayerName, sourceProject, targetProject));
		converters.add(new JavaToUMLConverter(sourceProject.secondLayerName, sourceProject, targetProject));
		converters.add(new JavaToUMLConverter(sourceProject.thirdLayerName, sourceProject, targetProject));
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
