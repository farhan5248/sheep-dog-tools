package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.FileObject;
import org.farhan.objects.mbttransformer.BlahObjectPageStepsJavaFile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class BlahObjectPageStepsJavaFileImpl extends FileObject implements BlahObjectPageStepsJavaFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
