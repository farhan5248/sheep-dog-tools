package org.farhan;

import java.util.HashMap;

public class AttributeVertex {

	private HashMap<String, String> attributes;

	public AttributeVertex(String label) {
		attributes = new HashMap<String, String>();
		attributes.put("label", label);
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
