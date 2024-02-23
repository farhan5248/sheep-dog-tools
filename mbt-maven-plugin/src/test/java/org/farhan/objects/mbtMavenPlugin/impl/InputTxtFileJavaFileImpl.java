package org.farhan.objects.mbtMavenPlugin.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.InputTxtFileJavaFile;

public class InputTxtFileJavaFileImpl extends FileObject implements InputTxtFileJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
