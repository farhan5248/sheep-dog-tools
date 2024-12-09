package org.farhan.mbt.convert;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.cucumber.CucumberGuiceProject;

public class ConvertUMLToCucumberGuice extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberGuice(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	protected void initProjects() throws Exception {
		model = new UMLModel(this.tags, this.fa);
		model.init();
		project = new CucumberGuiceProject(this.tags, this.fa);
		project.init();
	}
}
