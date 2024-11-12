package org.farhan.mbt.convert;

import org.farhan.mbt.cucumber.CucumberSpringProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberSpring extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberSpring(String tags) {
		super(tags);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new UMLProject(this.tags);
		tgtPrj = new CucumberSpringProject(this.tags);
	}

}
