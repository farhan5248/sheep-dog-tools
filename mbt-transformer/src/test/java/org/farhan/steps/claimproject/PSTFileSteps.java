package org.farhan.steps.claimproject;

import org.farhan.objects.claimproject.ClaimProjectFactory;
import org.farhan.objects.claimproject.PSTFile;
import org.farhan.steps.common.UMLSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class PSTFileSteps extends UMLSteps {

	@And("^The claim project, target/uml/pst.uml file is present$")
	public void TheClaimProjectPSTUMLFileIsPresent() {

		PSTFile o = (PSTFile) ClaimProjectFactory.get("PSTFile");
		o.setPath("target/uml/pst.uml");
		o.assertExists();
	}

	@And("^The target/uml/pst.uml file, Class Comments section is as follows$")
	public void ThePSTUMLFileClassCommentsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Comments");
	}
	
	@And("^The target/uml/pst.uml file, Class Interactions section is as follows$")
	public void ThePSTUMLFileClassInteractionsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Interactions");
	}

	@And("^The target/uml/pst.uml file, Interaction Parameters section is as follows$")
	public void ThePSTUMLFileInteractionParametersSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Parameters");
	}
	
	@And("^The target/uml/pst.uml file, Interaction Comments section is as follows$")
	public void ThePSTUMLFileInteractionCommentsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Comments");
	}
}