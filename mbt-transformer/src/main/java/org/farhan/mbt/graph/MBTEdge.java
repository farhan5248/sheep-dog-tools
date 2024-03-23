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
	}

	public void setTag(String tag) {
		attributes.put("tag", tag);
	}

	public void appendTag(String tag) {
		// TODO after saving path meta data, make this method private and move it to
		// MBTGraph
		if (getTags().isEmpty()) {
			setTag(tag);
		} else if (!getTags().contains(tag)) {
			setTag(getTags() + "," + tag);
		}
	}

	public String getTags() {
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
		text += "\n\ttag:" + getTags();
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

	private String toID() {
		MBTVertex source = (MBTVertex) getSource();
		MBTVertex target = (MBTVertex) getTarget();
		return source.getLabel() + getLabel() + target.getLabel();
	}

	@Override
	public int hashCode() {
		return toID().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return toID().equals(((MBTEdge) o).toID());
	}
}