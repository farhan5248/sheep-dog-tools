package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.PstUmlFile;
import com.google.inject.Inject;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;

@ScenarioScoped
public class MbtTransformerPstUmlFileSteps extends TestSteps {

    @Inject
    public MbtTransformerPstUmlFileSteps(PstUmlFile object) {
        super(object);
    }

    @Given("^The mbt-transformer plugin, uml/pst.uml file Class Annotations section will be created as follows$")
    public void theMbtTransformerPluginUmlPstUmlFileClassAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassAnnotationsSection");
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
        object.assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows$")
    public void theMbtTransformerPluginUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows$")
    public void theMbtTransformerPluginUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows$")
    public void theMbtTransformerPluginUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(DataTable dataTable) {
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

    @Given("^The uml/pst.uml file Class Annotations section will be created as follows$")
    public void theUmlPstUmlFileClassAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassAnnotationsSection");
    }

    @Given("^The uml/pst.uml file Class Comments section will be created as follows$")
    public void theUmlPstUmlFileClassCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassCommentsSection");
    }

    @Given("^The uml/pst.uml file Class section will be created as follows$")
    public void theUmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The uml/pst.uml file Class section won't be created as follows$")
    public void theUmlPstUmlFileClassSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection", true);
    }

    @Given("^The uml/pst.uml file Interaction Annotations section will be created as follows$")
    public void theUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The uml/pst.uml file Interaction Comments section will be created as follows$")
    public void theUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The uml/pst.uml file Interaction Messages section will be created as follows$")
    public void theUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionMessagesSection");
    }

    @Given("^The uml/pst.uml file Interaction section will be created as follows$")
    public void theUmlPstUmlFileInteractionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The uml/pst.uml file Interaction section won't be created as follows$")
    public void theUmlPstUmlFileInteractionSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("mbt-transformer");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }
}
