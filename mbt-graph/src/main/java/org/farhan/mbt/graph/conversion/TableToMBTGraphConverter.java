package org.farhan.mbt.graph.conversion;

import java.util.ArrayList;
import java.util.Map;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTTable;
import org.farhan.mbt.graph.MBTVertex;

public class TableToMBTGraphConverter {

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
		MBTGraph<MBTVertex, MBTEdge> g = TableToMBTGraphConverter.createEmpty(listsName);
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

}
