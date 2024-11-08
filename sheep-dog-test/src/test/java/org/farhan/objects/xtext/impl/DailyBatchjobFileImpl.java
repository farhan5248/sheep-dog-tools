package org.farhan.objects.xtext.impl;

import java.util.HashMap;

import org.farhan.common.TestObject;
import org.farhan.objects.xtext.DailyBatchjobFile;

import io.cucumber.guice.ScenarioScoped;
@ScenarioScoped
public class DailyBatchjobFileImpl extends TestObject implements DailyBatchjobFile {

	public void setPresent(HashMap<String, String> keyMap) {
		getEclipseMock().getFiles().add(keyValue.get("path").replace("src-gen-step-defs/", ""));
	}
}
