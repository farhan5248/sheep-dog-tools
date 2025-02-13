package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.AdocFileObject;
import org.farhan.objects.mbttransformer.Object1PageAsciidocFile;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class Object1PageAsciidocFileImpl extends AdocFileObject implements Object1PageAsciidocFile {

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

}
