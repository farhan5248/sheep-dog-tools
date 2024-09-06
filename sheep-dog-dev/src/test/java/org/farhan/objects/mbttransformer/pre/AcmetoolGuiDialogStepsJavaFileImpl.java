package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.AcmetoolGuiDialogStepsJavaFile;

public class AcmetoolGuiDialogStepsJavaFileImpl extends FileObject implements  AcmetoolGuiDialogStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
