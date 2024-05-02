package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbttransformer.graph.GivenTheSearchApplicationHomePageIsEmptyGraphFile;

public class GivenTheSearchApplicationHomePageIsEmptyGraphFileImpl extends GraphFileObject
		implements GivenTheSearchApplicationHomePageIsEmptyGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
