package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.ProcessAdocFile;

public class ProcessAdocFileImpl extends RestService implements ProcessAdocFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		addParamter("fileName", keyValue.get("path").replaceFirst("src/test/", ""));
		assertContent("getFileContents", keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		addParamter("fileName", keyValue.get("path").replaceFirst("src/test/", ""));
		setContent("addFile", keyMap.get("Content"));
	}
}
