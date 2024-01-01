package org.farhan.stepdefs.claim;

import org.farhan.common.objects.ClaimFactory;
import org.farhan.common.stepdefs.TestSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class ClaimPstUmlFileSteps extends TestSteps {

    @Given("^The claim project, target/uml/pst.uml file will be present$")
    public void theClaimProjectTargetUmlPstUmlFileWillBePresent() {
        ClaimFactory.get("ClaimPstUmlFile").assertWillBePresent();
    }

    @Given("^The target/uml/pst.uml file, Class section will be as follows$")
    public void theTargetUmlPstUmlFileClassSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Class");
    }

    @Given("^The target/uml/pst.uml file, Class Comments section will be as follows$")
    public void theTargetUmlPstUmlFileClassCommentsSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Class Comments");
    }

    @Given("^The target/uml/pst.uml file, Class Element Imports section will be as follows$")
    public void theTargetUmlPstUmlFileClassElementImportsSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Class Element Imports");
    }

    @Given("^The target/uml/pst.uml file, Class Properties section will be as follows$")
    public void theTargetUmlPstUmlFileClassPropertiesSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Class Properties");
    }

    @Given("^The target/uml/pst.uml file, Class Interactions section will be as follows$")
    public void theTargetUmlPstUmlFileClassInteractionsSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Class Interactions");
    }

    @Given("^The target/uml/pst.uml file, Interaction Parameters section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionParametersSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Interaction Parameters");
    }

    @Given("^The target/uml/pst.uml file, Interaction Annotations section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionAnnotationsSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Interaction Annotations");
    }

    @Given("^The target/uml/pst.uml file, Interaction Comments section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionCommentsSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Interaction Comments");
    }

    @Given("^The target/uml/pst.uml file, Interaction Messages section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionMessagesSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Interaction Messages");
    }

    @Given("^The target/uml/pst.uml file, Interaction Lifelines section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionLifelinesSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Interaction Lifelines");
    }

    @Given("^The target/uml/pst.uml file, Interaction Message Occurences section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionMessageOccurencesSectionWillBeAsFollows(DataTable dataTable) {
        ClaimFactory.get("ClaimPstUmlFile").assertAttributes(dataTable, "Interaction Message Occurences");
    }
}
