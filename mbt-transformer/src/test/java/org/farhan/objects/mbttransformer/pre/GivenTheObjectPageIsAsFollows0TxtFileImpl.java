package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.GivenTheObjectPageIsAsFollows0TxtFile;

public class GivenTheObjectPageIsAsFollows0TxtFileImpl extends FileObject
		implements GivenTheObjectPageIsAsFollows0TxtFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
