package org.farhan.stepdefs.claimproject;

import org.farhan.common.objects.ClaimProjectFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class PSTFileSteps extends TestSteps {

	@Given("^The claim project, target/uml/pst.uml file is present$")
	public void TheClaimProjectPSTUMLFileIsPresent() {
		ClaimProjectFactory.get("PSTFile").setBaseDir("claim").setPath("target/uml/pst.uml").assertExists();
	}

	@Given("^The target/uml/pst.uml file, Class section is as follows$")
	public void ThePSTUMLFileClassSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class");
	}

	@Given("^The target/uml/pst.uml file, Class Comments section is as follows$")
	public void ThePSTUMLFileClassCommentsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Comments");
	}

	@Given("^The target/uml/pst.uml file, Class Element Imports section is as follows$")
	public void ThePSTUMLFileClassElementImportsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Element Imports");
	}

	@Given("^The target/uml/pst.uml file, Class Properties section is as follows$")
	public void ThePSTUMLFileClassPropertiesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Properties");
	}

	@Given("^The target/uml/pst.uml file, Class Interactions section is as follows$")
	public void ThePSTUMLFileClassInteractionsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Interactions");
	}

	@Given("^The target/uml/pst.uml file, Interaction Parameters section is as follows$")
	public void ThePSTUMLFileInteractionParametersSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Parameters");
	}

	@Given("^The target/uml/pst.uml file, Interaction Annotations section is as follows$")
	public void ThePSTUMLFileInteractionAnnotationsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Annotations");
	}

	@Given("^The target/uml/pst.uml file, Interaction Comments section is as follows$")
	public void ThePSTUMLFileInteractionCommentsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Comments");
	}

	@Given("^The target/uml/pst.uml file, Interaction Messages section is as follows$")
	public void ThePSTUMLFileInteractionMessagesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Messages");
	}

	@Given("^The target/uml/pst.uml file, Interaction Lifelines section is as follows$")
	public void ThePSTUMLFileInteractionLifelinesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Lifelines");
	}

	@Given("^The target/uml/pst.uml file, Interaction Message Occurences section is as follows$")
	public void ThePSTUMLFileInteractionMessageOccurencesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Message Occurences");
	}
}