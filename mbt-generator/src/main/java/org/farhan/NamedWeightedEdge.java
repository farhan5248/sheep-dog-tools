package org.farhan;

import org.jgrapht.graph.DefaultWeightedEdge;

@SuppressWarnings("serial")
public class NamedWeightedEdge extends DefaultWeightedEdge {

	private static final long serialVersionUID = -6681665149703952410L;
	private String label;

	public NamedWeightedEdge(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return getLabel();
	}

	@Override
	public int hashCode() {
		return getLabel().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}
}