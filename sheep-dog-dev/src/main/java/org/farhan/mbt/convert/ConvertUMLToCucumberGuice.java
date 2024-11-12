package org.farhan.mbt.convert;

import org.farhan.mbt.cucumber.CucumberGuiceProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberGuice extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberGuice(String tags) {
		super(tags);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new UMLProject(this.tags);
		tgtPrj = new CucumberGuiceProject(this.tags);
	}
}
