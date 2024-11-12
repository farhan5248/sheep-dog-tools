package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.mbt.core.ConvertibleObject;

public class CucumberGuiceProject extends CucumberProject {

	public CucumberGuiceProject(String tag) {
		super(tag);
	}
	
	protected ConvertibleObject createJavaWrapper(File file) {
		return new CucumberGuiceJavaWrapper(file);
	}
}
