package org.farhan.mbt.asciidoctorgraph;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.ToGraphConversionMojo;
import org.farhan.mbt.core.ToGraphLayerConverter;
import org.farhan.mbt.graph.GraphProject;

public class ConvertAsciiDoctorToGraphMojo extends ToGraphConversionMojo {

	@Override
	protected ArrayList<ToGraphLayerConverter> getLayerConverters() {
		ArrayList<ToGraphLayerConverter> converters = new ArrayList<ToGraphLayerConverter>();
		converters.add(new AsciiDoctorToGraphFirstLayerConverter(Project.firstLayerPackageName));
		return converters;
	}

	@Override
	protected void initProjects() {
		GraphProject.init();
		AsciiDoctorProject.init();
	}

	@Override
	protected void save() throws Exception {
		GraphProject.writeFiles();
	}
}
