package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUML extends ToUMLConversionMojo {

	JGraphTProject source;
	UMLProject target;

	@Override
	protected ArrayList<ToUMLConverter> getLayerConverters() {
		ArrayList<ToUMLConverter> converters = new ArrayList<ToUMLConverter>();
		converters.add(new GraphToUMLConverter(source.firstLayerName, source, target));
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
