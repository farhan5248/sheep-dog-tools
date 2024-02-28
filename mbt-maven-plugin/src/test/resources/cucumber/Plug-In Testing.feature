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

  Scenario: Create step definition files

     Then The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolInputTxtFileSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acmeTool;
          
          import org.farhan.common.AcmeToolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolInputTxtFileSteps {
          
              @Given("^The acme-tool plugin, src/test/resources/cucumber/Input.txt file is as follows$")
              public void theAcmeToolPluginSrcTestResourcesCucumberInputTxtFileIsAsFollows(String docString) {
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
      And The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolDoItGoalSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acmeTool;
          
          import org.farhan.common.AcmeToolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolDoItGoalSteps {
          
              @Given("^The do-it goal is executed with$")
              public void theDoItGoalIsExecutedWith(DataTable dataTable) {
                  AcmeToolFactory.get("DoItGoal").setComponent("acme-tool");
                  AcmeToolFactory.get("DoItGoal").setPath("do-it");
                  AcmeToolFactory.get("DoItGoal").setInputOutputs(dataTable);
                  AcmeToolFactory.get("DoItGoal").transition();
              }
          }
          
          """
      And The src/test/java/org/farhan/stepdefs/acmeTool/AcmeToolOutputTxtFileSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acmeTool;
          
          import org.farhan.common.AcmeToolFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeToolOutputTxtFileSteps {
          
              @Given("^The Output.txt file, Results table will be as follows$")
              public void theOutputTxtFileResultsTableWillBeAsFollows(DataTable dataTable) {
                  AcmeToolFactory.get("OutputTxtFile").setComponent("acme-tool");
                  AcmeToolFactory.get("OutputTxtFile").setPath("Output.txt");
                  AcmeToolFactory.get("OutputTxtFile").assertInputOutputs(dataTable, "ResultsTable");
              }
          
              @Given("^The target/Output.txt file will be present$")
              public void theTargetOutputTxtFileWillBePresent() {
                  AcmeToolFactory.get("OutputTxtFile").setComponent("acme-tool");
                  AcmeToolFactory.get("OutputTxtFile").setPath("target/Output.txt");
                  AcmeToolFactory.get("OutputTxtFile").assertInputOutputs("Present");
              }
          }
          
          """

  Scenario: Create step object files

     Then The src/test/java/org/farhan/objects/acmeTool/InputTxtFile.java file will be as follows
          """
          package org.farhan.objects.acmeTool;
          
          import java.util.HashMap;
          
          public interface InputTxtFile {
          
              public void setContent(HashMap<String, String> keyMap);
          
              public void setValid(HashMap<String, String> keyMap);
          }
          
          """
      And The src/test/java/org/farhan/objects/acmeTool/DoItGoal.java file will be as follows
          """
          package org.farhan.objects.acmeTool;
          
          import java.util.HashMap;
          
          public interface DoItGoal {
          
              public void setParameters(HashMap<String, String> keyMap);
          
              public void transition();
          }
          
          """
      And The src/test/java/org/farhan/objects/acmeTool/OutputTxtFile.java file will be as follows

          """
          package org.farhan.objects.acmeTool;
          
          import java.util.HashMap;
          
          public interface OutputTxtFile {
          
              public void assertPresent(HashMap<String, String> keyMap);
          
              public void assertResultsTableLines(HashMap<String, String> keyMap);
          }
          
          """

          