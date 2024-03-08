package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertToGraph;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToGraph extends ConvertToGraph {

	UMLProject source;
	JGraphTProject target;

	@Override
	protected ArrayList<ToGraphConverter> getLayerConverters() {
		ArrayList<ToGraphConverter> converters = new ArrayList<ToGraphConverter>();
		converters.add(new UMLToGraphConverter(source.FIRST_LAYER, source, target));
		return converters;
	}

	@Override
	protected void initProjects() throws Exception {
		source = new UMLProject();
		target = new JGraphTProject();
		// TODO temporarily need this until I figure out how to read the model file just
		// once for multiple layers. Reading it multiple times risks overriding
		// modifications to it
		source.load();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}
}
