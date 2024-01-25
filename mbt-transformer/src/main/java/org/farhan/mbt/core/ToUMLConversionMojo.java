package org.farhan.mbt.core;

import java.util.ArrayList;

public abstract class ToUMLConversionMojo {

	protected ToUMLFirstLayerConverter firstLayerConverter;
	protected ToUMLOtherLayerConverter otherLayerConverter;
	protected ToUMLFirstLayerLinker firstLayerLinker;
	protected ToUMLOtherLayerLinker otherLayerLinker;

	protected abstract ToUMLOtherLayerConverter getOtherLayerConverter();

	protected abstract ToUMLFirstLayerConverter getFirstLayerConverter();

	protected abstract ToUMLFirstLayerLinker getFirstLayerLinker();

	protected abstract ToUMLOtherLayerLinker getOtherLayerLinker();

	protected abstract ArrayList<ConvertibleFile> getFirstLayerFiles();

	protected abstract ArrayList<ConvertibleFile> getSecondLayerFiles();

	protected abstract ArrayList<ConvertibleFile> getThirdLayerFiles();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		// TODO remove linkers, to mimic forward engineering code of 3 layer transforms
		initProjects();
		firstLayerConverter = getFirstLayerConverter();
		otherLayerConverter = getOtherLayerConverter();
		firstLayerLinker = getFirstLayerLinker();
		otherLayerLinker = getOtherLayerLinker();
		// TODO this should be the tag
		firstLayerConverter.selectLayerFiles(Project.firstLayerPackageName);
		firstLayerConverter.transformLayerFiles(getFirstLayerFiles());
		otherLayerConverter.selectLayerFiles(Project.secondLayerPackageName);
		otherLayerConverter.transformLayerFiles(getSecondLayerFiles());
		firstLayerLinker.linkLayerFiles(Project.firstLayerPackageName);
		otherLayerConverter.selectLayerFiles(Project.thirdLayerPackageName);
		otherLayerConverter.transformLayerFiles(getThirdLayerFiles());
		otherLayerLinker.linkLayerFiles(Project.secondLayerPackageName);
		writeFiles();
	}
}
