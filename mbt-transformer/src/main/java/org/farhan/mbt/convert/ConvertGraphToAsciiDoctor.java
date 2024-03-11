package org.farhan.mbt.convert;

import java.util.ArrayList;

import org.farhan.mbt.asciidoctor.AsciiDoctorProject;
import org.farhan.mbt.converter.GraphToAdocConverter;
import org.farhan.mbt.core.ConvertToDocument;
import org.farhan.mbt.core.ToDocumentConverter;
import org.farhan.mbt.graph.JGraphTProject;

public class ConvertGraphToAsciiDoctor extends ConvertToDocument {

	JGraphTProject source;
	AsciiDoctorProject target;

	@Override
	protected ArrayList<ToDocumentConverter> getLayerConverters() {
		ArrayList<ToDocumentConverter> converters = new ArrayList<ToDocumentConverter>();
		converters.add(new GraphToAdocConverter(source.FIRST_LAYER, source, target));
		return converters;
	}

	@Override
	protected void initProjects() throws Exception {
		source = new JGraphTProject();
		target = new AsciiDoctorProject();
	}

	@Override
	protected void save() throws Exception {
		target.save();
	}
}
