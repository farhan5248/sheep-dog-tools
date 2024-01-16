package org.farhan;

import java.util.ArrayList;

import org.jgrapht.graph.DirectedWeightedPseudograph;

public class TableToGraphConverter {

	public static DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> createGraphFromTable(
			ArrayList<ArrayList<String>> table) {

		DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g = new DirectedWeightedPseudograph<>(
				AttributeWeightedEdge.class);

		// add start and end vertices
		g.addVertex(new AttributeVertex("start"));
		g.addVertex(new AttributeVertex("end"));

		// get vertices from table
		ArrayList<AttributeVertex> vertices = new ArrayList<AttributeVertex>();
		// TODO validate the table has at least two rows
		for (String h : table.get(0)) {
			vertices.add(new AttributeVertex(h));
			g.addVertex(vertices.getLast());
		}

		// go through each row and convert to edge
		for (int i = 1; i < table.size(); i++) {
			createStartEdge(g, vertices, table.get(i));

			// TODO this assumes a table with at least two columns
			AttributeVertex prevVertice = vertices.get(1);
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

	public static void createEndEdge(DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g,
			ArrayList<AttributeVertex> vertices, ArrayList<String> labels) {
		createNamedWeightedEdge(g, vertices.get(vertices.size() - 1), GraphHelper.getEndVertice(g),
				labels.get(labels.size() - 1), 1.0);
	}

	public static void createStartEdge(DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g,
			ArrayList<AttributeVertex> vertices, ArrayList<String> labels) {
		createNamedWeightedEdge(g, GraphHelper.getStartVertice(g), vertices.get(0), "", 1.0);
	}

	public static AttributeWeightedEdge createNamedWeightedEdge(
			DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g, AttributeVertex source,
			AttributeVertex target, String label, double weight) {
		AttributeWeightedEdge edge = new AttributeWeightedEdge(label);
		g.addEdge(source, target, edge);
		g.setEdgeWeight(edge, weight);
		return edge;
	}
}
