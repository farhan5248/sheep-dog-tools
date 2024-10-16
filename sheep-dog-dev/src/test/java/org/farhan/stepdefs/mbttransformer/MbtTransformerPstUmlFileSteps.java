package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.MbtTransformerFactory;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerPstUmlFileSteps {

    @Given("^The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present$")
    public void theMbtTransformerPluginTargetMbtUmlPstUmlFileWillBePresent() {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs("Present");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionMessagesSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction Comments section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction Annotations section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class Annotations section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassAnnotationsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class Comments section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        MbtTransformerFactory.get("PstUmlFile").setComponent("mbt-transformer");
        MbtTransformerFactory.get("PstUmlFile").setPath("target/mbt/uml/pst.uml");
        MbtTransformerFactory.get("PstUmlFile").assertInputOutputs(dataTable, "ClassCommentsSection");
    }
}
