package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmeAccountDetailsPageStepsJavaFile;

public class AcmeAccountDetailsPageStepsJavaFileImpl extends FileObject implements AcmeAccountDetailsPageStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
