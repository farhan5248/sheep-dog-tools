package org.farhan.mbt.asciidoctorgraph;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ToGraphConversionMojo;
import org.farhan.mbt.core.ToGraphConverter;
import org.farhan.mbt.graph.GraphProject;

public class ConvertAsciiDoctorToGraph extends ToGraphConversionMojo {

	AsciiDoctorProject sourceProject;
	GraphProject targetProject;

	@Override
	protected ArrayList<ToGraphConverter> getLayerConverters() {
		ArrayList<ToGraphConverter> converters = new ArrayList<ToGraphConverter>();
		converters.add(new AdocToGraphLayerConverter(sourceProject.firstLayerName, sourceProject, targetProject));
		return converters;
	}

	@Override
	protected void initProjects() {
		sourceProject = new AsciiDoctorProject();
		targetProject = new GraphProject();
	}

	@Override
	protected void save() throws Exception {
		targetProject.save();
	}
}
