package org.farhan;

import java.util.ArrayList;

public class TableToMBTGraphConverter {

	public static MBTGraph<AttributeVertex, AttributeWeightedEdge> createFromMultipleColumns(MBTTable table) {

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = new MBTGraph<>(AttributeWeightedEdge.class);
		g.setName(table.getCaption());

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
			createStartEdge(g, vertices);

			ArrayList<String> row = table.get(i);
			for (int j = 0; j < vertices.size() - 1; j++) {
				String label = row.get(j);
				if (!label.isEmpty()) {
					createNamedWeightedEdge(g, vertices.get(j), vertices.get(j + 1), row.get(j), 1.0);
				}
			}
			// TODO this assumes the last column isn't blank
			createEndEdge(g, vertices, row.get(row.size() - 1));
		}
		return g;
	}

	public static MBTGraph<AttributeVertex, AttributeWeightedEdge> createFromSingleColumn(MBTTable table) {

		MBTGraph<AttributeVertex, AttributeWeightedEdge> g = new MBTGraph<>(AttributeWeightedEdge.class);
		g.setName(table.getCaption());

		// add start and end vertices
		g.addVertex(new AttributeVertex("start"));
		g.addVertex(new AttributeVertex("end"));

		// get vertices from table
		ArrayList<AttributeVertex> vertices = new ArrayList<AttributeVertex>();
		// TODO validate the table has just one column
		for (int i = 1; i < table.size(); i++) {
			vertices.add(new AttributeVertex(table.get(i).getFirst()));
			g.addVertex(vertices.getLast());
		}

		createStartEdge(g, vertices);
		// go through each row and convert to edge
		for (int i = 1; i < vertices.size() - 1; i++) {
			// TODO assuming no row is blank
			createNamedWeightedEdge(g, vertices.get(i), vertices.get(i + 1), vertices.get(i).getLabel(), 1.0);
		}
		createEndEdge(g, vertices, vertices.get(vertices.size() - 1).getLabel());
		return g;
	}

	private static void createStartEdge(MBTGraph<AttributeVertex, AttributeWeightedEdge> g,
			ArrayList<AttributeVertex> vertices) {
		createNamedWeightedEdge(g, g.getStartVertice(), vertices.get(0), "", 1.0);
	}

	private static void createEndEdge(MBTGraph<AttributeVertex, AttributeWeightedEdge> g,
			ArrayList<AttributeVertex> vertices, String label) {
		createNamedWeightedEdge(g, vertices.get(vertices.size() - 1), g.getEndVertice(), label, 1.0);
	}

	public static AttributeWeightedEdge createNamedWeightedEdge(MBTGraph<AttributeVertex, AttributeWeightedEdge> g,
			AttributeVertex source, AttributeVertex target, String label, double weight) {
		AttributeWeightedEdge edge = new AttributeWeightedEdge(label);
		g.addEdge(source, target, edge);
		g.setEdgeWeight(edge, weight);
		return edge;
	}
}
