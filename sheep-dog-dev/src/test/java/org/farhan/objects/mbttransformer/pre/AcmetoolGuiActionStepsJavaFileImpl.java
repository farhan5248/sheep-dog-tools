package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmetoolGuiActionStepsJavaFile;

public class AcmetoolGuiActionStepsJavaFileImpl extends FileObject implements AcmetoolGuiActionStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
