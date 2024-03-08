package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbtTransformer.TheSearchApplicationHomePageIsAsFollowsGraphFile;

public class TheSearchApplicationHomePageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements TheSearchApplicationHomePageIsAsFollowsGraphFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
