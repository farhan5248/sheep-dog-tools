package org.farhan.mbt.conv.cucumber;

import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.farhan.conv.core.Project;
import org.farhan.conv.core.UMLToConversionMojo;
import org.farhan.conv.core.UMLToFirstLayerConverter;
import org.farhan.conv.core.UMLToOtherLayerConverter;
import org.farhan.conv.core.Utilities;
import org.farhan.mbt.conv.uml.UMLProject;

public class ConvertUMLToCucumberPSTMojo extends UMLToConversionMojo {

	@Override
	protected UMLToOtherLayerConverter getOtherLayerConverter() {
		return new UMLToCucumberOtherLayerConverter();
	}

	@Override
	protected UMLToFirstLayerConverter getFirstLayerConverter() {
		return new UMLToCucumberFirstLayerConverter();
	}

	@Override
	protected ArrayList<Class> getFirstLayerClasses() {
		return getClasses(Project.firstLayerPackageName);
	}

	@Override
	protected ArrayList<Class> getSecondLayerClasses() {
		return getClasses(Project.secondLayerPackageName);
	}

	@Override
	protected ArrayList<Class> getThirdLayerClasses() {
		return getClasses(Project.thirdLayerPackageName);
	}

	private ArrayList<Class> getClasses(String packageName) {
		ArrayList<Class> layerClasses = null;
		try {
			UMLProject.readFiles();
			//TODO replace with UMLProject.getFirstLayerClasses etc
			layerClasses = UMLProject.getPackageClasses(UMLProject.theSystem.getNestedPackage(packageName));
		} catch (IOException e) {
			System.out.println(Utilities.getStackTraceAsString(e));
		}
		return layerClasses;
	}

	@Override
	protected void writeFiles() throws Exception {
		// TODO make writeFiles and readFiles for Projects consistent
		CucumberProject.writeFiles();
	}

	@Override
	protected void initProjects() {
		CucumberProject.init();
		UMLProject.init();
	}

}
