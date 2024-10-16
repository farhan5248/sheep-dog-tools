package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.JavaFileObject;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;

public class BlahObjectPageStepsJavaFileImpl extends JavaFileObject implements BlahObjectPageStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
