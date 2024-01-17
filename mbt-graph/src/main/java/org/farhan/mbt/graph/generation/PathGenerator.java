package org.farhan.mbt.graph.generation;

import java.util.ArrayList;
import java.util.Set;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;

public class PathGenerator {

	public static ArrayList<MBTPath> getAllPaths(MBTGraph<MBTVertex, MBTEdge> g,
			MBTVertex vertice) {
		ArrayList<MBTPath> pathsFromVertice = new ArrayList<MBTPath>();
		ArrayList<MBTPath> pathsFromChild;
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertice);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			pathsFromVertice.add(new MBTPath());
			return pathsFromVertice;
		} else {
			for (MBTEdge e : edges) {
				pathsFromChild = getAllPaths(g, g.getEdgeTarget(e));
				for (MBTPath p : pathsFromChild) {
					p.add(0, g.getEdgeTarget(e));
					p.add(0, e);
					if (vertice.getLabel().contentEquals(g.getStartVertice().getLabel())) {
						p.add(0, vertice);
					}
				}
				pathsFromVertice.addAll(pathsFromChild);
			}
			return pathsFromVertice;
		}
	}

	public static ArrayList<MBTPath> getTaggedPaths(MBTGraph<MBTVertex, MBTEdge> g,
			MBTVertex vertice, String tag) {
		ArrayList<MBTPath> pathsFromVertice = getAllPaths(g, vertice);

		for (int i = pathsFromVertice.size() - 1; i >= 0; i--) {

			MBTPath path = pathsFromVertice.get(i);
			if (!path.contains(tag)) {
				pathsFromVertice.remove(i);
			}
		}

		return pathsFromVertice;
	}
}
