package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestObject;
import org.farhan.objects.mbttransformer.AsciidoctorToUmlGoal;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerAsciidoctorToUmlGoalSteps {

	private TestObject object;

	public MbtTransformerAsciidoctorToUmlGoalSteps(AsciidoctorToUmlGoal object) {
		this.object = (TestObject) object;
	}

	@Given("^The mbt-transformer plugin, asciidoctor-to-uml goal is executed$")
	public void theMbtTransformerPluginAsciidoctorToUmlGoalIsExecuted() {
		object.setComponent("mbt-transformer");
		object.setPath("asciidoctor-to-uml");
		object.transition();
	}

	@Given("^The mbt-transformer plugin, asciidoctor-to-uml goal is executed with$")
	public void theMbtTransformerPluginAsciidoctorToUmlGoalIsExecutedWith(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("asciidoctor-to-uml");
		object.setInputOutputs(dataTable);
		object.transition();
	}
}
