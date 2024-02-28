package org.farhan.objects.mbtMavenPlugin.pre.stepdefs;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.AcmeOrdersTxtFileStepsJavaFile;

public class AcmeOrdersTxtFileStepsJavaFileImpl extends FileObject implements AcmeOrdersTxtFileStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
