package org.farhan.mbt.cucumber;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ObjectRepository;

public class CucumberGuiceTestProject extends CucumberTestProject {

	public CucumberGuiceTestProject(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	@Override
	protected ConvertibleObject createJavaWrapper(String file) {
		return new CucumberGuiceClass(file);
	}
}
