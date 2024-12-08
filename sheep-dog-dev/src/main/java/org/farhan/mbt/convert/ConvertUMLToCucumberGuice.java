package org.farhan.mbt.convert;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.cucumber.CucumberGuiceProject;

public class ConvertUMLToCucumberGuice extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberGuice(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	@Override
	public void initProjects() throws Exception {
		super.initProjects();
		project = new CucumberGuiceProject(this.tags, this.fa);
		project.init();
	}
}
