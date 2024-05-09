package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.GivenTheObject2PageIsAsFollowsGraphFile;

public class GivenTheObject2PageIsAsFollowsGraphFileImpl extends GraphFileObject
		implements GivenTheObject2PageIsAsFollowsGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
