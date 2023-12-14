package org.farhan.conv.core;

import java.io.File;

import org.apache.log4j.Logger;
import org.eclipse.uml2.uml.Model;
import org.farhan.mbt.conv.uml.UMLProject;

public abstract class ConversionMojo {

	Logger log;
	protected Model theSystem;
	protected FirstLayerConverter firstLayerConverter;
	protected OtherLayerConverter otherLayerConverter;
	protected FirstLayerLinker firstLayerLinker;
	protected OtherLayerLinker otherLayerLinker;

	protected abstract OtherLayerConverter getOtherLayerConverter(Model theSystem);

	protected abstract FirstLayerConverter getFirstLayerConverter(Model theSystem);

	protected abstract FirstLayerLinker getFirstLayerLinker(Model theSystem);

	protected abstract OtherLayerLinker getOtherLayerLinker(Model theSystem);

	public void mojoGoal() throws Exception {

		theSystem = UMLProject.initProject("pst");
		firstLayerConverter = getFirstLayerConverter(theSystem);
		otherLayerConverter = getOtherLayerConverter(theSystem);
		firstLayerLinker = getFirstLayerLinker(theSystem);
		otherLayerLinker = getOtherLayerLinker(theSystem);
		Project.firstLayerFiles = firstLayerConverter.selectLayerFiles("");
		firstLayerConverter.transformLayerFiles(Project.firstLayerFiles);
		Project.secondLayerFiles = otherLayerConverter.selectLayerFiles(Project.firstLayerPackageName);
		otherLayerConverter.transformLayerFiles(Project.secondLayerFiles);
		firstLayerLinker.linkLayerFiles(Project.firstLayerPackageName);
		Project.thirdLayerFiles = otherLayerConverter.selectLayerFiles(Project.secondLayerPackageName);
		otherLayerConverter.transformLayerFiles(Project.thirdLayerFiles);
		otherLayerLinker.linkLayerFiles(Project.secondLayerPackageName);
		UMLProject.exportUMLFiles(theSystem, new File(Project.baseDir + Project.umlDir));
	}

}
