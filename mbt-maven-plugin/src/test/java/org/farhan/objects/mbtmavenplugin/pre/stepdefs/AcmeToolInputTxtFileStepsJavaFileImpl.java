package org.farhan.objects.mbtmavenplugin.pre.stepdefs;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.AcmeToolInputTxtFileStepsJavaFile;

public class AcmeToolInputTxtFileStepsJavaFileImpl extends FileObject implements AcmeToolInputTxtFileStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
