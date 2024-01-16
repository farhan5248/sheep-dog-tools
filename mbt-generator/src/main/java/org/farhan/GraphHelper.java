package org.farhan;

import org.jgrapht.graph.DirectedWeightedPseudograph;

public class GraphHelper {

	public static AttributeVertex getStartVertice(
			DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g) {
		for (AttributeVertex v : g.vertexSet()) {
			if (v.getLabel().contentEquals("start")) {
				return v;
			}
		}
		return null;
	}

	public static AttributeVertex getEndVertice(DirectedWeightedPseudograph<AttributeVertex, AttributeWeightedEdge> g) {
		for (AttributeVertex v : g.vertexSet()) {
			if (v.getLabel().contentEquals("end")) {
				return v;
			}
		}
		return null;
	}
}
