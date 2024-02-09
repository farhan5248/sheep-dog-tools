package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;

public class MbtTransformerAsciidoctorToGraphGoalSteps {

	@Given("^The mbt-transformer plugin, asciidoctor-to-graph goal is executed$")
	public void theMbtTransformerPluginAsciidoctorToGraphGoalIsExecuted() {
		MbtTransformerFactory.get("MbtTransformerAsciidoctorToGraphGoal").transition();
	}
}
