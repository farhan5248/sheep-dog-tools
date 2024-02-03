package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLLayerConverter;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUMLMojo extends ToUMLConversionMojo {

	GraphProject sourceProject;
	UMLProject targetProject;

	@Override
	protected ArrayList<ToUMLLayerConverter> getLayerConverters() {
		ArrayList<ToUMLLayerConverter> converters = new ArrayList<ToUMLLayerConverter>();
		converters.add(new GraphToUMLFirstLayerConverter(sourceProject.firstLayerName, sourceProject, targetProject));
		return converters;
	}

	@Override
	protected void initProjects() {
		sourceProject = new GraphProject();
		targetProject = new UMLProject();
	}

	@Override
	protected void save() throws Exception {
		targetProject.save();
	}
}
