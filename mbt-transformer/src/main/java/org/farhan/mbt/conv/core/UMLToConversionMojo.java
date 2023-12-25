package org.farhan.mbt.conv.core;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;

public abstract class UMLToConversionMojo {

	protected UMLToFirstLayerConverter firstLayerConverter;
	protected UMLToOtherLayerConverter otherLayerConverter;

	protected abstract UMLToOtherLayerConverter getOtherLayerConverter();

	protected abstract UMLToFirstLayerConverter getFirstLayerConverter();

	protected abstract ArrayList<Class> getFirstLayerClasses();

	protected abstract ArrayList<Class> getSecondLayerClasses();

	protected abstract ArrayList<Class> getThirdLayerClasses();

	protected abstract void writeFiles() throws Exception;

	protected abstract void initProjects();

	public void mojoGoal() throws Exception {

		initProjects();
		firstLayerConverter = getFirstLayerConverter();
		otherLayerConverter = getOtherLayerConverter();
		firstLayerConverter.selectLayerClasses(Project.firstLayerPackageName);
		firstLayerConverter.transformLayerClasses(getFirstLayerClasses());
		otherLayerConverter.selectLayerClasses(Project.secondLayerPackageName);
		otherLayerConverter.transformLayerClasses(getSecondLayerClasses());
		otherLayerConverter.selectLayerClasses(Project.thirdLayerPackageName);
		otherLayerConverter.transformLayerClasses(getThirdLayerClasses());
		writeFiles();
	}

}
