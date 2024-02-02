package org.farhan.mbt.core;

public abstract class UMLToConversionMojo {

	protected UMLToFirstLayerConverter firstLayerConverter;
	protected UMLToOtherLayerConverter otherLayerConverter;

	protected abstract UMLToOtherLayerConverter getOtherLayerConverter();

	protected abstract UMLToFirstLayerConverter getFirstLayerConverter();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects() throws Exception;

	public void mojoGoal() throws Exception {

		initProjects();
		firstLayerConverter = getFirstLayerConverter();
		otherLayerConverter = getOtherLayerConverter();
		firstLayerConverter.selectLayerClasses(Project.firstLayerPackageName);
		firstLayerConverter.transformLayerClasses(Project.firstLayerPackageName);
		otherLayerConverter.selectLayerClasses(Project.secondLayerPackageName);
		otherLayerConverter.transformLayerClasses(Project.secondLayerPackageName);
		otherLayerConverter.selectLayerClasses(Project.thirdLayerPackageName);
		otherLayerConverter.transformLayerClasses(Project.thirdLayerPackageName);
		writeFiles();
	}

}
