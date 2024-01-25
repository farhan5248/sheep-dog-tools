package org.farhan.mbt.graph.generation;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.graphuml.GraphToUMLFirstLayerConverter;
import org.farhan.mbt.graphuml.PathGenerator;
import org.farhan.mbt.uml.UMLProject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.GraphProject;
import org.farhan.mbt.graph.GraphTextFile;
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

	private GraphTextFile readFile(String name) {
		GraphTextFile gtf = new GraphTextFile(new File(name));
		try {
			gtf.read();
		} catch (Exception e) {
			System.out.println(Utilities.getStackTraceAsString(e));
		}
		return gtf;
	}

	private ArrayList<MBTPath> runConversion(GraphTextFile gtf) {
		GraphToUMLFirstLayerConverter c = new GraphToUMLFirstLayerConverter();
		try {
			c.temp(gtf);
			UMLProject.writeFiles();
		} catch (Exception e) {
			System.out.println(Utilities.getStackTraceAsString(e));
		}
		return c.paths;
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		UMLProject.init();
		GraphProject.init();
		GraphTextFile gtf = readFile("target/Graphs/singleOutgoingEdgeFromAllVertices.txt");
		ArrayList<MBTPath> paths = runConversion(gtf);
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(1, paths.size());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (5) -> (end) -> (end)",
				paths.get(0).toString());
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertice() {

		UMLProject.init();
		GraphProject.init();
		GraphTextFile gtf = readFile("target/Graphs/multipleOutgoingEdgesFromOneVertice.txt");
		ArrayList<MBTPath> paths = runConversion(gtf);
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(2, paths.size());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (5) -> (end) -> (end)",
				paths.get(0).toString());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (4) -> (end) -> (end)",
				paths.get(1).toString());
	}

	@Test
	/**
	 * | ins | grp | crt |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		UMLProject.init();
		GraphProject.init();
		GraphTextFile gtf = readFile("target/Graphs/multipleOutgoingEdgesFromAllVertices.txt");
		ArrayList<MBTPath> paths = runConversion(gtf);
		for (MBTPath p : paths) {
			System.out.println(p.toString());
		}
		Assertions.assertEquals(4, paths.size());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (5) -> (grp) -> (10) -> (end) -> (end)",
				paths.get(0).toString());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (5) -> (grp) -> (8) -> (end) -> (end)",
				paths.get(1).toString());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (4) -> (grp) -> (10) -> (end) -> (end)",
				paths.get(2).toString());
		Assertions.assertEquals(
				"(start) -> () -> (Set Object as follows) -> (start) -> () -> (ins) -> (4) -> (grp) -> (8) -> (end) -> (end)",
				paths.get(3).toString());
	}

}
