package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.graph.GivenTheDocStringPageIsAsFollowsGraphFile;

public class GivenTheDocStringPageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements GivenTheDocStringPageIsAsFollowsGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	@Override
	public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}
}
