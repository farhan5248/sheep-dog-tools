Feature: Dependency Injection

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is empty
          """

@debug
  Scenario: Spring Java file is generated

     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-cucumber-spring goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.TestSteps;
          import org.farhan.objects.blah.ObjectPage;
          
          public class BlahObjectPageSteps extends TestSteps {
          
              public BlahObjectPageSteps(BlahObjectPage object) {
                  super(object);
              }
          
              @Given("^The blah application, Object page is empty$")
              public void theBlahApplicationObjectPageIsEmpty() {
                  object.setComponent("blah");
                  object.setPath("Object");
                  object.setInputOutputs("Empty");
              }
          }
          """

  Scenario: Guice Java file is generated

     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-cucumber-guice goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.TestSteps;
          import io.cucumber.guice.ScenarioScoped;
          import com.google.inject.Inject;
          import org.farhan.objects.blah.ObjectPage;
          
          @ScenarioScoped
          public class BlahObjectPageSteps extends TestSteps {
          
              @Inject
              public BlahObjectPageSteps(BlahObjectPage object) {
                  super(object);
              }
          
              @Given("^The blah application, Object page is empty$")
              public void theBlahApplicationObjectPageIsEmpty() {
                  object.setComponent("blah");
                  object.setPath("Object");
                  object.setInputOutputs("Empty");
              }
          }
          """

