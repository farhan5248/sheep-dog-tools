package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;
import org.eclipse.uml2.uml.Class;
import org.farhan.mbt.core.UMLToConversionMojo;
import org.farhan.mbt.core.UMLToFirstLayerConverter;
import org.farhan.mbt.core.UMLToOtherLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberMojo extends UMLToConversionMojo {

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
		try {
			UMLProject.readFiles();
		} catch (Exception e) {
			System.out.println(Utilities.getStackTraceAsString(e));
		}
		return UMLProject.getFirstLayerClasses();
	}

	@Override
	protected ArrayList<Class> getSecondLayerClasses() {
		try {
			UMLProject.readFiles();
		} catch (Exception e) {
			System.out.println(Utilities.getStackTraceAsString(e));
		}
		return UMLProject.getSecondLayerClasses();
	}

	@Override
	protected ArrayList<Class> getThirdLayerClasses() {
		try {
			UMLProject.readFiles();
		} catch (Exception e) {
			System.out.println(Utilities.getStackTraceAsString(e));
		}
		return UMLProject.getThirdLayerClasses();
	}

	@Override
	protected void writeFiles() throws Exception {
		CucumberProject.writeFiles();
	}

	@Override
	protected void initProjects() {
		CucumberProject.init();
		UMLProject.init();
	}

}
