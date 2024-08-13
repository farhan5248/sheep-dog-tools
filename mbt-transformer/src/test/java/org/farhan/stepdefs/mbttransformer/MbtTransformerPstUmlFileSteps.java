package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPstUmlFileSteps {

    @Given("^The mbt-transformer plugin, target/uml/pst.uml file will be present$")
    public void theMbtTransformerPluginTargetUmlPstUmlFileWillBePresent() {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs("Present");
    }

    @Given("^The target/uml/pst.uml file, Class Annotations section will be as follows$")
    public void theTargetUmlPstUmlFileClassAnnotationsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassAnnotationsSection");
    }

    @Given("^The target/uml/pst.uml file, Class Comments section will be as follows$")
    public void theTargetUmlPstUmlFileClassCommentsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassCommentsSection");
    }

    @Given("^The target/uml/pst.uml file, Class Interactions section will be as follows$")
    public void theTargetUmlPstUmlFileClassInteractionsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassInteractionsSection");
    }

    @Given("^The target/uml/pst.uml file, Class section will be as follows$")
    public void theTargetUmlPstUmlFileClassSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Annotations section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionAnnotationsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Comments section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionCommentsSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The target/uml/pst.uml file, Interaction Messages section will be as follows$")
    public void theTargetUmlPstUmlFileInteractionMessagesSectionWillBeAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionMessagesSection");
    }
}
