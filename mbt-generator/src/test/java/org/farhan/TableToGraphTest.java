package org.farhan;

import java.util.ArrayList;
import java.util.Set;

import org.jgrapht.graph.DirectedWeightedPseudograph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TableToGraphTest {

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 */
	void singleFieldSingleValueTable() {
		DirectedWeightedPseudograph<String, NamedWeightedEdge> g = new DirectedWeightedPseudograph<>(
				NamedWeightedEdge.class);
		String start = "start";
		String insurer = "insurer";
		String group = "group";
		String certificate = "certificate";
		String end = "end";

		// add the vertices
		g.addVertex(start);
		g.addVertex(insurer);
		g.addVertex(group);
		g.addVertex(certificate);
		g.addVertex(end);

		// add edges
		createNamedWeightedEdge(g, start, insurer, "", 1.0);
		createNamedWeightedEdge(g, insurer, group, "5", 1.0);
		createNamedWeightedEdge(g, group, certificate, "10", 1.0);
		createNamedWeightedEdge(g, certificate, end, "15", 1.0);

		System.out.println(g.toString());
		ArrayList<ArrayList<String>> paths = getAllPaths(g, start);
		Assertions.assertEquals(1, paths.size());
		Assertions.assertEquals(pathToString(paths.getFirst()),
				" -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end");
	}

	@Test
	/**
	 * | insurer | group | certificate |
	 * |       5 |    10 |          15 |
	 * |       5 |    10 |          12 |
	 */
	void singleFieldMultiValueTable() {
		DirectedWeightedPseudograph<String, NamedWeightedEdge> g = new DirectedWeightedPseudograph<>(
				NamedWeightedEdge.class);
		String start = "start";
		String insurer = "insurer";
		String group = "group";
		String certificate = "certificate";
		String end = "end";

		// add the vertices
		g.addVertex(start);
		g.addVertex(insurer);
		g.addVertex(group);
		g.addVertex(certificate);
		g.addVertex(end);

		// add edges
		createNamedWeightedEdge(g, start, insurer, "", 1.0);
		createNamedWeightedEdge(g, insurer, group, "5", 1.0);
		createNamedWeightedEdge(g, group, certificate, "10", 1.0);
		createNamedWeightedEdge(g, certificate, end, "15", 1.0);
		createNamedWeightedEdge(g, certificate, end, "12", 1.0);

		System.out.println(g.toString());

		ArrayList<ArrayList<String>> paths = getAllPaths(g, start);
		Assertions.assertEquals(2, paths.size());
		Assertions.assertEquals(pathToString(paths.getFirst()),
				" -> insurer -> 5 -> group -> 10 -> certificate -> 15 -> end");
		Assertions.assertEquals(pathToString(paths.getLast()),
				" -> insurer -> 5 -> group -> 10 -> certificate -> 12 -> end");
	}

	private String pathToString(ArrayList<String> path) {
		String pathAsString = "";
		for (String vertice : path) {
			pathAsString += vertice + " -> ";
		}
		pathAsString = pathAsString.replaceAll(" -> $", "");
		return pathAsString;
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
				}
				pathsFromVertice.addAll(pathsFromChild);
			}
			return pathsFromVertice;
		}
	}
}
