package org.farhan.common;

import java.io.File;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.core.ConvertibleProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTVertex;
import org.junit.jupiter.api.Assertions;

public abstract class GraphFileObject extends FileObject {

	protected JGraphTProject graphProject;

	private MBTEdge getEdgeByString(MBTGraph<MBTVertex, MBTEdge> g, String edgeName) {
		MBTEdge edge = null;
		for (MBTEdge e : g.edgeSet()) {
			String eString = g.getEdgeSource(e).getLabel() + " -> " + e.getValue() + " -> "
					+ g.getEdgeTarget(e).getLabel();
			if (edgeName.contentEquals(eString)) {
				edge = e;
				break;
			}
		}
		return edge;
	}

	private MBTEdge getEdgeBySourceVertex(MBTGraph<MBTVertex, MBTEdge> g, String sourceVertex) {
		return (MBTEdge) g.outgoingEdgesOf(g.getVertex(sourceVertex)).toArray()[0];
	}

	protected void assertVerticesVertexNameExists(String vertexName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		Assertions.assertTrue(g.vertexSet().contains(new MBTVertex(vertexName)),
				"Vertex " + vertexName + " doesn't exist");
	}

	protected void assertEdgesEdgeNameExists(String edgeName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		Assertions.assertTrue(getEdgeByString(g, edgeName) != null, "Edge " + edgeName + " doesn't exist");
	}

	protected void assertEdgesGraphEdgeNameExists(String sourceVertex, String graphEdgeName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertTrue(getEdgeByString(g1, graphEdgeName) != null,
				"Graph Edge " + graphEdgeName + " doesn't exist");
	}

	protected void assertEdgesGraphVertexNameExists(String sourceVertex, String graphVertexName) {
		// TODO temporarily commented out until I can distinguish parent from child
		// graphs
		// Assertions.assertEquals(1,
		// graphProject.getObjects(graphProject.firstLayerName).size());
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		MBTEdge edge = getEdgeBySourceVertex(g, sourceVertex);
		Assertions.assertTrue(edge != null, "Edge " + sourceVertex + " doesn't exist");
		MBTGraph<MBTVertex, MBTEdge> g1 = (MBTGraph<MBTVertex, MBTEdge>) edge.getValue();
		Assertions.assertTrue(g1.vertexSet().contains(new MBTVertex(graphVertexName)),
				"Vertex " + graphVertexName + " doesn't exist");
	}

	protected void assertGraphModelExists() {
		assertFileExists();
		File f = new File(ConvertibleProject.baseDir + keyValue.get("path"));
		try {
			graphProject = new JGraphTProject();
			graphProject.createObject(f.getAbsolutePath()).load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

	protected void assertEdgesDescription(String edgeName, String description) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		MBTEdge edge = getEdgeByString(g, edgeName);
		Assertions.assertTrue(edge != null, "Edge " + edgeName + " doesn't exist");
		Assertions.assertEquals(description, edge.getDescription());
	}

	protected void assertEdgesLabel(String edgeName, String label) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		MBTEdge edge = getEdgeByString(g, edgeName);
		Assertions.assertTrue(edge != null, "Edge " + edgeName + " doesn't exist");
		Assertions.assertEquals(label, edge.getLabel());
	}

	protected void assertEdgesTag(String edgeName, String tag) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		MBTEdge edge = getEdgeByString(g, edgeName);
		Assertions.assertTrue(edge != null, "Edge " + edgeName + " doesn't exist");
		Assertions.assertEquals(tag, edge.getTag());
	}

	protected void assertGraphDescription(String description) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		Assertions.assertEquals(description, g.getDescription());
	}

	protected void assertGraphLabel(String label) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		Assertions.assertEquals(label, g.getLabel());
	}

	protected void assertGraphTag(String tag) {
		JGraphTGraphWrapper gtf = (JGraphTGraphWrapper) graphProject.getObjects(graphProject.FIRST_LAYER).getFirst();
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) gtf.get();
		Assertions.assertEquals(tag, g.getTag());
	}
}
