package org.farhan.mbt.convert;

import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.cucumber.CucumberSpringProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberSpring extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberSpring(String tags, ObjectRepository fa) {
		super(tags, fa);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new UMLProject(this.tags, this.fa);
		tgtPrj = new CucumberSpringProject(this.tags, this.fa);
	}

}
