package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.mbt.core.ConvertibleObject;

public class CucumberSpringProject extends CucumberProject {

	public CucumberSpringProject(String tag) {
		super(tag);
	}
	
	@Override
	protected ConvertibleObject createJavaWrapper(File file) {
		return new CucumberSpringJavaWrapper(file);
	}

}
