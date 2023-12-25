package org.farhan.stepdefs.claimproject;

import org.farhan.common.stepdefs.UMLSteps;
import org.farhan.objects.claimproject.ClaimProjectFactory;
import org.farhan.objects.claimproject.PSTFile;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

public class PSTFileSteps extends UMLSteps {

	@And("^The claim project, target/uml/pst.uml file is present$")
	public void TheClaimProjectPSTUMLFileIsPresent() {

		PSTFile o = (PSTFile) ClaimProjectFactory.get("PSTFile");
		o.setBaseDir("claim");
		o.setPath("target/uml/pst.uml");
		o.assertExists();
	}

	@And("^The target/uml/pst.uml file, Class section is as follows$")
	public void ThePSTUMLFileClassSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class");
	}
	
	@And("^The target/uml/pst.uml file, Class Comments section is as follows$")
	public void ThePSTUMLFileClassCommentsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Comments");
	}
	
	@And("^The target/uml/pst.uml file, Class Element Imports section is as follows$")
	public void ThePSTUMLFileClassElementImportsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Element Imports");
	}
	
	@And("^The target/uml/pst.uml file, Class Properties section is as follows$")
	public void ThePSTUMLFileClassPropertiesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Properties");
	}
	
	@And("^The target/uml/pst.uml file, Class Interactions section is as follows$")
	public void ThePSTUMLFileClassInteractionsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Class Interactions");
	}

	@And("^The target/uml/pst.uml file, Interaction Parameters section is as follows$")
	public void ThePSTUMLFileInteractionParametersSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Parameters");
	}
	
	@And("^The target/uml/pst.uml file, Interaction Annotations section is as follows$")
	public void ThePSTUMLFileInteractionAnnotationsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Annotations");
	}
	
	@And("^The target/uml/pst.uml file, Interaction Comments section is as follows$")
	public void ThePSTUMLFileInteractionCommentsSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Comments");
	}
	
	@And("^The target/uml/pst.uml file, Interaction Messages section is as follows$")
	public void ThePSTUMLFileInteractionMessagesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Messages");
	}
	
	@And("^The target/uml/pst.uml file, Interaction Lifelines section is as follows$")
	public void ThePSTUMLFileInteractionLifelinesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Lifelines");
	}
	
	@And("^The target/uml/pst.uml file, Interaction Message Occurences section is as follows$")
	public void ThePSTUMLFileInteractionMessageOccurencesSectionIsAsFollows(DataTable dataTable) {
		ClaimProjectFactory.get("PSTFile").assertAttributes(dataTable, "Interaction Message Occurences");
	}
}