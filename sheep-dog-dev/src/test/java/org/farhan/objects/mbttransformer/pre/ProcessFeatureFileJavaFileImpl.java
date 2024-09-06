package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.ProcessFeatureFileJavaFile;

public class ProcessFeatureFileJavaFileImpl extends FileObject implements  ProcessFeatureFileJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
