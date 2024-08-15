package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmeToolOutputTxtFileStepsJavaFile;

public class AcmeToolOutputTxtFileStepsJavaFileImpl extends FileObject implements AcmeToolOutputTxtFileStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
