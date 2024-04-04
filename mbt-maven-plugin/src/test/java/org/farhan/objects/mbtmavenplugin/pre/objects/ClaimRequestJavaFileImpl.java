package org.farhan.objects.mbtmavenplugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.ClaimRequestJavaFile;

public class ClaimRequestJavaFileImpl extends FileObject implements ClaimRequestJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
