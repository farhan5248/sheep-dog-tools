package org.farhan;

import java.util.ArrayList;
import java.util.Set;

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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<AttributePath> paths = PathGenerator.getAllPaths(g, g.getStartVertice());
		for (AttributePath p : paths) {
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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<AttributePath> paths = PathGenerator.getAllPaths(g, g.getStartVertice());
		for (AttributePath p : paths) {
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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<AttributePath> paths = PathGenerator.getAllPaths(g, g.getStartVertice());
		for (AttributePath p : paths) {
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

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		Set<AttributeWeightedEdge> edges = g.getAllEdges(new AttributeVertex("group"),
				new AttributeVertex("certificate"));
		for (AttributeWeightedEdge edge : edges) {
			if (edge.getLabel().contentEquals("8")) {
				edge.setTag("tagged");
			}
		}
		ArrayList<AttributePath> paths = PathGenerator.getTaggedPaths(g, g.getStartVertice(), "tagged");
		for (AttributePath p : paths) {
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
