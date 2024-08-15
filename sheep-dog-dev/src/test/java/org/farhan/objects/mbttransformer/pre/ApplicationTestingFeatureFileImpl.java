package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.ApplicationTestingFeatureFile;

public class ApplicationTestingFeatureFileImpl extends FileObject implements ApplicationTestingFeatureFile {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
