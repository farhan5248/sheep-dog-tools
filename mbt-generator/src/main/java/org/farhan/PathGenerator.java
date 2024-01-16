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
					p.add(0, g.getEdgeTarget(e).getLabel());
					p.add(0, e.getLabel());
					if (vertice.getLabel().contentEquals(GraphHelper.getStartVertice(g).getLabel())) {
						p.add(0, vertice.getLabel());
					}
				}
				pathsFromVertice.addAll(pathsFromChild);
			}
			return pathsFromVertice;
		}
	}
}
