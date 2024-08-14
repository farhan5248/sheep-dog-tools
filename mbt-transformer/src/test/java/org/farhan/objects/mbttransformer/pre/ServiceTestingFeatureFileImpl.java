package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.ServiceTestingFeatureFile;

public class ServiceTestingFeatureFileImpl extends FileObject implements ServiceTestingFeatureFile{

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
