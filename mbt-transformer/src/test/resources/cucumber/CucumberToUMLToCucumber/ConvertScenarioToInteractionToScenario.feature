Feature: Convert Scenario To Interaction To Scenario

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a feature
          
            @tag1
            Scenario: Submit
          
              Basic EDI claim
          
              Given The blah application, something/Object page is empty
               When The blah application, something/Object page is empty
               Then The blah application, something/Object page is empty
                But The blah application, something/Object page is empty
                And The blah application, something/Object page is empty
                  * The blah application, something/Object page is empty
          
          
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          import org.farhan.common.BlahFactory;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, something/Object page is empty$")
              public void theBlahApplicationSomethingObjectPageIsEmpty() {
                  BlahFactory.get("ObjectPage").setInputOutputs("Empty");
              }
          }
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Convert class to feature from graph

     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be as follows
          """
          Feature: This is a feature
          
            @tag1
            Scenario: Submit
          
              Basic EDI claim
          
              Given The blah application, something/Object page is empty
               When The blah application, something/Object page is empty
               Then The blah application, something/Object page is empty
                But The blah application, something/Object page is empty
                And The blah application, something/Object page is empty
                  * The blah application, something/Object page is empty
          
          
              """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows
          """
          package org.farhan.stepdefs.blah;
          
          import org.farhan.common.BlahFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, something/Object page is empty$")
              public void theBlahApplicationSomethingObjectPageIsEmpty() {
                  BlahFactory.get("ObjectPage").setInputOutputs("Empty");
              }
          }
          
          """

