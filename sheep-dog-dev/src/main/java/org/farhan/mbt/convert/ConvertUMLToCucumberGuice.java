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
		model = new TestProject(this.tag, this.fa);
		project = new CucumberGuiceTestProject(this.tag, this.fa);
		model.init();
		project.init();
		this.pathConverter = new CucumberPathConverter(model, (CucumberTestProject) project);
	}
}
