@debug
Feature: Eclipse Plug-In Testing

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Plug-In Testing.feature file is created as follows
          """
          Feature: Initial
          
            Scenario: Generation
          
              Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
                    \"\"\"
                    Text
                    \"\"\"
               When The generation action is performed
               Then The src/test/resources/cucumber/StepObject.feature file will be created as follows
                    \"\"\"
                    Step one
                    \"\"\"
          
            Scenario: Validation
          
              Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
                    \"\"\"
                    Text
                    \"\"\"
               When The validation action is performed
               Then The validation dialog will be set as follows
                    | Message |
          
            Scenario: Suggestion
          
              Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
                    \"\"\"
                    Text
                    \"\"\"
               When The suggestion action is performed
               Then The suggestion dialog will be set as follows
                    | Suggestion Name | Suggestion |
          """
     When The cucumber-to-uml goal is executed
      And The uml-to-cucumber goal is executed

  Scenario: Create AcmeToolInputTxtFileSteps.java

     Then The src/test/java/org/farhan/stepdefs/acmetool/AcmeToolInputTxtFileSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmeToolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolInputTxtFileSteps {
          
              @Given("^The acme-tool plugin, src/test/resources/cucumber/Input.txt file is created as follows$")
              public void theAcmeToolPluginSrcTestResourcesCucumberInputTxtFileIsCreatedAsFollows(String docString) {
                  AcmeToolFactory.get("InputTxtFile").setComponent("acme-tool");
                  AcmeToolFactory.get("InputTxtFile").setPath("src/test/resources/cucumber/Input.txt");
                  AcmeToolFactory.get("InputTxtFile").setInputOutputs("Content", docString);
              }
          
              @Given("^The Input.txt file is valid$")
              public void theInputTxtFileIsValid() {
                  AcmeToolFactory.get("InputTxtFile").setComponent("acme-tool");
                  AcmeToolFactory.get("InputTxtFile").setPath("Input.txt");
                  AcmeToolFactory.get("InputTxtFile").setInputOutputs("Valid");
              }
          }
          """

