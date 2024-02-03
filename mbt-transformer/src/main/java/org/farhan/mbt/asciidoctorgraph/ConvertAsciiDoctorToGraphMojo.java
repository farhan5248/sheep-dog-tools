package org.farhan.mbt.asciidoctorgraph;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ToGraphConversionMojo;
import org.farhan.mbt.core.ToGraphLayerConverter;
import org.farhan.mbt.graph.GraphProject;

public class ConvertAsciiDoctorToGraphMojo extends ToGraphConversionMojo {

	AsciiDoctorProject sourceProject;
	GraphProject targetProject;

	@Override
	protected ArrayList<ToGraphLayerConverter> getLayerConverters() {
		ArrayList<ToGraphLayerConverter> converters = new ArrayList<ToGraphLayerConverter>();
		converters.add(new AsciiDoctorToGraphFirstLayerConverter(sourceProject.firstLayerName, sourceProject, targetProject));
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
