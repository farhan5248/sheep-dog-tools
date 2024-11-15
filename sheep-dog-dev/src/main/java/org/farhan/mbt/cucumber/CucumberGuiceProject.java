package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.FileAccessor;

public class CucumberGuiceProject extends CucumberProject {

	public CucumberGuiceProject(String tag, FileAccessor fa) {
		super(tag, fa);
	}

	@Override
	protected ConvertibleObject createJavaWrapper(File file) {
		return new CucumberGuiceJavaWrapper(file);
	}
}
