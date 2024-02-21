package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

import org.farhan.common.MbtTransformer;

import io.cucumber.java.PendingException;

public class MbtTransformerProcessGraphFile extends MbtTransformer {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertPresent(HashMap<String, String> keyMap) {
		assertGraphModelExists();
	}

	public void assertVerticesVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Vertex Name"));
	}

	public void assertEdgesEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}

	public void assertEdgesGraphEdgesGraphEdgeName(HashMap<String, String> keyMap) {
		assertEdgesGraphEdgeNameExists(keyMap.get("Edge Source Vertex Name"), keyMap.get("Graph Edge Name"));
	}

	public void assertEdgesGraphVerticesGraphVertexName(HashMap<String, String> keyMap) {
		assertEdgesGraphVertexNameExists(keyMap.get("Edge Source Vertex Name"), keyMap.get("Graph Vertex Name"));
	}

	public void assertEdgesGraphVerticesEdgeSourceVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Edge Source Vertex Name"));
	}

	public void assertEdgesGraphEdgesEdgeSourceVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Edge Source Vertex Name"));
	}

}
