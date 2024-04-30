package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.WhenTheSearchApplicationHomePageIsAsFollowsGraphFile;

public class WhenTheSearchApplicationHomePageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements WhenTheSearchApplicationHomePageIsAsFollowsGraphFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertGraphModelExists();
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
