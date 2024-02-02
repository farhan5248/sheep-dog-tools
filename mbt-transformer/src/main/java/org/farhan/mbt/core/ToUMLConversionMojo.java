package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToUMLConversionMojo {

	protected ToUMLFirstLayerConverter firstLayerConverter;
	protected ToUMLOtherLayerConverter otherLayerConverter;

	protected abstract ToUMLOtherLayerConverter getOtherLayerConverter();

	protected abstract ToUMLFirstLayerConverter getFirstLayerConverter();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		// TODO remove linkers, to mimic forward engineering code of 3 layer transforms
		initProjects();
		firstLayerConverter = getFirstLayerConverter();
		otherLayerConverter = getOtherLayerConverter();
		// TODO this should be the tag
		firstLayerConverter.selectLayerFiles(Project.firstLayerPackageName);
		firstLayerConverter.transformLayerFiles(Project.firstLayerPackageName);
		otherLayerConverter.selectLayerFiles(Project.secondLayerPackageName);
		otherLayerConverter.transformLayerFiles(Project.secondLayerPackageName);
		otherLayerConverter.selectLayerFiles(Project.thirdLayerPackageName);
		otherLayerConverter.transformLayerFiles(Project.thirdLayerPackageName);
		writeFiles();
	}
}
