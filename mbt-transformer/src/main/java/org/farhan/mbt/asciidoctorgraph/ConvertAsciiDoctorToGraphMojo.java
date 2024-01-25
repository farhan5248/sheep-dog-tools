package org.farhan.mbt.asciidoctorgraph;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.ToGraphConversionMojo;
import org.farhan.mbt.core.ToGraphFirstLayerConverter;
import org.farhan.mbt.graph.GraphProject;

public class ConvertAsciiDoctorToGraphMojo extends ToGraphConversionMojo {

	@Override
	protected ToGraphFirstLayerConverter getFirstLayerConverter() {
		return new AsciiDoctorToGraphFirstLayerConverter();
	}

	@Override
	protected ArrayList<ConvertibleFile> getFirstLayerFiles() {
		return AsciiDoctorProject.getFirstLayerFiles();
	}

	@Override
	protected void initProjects() {
		GraphProject.init();
		AsciiDoctorProject.init();
	}

	@Override
	protected void writeFiles() throws Exception {
		GraphProject.writeFiles();
	}
}
