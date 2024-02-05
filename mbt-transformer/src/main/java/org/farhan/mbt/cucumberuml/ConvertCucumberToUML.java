package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertToUML;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUML extends ConvertToUML {

	CucumberProject source;
	UMLProject target;

	@Override
	protected ArrayList<ToUMLConverter> getLayerConverters() {
		ArrayList<ToUMLConverter> converters = new ArrayList<ToUMLConverter>();
		converters.add(new FeatureToUMLConverter(source.firstLayerName, source, target));
		converters.add(new JavaToUMLConverter(source.secondLayerName, source, target));
		converters.add(new JavaToUMLConverter(source.thirdLayerName, source, target));
		return converters;
	}

	@Override
	protected void initProjects() throws Exception {
		source = new CucumberProject();
		target = new UMLProject();
		// TODO this is inefficient, it's reading every file unnecessarily, move the
		// call to read() to selectObjects. The same applies to the first layer.
		// Basically move file reading out of the project to the converters to be more
		// selective
		source.load();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}

}
