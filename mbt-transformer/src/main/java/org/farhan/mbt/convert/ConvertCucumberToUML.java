package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.mbt.converter.FeatureToUMLConverter;
import org.farhan.mbt.converter.JavaToUMLConverter;
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
		converters.add(new FeatureToUMLConverter(source.FIRST_LAYER, source, target));
		converters.add(new JavaToUMLConverter(source.SECOND_LAYER, source, target));
		converters.add(new JavaToUMLConverter(source.THIRD_LAYER, source, target));
		return converters;
	}

	@Override
	protected void initProjects() throws Exception {
		source = new CucumberProject();
		target = new UMLProject();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}

}
