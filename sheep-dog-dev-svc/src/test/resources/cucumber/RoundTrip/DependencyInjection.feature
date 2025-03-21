@debug
Feature: Dependency Injection

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is empty
          """

  Scenario: Spring Java file is generated

     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber-spring goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.TestSteps;
          import org.farhan.objects.blah.ObjectPage;
          
          public class BlahObjectPageSteps extends TestSteps {
          
              public BlahObjectPageSteps(ObjectPage object) {
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

     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber-guice goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import com.google.inject.Inject;
          import io.cucumber.guice.ScenarioScoped;
          import io.cucumber.java.en.Given;
          import org.farhan.common.TestSteps;
          import org.farhan.objects.blah.ObjectPage;
          
          @ScenarioScoped
          public class BlahObjectPageSteps extends TestSteps {
          
              @Inject
              public BlahObjectPageSteps(ObjectPage object) {
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

