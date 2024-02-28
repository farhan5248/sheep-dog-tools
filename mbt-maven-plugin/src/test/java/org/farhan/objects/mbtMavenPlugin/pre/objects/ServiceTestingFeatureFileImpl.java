package org.farhan.objects.mbtMavenPlugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.ServiceTestingFeatureFile;

public class ServiceTestingFeatureFileImpl extends FileObject implements ServiceTestingFeatureFile{

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
