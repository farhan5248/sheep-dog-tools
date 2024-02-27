package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbtTransformer.BlahDocStringPageStepsJavaFile;

public class BlahDocStringPageStepsJavaFileImpl extends UMLFileObject implements BlahDocStringPageStepsJavaFile {
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
