package org.farhan.mbt.graph.conversion;

import java.util.ArrayList;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.farhan.mbt.graph.MBTVertex;

public class TableToMBTGraphConverter {

	public static MBTGraph<MBTVertex, MBTEdge> createFromMultipleColumns(MBTTable table) {

		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(table.getCaption());

		// add start and end vertices
		g.addVertex(new MBTVertex("start"));
		g.addVertex(new MBTVertex("end"));

		// get vertices from table
		ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
		// TODO validate the table has at least two rows
		for (String h : table.get(0)) {
			vertices.add(new MBTVertex(h));
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

	public static MBTGraph<MBTVertex, MBTEdge> createFromSingleColumn(MBTTable table) {

		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(table.getCaption());

		// add start and end vertices
		g.addVertex(new MBTVertex("start"));
		g.addVertex(new MBTVertex("end"));

		// get vertices from table
		ArrayList<MBTVertex> vertices = new ArrayList<MBTVertex>();
		// TODO validate the table has just one column
		for (int i = 1; i < table.size(); i++) {
			vertices.add(new MBTVertex(table.get(i).getFirst()));
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

	private static void createStartEdge(MBTGraph<MBTVertex, MBTEdge> g,
			ArrayList<MBTVertex> vertices) {
		createNamedWeightedEdge(g, g.getStartVertice(), vertices.get(0), "", 1.0);
	}

	private static void createEndEdge(MBTGraph<MBTVertex, MBTEdge> g,
			ArrayList<MBTVertex> vertices, String label) {
		createNamedWeightedEdge(g, vertices.get(vertices.size() - 1), g.getEndVertice(), label, 1.0);
	}

	public static MBTEdge createNamedWeightedEdge(MBTGraph<MBTVertex, MBTEdge> g,
			MBTVertex source, MBTVertex target, String label, double weight) {
		MBTEdge edge = new MBTEdge(label);
		g.addEdge(source, target, edge);
		g.setEdgeWeight(edge, weight);
		return edge;
	}
}
