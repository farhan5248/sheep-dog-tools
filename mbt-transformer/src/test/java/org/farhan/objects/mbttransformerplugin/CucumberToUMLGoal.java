package org.farhan.objects.mbttransformerplugin;

import java.util.HashMap;

import org.farhan.conv.core.Project;
import org.farhan.mbt.conv.cucumber.ConvertCucumberToUMLPSTMojo;
import org.farhan.objects.common.GoalObject;
import org.junit.jupiter.api.Assertions;

public class CucumberToUMLGoal extends GoalObject {

	public CucumberToUMLGoal() {
		object = this;
	}

	public void setTags(HashMap<String, String> row) {
		// TODO I should probably pass the tags to the mojoGoal to keep it simple? It an
		// then set it at the project level or whatever
		Project.tags = row.get("Tags");
	}

	public void execute() {

		try {
			ConvertCucumberToUMLPSTMojo mojo = new ConvertCucumberToUMLPSTMojo();
			mojo.mojoGoal();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step");
		}
	}

}
