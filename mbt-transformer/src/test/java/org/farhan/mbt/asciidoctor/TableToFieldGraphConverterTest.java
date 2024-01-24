package org.farhan.mbt.asciidoctor;

import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.asciidoctor.AsciiDoctorToGraphFirstLayerConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableToFieldGraphConverterTest {

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		try {
			AsciiDoctorToGraphFirstLayerConverter asciiDoctorToGraphFirstLayerConverter = new AsciiDoctorToGraphFirstLayerConverter();
			asciiDoctorToGraphFirstLayerConverter.createFromAdoc("singleOutgoingEdgeFromAllVertices.adoc");
			MBTGraph<MBTVertex, MBTEdge> g = GraphProject.getFirstLayerGraphs().getFirst();
			MBTEdge edge = (MBTEdge) g.outgoingEdgesOf(g.getVertex("Set Object as follows")).toArray()[0];
			MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
			Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
					+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
					+ "group -> 10 -> certificate=(group,certificate), "
					+ "certificate -> 15 -> end=(certificate,end)])", g1.toString());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertex() {

		try {
			AsciiDoctorToGraphFirstLayerConverter asciiDoctorToGraphFirstLayerConverter = new AsciiDoctorToGraphFirstLayerConverter();
			asciiDoctorToGraphFirstLayerConverter.createFromAdoc("multipleOutgoingEdgesFromOneVertex.adoc");
			MBTGraph<MBTVertex, MBTEdge> g = GraphProject.getFirstLayerGraphs().getFirst();
			MBTEdge edge = (MBTEdge) g.outgoingEdgesOf(g.getVertex("Set Object as follows")).toArray()[0];
			MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
			Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
					+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
					+ "group -> 10 -> certificate=(group,certificate), "
					+ "certificate -> 15 -> end=(certificate,end), " + "certificate -> 12 -> end=(certificate,end)])",
					g1.toString());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {
		try {
			AsciiDoctorToGraphFirstLayerConverter asciiDoctorToGraphFirstLayerConverter = new AsciiDoctorToGraphFirstLayerConverter();
			asciiDoctorToGraphFirstLayerConverter.createFromAdoc("multipleOutgoingEdgesFromAllVertices.adoc");
			MBTGraph<MBTVertex, MBTEdge> g = GraphProject.getFirstLayerGraphs().getFirst();
			MBTEdge edge = (MBTEdge) g.outgoingEdgesOf(g.getVertex("Set Object as follows")).toArray()[0];
			MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
			Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
					+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
					+ "group -> 10 -> certificate=(group,certificate), "
					+ "certificate -> 15 -> end=(certificate,end), " + "insurer -> 4 -> group=(insurer,group), "
					+ "group -> 8 -> certificate=(group,certificate), "
					+ "certificate -> 12 -> end=(certificate,end)])", g1.toString());
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}

}
