package org.farhan.mbt.graph;

import java.util.ArrayList;

public class MBTPath {

	private ArrayList<Object> path;

	public MBTPath() {
		path = new ArrayList<Object>();
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

}
