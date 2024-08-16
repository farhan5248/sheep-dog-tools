package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmeLogInRequestStepsJavaFile;

public class AcmeLogInRequestStepsJavaFileImpl extends FileObject implements AcmeLogInRequestStepsJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}