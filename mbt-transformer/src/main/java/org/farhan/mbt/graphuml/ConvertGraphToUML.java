package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLConverter;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUML extends ToUMLConversionMojo {

	GraphProject sourceProject;
	UMLProject targetProject;

	@Override
	protected ArrayList<ToUMLConverter> getLayerConverters() {
		ArrayList<ToUMLConverter> converters = new ArrayList<ToUMLConverter>();
		converters.add(new GraphToUMLConverter(sourceProject.firstLayerName, sourceProject, targetProject));
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
