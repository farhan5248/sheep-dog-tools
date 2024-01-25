package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.core.ToUMLFirstLayerLinker;
import org.farhan.mbt.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.core.ToUMLOtherLayerLinker;
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
	protected ToUMLOtherLayerLinker getOtherLayerLinker() {
		return new CucumberToUMLOtherLayerLinker();
	}

	@Override
	protected ToUMLFirstLayerLinker getFirstLayerLinker() {
		return new CucumberToUMLFirstLayerLinker();
	}

	@Override
	protected ArrayList<ConvertibleFile> getFirstLayerFiles() {
		return CucumberProject.getFirstLayerFiles();
	}

	@Override
	protected ArrayList<ConvertibleFile> getSecondLayerFiles() {
		return CucumberProject.getSecondLayerFiles();
	}

	@Override
	protected ArrayList<ConvertibleFile> getThirdLayerFiles() {
		return CucumberProject.getThirdLayerFiles();
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
