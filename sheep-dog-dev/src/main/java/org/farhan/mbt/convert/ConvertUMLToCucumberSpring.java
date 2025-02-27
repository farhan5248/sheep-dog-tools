package org.farhan.mbt.convert;

import org.farhan.mbt.core.Logger;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.cucumber.CucumberPathConverter;
import org.farhan.mbt.cucumber.CucumberTestProject;
import org.farhan.mbt.cucumber.CucumberSpringTestProject;

public class ConvertUMLToCucumberSpring extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberSpring(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	public void initProjects() throws Exception {
		testProject = new TestProject(this.tags, this.fa);
		project = new CucumberSpringTestProject(this.tags, this.fa);
		testProject.init();
		project.init();
		this.pathConverter = new CucumberPathConverter(testProject, (CucumberTestProject) project);
	}

}
