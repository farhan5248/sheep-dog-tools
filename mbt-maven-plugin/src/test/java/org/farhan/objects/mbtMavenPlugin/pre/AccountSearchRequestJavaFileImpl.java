package org.farhan.objects.mbtMavenPlugin.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.AccountSearchRequestJavaFile;

public class AccountSearchRequestJavaFileImpl extends FileObject implements AccountSearchRequestJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
