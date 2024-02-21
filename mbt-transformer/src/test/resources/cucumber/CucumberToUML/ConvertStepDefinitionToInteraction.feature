Feature: Convert Step Definition To Interaction

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
          
              Given The blah application, Object page is empty
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          import org.farhan.common.BlahFactory;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, Object page is invalid$")
              public void theBlahApplicationObjectPageIsInvalid() {
                  BlahFactory.get("ObjectPage").assertIsInvalid();
              }
          
              @Given("^The blah application, Object page, Top section will be as follows$")
              public void theBlahApplicationObjectPageTopSectionIsAsFollows(DataTable dataTable) {
                  BlahFactory.get("ObjectPage").assertAttributes(dataTable, "Top");
              }
          }
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Preserve existing java methods

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows
          """
          package org.farhan.stepdefs.blah;
          
          import org.farhan.common.BlahFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, Object page is empty$")
              public void theBlahApplicationObjectPageIsEmpty() {
                  BlahFactory.get("ObjectPage").setIsEmpty();
              }
          
              @Given("^The blah application, Object page is invalid$")
              public void theBlahApplicationObjectPageIsInvalid() {
                  BlahFactory.get("ObjectPage").assertIsInvalid();
              }
          
              @Given("^The blah application, Object page, Top section will be as follows$")
              public void theBlahApplicationObjectPageTopSectionIsAsFollows(DataTable dataTable) {
                  BlahFactory.get("ObjectPage").assertAttributes(dataTable, "Top");
              }
          }
          
          """

