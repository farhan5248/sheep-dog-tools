package org.farhan.objects.mbtMavenPlugin.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.NightlyJobJavaFile;

public class NightlyJobJavaFileImpl extends FileObject implements NightlyJobJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
