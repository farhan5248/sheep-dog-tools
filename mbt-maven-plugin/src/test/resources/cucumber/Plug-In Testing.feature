@plugin
Feature: Plug-In Testing

  This feature covers having an input file, running the plugin, and verifying the output file.
  You can have multiple input files or multiple output files.
  You can check their contents or their presence, absence, validity etc

  Background: Create a feature file

    Given The mbt-maven-plugin plugin, src/test/resources/cucumber/Plug-In Testing.feature file is as follows
          """
          Feature: Plug-In Testing
          
            Scenario: Run a plug-in
          
              Given The acme-tool plugin, src/test/resources/cucumber/Input.txt file is as follows
                    \"\"\"
                    Text
                    \"\"\"
                And The Input.txt file is valid
               When The do-it goal is executed with
                    | Parameters |
                    |          1 |
               Then The target/Output.txt file will be present
                And The Output.txt file, Results table will be as follows
                    | Lines |
                    |  Text |
          """
     When The cucumber-to-uml goal is executed
      And The uml-to-cucumber goal is executed

  Scenario: Create AcmeToolInputTxtFileSteps.java

     Then The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolInputTxtFileSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmetoolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolInputTxtFileSteps {
          
              @Given("^The acme-tool plugin, src/test/resources/cucumber/Input.txt file is as follows$")
              public void theAcmeToolPluginSrcTestResourcesCucumberInputTxtFileIsAsFollows(String docString) {
                  AcmetoolFactory.get("InputTxtFile").setComponent("Acmetool");
                  AcmetoolFactory.get("InputTxtFile").setPath("src/test/resources/cucumber/Input.txt");
                  AcmetoolFactory.get("InputTxtFile").setInputOutputs("Content", docString);
              }
          
              @Given("^The Input.txt file is valid$")
              public void theInputTxtFileIsValid() {
                  AcmetoolFactory.get("InputTxtFile").setComponent("Acmetool");
                  AcmetoolFactory.get("InputTxtFile").setPath("Input.txt");
                  AcmetoolFactory.get("InputTxtFile").setInputOutputs("Valid");
              }
          }
          
          """

  Scenario: Create AcmeToolDoItGoalSteps.java

     Then The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolDoItGoalSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmetoolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolDoItGoalSteps {
          
              @Given("^The do-it goal is executed with$")
              public void theDoItGoalIsExecutedWith(DataTable dataTable) {
                  AcmetoolFactory.get("DoItGoal").setComponent("Acmetool");
                  AcmetoolFactory.get("DoItGoal").setPath("do-it");
                  AcmetoolFactory.get("DoItGoal").setInputOutputs(dataTable);
                  AcmetoolFactory.get("DoItGoal").transition();
              }
          }
          
          """

  Scenario: Create AcmeToolOutputTxtFileSteps.java

     Then The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolOutputTxtFileSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acmetool;
          
          import org.farhan.common.AcmetoolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolOutputTxtFileSteps {
          
              @Given("^The target/Output.txt file will be present$")
              public void theTargetOutputTxtFileWillBePresent() {
                  AcmetoolFactory.get("OutputTxtFile").setComponent("Acmetool");
                  AcmetoolFactory.get("OutputTxtFile").setPath("target/Output.txt");
                  AcmetoolFactory.get("OutputTxtFile").assertInputOutputs("Present");
              }
          
              @Given("^The Output.txt file, Results table will be as follows$")
              public void theOutputTxtFileResultsTableWillBeAsFollows(DataTable dataTable) {
                  AcmetoolFactory.get("OutputTxtFile").setComponent("Acmetool");
                  AcmetoolFactory.get("OutputTxtFile").setPath("Output.txt");
                  AcmetoolFactory.get("OutputTxtFile").assertInputOutputs(dataTable, "ResultsTable");
              }
          }
          
          """

  Scenario: Create InputTxtFile.java

     Then The src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java file will be as follows
          """
          package org.farhan.objects.acmetool;
          
          import java.util.HashMap;
          
          public interface InputTxtFile {
          
              public void setContent(HashMap<String, String> keyMap);
          
              public void setValid(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create DoItGoal.java

     Then The src/test/java/org/farhan/objects/acmeTool/DoItGoal.java file will be as follows
          """
          package org.farhan.objects.acmetool;
          
          import java.util.HashMap;
          
          public interface DoItGoal {
          
              public void transition();
          
              public void setParameters(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create OutputTxtFile.java

     Then The src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java file will be as follows
          """
          package org.farhan.objects.acmetool;
          
          import java.util.HashMap;
          
          public interface OutputTxtFile {
          
              public void assertPresent(HashMap<String, String> keyMap);
          
              public void assertResultsTableLines(HashMap<String, String> keyMap);
          }
          
          """

