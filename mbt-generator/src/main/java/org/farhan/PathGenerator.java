package org.farhan;

import java.util.ArrayList;
import java.util.Set;

import org.jgrapht.graph.DirectedWeightedPseudograph;

public class PathGenerator {

	public static ArrayList<AttributePath> getAllPaths(
			DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g, AttributeVertex vertice) {
		ArrayList<AttributePath> pathsFromVertice = new ArrayList<AttributePath>();
		ArrayList<AttributePath> pathsFromChild;
		Set<AttributeWeightedEdge> edges = g.outgoingEdgesOf(vertice);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			pathsFromVertice.add(new AttributePath());
			return pathsFromVertice;
		} else {
			for (AttributeWeightedEdge e : edges) {
				pathsFromChild = getAllPaths(g, g.getEdgeTarget(e));
				for (AttributePath p : pathsFromChild) {
					p.add(0, g.getEdgeTarget(e));
					p.add(0, e);
					if (vertice.getLabel().contentEquals(GraphHelper.getStartVertice(g).getLabel())) {
						p.add(0, vertice);
					}
				}
				pathsFromVertice.addAll(pathsFromChild);
			}
			return pathsFromVertice;
		}
	}

	public static ArrayList<AttributePath> getTaggedPaths(
			DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g, AttributeVertex vertice,
			String tag) {
		ArrayList<AttributePath> pathsFromVertice = getAllPaths(g, vertice);

		for (int i = pathsFromVertice.size() - 1; i >= 0; i--) {

			AttributePath path = pathsFromVertice.get(i);
			if (!path.contains(tag)) {
				pathsFromVertice.remove(i);
			}
		}

		return pathsFromVertice;
	}
}
