package org.farhan.mbt.graph.generation;

import java.util.ArrayList;
import java.util.Set;

import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.farhan.mbt.graph.conversion.TableToMBTGraphConverter;
import org.farhan.mbt.graph.generation.PathGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathGeneratorTest {

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(g, g.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(1, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				paths.get(0).toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertice() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");
		table.addRow("5", "10", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(g, g.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(2, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				paths.get(0).toString());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 12 -> end",
				paths.get(1).toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");
		table.addRow("4", "8", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(g, g.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(8, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				paths.get(0).toString());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 12 -> end",
				paths.get(1).toString());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 8 -> certificate -> 15 -> end",
				paths.get(2).toString());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 8 -> certificate -> 12 -> end",
				paths.get(3).toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 10 -> certificate -> 15 -> end",
				paths.get(4).toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 10 -> certificate -> 12 -> end",
				paths.get(5).toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 8 -> certificate -> 15 -> end",
				paths.get(6).toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 8 -> certificate -> 12 -> end",
				paths.get(7).toString());
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void taggedEdgesFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("insurer", "group", "certificate");
		table.addRow("5", "10", "15");
		table.addRow("4", "8", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		Set<MBTEdge> edges = g.getAllEdges(new MBTVertex("group"),
				new MBTVertex("certificate"));
		for (MBTEdge edge : edges) {
			if (edge.getLabel().contentEquals("8")) {
				edge.setTag("tagged");
			}
		}
		ArrayList<MBTPath> paths = PathGenerator.getTaggedPaths(g, g.getStartVertex(), "tagged");
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(4, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 8 -> certificate -> 15 -> end",
				paths.get(0).toString());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 8 -> certificate -> 12 -> end",
				paths.get(1).toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 8 -> certificate -> 15 -> end",
				paths.get(2).toString());
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 8 -> certificate -> 12 -> end",
				paths.get(3).toString());
	}

}
