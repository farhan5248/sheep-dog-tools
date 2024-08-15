package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmeNightlyJobStepsJavaFile;

public class AcmeNightlyJobStepsJavaFileImpl extends FileObject implements AcmeNightlyJobStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
