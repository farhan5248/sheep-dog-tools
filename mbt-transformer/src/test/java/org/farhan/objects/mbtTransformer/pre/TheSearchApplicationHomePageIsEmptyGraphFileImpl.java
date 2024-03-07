package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.GraphFileObject;
import org.farhan.objects.mbtTransformer.TheSearchApplicationHomePageIsEmptyGraphFile;

public class TheSearchApplicationHomePageIsEmptyGraphFileImpl extends GraphFileObject
		implements TheSearchApplicationHomePageIsEmptyGraphFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
