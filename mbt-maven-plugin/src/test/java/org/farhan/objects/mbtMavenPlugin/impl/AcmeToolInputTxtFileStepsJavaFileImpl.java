package org.farhan.objects.mbtMavenPlugin.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.AcmeToolInputTxtFileStepsJavaFile;

public class AcmeToolInputTxtFileStepsJavaFileImpl extends FileObject implements AcmeToolInputTxtFileStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
