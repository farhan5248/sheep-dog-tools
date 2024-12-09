package org.farhan.mbt.convert;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.core.UMLModel;
import org.farhan.mbt.cucumber.CucumberSpringProject;

public class ConvertUMLToCucumberSpring extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberSpring(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	protected void initProjects() throws Exception {
		model = new UMLModel(this.tags, this.fa);
		model.init();
		project = new CucumberSpringProject(this.tags, this.fa);
		project.init();
	}

}
