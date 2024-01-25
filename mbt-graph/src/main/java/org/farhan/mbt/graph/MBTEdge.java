package org.farhan.mbt.graph;

import java.util.HashMap;

import org.jgrapht.graph.DefaultWeightedEdge;

public class MBTEdge extends DefaultWeightedEdge {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5850254711369259654L;
	private HashMap<String, Object> attributes;

	public MBTEdge(String label) {
		attributes = new HashMap<String, Object>();
		attributes.put("label", label);
		attributes.put("tag", "");
	}

	public void addAttribute(String key, Object value) {
		// the prefix is there to prevent an attribute matching tag or label
		attributes.put("_" + key, value);
	}

	public String getAttribute(String key) {
		return attributes.get("_" + key).toString();
	}

	// I need a better name for this but it's either a graph or an expression
	public void setValue(Object graph) {
		attributes.put("value", graph);
	}

	public Object getValue() {
		return attributes.get("value");
	}

	public void setTag(String tag) {
		attributes.put("tag", tag);
	}

	public String getTag() {
		return attributes.get("tag").toString();
	}

	public void setLabel(String label) {
		attributes.put("label", label);
	}

	public String getLabel() {
		return attributes.get("label").toString();
	}

	@Override
	public String toString() {
		Object value = getValue();
		if (value == null) {
			value = "";
		}
		return getSource().toString() + " -> " + value + " -> " + getTarget().toString();
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}
}