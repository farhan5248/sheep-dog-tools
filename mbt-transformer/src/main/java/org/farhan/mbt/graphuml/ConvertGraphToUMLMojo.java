package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleFile;
import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUMLMojo extends ToUMLConversionMojo {

	@Override
	protected ToUMLOtherLayerConverter getOtherLayerConverter() {
		return new GraphToUMLOtherLayerConverter();
	}

	@Override
	protected ToUMLFirstLayerConverter getFirstLayerConverter() {
		return new GraphToUMLFirstLayerConverter();
	}

	@Override
	protected void initProjects() {
		UMLProject.init();
		GraphProject.init();
	}

	@Override
	protected void writeFiles() throws Exception {
		UMLProject.writeFiles();
	}
}
