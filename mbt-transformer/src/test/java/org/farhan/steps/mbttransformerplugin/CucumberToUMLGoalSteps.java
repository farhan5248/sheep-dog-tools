package org.farhan.steps.mbttransformerplugin;

import org.farhan.objects.mbttransformerplugin.CucumberToUMLGoal;
import org.farhan.objects.mbttransformerplugin.MBTTransformerPluginFactory;
import org.farhan.steps.common.GoalSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class CucumberToUMLGoalSteps extends GoalSteps {

	@And("^The mbt-transformer plugin, cucumber-to-uml goal is executed with$")
	public void TheMbtTransformerPluginCucumberToUmlGoalIsExecutedWith(DataTable dataTable) {

		CucumberToUMLGoal o = (CucumberToUMLGoal) MBTTransformerPluginFactory.get("CucumberToUMLGoal");
		MBTTransformerPluginFactory.get("CucumberToUMLGoal").setAttributes(dataTable);
		o.execute();
	}
}
