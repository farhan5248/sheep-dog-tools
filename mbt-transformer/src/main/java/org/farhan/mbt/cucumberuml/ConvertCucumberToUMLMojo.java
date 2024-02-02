package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUMLMojo extends ToUMLConversionMojo {

	@Override
	protected ToUMLOtherLayerConverter getOtherLayerConverter() {
		return new CucumberToUMLOtherLayerConverter();
	}

	@Override
	protected ToUMLFirstLayerConverter getFirstLayerConverter() {
		return new CucumberToUMLFirstLayerConverter();
	}

	@Override
	protected void initProjects() {
		UMLProject.init();
		CucumberProject.init();
	}

	@Override
	protected void writeFiles() throws Exception {
		UMLProject.writeFiles();
	}

}
