package org.farhan.mbt.graph;

import java.util.HashMap;

import org.jgrapht.graph.DefaultWeightedEdge;

public class MBTEdge extends DefaultWeightedEdge {

	private static final long serialVersionUID = 5850254711369259654L;
	private HashMap<String, String> attributes;

	public MBTEdge(String label) {
		attributes = new HashMap<String, String>();
		setLabel(label);
		setTag("");
		setDescription("");
	}

	public void setDescription(String description) {
		attributes.put("description", description);
	}

	public String getDescription() {
		return attributes.get("description").toString();
	}

	public void setTag(String tag) {
		attributes.put("tag", tag);
	}

	public void appendTag(String tag) {
		// TODO after saving path meta data, make this method private and move it to
		// MBTGraph
		if (getTag().isEmpty()) {
			setTag(tag);
		} else if (!getTag().contains(tag)) {
			setTag(getTag() + "," + tag);
		}
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

		String text = "Edge";
		text += "\n\tlabel:" + getLabel();
		text += "\n\ttag:" + getTag();
		text += "\n\tdescription:";
		if (getDescription() != null) {
			for (String line : getDescription().toString().split("\n")) {
				text += "\n\t\t" + line;
			}
		}
		text += "\n\tsource:";
		for (String line : getSource().toString().split("\n")) {
			text += "\n\t\t" + line;
		}
		text += "\n\ttarget:";
		for (String line : getTarget().toString().split("\n")) {
			text += "\n\t\t" + line;
		}
		return text;
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