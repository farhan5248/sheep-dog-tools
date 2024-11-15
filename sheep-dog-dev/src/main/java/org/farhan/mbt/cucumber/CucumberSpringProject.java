package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.FileAccessor;

public class CucumberSpringProject extends CucumberProject {

	public CucumberSpringProject(String tag, FileAccessor fa) {
		super(tag, fa);
	}

	@Override
	protected ConvertibleObject createJavaWrapper(File file) {
		return new CucumberSpringJavaWrapper(file);
	}

}
