package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FeatureFileObject;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;

public class ProcessFeatureFileImpl extends FeatureFileObject implements ProcessFeatureFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}