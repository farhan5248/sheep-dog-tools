package org.farhan.mbt.conv.cucumber;

import java.util.ArrayList;

import org.farhan.mbt.conv.core.ConvertibleFile;
import org.farhan.mbt.conv.core.ToUMLConversionMojo;
import org.farhan.mbt.conv.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.conv.core.ToUMLFirstLayerLinker;
import org.farhan.mbt.conv.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.conv.core.ToUMLOtherLayerLinker;
import org.farhan.mbt.conv.uml.UMLProject;

public class ConvertCucumberToUMLPSTMojo extends ToUMLConversionMojo {

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
