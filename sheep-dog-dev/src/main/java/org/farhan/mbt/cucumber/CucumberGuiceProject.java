package org.farhan.mbt.cucumber;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ObjectRepository;

public class CucumberGuiceProject extends CucumberProject {

	public CucumberGuiceProject(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	@Override
	protected ConvertibleObject createJavaWrapper(String file) {
		return new CucumberGuiceJavaWrapper(file);
	}
}
