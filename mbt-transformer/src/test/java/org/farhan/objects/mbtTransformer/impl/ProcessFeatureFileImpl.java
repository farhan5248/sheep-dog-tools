package org.farhan.objects.mbtTransformer.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtTransformer.ProcessFeatureFile;

public class ProcessFeatureFileImpl extends FileObject implements ProcessFeatureFile {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
