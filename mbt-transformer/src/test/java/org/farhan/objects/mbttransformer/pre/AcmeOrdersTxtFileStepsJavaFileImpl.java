package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmeOrdersTxtFileStepsJavaFile;

public class AcmeOrdersTxtFileStepsJavaFileImpl extends FileObject implements AcmeOrdersTxtFileStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
