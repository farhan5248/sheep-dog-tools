package org.farhan.mbt.graph.generation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.graphuml.PathGenerator;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathGeneratorTest {

	public static MBTGraph<MBTVertex, MBTEdge> createEmpty(String name) {
		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(name);
		g.createStartVertex();
		g.createEndVertex();
		return g;
	}

	public static MBTGraph<MBTVertex, MBTEdge> createFromMultipleColumns(MBTTable table) {

		MBTGraph<MBTVertex, MBTEdge> g = createEmpty(table.getCaption());

		// get vertices from table
		ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
		// TODO validate the table has at least two rows
		for (String h : table.get(0)) {
			vertices.add(g.createVertex(h));
		}

		// go through each row and convert to edge
		for (int i = 1; i < table.size(); i++) {

			g.createEdgeWithInput(g.getStartVertex(), vertices.getFirst(), "", "");

			ArrayList<String> row = table.get(i);
			for (int j = 0; j < vertices.size() - 1; j++) {
				String label = row.get(j);
				if (!label.isEmpty()) {
					g.createEdgeWithInput(vertices.get(j), vertices.get(j + 1), row.get(j), row.get(j));
				}
			}
			// TODO this assumes the last column isn't blank
			g.createEdgeWithInput(vertices.getLast(), g.getEndVertex(), row.getLast(), row.getLast());
		}
		return g;
	}

	public static MBTGraph<MBTVertex, MBTEdge> createFromMultiList(Map<String, ArrayList<String>> lists,
			String listsName) {
		MBTGraph<MBTVertex, MBTEdge> g = createEmpty(listsName);
		for (String listName : lists.keySet()) {
			createFromList(g, lists.get(listName), listName);
		}
		return g;
	}

	public static void createFromList(MBTGraph<MBTVertex, MBTEdge> g, ArrayList<String> list, String name) {

		g.createEdgeWithVertices(g.getStartVertex().getLabel(), list.getFirst(), "", null);
		for (int i = 0; i < list.size() - 1; i++) {
			// this step would probably be getting block title
			String source = list.get(i);
			String target = list.get(i + 1);
			g.createEdgeWithVertices(source, target, name, null);
		}
		g.createEdgeWithVertices(list.getLast(), g.getEndVertex().getLabel(), name, null);
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		MBTTable table = new MBTTable("Set Object as follows");
		table.addRow("ins", "grp", "crt");
		table.addRow("5", "10", "15");

		MBTGraph<MBTVertex, MBTEdge> g = createFromMultipleColumns(table);
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

		MBTGraph<MBTVertex, MBTEdge> g = createFromMultipleColumns(table);
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

		MBTGraph<MBTVertex, MBTEdge> g = createFromMultipleColumns(table);
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

		MBTGraph<MBTVertex, MBTEdge> g = createFromMultipleColumns(table);
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

		MBTGraph<MBTVertex, MBTEdge> objectGraph = createFromMultiList(lists, "Feature Name");
		MBTGraph<MBTVertex, MBTEdge> fieldGraph = createFromMultipleColumns(fieldTable);
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
