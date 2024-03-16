package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtTransformer.GivenTheDocStringPageIsAsFollows0TxtFile;

public class GivenTheDocStringPageIsAsFollows0TxtFileImpl extends FileObject
		implements GivenTheDocStringPageIsAsFollows0TxtFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
