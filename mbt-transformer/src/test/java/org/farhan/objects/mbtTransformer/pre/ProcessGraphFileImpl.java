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
	public void assertGraphSectionDescription(HashMap<String, String> keyMap) {
		assertGraphDescription(keyMap.get("Description"));
	}

	@Override
	public void assertGraphSectionTag(HashMap<String, String> keyMap) {
		assertGraphTag(keyMap.get("Tag"));
	}

	@Override
	public void assertGraphSectionName(HashMap<String, String> keyMap) {
		assertGraphName(keyMap.get("Name"));
	}

	@Override
	public void assertPathsSectionDescription(HashMap<String, String> keyMap) {
		assertPathsDescription(keyMap.get("Name"), keyMap.get("Description"));
	}

	@Override
	public void assertPathsSectionName(HashMap<String, String> keyMap) {
		assertPathsNameExists(keyMap.get("Name"));
	}

	@Override
	public void assertPathsSectionTag(HashMap<String, String> keyMap) {
		assertPathsTag(keyMap.get("Name"), keyMap.get("Tag"));
	}
}
