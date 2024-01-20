package org.farhan.mbt.asciidoctor;

import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.asciidoctor.AdocToMBTGraphConverter;
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

		MBTGraph<MBTVertex, MBTEdge> g = AdocToMBTGraphConverter
				.createFromAdoc("singleOutgoingEdgeFromAllVertices.adoc");
		MBTEdge edge = (MBTEdge) g.outgoingEdgesOf(g.getVertex("Set Object as follows")).toArray()[0];
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();

		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end)])",
				g1.toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertex() {

		MBTGraph<MBTVertex, MBTEdge> g = AdocToMBTGraphConverter
				.createFromAdoc("multipleOutgoingEdgesFromOneVertex.adoc");
		MBTEdge edge = (MBTEdge) g.outgoingEdgesOf(g.getVertex("Set Object as follows")).toArray()[0];
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end), "
				+ "certificate -> 12 -> end=(certificate,end)])", g1.toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		MBTGraph<MBTVertex, MBTEdge> g = AdocToMBTGraphConverter
				.createFromAdoc("multipleOutgoingEdgesFromAllVertices.adoc");
		MBTEdge edge = (MBTEdge) g.outgoingEdgesOf(g.getVertex("Set Object as follows")).toArray()[0];
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertEquals("Set Object as follows " + "([start, end, insurer, group, certificate], "
				+ "[start ->  -> insurer=(start,insurer), " + "insurer -> 5 -> group=(insurer,group), "
				+ "group -> 10 -> certificate=(group,certificate), " + "certificate -> 15 -> end=(certificate,end), "
				+ "insurer -> 4 -> group=(insurer,group), " + "group -> 8 -> certificate=(group,certificate), "
				+ "certificate -> 12 -> end=(certificate,end)])", g1.toString());
	}

}
