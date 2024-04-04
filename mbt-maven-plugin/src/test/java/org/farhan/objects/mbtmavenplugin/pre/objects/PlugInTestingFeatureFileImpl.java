package org.farhan.objects.mbtmavenplugin.pre.objects;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtmavenplugin.PlugInTestingFeatureFile;

public class PlugInTestingFeatureFileImpl extends FileObject implements PlugInTestingFeatureFile {

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
