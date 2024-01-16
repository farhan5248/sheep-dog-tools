package org.farhan;

import java.util.ArrayList;

public class AttributePath {

	private ArrayList<Object> path;

	public AttributePath() {
		path = new ArrayList<Object>();
	}

	public void add(int i, Object verticeOrEdge) {
		path.add(i, verticeOrEdge);
	}

	public String toString() {
		String pathAsString = "";
		for (Object verticeOrEdge : path) {
			pathAsString += verticeOrEdge.toString() + " -> ";
		}
		pathAsString = pathAsString.replaceAll(" -> $", "");
		return pathAsString;
	}

	public boolean contains(String tag) {
		// loop through all the edges
		for (Object verticeOrEdge : path) {
			// if the edge has the tag, return true
			if (verticeOrEdge instanceof AttributeVertex) {
				continue;
			}
			AttributeWeightedEdge edge = (AttributeWeightedEdge) verticeOrEdge;
			if (edge.getTag().contentEquals(tag)) {
				return true;
			}
		}
		return false;
	}

}
