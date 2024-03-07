package org.farhan.mbt.graph;

import java.util.HashMap;
import java.util.Optional;

import org.jgrapht.graph.DirectedWeightedPseudograph;

public class MBTGraph<V, E> extends DirectedWeightedPseudograph<V, E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6896363596798655076L;

	private HashMap<String, Object> attributes;

	public MBTGraph(Class<? extends E> edgeClass) {
		super(edgeClass);
		attributes = new HashMap<String, Object>();
		setTag("");
		setDescription("");
	}

	public String getLabel() {
		return attributes.get("label").toString();
	}

	public void setLabel(String label) {
		attributes.put("label", label);
	}

	public void setTag(String tag) {
		attributes.put("tag", tag);
	}

	public String getTag() {
		return attributes.get("tag").toString();
	}

	public void setDescription(String description) {
		attributes.put("description", description);
	}

	public String getDescription() {
		return attributes.get("description").toString();
	}

	public MBTVertex getStartVertex() {
		return getVertex("start");
	}

	public MBTVertex getEndVertex() {
		return getVertex("end");
	}

	public String toString() {
		String text = "Graph";
		text += "\n\tname:" + getLabel();
		text += "\n\ttag:" + getTag();
		text += "\n\tdescription:";
		if (getDescription() != null) {
			for (String line : getDescription().toString().split("\n")) {
				text += "\n\t\t" + line;
			}
		}
		text += "\n\tvertices:";
		for (V v : vertexSet()) {
			for (String line : v.toString().split("\n")) {
				text += "\n\t\t" + line;
			}
		}
		text += "\n\tedges:";
		for (E e : edgeSet()) {
			for (String line : e.toString().split("\n")) {
				text += "\n\t\t" + line;
			}
		}
		return text;
	}

	public void createStartVertex() {
		createVertex("start");
	}

	public void createEndVertex() {
		createVertex("end");
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

	public MBTEdge createEdgeWithVertices(String sourceLabel, String targetLabel, String edgeLabel, String edgeInput) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		MBTVertex source = g.createVertex(sourceLabel);
		MBTVertex target = g.createVertex(targetLabel);
		return createEdge(source, target, edgeLabel);
	}

	public MBTEdge createEdge(MBTVertex source, MBTVertex target, String edgeLabel) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		MBTEdge edge = getEdgeByLabel(source, target, edgeLabel);
		if (edge == null) {
			edge = new MBTEdge(edgeLabel);
			g.addEdge(source, target, edge);
			g.setEdgeWeight(edge, 1.0);
		} else {
			// TODO I think this is to maintain the list of paths/section/scenarios. Change
			// it to a list of tags
			edge.setLabel(edge.getLabel() + "," + edgeLabel);
		}
		return edge;
	}

	public MBTEdge getEdgeByLabel(MBTVertex source, MBTVertex target, String edgeLabel) {
		MBTGraph<MBTVertex, MBTEdge> g = getThisGraph();
		for (MBTEdge edge : g.getAllEdges(source, target)) {
			if (edge.getLabel().toString().contentEquals(edgeLabel)) {
				return edge;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private MBTGraph<MBTVertex, MBTEdge> getThisGraph() {
		return (MBTGraph<MBTVertex, MBTEdge>) this;
	}
}
