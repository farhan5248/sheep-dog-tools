package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.converter.AsciiDoctorToGraphConverter;
import org.farhan.mbt.core.ConvertToGraph;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.JGraphTProject;

public class ConvertAsciiDoctorToGraph extends ConvertToGraph {

	AsciiDoctorProject source;
	JGraphTProject target;

	@Override
	protected ArrayList<ToGraphConverter> getLayerConverters() {
		ArrayList<ToGraphConverter> converters = new ArrayList<ToGraphConverter>();
		converters.add(new AsciiDoctorToGraphConverter(source.FIRST_LAYER, source, target));
		return converters;
	}

	@Override
	protected void initProjects() throws Exception {
		source = new AsciiDoctorProject();
		target = new JGraphTProject();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}
}
