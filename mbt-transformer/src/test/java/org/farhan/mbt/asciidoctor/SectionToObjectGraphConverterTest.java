package org.farhan.mbt.asciidoctor;

import org.farhan.mbt.graph.MBTVertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.farhan.mbt.asciidoctor.AsciiDoctorToGraphFirstLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SectionToObjectGraphConverterTest {

	@Test
	/**
	 * 
	 */
	void oneSectionOneVertexOneEdge() {
		try {
			AsciiDoctorToGraphFirstLayerConverter asciiDoctorToGraphFirstLayerConverter = new AsciiDoctorToGraphFirstLayerConverter();
			asciiDoctorToGraphFirstLayerConverter.createFromAdoc("oneSectionOneVertexOneEdge.adoc");
			MBTGraph<MBTVertex, MBTEdge> g = GraphProject.getFirstLayerGraphs().getFirst();
			Assertions.assertEquals(
					"Feature Name ([start, end, Step 1], [start ->  -> Step 1=(start,Step 1), Step 1 ->  -> end=(Step 1,end)])",
					g.toString());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Test
	/**
	 * 
	 */
	void manySectionOneVertexOneEdge() {

		try {
			AsciiDoctorToGraphFirstLayerConverter asciiDoctorToGraphFirstLayerConverter = new AsciiDoctorToGraphFirstLayerConverter();
			asciiDoctorToGraphFirstLayerConverter.createFromAdoc("manySectionOneVertexOneEdge.adoc");
			MBTGraph<MBTVertex, MBTEdge> g = GraphProject.getFirstLayerGraphs().getFirst();
			Assertions.assertEquals("Feature Name " + "([start, end, Step 1], "
					+ "[start ->  -> Step 1=(start,Step 1), Step 1 ->  -> end=(Step 1,end)])", g.toString());

		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Test
	/**
	 * 
	 */
	void oneSectionManyVertexOneEdge() {

		try {
			AsciiDoctorToGraphFirstLayerConverter asciiDoctorToGraphFirstLayerConverter = new AsciiDoctorToGraphFirstLayerConverter();
			asciiDoctorToGraphFirstLayerConverter.createFromAdoc("oneSectionManyVertexOneEdge.adoc");
			MBTGraph<MBTVertex, MBTEdge> g = GraphProject.getFirstLayerGraphs().getFirst();
			Assertions.assertEquals("Feature Name " + "([start, end, Step 1, Step 2], "
					+ "[start ->  -> Step 1=(start,Step 1), Step 1 ->  -> Step 2=(Step 1,Step 2), Step 2 ->  -> end=(Step 2,end)])",
					g.toString());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

}
