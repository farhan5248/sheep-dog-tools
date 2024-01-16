package org.farhan;

import java.util.ArrayList;

public class AttributePath {

	private ArrayList<String> path;

	public AttributePath() {
		path = new ArrayList<String>();
	}

	public void add(int i, String label) {
		path.add(i, label);
	}

	public String toString() {
		String pathAsString = "";
		for (String verticeOrEdge : path) {
			pathAsString += verticeOrEdge + " -> ";
		}
		pathAsString = pathAsString.replaceAll(" -> $", "");
		return pathAsString;
	}

}
