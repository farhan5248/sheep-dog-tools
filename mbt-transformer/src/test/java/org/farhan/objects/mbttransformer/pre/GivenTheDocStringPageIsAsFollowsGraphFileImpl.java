package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.GivenTheDocStringPageIsAsFollowsGraphFile;

public class GivenTheDocStringPageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements GivenTheDocStringPageIsAsFollowsGraphFile {

	@Override
	public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}

	@Override
	public void assertEdgesSectionTag(HashMap<String, String> keyMap) {
		assertEdgesTag(keyMap.get("Edge Name"), keyMap.get("Tag"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
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
