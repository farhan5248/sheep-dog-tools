package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.mbt.converter.GraphToUMLConverter;
import org.farhan.mbt.core.ConvertToUML;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUML extends ConvertToUML {

	JGraphTProject source;
	UMLProject target;

	@Override
	protected ArrayList<ToUMLConverter> getLayerConverters() {
		ArrayList<ToUMLConverter> converters = new ArrayList<ToUMLConverter>();
		converters.add(new GraphToUMLConverter(source.FIRST_LAYER, source, target));
		return converters;
	}

	@Override
	protected void initProjects() {
		source = new JGraphTProject();
		target = new UMLProject();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}
}
