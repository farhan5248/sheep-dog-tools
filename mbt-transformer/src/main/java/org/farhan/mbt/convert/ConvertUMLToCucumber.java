package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.mbt.converter.UMLToCucumberConverter;
import org.farhan.mbt.core.ConvertToCode;
import org.farhan.mbt.core.ToCodeConverter;
import org.farhan.mbt.cucumber.CucumberProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumber extends ConvertToCode {

	UMLProject source;
	CucumberProject target;

	@Override
	protected ArrayList<ToCodeConverter> getLayerConverters() {
		ArrayList<ToCodeConverter> converters = new ArrayList<ToCodeConverter>();
		converters.add(new UMLToCucumberConverter(source.FIRST_LAYER, source, target));
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

		// TODO temporarily need this until I figure out how to read the model file just
		// once for multiple layers. Reading it multiple times risks overriding
		// modifications to it
		source.load();

	}

}
