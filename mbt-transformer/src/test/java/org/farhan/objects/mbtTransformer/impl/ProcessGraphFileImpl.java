package org.farhan.objects.mbtTransformer.impl;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbtTransformer.ProcessGraphFile;

public class ProcessGraphFileImpl extends GraphFileObject implements ProcessGraphFile {

	@Override
	public void assertEdgesGraphEdgesSectionEdgeSourceVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Edge Source Vertex Name"));
	}

	@Override
	public void assertEdgesGraphEdgesSectionGraphEdgeName(HashMap<String, String> keyMap) {
		assertEdgesGraphEdgeNameExists(keyMap.get("Edge Source Vertex Name"), keyMap.get("Graph Edge Name"));
	}

	@Override
	public void assertEdgesGraphVerticesSectionEdgeSourceVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Edge Source Vertex Name"));
	}

	@Override
	public void assertEdgesGraphVerticesSectionGraphVertexName(HashMap<String, String> keyMap) {
		assertEdgesGraphVertexNameExists(keyMap.get("Edge Source Vertex Name"), keyMap.get("Graph Vertex Name"));
	}

	@Override
	public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertGraphModelExists();
	}

	@Override
	public void assertVerticesSectionVertexName(HashMap<String, String> keyMap) {
		assertVerticesVertexNameExists(keyMap.get("Vertex Name"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
