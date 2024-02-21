Feature: Convert Interaction To Step Definition

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
          
              Given The blah application, Object page is empty
              Given The blah2 service, Json request is executed with
                    | i1 | i2 |
                    | v5 | v6 |
              Given The blah2 service, Json request is invalid
              Given The blah application, DataTable page, Top section will be as follows
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

  Scenario: Create new step definition Java class with a data table for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows
          """
          package org.farhan.stepdefs.blah;
          
          import org.farhan.common.BlahFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class BlahDataTablePageSteps {
          
              @Given("^The blah application, DataTable page, Top section will be as follows$")
              public void theBlahApplicationDataTablePageTopSectionWillBeAsFollows(DataTable dataTable) {
                  BlahFactory.get("DataTablePage").assertInputOutputs(dataTable, "TopSection");
              }
          }
          
          """

  Scenario: Create new step definition Java class with a doc string for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be as follows
          """
          package org.farhan.stepdefs.blah;
          
          import org.farhan.common.BlahFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class BlahDocStringPageSteps {
          
              @Given("^The blah application, DocString page is as follows$")
              public void theBlahApplicationDocStringPageIsAsFollows(String docString) {
                  BlahFactory.get("DocStringPage").setInputOutputs(docString);
              }
          }
          
          """

  Scenario: Create new step definition Java class with no arguments for graph vertices

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
          }
          
          """

  Scenario: Create new step definition Java class for graph edges

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows
          """
          package org.farhan.stepdefs.blah2;
          
          import org.farhan.common.Blah2Factory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class Blah2JsonRequestSteps {
          
              @Given("^The blah2 service, Json request is executed with$")
              public void theBlah2ServiceJsonRequestIsExecutedWith(DataTable dataTable) {
                  Blah2Factory.get("JsonRequest").setInputOutputs(dataTable, "");
                  Blah2Factory.get("JsonRequest").transition();
              }
          
              @Given("^The blah2 service, Json request is invalid$")
              public void theBlah2ServiceJsonRequestIsInvalid() {
                  Blah2Factory.get("JsonRequest").setIsInvalid();
                  Blah2Factory.get("JsonRequest").transition();
              }
          }
          
          """

