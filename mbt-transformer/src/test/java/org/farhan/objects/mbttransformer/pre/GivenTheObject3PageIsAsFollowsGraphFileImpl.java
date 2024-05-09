package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.GivenTheObject3PageIsAsFollowsGraphFile;

public class GivenTheObject3PageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements GivenTheObject3PageIsAsFollowsGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
