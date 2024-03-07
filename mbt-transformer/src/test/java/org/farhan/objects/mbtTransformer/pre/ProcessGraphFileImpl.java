package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbtTransformer.ProcessGraphFile;

public class ProcessGraphFileImpl extends GraphFileObject implements ProcessGraphFile {

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

	@Override
	public void assertEdgesSectionDescription(HashMap<String, String> keyMap) {
		assertEdgesDescription(keyMap.get("Edge Name"), keyMap.get("Description"));
	}

	@Override
	public void assertEdgesSectionLabel(HashMap<String, String> keyMap) {
		assertEdgesLabel(keyMap.get("Edge Name"), keyMap.get("Label"));
	}

	@Override
	public void assertEdgesSectionTag(HashMap<String, String> keyMap) {
		assertEdgesTag(keyMap.get("Edge Name"), keyMap.get("Tag"));
	}

	@Override
	public void assertGraphSectionDescription(HashMap<String, String> keyMap) {
		assertGraphDescription(keyMap.get("Description"));
	}

	@Override
	public void assertGraphSectionLabel(HashMap<String, String> keyMap) {
		assertGraphLabel(keyMap.get("Label"));
	}

	@Override
	public void assertGraphSectionTag(HashMap<String, String> keyMap) {
		assertGraphTag(keyMap.get("Tag"));
	}
}
