package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.GivenTheObject1PageIsAsFollowsGraphFile;

public class GivenTheObject1PageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements GivenTheObject1PageIsAsFollowsGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
