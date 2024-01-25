package org.farhan.mbt.graphuml;

import java.util.ArrayList;
import java.util.Set;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;

public class PathGenerator {

	public static ArrayList<MBTPath> getAllPaths(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex) {
		ArrayList<MBTPath> vertexPaths = new ArrayList<MBTPath>();
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			vertexPaths.add(new MBTPath());
			return vertexPaths;
		} else {
			for (MBTEdge e : edges) {
				ArrayList<MBTPath> childPaths = getAllPaths(g, g.getEdgeTarget(e));
				ArrayList<MBTPath> edgePaths = getEdgePaths(e);
				combinePaths(g, e, vertex, vertexPaths, childPaths, edgePaths);
			}
			return vertexPaths;
		}
	}

	private static void combinePaths(MBTGraph<MBTVertex, MBTEdge> g, MBTEdge e, MBTVertex vertex,
			ArrayList<MBTPath> vertexPaths, ArrayList<MBTPath> childPaths, ArrayList<MBTPath> edgePaths) {
		for (MBTPath pc : childPaths) {

			if (edgePaths.isEmpty()) {
				pc.getPath().add(0, g.getEdgeTarget(e));
				pc.getPath().add(0, e);
				if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
					pc.getPath().add(0, vertex);
				}
				vertexPaths.add(pc);
			} else {
				for (MBTPath pe : edgePaths) {

					MBTPath expandedPath = new MBTPath();
					expandedPath.getPath().addAll(0, pc.getPath());
					expandedPath.getPath().add(0, g.getEdgeTarget(e));
					expandedPath.getPath().addAll(0, pe.getPath());
					if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
						expandedPath.getPath().add(0, vertex);
					}
					vertexPaths.add(expandedPath);
				}
			}
		}

	}

	private static ArrayList<MBTPath> getEdgePaths(MBTEdge e) {

		if (e.getValue() != null) {
			if (e.getValue() instanceof MBTGraph<?, ?>) {
				MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) e.getValue();
				return getAllPaths(g, g.getStartVertex());
			}
		}
		return new ArrayList<MBTPath>();

	}

}
