package org.farhan.mbt.asciidoctorgraph;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ToGraphConversionMojo;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.JGraphTProject;

public class ConvertAsciiDoctorToGraph extends ToGraphConversionMojo {

	AsciiDoctorProject source;
	JGraphTProject target;

	@Override
	protected ArrayList<ToGraphConverter> getLayerConverters() {
		ArrayList<ToGraphConverter> converters = new ArrayList<ToGraphConverter>();
		converters.add(new AdocToGraphConverter(source.firstLayerName, source, target));
		return converters;
	}

	@Override
	protected void initProjects() {
		source = new AsciiDoctorProject();
		target = new JGraphTProject();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}
}
