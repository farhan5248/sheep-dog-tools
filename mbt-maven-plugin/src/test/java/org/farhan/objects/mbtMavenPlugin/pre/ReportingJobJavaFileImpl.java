package org.farhan.objects.mbtMavenPlugin.pre;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbtMavenPlugin.ReportingJobJavaFile;

public class ReportingJobJavaFileImpl extends FileObject implements ReportingJobJavaFile{

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}
}
