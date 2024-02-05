package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertToCode;
import org.farhan.mbt.core.ToCodeConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumber extends ConvertToCode {

	// TODO move these into the converters themselves, think about how to read the
	// UML file before writing the next layer to it
	UMLProject source;
	CucumberProject target;

	@Override
	protected ArrayList<ToCodeConverter> getLayerConverters() {
		ArrayList<ToCodeConverter> converters = new ArrayList<ToCodeConverter>();
		converters
				.add(new UMLToFeatureConverter(source.firstLayerName, source, target));
		converters
				.add(new UMLToJavaConverter(source.secondLayerName, source, target));
		converters
				.add(new UMLToJavaConverter(source.thirdLayerName, source, target));
		return converters;
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}

	@Override
	protected void initProjects() throws Exception {

		source = new UMLProject();
		target = new CucumberProject();
		source.load();
	}

}
