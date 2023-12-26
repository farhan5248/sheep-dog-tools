Feature: Convert Step Definitions

  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
          Given The blah2 service, Json request is executed with
                | i1 | i2 |
                | v5 | v6 |
          Given The blah2 service, Json request is invalid
          Given The blah application, DataTable page, Top section is as follows
                | h1 | h2 |
                | v1 | v2 |
                | v3 | v4 |
          Given The blah application, DocString page is as follows
                \"\"\"
                text1
                text2
                \"\"\"
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Non existing Java class creation with vertice data tables
    Then The claim project, src/test/java/org/farhan/stepdefs/blah/blahDataTablePageSteps.java file will be as follows
      """
      package org.farhan.stepdefs.blah;
      
      import org.farhan.common.objects.BlahFactory;
      import io.cucumber.java.en.Given;
      import io.cucumber.datatable.DataTable;
      import org.farhan.common.stepdefs.TestSteps;
      
      public class BlahDataTablePageSteps extends TestSteps {
      
          @Given("The blah application, DataTable page, Top section is as follows")
          public void theBlahApplicationDataTablePageTopSectionIsAsFollows(DataTable dataTable) {
              BlahFactory.get("BlahDataTablePage").assertAttributes(dataTable, "Top");
          }
      }
      
      """    

  Scenario: Non existing Java class creation with vertice doc strings
    Then The claim project, src/test/java/org/farhan/stepdefs/blah/blahDocStringPageSteps.java file will be as follows
      """
      package org.farhan.stepdefs.blah;
      
      import org.farhan.common.objects.BlahFactory;
      import io.cucumber.java.en.Given;
      import io.cucumber.datatable.DataTable;
      import org.farhan.common.stepdefs.TestSteps;
      
      public class BlahDocStringPageSteps extends TestSteps {
      
          @Given("The blah application, DocString page is as follows")
          public void theBlahApplicationDocStringPageIsAsFollows(String docString) {
              BlahFactory.get("BlahDocStringPage").assertAttributes(docString);
          }
      }
      
      """   
      
  Scenario: Non existing Java class creation with vertice details
    Then The claim project, src/test/java/org/farhan/stepdefs/blah/blahObjectPageSteps.java file will be as follows
      """
      package org.farhan.stepdefs.blah;
      
      import org.farhan.common.objects.BlahFactory;
      import io.cucumber.java.en.Given;
      import io.cucumber.datatable.DataTable;
      import org.farhan.common.stepdefs.TestSteps;
      
      public class BlahObjectPageSteps extends TestSteps {
      
          @Given("The blah application, Object page is empty")
          public void theBlahApplicationObjectPageIsEmpty() {
              BlahFactory.get("BlahObjectPage").assertIsEmpty();
          }
      }
            
      """    

  Scenario: Non existing Java class creation with edge details
    Then The claim project, src/test/java/org/farhan/stepdefs/blah2/blah2JsonRequestSteps.java file will be as follows
      """
      package org.farhan.stepdefs.blah2;
      
      import org.farhan.common.objects.Blah2Factory;
      import io.cucumber.java.en.Given;
      import io.cucumber.datatable.DataTable;
      import org.farhan.common.stepdefs.TestSteps;
      
      public class Blah2JsonRequestSteps extends TestSteps {
      
          @Given("The blah2 service, Json request is executed with")
          public void theBlah2ServiceJsonRequestIsExecutedWith(DataTable dataTable) {
              Blah2Factory.get("Blah2JsonRequest").setAttributes(dataTable, "");
              Blah2Factory.get("Blah2JsonRequest").sendJsonRequest();
          }
      
          @Given("The blah2 service, Json request is invalid")
          public void theBlah2ServiceJsonRequestIsInvalid() {
              Blah2Factory.get("Blah2JsonRequest").setIsInvalid();
              Blah2Factory.get("Blah2JsonRequest").sendJsonRequest();
          }
      }
      
      """    

            