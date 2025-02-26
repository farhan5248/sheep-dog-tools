package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.src.test.java.org.farhan.objects.blah.ObjectPageJavaFile;
import org.farhan.objects.mbttransformer.src.test.java.org.farhan.stepdefs.blah.BlahObjectPageStepsJavaFile;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.app.ProcessAsciidocFile;
import org.farhan.objects.mbttransformer.src.test.resources.asciidoc.stepdefs.blahapplication.ObjectPageAsciidocFile;
import org.farhan.objects.mbttransformer.src.test.resources.cucumber.app.ProcessFeatureFile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class FileImpl extends FileObject
		implements BlahObjectPageStepsJavaFile, ProcessAsciidocFile, ProcessFeatureFile, ObjectPageAsciidocFile,
		ObjectPageJavaFile, org.farhan.objects.mbttransformer.src.test.resources.cucumber.ProcessFeatureFile,
		org.farhan.objects.mbttransformer.src.test.resources.asciidoc.ProcessAsciidocFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	@Override
	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub

	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		// TODO Auto-generated method stub

	}
}
