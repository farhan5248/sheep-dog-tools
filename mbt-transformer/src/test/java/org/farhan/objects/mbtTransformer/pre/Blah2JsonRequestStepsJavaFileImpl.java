package org.farhan.objects.mbtTransformer.pre;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbtTransformer.Blah2JsonRequestStepsJavaFile;

public class Blah2JsonRequestStepsJavaFileImpl extends UMLFileObject implements Blah2JsonRequestStepsJavaFile {
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
