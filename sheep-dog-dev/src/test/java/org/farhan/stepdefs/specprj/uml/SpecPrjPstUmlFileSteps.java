package org.farhan.stepdefs.specprj.uml;

import com.google.inject.Inject;
import io.cucumber.datatable.DataTable;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import org.farhan.common.TestSteps;
import org.farhan.objects.specprj.uml.PstUmlFile;

@ScenarioScoped
public class SpecPrjPstUmlFileSteps extends TestSteps {

    @Inject
    public SpecPrjPstUmlFileSteps(PstUmlFile object) {
        super(object);
    }

    @Given("^The spec-prj project, uml/pst.uml file Class Comments section will be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileClassCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassCommentsSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file Class section will be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileClassSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file Class section won't be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileClassSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "ClassSection", true);
    }

    @Given("^The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileInteractionAnnotationsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionAnnotationsSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileInteractionCommentsSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionCommentsSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileInteractionMessagesSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionMessagesSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file Interaction section will be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileInteractionSectionWillBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file Interaction section won't be created as follows$")
    public void theSpecPrjProjectUmlPstUmlFileInteractionSectionWontBeCreatedAsFollows(DataTable dataTable) {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        // TODO this needs to be true
        object.assertInputOutputs(dataTable, "InteractionSection");
    }

    @Given("^The spec-prj project, uml/pst.uml file will be present$")
    public void theSpecPrjProjectUmlPstUmlFileWillBePresent() {
        object.setComponent("spec-prj");
        object.setPath("uml/pst.uml");
        object.assertInputOutputs("Present");
    }
}
