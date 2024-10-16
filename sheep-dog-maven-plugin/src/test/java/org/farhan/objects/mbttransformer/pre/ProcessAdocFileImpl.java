package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.AdocFileObject;
import org.farhan.objects.mbttransformer.ProcessAdocFile;

public class ProcessAdocFileImpl extends AdocFileObject implements ProcessAdocFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
