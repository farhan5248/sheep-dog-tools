package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.PstUmlFile;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerPstUmlFileSteps  extends TestSteps{

    @Inject
    public MbtTransformerPstUmlFileSteps(PstUmlFile object) {
    	super(object);
    }

    @Given("^The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present$")
    public void theMbtTransformerPluginTargetMbtUmlPstUmlFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs("Present");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionMessagesSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction Comments section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction Annotations section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class Annotations section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassAnnotationsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class Comments section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassCommentsSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Class section won't be created as follows$")
    public void theTargetMbtUmlPstUmlFileClassSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection", true);
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction section will be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The target/mbt/uml/pst.uml file Interaction section won't be created as follows$")
    public void theTargetMbtUmlPstUmlFileInteractionSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The target/mbt/tag1/uml/pst.uml file Class section will be created as follows$")
    public void theTargetMbtTag1UmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/tag1/uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The target/mbt/tag1/uml/pst.uml file Class section won't be created as follows$")
    public void theTargetMbtTag1UmlPstUmlFileClassSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/tag1/uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection", true);
    }

    @Given("^The target/mbt/tag1/uml/pst.uml file Interaction section will be created as follows$")
    public void theTargetMbtTag1UmlPstUmlFileInteractionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/tag1/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The target/mbt/tag1/uml/pst.uml file Interaction section won't be created as follows$")
    public void theTargetMbtTag1UmlPstUmlFileInteractionSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/tag1/uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The mbt-transformer plugin, target/mbt/tag1/uml/pst.uml file will be present$")
    public void theMbtTransformerPluginTargetMbtTag1UmlPstUmlFileWillBePresent() {
        object.setComponent("mbt-transformer");
        object.setPath("target/mbt/tag1/uml/pst.uml");
        object.assertInputOutputs("Present");
    }
}
