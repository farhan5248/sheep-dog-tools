package org.farhan.stepdefs.mbtTransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPstUmlFileSteps {

    @Given("^The mbt-transformer plugin, target/uml/pst.uml file will be present$")
    public void theMbtTransformerPluginTargetUmlPstUmlFileWillBePresent() {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs("Present");
    }

    @Given("^The target/uml/pst.uml file, Class Comments section will be as follows$")
    public void theTargetUmlPstUmlFileClassCommentsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassCommentsSection");
    }

    @Given("^The target/uml/pst.uml file, Class Element Imports section will be as follows$")
    public void theTargetUmlPstUmlFileClassElementImportsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassElementImportsSection");
    }

    @Given("^The target/uml/pst.uml file, Class Interactions section will be as follows$")
    public void theTargetUmlPstUmlFileClassInteractionsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassInteractionsSection");
    }

    @Given("^The target/uml/pst.uml file, Class Properties section will be as follows$")
    public void theTargetUmlPstUmlFileClassPropertiesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassPropertiesSection");
    }

    @Given("^The target/uml/pst.uml file, Class section will be as follows$")
    public void theTargetUmlPstUmlFileClassSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Annotations section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionAnnotationsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Comments section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionCommentsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Lifelines section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionLifelinesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionLifelinesSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Message Occurences section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionMessageOccurencesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionMessageOccurencesSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Messages section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionMessagesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionMessagesSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Parameters section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionParametersSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionParametersSection");
    }
}
