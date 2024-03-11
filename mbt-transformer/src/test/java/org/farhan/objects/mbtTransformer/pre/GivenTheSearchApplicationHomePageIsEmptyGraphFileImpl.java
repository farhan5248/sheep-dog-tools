package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbtTransformer.GivenTheSearchApplicationHomePageIsEmptyGraphFile;

public class GivenTheSearchApplicationHomePageIsEmptyGraphFileImpl extends GraphFileObject
		implements GivenTheSearchApplicationHomePageIsEmptyGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
