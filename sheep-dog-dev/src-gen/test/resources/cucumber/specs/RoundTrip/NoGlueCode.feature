@sheep-dog-dev @round-trip
Feature: NoGlueCode

  \@sheep-dog-dev
  \@round-trip
  This maven goal generates java code without any Cucumber glue code.

  Background: Create a feature file

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          * Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is empty
          """

  Scenario: Spring Java file is generated

     When The maven plugin, asciidoctor-to-uml goal is executed
      And The maven plugin, uml-to-junit-spring goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/suites/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.TestSteps;
          import org.farhan.objects.blah.ObjectPage;
          
          public class BlahObjectPageSteps extends TestSteps {
          
              public BlahObjectPageSteps(ObjectPage object) {
                  super(object, "blah", "Object");
              }
          
              @Given("^The blah application, Object page is empty$")
              public void isEmpty() {
                  object.setInputOutputs("Empty");
              }
          }
          """

  Scenario: Guice Java file is generated

     When The maven plugin, asciidoctor-to-uml goal is executed
      And The maven plugin, uml-to-junit-guice goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/suites/blah/BlahObjectPageSteps.java file will be created as follows
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
                  super(object, "blah", "Object");
              }
          
              @Given("^The blah application, Object page is empty$")
              public void isEmpty() {
                  object.setInputOutputs("Empty");
              }
          }
          """

