package org.farhan;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

import org.jgrapht.graph.DirectedWeightedPseudograph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableToGraphTest {

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 */
	void singleOutgoingEdgeFromAllVertices() {

		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		// headers
		row = new ArrayList<String>();
		row.add("insurer");
		row.add("group");
		row.add("certificate");
		table.add(row);
		// row 1
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("15");
		table.add(row);

		DirectedWeightedPseudograph<String, NamedWeightedEdge> g = createGraphFromTable(table);
		System.out.println(g.toString());

		ArrayList<ArrayList<String>> paths = getAllPaths(g, getStartVertice(g));
		for (ArrayList<String> p : paths) {
			System.out.println(pathToString(p));
		}

		Assertions.assertEquals(1, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				pathToString(paths.getFirst()));
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void multipleOutgoingEdgesFromOneVertice() {

		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		// headers
		row = new ArrayList<String>();
		row.add("insurer");
		row.add("group");
		row.add("certificate");
		table.add(row);
		// row 1
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("15");
		table.add(row);
		// row 2
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("12");
		table.add(row);

		DirectedWeightedPseudograph<String, NamedWeightedEdge> g = createGraphFromTable(table);
		System.out.println(g.toString());

		ArrayList<ArrayList<String>> paths = getAllPaths(g, getStartVertice(g));
		for (ArrayList<String> p : paths) {
			System.out.println(pathToString(p));
		}
		Assertions.assertEquals(2, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				pathToString(paths.getFirst()));
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 12 -> end",
				pathToString(paths.getLast()));
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       4 |     8 |          12 |
	 */
	void multipleOutgoingEdgesFromAllVertices() {

		ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
		ArrayList<String> row;
		// headers
		row = new ArrayList<String>();
		row.add("insurer");
		row.add("group");
		row.add("certificate");
		table.add(row);
		// row 1
		row = new ArrayList<String>();
		row.add("5");
		row.add("10");
		row.add("15");
		table.add(row);
		// row 2
		row = new ArrayList<String>();
		row.add("4");
		row.add("8");
		row.add("12");
		table.add(row);

		DirectedWeightedPseudograph<String, NamedWeightedEdge> g = createGraphFromTable(table);
		System.out.println(g.toString());

		ArrayList<ArrayList<String>> paths = getAllPaths(g, getStartVertice(g));
		for (ArrayList<String> p : paths) {
			System.out.println(pathToString(p));
		}
		Assertions.assertEquals(8, paths.size());
		Assertions.assertEquals("start ->  -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end",
				pathToString(paths.getFirst()));
		Assertions.assertEquals("start ->  -> insurer -> 4 -> group -> 8 -> certificate -> 12 -> end",
				pathToString(paths.getLast()));
	}

	private DirectedWeightedPseudograph<String, NamedWeightedEdge> createGraphFromTable(
			ArrayList<ArrayList<String>> table) {

		DirectedWeightedPseudograph<String, NamedWeightedEdge> g = new DirectedWeightedPseudograph<>(
				NamedWeightedEdge.class);

		// add start and end vertices
		g.addVertex("start");
		g.addVertex("end");

		// get vertices from table
		ArrayList<String> vertices = new ArrayList<String>();
		// TODO validate the table has at least two rows
		for (String h : table.get(0)) {
			vertices.add(h);
			g.addVertex(h);
		}

		// go through each row and convert to edge
		for (int i = 1; i < table.size(); i++) {
			createStartEdge(g, vertices, table.get(i));

			// TODO this assumes a table with at least two columns
			String prevVertice = vertices.get(1);
			for (int j = 0; j < vertices.size() - 1; j++) {
				String label = table.get(i).get(j);
				if (!label.isEmpty()) {
					createNamedWeightedEdge(g, vertices.get(j), vertices.get(j + 1), table.get(i).get(j), 1.0);
				}
			}
			// TODO this assumes the last column isn't blank
			createEndEdge(g, vertices, table.get(i));

		}
		return g;
	}

	private void createEndEdge(DirectedWeightedPseudograph<String, NamedWeightedEdge> g, ArrayList<String> vertices,
			ArrayList<String> labels) {
		createNamedWeightedEdge(g, vertices.get(vertices.size() - 1), getEndVertice(g), labels.get(labels.size() - 1),
				1.0);
	}

	private void createStartEdge(DirectedWeightedPseudograph<String, NamedWeightedEdge> g, ArrayList<String> vertices,
			ArrayList<String> labels) {
		createNamedWeightedEdge(g, getStartVertice(g), vertices.get(0), "", 1.0);
	}

	private String getStartVertice(DirectedWeightedPseudograph<String, NamedWeightedEdge> g) {
		for (String v : g.vertexSet()) {
			if (v.contentEquals("start")) {
				return v;
			}
		}
		return null;
	}

	private String getEndVertice(DirectedWeightedPseudograph<String, NamedWeightedEdge> g) {
		for (String v : g.vertexSet()) {
			if (v.contentEquals("end")) {
				return v;
			}
		}
		return null;
	}

	private NamedWeightedEdge createNamedWeightedEdge(DirectedWeightedPseudograph<String, NamedWeightedEdge> g,
			String source, String target, String label, double weight) {
		NamedWeightedEdge edge = new NamedWeightedEdge(label);
		g.addEdge(source, target, edge);
		g.setEdgeWeight(edge, weight);
		return edge;
	}

	private ArrayList<ArrayList<String>> getAllPaths(DirectedWeightedPseudograph<String, NamedWeightedEdge> g,
			String vertice) {
		ArrayList<ArrayList<String>> pathsFromVertice = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> pathsFromChild;
		Set<NamedWeightedEdge> edges = g.outgoingEdgesOf(vertice);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			pathsFromVertice.add(new ArrayList<String>());
			return pathsFromVertice;
		} else {
			for (NamedWeightedEdge e : edges) {
				pathsFromChild = getAllPaths(g, g.getEdgeTarget(e));
				for (ArrayList<String> p : pathsFromChild) {
					p.add(0, g.getEdgeTarget(e));
					p.add(0, e.getLabel());
					if (vertice.contentEquals(getStartVertice(g))) {
						p.add(0, vertice);
					}
				}
				pathsFromVertice.addAll(pathsFromChild);
			}
			return pathsFromVertice;
		}
	}

	private String pathToString(ArrayList<String> path) {
		String pathAsString = "";
		for (String verticeOrEdge : path) {
			pathAsString += verticeOrEdge + " -> ";
		}
		pathAsString = pathAsString.replaceAll(" -> $", "");
		return pathAsString;
	}
}
