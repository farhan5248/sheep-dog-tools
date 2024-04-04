package org.farhan.objects.mbtmavenplugin.pre.stepdefs;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.AcmeNightlyJobStepsJavaFile;

public class AcmeNightlyJobStepsJavaFileImpl extends FileObject implements AcmeNightlyJobStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
