package org.farhan.mbt.graph.conversion;

import java.util.ArrayList;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.farhan.mbt.graph.MBTVertex;

public class TableToMBTGraphConverter {

	public static MBTGraph<MBTVertex, MBTEdge> createEmpty(String name) {
		MBTGraph<MBTVertex, MBTEdge> g = new MBTGraph<>(MBTEdge.class);
		g.setName(name);
		// add start and end vertices
		g.createVertex("start");
		g.createVertex("end");

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
			g.createStartEdge(vertices.getFirst());

			ArrayList<String> row = table.get(i);
			for (int j = 0; j < vertices.size() - 1; j++) {
				String label = row.get(j);
				if (!label.isEmpty()) {
					g.createEdge(vertices.get(j), vertices.get(j + 1), row.get(j), 1.0);
				}
			}
			// TODO this assumes the last column isn't blank
			g.createEndEdge(vertices.getLast(), row.get(row.size() - 1));
		}
		return g;
	}

	public static MBTGraph<MBTVertex, MBTEdge> createFromSingleColumn(MBTTable table) {

		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createEmpty(table.getCaption());
		// loop through all the rows as if they were sections in an adoc file
		ArrayList<ArrayList<String>> rows = table.getRows();
		TableToMBTGraphConverter.createFromEdge(g, g.getStartVertex().getLabel(), rows.getFirst().getFirst(), "", null);
		for (int i = 0; i < rows.size() - 1; i++) {
			// this step would probably be getting block title
			String source = rows.get(i).getFirst();
			String target = rows.get(i + 1).getFirst();
			TableToMBTGraphConverter.createFromEdge(g, source, target, table.getCaption(), null);
		}
		TableToMBTGraphConverter.createFromEdge(g, rows.getLast().getFirst(), g.getEndVertex().getLabel(),
				table.getCaption(), null);
		return g;
	}

	public static MBTEdge createFromEdge(MBTGraph<MBTVertex, MBTEdge> g, String sourceLabel, String targetLabel,
			String edgeLabel, Object edgeInput) {

		// TODO create method to create vertex if it doesn't exist, otherwise this
		// object won't be added and the edge will point to an orphaned vertex
		MBTVertex source = g.createVertex(sourceLabel);
		MBTVertex target = g.createVertex(targetLabel);
		MBTEdge edge = g.createEdge(source, target, edgeLabel, 1.0);
		edge.setGraph(edgeInput);
		return edge;
	}
}
