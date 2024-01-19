package org.farhan.mbt.graph;

import java.util.Optional;

import org.jgrapht.graph.DirectedWeightedPseudograph;

public class MBTGraph<V, E> extends DirectedWeightedPseudograph<V, E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6896363596798655076L;
	private String name;

	public MBTGraph(Class<? extends E> edgeClass) {
		super(edgeClass);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MBTVertex getStartVertex() {
		for (V v : this.vertexSet()) {
			MBTVertex av = (MBTVertex) v;
			if (av.getLabel().contentEquals("start")) {
				return av;
			}
		}
		return null;
	}

	public MBTVertex getEndVertex() {
		for (V v : this.vertexSet()) {
			MBTVertex av = (MBTVertex) v;
			if (av.getLabel().contentEquals("end")) {
				return av;
			}
		}
		return null;
	}

	public String toString() {
		return name + " " + super.toString();
	}

	public void createStartEdge(MBTVertex vertex) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		createEdge(g.getStartVertex(), vertex, "", 1.0);
	}

	public void createEndEdge(MBTVertex vertex, String label) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		createEdge(vertex, g.getEndVertex(), label, 1.0);
	}

	public MBTEdge createEdge(MBTVertex source, MBTVertex target, String label, double weight) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		MBTEdge edge = new MBTEdge(label);
		g.addEdge(source, target, edge);
		g.setEdgeWeight(edge, weight);
		return edge;
	}

	public MBTVertex createVertex(String label) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		
		MBTVertex vertex = getVertex(label);
		if (vertex == null) {
			vertex = new MBTVertex(label);
			g.addVertex(vertex);
		}
		return vertex;
	}

	public MBTVertex getVertex(String label) {
		Optional<MBTVertex> optional = getThisGraph().vertexSet().stream()
				.filter(step -> step.getLabel().contentEquals(label)).findAny();
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	private MBTGraph<MBTVertex, MBTEdge> getThisGraph() {
		return (MBTGraph<MBTVertex, MBTEdge>) this;
	}
}
