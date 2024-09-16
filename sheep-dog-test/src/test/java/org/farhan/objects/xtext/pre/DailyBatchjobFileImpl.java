package org.farhan.objects.xtext.pre;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.DailyBatchjobFile;

public class DailyBatchjobFileImpl extends TestObject implements DailyBatchjobFile {

	public void setPresent(HashMap<String, String> keyMap) {
		getEclipseMock().getProjectComponents().add(keyValue.get("path").replace("src-gen-step-defs/", ""));
	}
}
