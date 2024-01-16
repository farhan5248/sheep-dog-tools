package org.farhan;

import java.util.HashMap;

import org.jgrapht.graph.DefaultWeightedEdge;

@SuppressWarnings("serial")
public class AttributeWeightedEdge extends DefaultWeightedEdge {

	private static final long serialVersionUID = -6681665149703952410L;
	private HashMap<String, String> attributes;

	public AttributeWeightedEdge(String label) {
		attributes = new HashMap<String, String>();
		attributes.put("label", label);
	}

	public void addAttribute(String key, String value) {
		// the prefix is there to prevent an attribute matching tag or label
		attributes.put("_" + key, value);
	}

	public String getAttribute(String key) {
		return attributes.get("_" + key);
	}

	public void setTag(String tag) {
		attributes.put("tag", tag);
	}

	public String getTag(String tag) {
		return attributes.get("tag");
	}

	public String getLabel() {
		return attributes.get("label");
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