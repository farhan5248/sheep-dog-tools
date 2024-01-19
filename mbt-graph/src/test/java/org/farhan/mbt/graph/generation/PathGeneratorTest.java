package org.farhan.mbt.graph.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.farhan.mbt.graph.conversion.TableToMBTGraphConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathGeneratorTest {

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("ins", "grp", "crt");
		table.addRow("5", "10", "15");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(g, g.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(1, paths.size());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(0).toString());
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertice() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("ins", "grp", "crt");
		table.addRow("5", "10", "15");
		table.addRow("5", "10", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(g, g.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(2, paths.size());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(0).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(1).toString());
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("ins", "grp", "crt");
		table.addRow("5", "10", "15");
		table.addRow("4", "8", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(g, g.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(8, paths.size());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(0).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(1).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(2).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(3).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 4 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(4).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 4 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(5).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 4 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(6).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 4 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(7).toString());
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void taggedEdgesFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("ins", "grp", "crt");
		table.addRow("5", "10", "15");
		table.addRow("4", "8", "12");

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createFromMultipleColumns(table);
		Set<MBTEdge> edges = g.getAllEdges(new MBTVertex("grp"), new MBTVertex("crt"));
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
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(0).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(1).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 4 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end)",
				paths.get(2).toString());
		Assertions.assertEquals(
				"(start) -> (start ->  -> ins) -> (ins) -> (ins -> 4 -> grp) -> (grp) -> (grp -> 8 -> crt) -> (crt) -> (crt -> 12 -> end) -> (end)",
				paths.get(3).toString());
	}

	@Test
	/**
	 * TODO 
	 */
	void compoundPaths() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Step 1");
		Map<String, ArrayList<String>> lists = new HashMap<String, ArrayList<String>>();
		lists.put("Scenario name", list);

		MBTTable fieldTable = new MBTTable("Step 1");
		fieldTable.addRow("ins", "grp", "crt");
		fieldTable.addRow("5", "10", "15");

		MBTGraph<MBTVertex, MBTEdge> objectGraph = TableToMBTGraphConverter.createFromMultiList(lists, "Feature Name");
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = TableToMBTGraphConverter.createFromMultipleColumns(fieldTable);
		MBTEdge edge = (MBTEdge) objectGraph.outgoingEdgesOf(objectGraph.getVertex("Step 1")).toArray()[0];
		edge.setValue(fieldGraph);

		ArrayList<MBTPath> paths = PathGenerator.getAllPaths(objectGraph, objectGraph.getStartVertex());
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals("(start) -> (start ->  -> Step 1) -> (Step 1) -> "
				+ "(start) -> (start ->  -> ins) -> (ins) -> (ins -> 5 -> grp) -> (grp) -> (grp -> 10 -> crt) -> (crt) -> (crt -> 15 -> end) -> (end) -> "
				+ "(end)", paths.get(0).toString());
	}

}
