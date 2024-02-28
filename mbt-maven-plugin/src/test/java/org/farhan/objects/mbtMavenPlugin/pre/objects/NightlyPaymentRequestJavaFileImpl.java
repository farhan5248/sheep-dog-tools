package org.farhan.objects.mbtMavenPlugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.NightlyPaymentRequestJavaFile;

public class NightlyPaymentRequestJavaFileImpl extends FileObject implements NightlyPaymentRequestJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
