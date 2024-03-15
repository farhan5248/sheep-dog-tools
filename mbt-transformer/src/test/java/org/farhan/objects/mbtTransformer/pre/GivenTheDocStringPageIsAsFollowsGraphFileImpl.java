package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtTransformer.GivenTheDocStringPageIsAsFollowsGraphFile;

public class GivenTheDocStringPageIsAsFollowsGraphFileImpl extends FileObject implements GivenTheDocStringPageIsAsFollowsGraphFile{

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
