package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmetoolProcessFeatureFileStepsJavaFile;

public class AcmetoolProcessFeatureFileStepsJavaFileImpl extends FileObject implements  AcmetoolProcessFeatureFileStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}