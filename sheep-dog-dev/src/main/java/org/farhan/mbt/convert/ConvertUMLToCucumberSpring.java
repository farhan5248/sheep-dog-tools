package org.farhan.mbt.convert;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.cucumber.CucumberSpringProject;

public class ConvertUMLToCucumberSpring extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberSpring(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	@Override
	public void initProjects() throws Exception {
		super.initProjects();
		project = new CucumberSpringProject(this.tags, this.fa);
		project.init();
	}

}
