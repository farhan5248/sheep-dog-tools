package org.farhan.mbt.cucumberuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertCucumberToUML extends ToUMLConversionMojo {

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
	protected void initProjects() {
		source = new CucumberProject();
		target = new UMLProject();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}

}
