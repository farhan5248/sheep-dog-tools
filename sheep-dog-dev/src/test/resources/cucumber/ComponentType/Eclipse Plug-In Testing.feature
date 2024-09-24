@debug
Feature: Eclipse Plug-In Testing

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Generation
          
              Given The acmetool plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
                    \"\"\"
                    Text
                    \"\"\"
               When The gui action is performed
                And The gui dialog will be set as follows
                    | Message |
          """
     When The cucumber-to-uml goal is executed
      And The uml-to-cucumber goal is executed

  Scenario: Create GuiAction.java

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/acmetool/GuiAction.java file will be created as follows
          """
          package org.farhan.objects.acmetool;
          
          import java.util.HashMap;
          
          public interface GuiAction {
          
              public void transition();
          }
          """

  Scenario: Create GuiDialog.java

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/acmetool/GuiDialog.java file will be created as follows
          """
          package org.farhan.objects.acmetool;
          
          import java.util.HashMap;
          
          public interface GuiDialog {
          
              public void assertMessage(HashMap<String, String> keyMap);
          }
          """

  Scenario: Create ProcessFeatureFile.java

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/acmetool/ProcessFeatureFile.java file will be created as follows
          """
          package org.farhan.objects.acmetool;
          
          import java.util.HashMap;
          
          public interface ProcessFeatureFile {
          
              public void setStepsSnippetContent(HashMap<String, String> keyMap);
          }
          """

  Scenario: Create AcmetoolGuiActionSteps.java

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/acmetool/AcmetoolGuiActionSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmetoolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmetoolGuiActionSteps {
          
              @Given("^The gui action is performed$")
              public void theGuiActionIsPerformed() {
                  AcmetoolFactory.get("GuiAction").setComponent("acmetool");
                  AcmetoolFactory.get("GuiAction").setPath("gui");
                  AcmetoolFactory.get("GuiAction").transition();
              }
          }
          """

  Scenario: Create AcmetoolGuiDialogSteps.java

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/acmetool/AcmetoolGuiDialogSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmetoolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmetoolGuiDialogSteps {
          
              @Given("^The gui dialog will be set as follows$")
              public void theGuiDialogWillBeSetAsFollows(DataTable dataTable) {
                  AcmetoolFactory.get("GuiDialog").setComponent("acmetool");
                  AcmetoolFactory.get("GuiDialog").setPath("gui");
                  AcmetoolFactory.get("GuiDialog").assertInputOutputs(dataTable);
              }
          }
          """

  Scenario: Create AcmetoolProcessFeatureFileSteps.java

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/acmetool/AcmetoolProcessFeatureFileSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmetoolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmetoolProcessFeatureFileSteps {
          
              @Given("^The acmetool plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows$")
              public void theAcmetoolPluginSrcTestResourcesCucumberProcessFeatureFileStepsSnippetIsCreatedAsFollows(String docString) {
                  AcmetoolFactory.get("ProcessFeatureFile").setComponent("acmetool");
                  AcmetoolFactory.get("ProcessFeatureFile").setPath("src/test/resources/cucumber/Process.feature");
                  AcmetoolFactory.get("ProcessFeatureFile").setInputOutputs("Content", docString, "StepsSnippet");
              }
          }
          """

