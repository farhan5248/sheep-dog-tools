package org.farhan.objects.mbtmavenplugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.NightlyPaymentRequestJavaFile;

public class NightlyPaymentRequestJavaFileImpl extends FileObject implements NightlyPaymentRequestJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
