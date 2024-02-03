package org.farhan.mbt.graphuml;

import java.util.ArrayList;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.Project;
import org.farhan.mbt.core.ToUMLConversionMojo;
import org.farhan.mbt.core.ToUMLFirstLayerConverter;
import org.farhan.mbt.core.ToUMLLayerConverter;
import org.farhan.mbt.core.ToUMLOtherLayerConverter;
import org.farhan.mbt.cucumberuml.CucumberToUMLFirstLayerConverter;
import org.farhan.mbt.cucumberuml.CucumberToUMLOtherLayerConverter;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertGraphToUMLMojo extends ToUMLConversionMojo {

	@Override
	protected ArrayList<ToUMLLayerConverter> getLayerConverters() {
		ArrayList<ToUMLLayerConverter> converters = new ArrayList<ToUMLLayerConverter>();
		converters.add(new GraphToUMLFirstLayerConverter(Project.firstLayerPackageName));
		return converters;
	}

	@Override
	protected void initProjects() {
		UMLProject.init();
		GraphProject.init();
	}

	@Override
	protected void save() throws Exception {
		UMLProject.writeFiles();
	}
}
