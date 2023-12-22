package org.farhan.mbt.conv.cucumber;

import java.io.File;
import java.util.ArrayList;

import org.farhan.conv.core.ConvertibleFile;
import org.farhan.conv.core.Project;
import org.farhan.conv.core.ToUMLConversionMojo;
import org.farhan.conv.core.ToUMLFirstLayerConverter;
import org.farhan.conv.core.ToUMLFirstLayerLinker;
import org.farhan.conv.core.ToUMLOtherLayerConverter;
import org.farhan.conv.core.ToUMLOtherLayerLinker;
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
		return CucumberProject.firstLayerFiles;
	}

	@Override
	protected ArrayList<ConvertibleFile> getSecondLayerFiles() {
		return CucumberProject.secondLayerFiles;
	}

	@Override
	protected ArrayList<ConvertibleFile> getThirdLayerFiles() {
		return CucumberProject.thirdLayerFiles;
	}

	@Override
	protected void initProjects() {
		UMLProject.init();
		CucumberProject.init();
	}

	@Override
	protected void writeFiles() throws Exception {
		UMLProject.writeFiles(new File(Project.baseDir + Project.umlDir));
	}
}
