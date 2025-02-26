package org.farhan.stepdefs.mbttransformer.uml;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.uml.PstUmlFile;

@ScenarioScoped
public class MbtTransformerPstUmlFileSteps extends TestSteps {

	@Inject
	public MbtTransformerPstUmlFileSteps(PstUmlFile object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Class Comments section will be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileClassCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "ClassCommentsSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Class section will be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "ClassSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Class section won't be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileClassSectionWontBeCreatedAsFollows(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "ClassSection", true);
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "InteractionAnnotationsSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "InteractionCommentsSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(
			DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "InteractionMessagesSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Interaction section will be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileInteractionSectionWillBeCreatedAsFollows(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "InteractionSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file Interaction section won't be created as follows$")
	public void theMbtTransformerPluginUmlPstUmlFileInteractionSectionWontBeCreatedAsFollows(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs(dataTable, "InteractionSection");
	}

	@Given("^The mbt-transformer plugin, uml/pst.uml file will be present$")
	public void theMbtTransformerPluginUmlPstUmlFileWillBePresent() {
		object.setComponent("mbt-transformer");
		object.setPath("uml/pst.uml");
		object.assertInputOutputs("Present");
	}
}
