package org.farhan.common;

import java.io.File;
import java.util.ArrayList;

import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPathInfo;
import org.farhan.mbt.graph.MBTVertex;
import org.junit.jupiter.api.Assertions;

public abstract class GraphFileObject extends FileObject {

	private JGraphTProject graphProject;

	// TODO delete this method after making a map and a getter for each project
	private MBTGraph<MBTVertex, MBTEdge> getGraph(String graphName) {
		for (Object o : graphProject.getObjects(graphProject.FIRST_LAYER)) {
			MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) ((JGraphTGraphWrapper) o).get();
			if (g.getLabel().contentEquals(graphName.replace(".graph", ""))) {
				return g;
			}
		}
		for (Object o : graphProject.getObjects(graphProject.SECOND_LAYER)) {
			MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) ((JGraphTGraphWrapper) o).get();
			if (g.getLabel().contentEquals(graphName.replace(".graph", ""))) {
				return g;
			}
		}
		return null;
	}

	private MBTEdge getEdgeByString(MBTGraph<MBTVertex, MBTEdge> g, String edgeName) {
		for (MBTEdge e : g.edgeSet()) {
			String eString = g.getEdgeSource(e).getLabel() + " -> " + e.getLabel() + " -> "
					+ g.getEdgeTarget(e).getLabel();
			if (edgeName.contentEquals(eString)) {
				return e;
			}
		}
		return null;
	}

	private MBTEdge getEdgeBySourceVertex(MBTGraph<MBTVertex, MBTEdge> g, String sourceVertex) {
		return (MBTEdge) g.outgoingEdgesOf(g.getVertex(sourceVertex)).toArray()[0];
	}

	protected void assertVerticesVertexNameExists(String vertexName) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		Assertions.assertTrue(g.vertexSet().contains(new MBTVertex(vertexName)),
				"Vertex " + vertexName + " doesn't exist");
	}

	protected void assertEdgesEdgeNameExists(String edgeName) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		Assertions.assertTrue(getEdgeByString(g, edgeName) != null, "Edge " + edgeName + " doesn't exist");
	}

	protected void assertEdgesGraphEdgeNameExists(String sourceVertex, String graphEdgeName) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = getGraph(edge.getLabel());
		Assertions.assertTrue(getEdgeByString(g1, graphEdgeName) != null,
				"Graph Edge " + graphEdgeName + " doesn't exist");
	}

	protected void assertEdgesGraphVertexNameExists(String sourceVertex, String graphVertexName) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = getGraph(edge.getLabel());
		Assertions.assertTrue(g1.vertexSet().contains(new MBTVertex(graphVertexName)),
				"Vertex " + graphVertexName + " doesn't exist");
	}

	protected void assertGraphModelExists() {
		assertFileExists();
		try {
			// TODO compare how the layers of feature and java files are read, this is ugly
			graphProject = new JGraphTProject();
			ArrayList<File> files = Utilities.recursivelyListFiles(graphProject.getDir(graphProject.FIRST_LAYER),
					graphProject.getFileExt(graphProject.FIRST_LAYER));
			graphProject.getObjects(graphProject.FIRST_LAYER).clear();
			for (File f : files) {
				graphProject.createObject(f.getAbsolutePath()).load();
			}
			files = Utilities.recursivelyListFiles(graphProject.getDir(graphProject.SECOND_LAYER),
					graphProject.getFileExt(graphProject.SECOND_LAYER));
			graphProject.getObjects(graphProject.SECOND_LAYER).clear();
			for (File f : files) {
				graphProject.createObject(f.getAbsolutePath()).load();
			}
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertPathsNameExists(String pathName) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		MBTPathInfo path = g.getPathInfo(pathName);
		Assertions.assertTrue(path != null, "Path " + pathName + " doesn't exist");
	}

	protected void assertPathsDescription(String pathName, String description) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		MBTPathInfo path = g.getPathInfo(pathName);
		Assertions.assertTrue(path != null, "Path " + pathName + " doesn't exist");
		Assertions.assertEquals(description, path.getDescription());
	}

	protected void assertPathsTag(String pathName, String tags) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		MBTPathInfo path = g.getPathInfo(pathName);
		Assertions.assertTrue(path != null, "Path " + pathName + " doesn't exist");
		Assertions.assertEquals(tags, path.getTags());
	}

	protected void assertGraphDescription(String description) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		Assertions.assertEquals(description, g.getDescription());
	}

	protected void assertGraphName(String label) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		Assertions.assertEquals(label, g.getLabel());
	}

	protected void assertGraphTag(String tag) {
		MBTGraph<MBTVertex, MBTEdge> g = getGraph(keyValue.get("path"));
		Assertions.assertEquals(tag, g.getTag());
	}
}
