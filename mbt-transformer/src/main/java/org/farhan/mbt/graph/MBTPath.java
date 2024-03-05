package org.farhan.mbt.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class MBTPath {

	private HashMap<String, Object> attributes;
	private ArrayList<Object> path;

	public MBTPath() {
		path = new ArrayList<Object>();
		attributes = new HashMap<String, Object>();
	}

	public ArrayList<Object> getPath() {
		return path;
	}

	public String toString() {
		String pathAsString = "";
		for (Object o : path) {
			if (o instanceof MBTVertex) {
				pathAsString += "(" + ((MBTVertex) o).getLabel() + ")" + " -> ";
			} else {
				pathAsString += "(" + ((MBTEdge) o).getLabel() + ")" + " -> ";
			}
		}
		pathAsString = pathAsString.replaceAll(" -> $", "");
		return pathAsString;
	}

	public boolean contains(String tag) {
		// loop through all the edges
		for (Object verticeOrEdge : path) {
			// if the edge has the tag, return true
			if (verticeOrEdge instanceof MBTVertex) {
				continue;
			}
			MBTEdge edge = (MBTEdge) verticeOrEdge;
			if (edge.getTag().contentEquals(tag)) {
				return true;
			}
		}
		return false;
	}

	public void setLabel(String label) {
		attributes.put("label", label);
	}

	public void setTags(String tags) {
		attributes.put("tags", tags);
	}

	public void setDescription(String description) {
		attributes.put("description", description);
	}

	public String getLabel() {
		return attributes.get("label").toString();
	}

	public String getTags() {
		return attributes.get("tags").toString();
	}

	public String getDescription() {
		return attributes.get("description").toString();
	}
}
