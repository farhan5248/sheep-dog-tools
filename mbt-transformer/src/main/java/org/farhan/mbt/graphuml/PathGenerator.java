package org.farhan.mbt.graphuml;

import java.util.ArrayList;
import java.util.Set;

import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;

public class PathGenerator {

	public static ArrayList<MBTPath> getAllPaths(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertice) {
		ArrayList<MBTPath> pathsFromVertice = new ArrayList<MBTPath>();
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertice);
		if (edges.isEmpty()) {
			// last node creates empty list and returns it
			pathsFromVertice.add(new MBTPath());
			return pathsFromVertice;
		} else {
			for (MBTEdge e : edges) {
				ArrayList<MBTPath> pathsFromChild = getAllPaths(g, g.getEdgeTarget(e));
				ArrayList<MBTPath> pathsFromEdge = getEdgePaths(e);

				for (MBTPath pc : pathsFromChild) {

					if (pathsFromEdge.isEmpty()) {
						pc.getPath().add(0, g.getEdgeTarget(e));
						pc.getPath().add(0, e);
						if (vertice.getLabel().contentEquals(g.getStartVertex().getLabel())) {
							pc.getPath().add(0, vertice);
						}
						pathsFromVertice.add(pc);
					} else {
						for (MBTPath pe : pathsFromEdge) {

							MBTPath expandedPath = new MBTPath();
							expandedPath.getPath().addAll(0, pc.getPath());
							expandedPath.getPath().add(0, g.getEdgeTarget(e));
							expandedPath.getPath().addAll(0, pe.getPath());
							if (vertice.getLabel().contentEquals(g.getStartVertex().getLabel())) {
								expandedPath.getPath().add(0, vertice);
							}
							pathsFromVertice.add(expandedPath);
						}
					}
				}
			}
			return pathsFromVertice;
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

	public static ArrayList<MBTPath> getTaggedPaths(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertice, String tag) {
		ArrayList<MBTPath> pathsFromVertice = getAllPaths(g, vertice);

		for (int i = pathsFromVertice.size() - 1; i >= 0; i--) {

			MBTPath path = pathsFromVertice.get(i);
			if (!path.contains(tag)) {
				pathsFromVertice.remove(i);
			}
		}

		return pathsFromVertice;
	}
}
