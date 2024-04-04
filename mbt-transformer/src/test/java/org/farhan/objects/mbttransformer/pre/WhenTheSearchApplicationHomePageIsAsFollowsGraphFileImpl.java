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

}
