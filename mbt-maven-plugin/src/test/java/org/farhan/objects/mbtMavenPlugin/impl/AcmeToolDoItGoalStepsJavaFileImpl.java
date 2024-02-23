package org.farhan.objects.mbtMavenPlugin.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.AcmeToolDoItGoalStepsJavaFile;

public class AcmeToolDoItGoalStepsJavaFileImpl extends FileObject implements AcmeToolDoItGoalStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
