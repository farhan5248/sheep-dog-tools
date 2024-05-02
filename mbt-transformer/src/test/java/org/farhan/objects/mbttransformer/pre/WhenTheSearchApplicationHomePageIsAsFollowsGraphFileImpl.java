package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.graph.WhenTheSearchApplicationHomePageIsAsFollowsGraphFile;

public class WhenTheSearchApplicationHomePageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements WhenTheSearchApplicationHomePageIsAsFollowsGraphFile {

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	@Override
	public void assertEdgesSectionEdgeName(HashMap<String, String> keyMap) {
		assertEdgesEdgeNameExists(keyMap.get("Edge Name"));
	}

	@Override
	public void assertEdgesSectionTag(HashMap<String, String> keyMap) {
		assertEdgesTag(keyMap.get("Edge Name"), keyMap.get("Tag"));
	}

}
