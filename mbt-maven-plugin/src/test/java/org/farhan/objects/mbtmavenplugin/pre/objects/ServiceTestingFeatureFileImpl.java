package org.farhan.objects.mbtmavenplugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.ServiceTestingFeatureFile;

public class ServiceTestingFeatureFileImpl extends FileObject implements ServiceTestingFeatureFile{

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
