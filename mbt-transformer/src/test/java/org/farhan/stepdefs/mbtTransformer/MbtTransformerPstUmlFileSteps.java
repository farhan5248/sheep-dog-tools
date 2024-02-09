package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.objects.MbtTransformerFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class MbtTransformerPstUmlFileSteps {

	@Given("^The mbt-transformer plugin, target/uml/pst.uml file will be present$")
	public void theClaimProjectTargetUmlPstUmlFileWillBePresent() {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs("Present");
	}

	@Given("^The target/uml/pst.uml file, Class section will be as follows$")
	public void theTargetUmlPstUmlFileClassSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Class");
	}

	@Given("^The target/uml/pst.uml file, Class Comments section will be as follows$")
	public void theTargetUmlPstUmlFileClassCommentsSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Class Comments");
	}

	@Given("^The target/uml/pst.uml file, Class Element Imports section will be as follows$")
	public void theTargetUmlPstUmlFileClassElementImportsSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Class Element Imports");
	}

	@Given("^The target/uml/pst.uml file, Class Properties section will be as follows$")
	public void theTargetUmlPstUmlFileClassPropertiesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Class Properties");
	}

	@Given("^The target/uml/pst.uml file, Class Interactions section will be as follows$")
	public void theTargetUmlPstUmlFileClassInteractionsSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Class Interactions");
	}

	@Given("^The target/uml/pst.uml file, Interaction Parameters section will be as follows$")
	public void theTargetUmlPstUmlFileInteractionParametersSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Interaction Parameters");
	}

	@Given("^The target/uml/pst.uml file, Interaction Annotations section will be as follows$")
	public void theTargetUmlPstUmlFileInteractionAnnotationsSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Interaction Annotations");
	}

	@Given("^The target/uml/pst.uml file, Interaction Comments section will be as follows$")
	public void theTargetUmlPstUmlFileInteractionCommentsSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Interaction Comments");
	}

	@Given("^The target/uml/pst.uml file, Interaction Messages section will be as follows$")
	public void theTargetUmlPstUmlFileInteractionMessagesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Interaction Messages");
	}

	@Given("^The target/uml/pst.uml file, Interaction Lifelines section will be as follows$")
	public void theTargetUmlPstUmlFileInteractionLifelinesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Interaction Lifelines");
	}

	@Given("^The target/uml/pst.uml file, Interaction Message Occurences section will be as follows$")
	public void theTargetUmlPstUmlFileInteractionMessageOccurencesSectionWillBeAsFollows(DataTable dataTable) {
		MbtTransformerFactory.get("MbtTransformerPstUmlFile").assertInputOutputs(dataTable, "Interaction Message Occurences");
	}
}
