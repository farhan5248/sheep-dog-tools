package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import org.farhan.common.stepdefs.TestSteps;

public class MbtTransformerAsciidoctorToGraphGoalSteps extends TestSteps {

    @Given("^The mbt-transformer plugin, asciidoctor-to-graph goal is executed$")
    public void theMbtTransformerPluginAsciidoctorToGraphGoalIsExecuted() {
        MbtTransformerFactory.get("MbtTransformerAsciidoctorToGraphGoal").setIsExecuted();
        MbtTransformerFactory.get("MbtTransformerAsciidoctorToGraphGoal").execute();
    }
}
