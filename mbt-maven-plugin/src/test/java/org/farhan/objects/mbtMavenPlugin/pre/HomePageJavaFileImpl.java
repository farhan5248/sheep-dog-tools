package org.farhan.objects.mbtMavenPlugin.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.HomePageJavaFile;

public class HomePageJavaFileImpl extends FileObject implements HomePageJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
