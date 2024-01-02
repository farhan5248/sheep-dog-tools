package org.farhan.objects.mbttransformer;

import java.util.HashMap;

import org.farhan.common.objects.MbtTransformer;

public class MbtTransformerBlahDocStringsPageStepsJavaFile extends MbtTransformer {
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
