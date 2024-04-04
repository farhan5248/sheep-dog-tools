package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.UMLFileObject;
import org.farhan.objects.mbttransformer.JsonRequestJavaFile;

public class JsonRequestJavaFileImpl extends UMLFileObject implements JsonRequestJavaFile {
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}