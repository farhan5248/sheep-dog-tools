package org.farhan.mbt.graph;

import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.uml2.uml.Model;
import org.farhan.mbt.core.Project;

public class GraphProject extends Project {

	private static ArrayList<MBTGraph<MBTVertex, MBTEdge>> firstLayerGraphs;

	public static void init() {
		firstLayerGraphs = new ArrayList<MBTGraph<MBTVertex, MBTEdge>>();
	}

	public static Model readFiles() throws IOException {
		return null;
	}

	public static void writeFiles() throws Exception {
	}

	public static ArrayList<MBTGraph<MBTVertex,MBTEdge>> getFirstLayerGraphs() {
		return firstLayerGraphs;
	}

}
