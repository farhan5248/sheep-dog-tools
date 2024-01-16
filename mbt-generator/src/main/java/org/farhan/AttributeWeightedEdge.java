package org.farhan;

import java.util.HashMap;

import org.jgrapht.graph.DefaultWeightedEdge;

public class AttributeWeightedEdge extends DefaultWeightedEdge {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5850254711369259654L;
	private HashMap<String, Object> attributes;

	public AttributeWeightedEdge(String label) {
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

	public void setTag(String tag) {
		attributes.put("tag", tag);
	}

	public String getTag() {
		return attributes.get("tag").toString();
	}

	public String getLabel() {
		return attributes.get("label").toString();
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