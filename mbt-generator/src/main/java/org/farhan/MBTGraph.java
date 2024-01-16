package org.farhan;

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

	public AttributeVertex getStartVertice() {
		for (V v : this.vertexSet()) {
			AttributeVertex av = (AttributeVertex) v;
			if (av.getLabel().contentEquals("start")) {
				return av;
			}
		}
		return null;
	}

	public AttributeVertex getEndVertice() {
		for (V v : this.vertexSet()) {
			AttributeVertex av = (AttributeVertex) v;
			if (av.getLabel().contentEquals("end")) {
				return av;
			}
		}
		return null;
	}

	public String toString() {
		return name + " " + super.toString();
	}

}
