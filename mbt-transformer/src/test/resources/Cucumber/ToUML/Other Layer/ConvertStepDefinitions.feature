Feature: Convert Step Definitions

  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
      """
    And The claim project, src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java file is as follows
      """
      package org.farhan.stepdefs.blah;
      
      import io.cucumber.java.en.Given;
      import io.cucumber.java.PendingException;
      import io.cucumber.datatable.DataTable;
      import org.farhan.common.TestSteps;
      import org.farhan.common.BlahFactory;
      
      public class blahObjectPageSteps extends TestSteps {
      
          @Given("The blah application, Object page is invalid")
          public void theBlahApplicationObjectPageIsInvalid() {
              BlahFactory.get("BlahObjectPage").assertIsInvalid();
          }

          @Given("The blah application, Object page, Top section is as follows")
          public void theBlahApplicationObjectPageTopSectionIsAsFollows(DataTable dataTable) {
              BlahFactory.get("BlahObjectPage").assertAttributes(dataTable, "Top");
          }
      }
      
      """      
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Existing Java methods are preserved
    Then The claim project, src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java file will be as follows
      """
      package org.farhan.stepdefs.blah;
      
      import io.cucumber.java.en.Given;
      import io.cucumber.java.PendingException;
      import io.cucumber.datatable.DataTable;
      import org.farhan.common.TestSteps;
      import org.farhan.common.BlahFactory;
      import org.farhan.objects.blah.blahObjectPage;
      
      public class blahObjectPageSteps extends TestSteps {
      
          @Given("The blah application, Object page is invalid")
          public void theBlahApplicationObjectPageIsInvalid() {
              BlahFactory.assertIsInvalid();
          }
      
          @Given("The blah application, Object page, Top section is as follows")
          public void theBlahApplicationObjectPageTopSectionIsAsFollows(DataTable dataTable) {
              BlahFactory.assertAttributes(dataTable, "Top");
          }
      
          @Given("The blah application, Object page is empty")
          public void theBlahApplicationObjectPageIsEmpty() {
              blahObjectPage.assertIsEmpty();
          }
      }
      
      """   
