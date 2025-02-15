package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.ObjectPageAsciidocFile;
import org.farhan.objects.mbttransformer.ObjectPageJavaFile;
import org.farhan.objects.mbttransformer.ProcessAsciidocFile;
import org.farhan.objects.mbttransformer.ProcessFeatureFile;

import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class FileImpl extends FileObject implements BlahObjectPageStepsJavaFile, ObjectPageJavaFile,
		ObjectPageAsciidocFile, ProcessAsciidocFile, ProcessFeatureFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub

	}

}
