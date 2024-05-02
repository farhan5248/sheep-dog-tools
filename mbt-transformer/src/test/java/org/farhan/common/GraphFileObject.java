package org.farhan.common;

import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;
import org.junit.jupiter.api.Assertions;

public abstract class GraphFileObject extends FileObject {

	private JGraphTProject project;
	private JGraphTGraphWrapper wrapper;

	protected void assertEdgesEdgeNameExists(String edgeName) {
		Assertions.assertTrue(getEdge(getObject(), edgeName) != null, "Edge " + edgeName + " doesn't exist");
	}

	protected void assertEdgesTag(String edgeName, String tags) {
		assertEdgesEdgeNameExists(edgeName);
		Assertions.assertEquals(tags, getEdge(getObject(), edgeName).getTags());
	}

	protected void assertGraphDescription(String description) {
		Assertions.assertEquals(description, getObject().getDescription());
	}

	protected void assertGraphName(String label) {
		Assertions.assertEquals(label, getObject().getName());
	}

	protected void assertGraphTag(String tag) {
		Assertions.assertEquals(tag, getObject().getTags());
	}

	protected void assertObjectExists() {
		super.assertObjectExists();
		project = new JGraphTProject();
		try {
			wrapper = (JGraphTGraphWrapper) project.createObject(getFile().getAbsolutePath());
			wrapper.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertPathsDescription(String pathName, String description) {
		assertPathsNameExists(pathName);
		Assertions.assertEquals(description, getObject().getPathInfo(pathName).getDescription());
	}

	protected void assertPathsIndex(String pathName, String index) {
		assertPathsNameExists(pathName);
		Assertions.assertEquals(index, getObject().getPathInfo(pathName).getIndex());
	}

	protected void assertPathsNameExists(String pathName) {
		Assertions.assertTrue(getObject().getPathInfo(pathName) != null, "Path " + pathName + " doesn't exist");
	}

	protected void assertPathsTag(String pathName, String tags) {
		assertPathsNameExists(pathName);
		Assertions.assertEquals(tags, getObject().getPathInfo(pathName).getTags());
	}

	protected void assertVerticesVertexNameExists(String vertexName) {
		Assertions.assertTrue(getObject().vertexSet().contains(new MBTVertex(vertexName)),
				"Vertex " + vertexName + " doesn't exist");
	}

	private MBTEdge getEdge(MBTGraph<MBTVertex, MBTEdge> g, String edgeName) {
		for (MBTEdge e : g.edgeSet()) {
			String eString = g.getEdgeSource(e).getLabel() + " -> " + e.getLabel() + " -> "
					+ g.getEdgeTarget(e).getLabel();
			if (edgeName.contentEquals(eString)) {
				return e;
			}
		}
		return null;
	}

	private MBTGraph<MBTVertex, MBTEdge> getObject() {
		return (MBTGraph<MBTVertex, MBTEdge>) wrapper.get();
	}
}
