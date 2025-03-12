package org.farhan.mbt.convert;

import org.farhan.mbt.core.Logger;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.TestProject;
import org.farhan.mbt.cucumber.CucumberGuiceTestProject;
import org.farhan.mbt.cucumber.CucumberPathConverter;
import org.farhan.mbt.cucumber.CucumberTestProject;

public class ConvertUMLToCucumberGuice extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberGuice(String tags, ObjectRepository fa, Logger log) {
		super(tags, fa, log);
	}

	public void initProjects() throws Exception {
		testProject = new TestProject(this.tag, this.fa);
		srcProject = new CucumberGuiceTestProject(this.tag, this.fa);
		testProject.init();
		srcProject.init();
		this.pathConverter = new CucumberPathConverter(testProject, (CucumberTestProject) srcProject);
	}
}
