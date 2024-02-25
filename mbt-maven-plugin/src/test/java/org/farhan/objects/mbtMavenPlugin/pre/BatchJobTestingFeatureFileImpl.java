package org.farhan.objects.mbtMavenPlugin.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.BatchJobTestingFeatureFile;

public class BatchJobTestingFeatureFileImpl extends FileObject implements BatchJobTestingFeatureFile {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
