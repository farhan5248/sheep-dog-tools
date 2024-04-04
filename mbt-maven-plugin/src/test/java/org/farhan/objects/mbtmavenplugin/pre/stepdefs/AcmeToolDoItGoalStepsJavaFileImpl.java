package org.farhan.objects.mbtmavenplugin.pre.stepdefs;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.AcmeToolDoItGoalStepsJavaFile;

public class AcmeToolDoItGoalStepsJavaFileImpl extends FileObject implements AcmeToolDoItGoalStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
