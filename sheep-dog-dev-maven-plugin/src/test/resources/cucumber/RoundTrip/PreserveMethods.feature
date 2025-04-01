@debug
Feature: PreserveMethods

  Background: Create an asciidoc file

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is empty
          """
      And The maven plugin, asciidoctor-to-uml goal is executed

  Scenario: Preserve existing java methods for layer 2

      And The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          import org.farhan.common.BlahFactory;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, Object page is invalid$")
              public void theBlahApplicationObjectPageIsInvalid() {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Invalid");
              }
          }
          """
     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          import org.farhan.common.BlahFactory;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, Object page is invalid$")
              public void theBlahApplicationObjectPageIsInvalid() {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Invalid");
              }
          
              @Given("^The blah application, Object page is empty$")
              public void theBlahApplicationObjectPageIsEmpty() {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Empty");
              }
          }
          """

  Scenario: Preserve existing java methods for layer 3

      And The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file is created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface ObjectPage {
          
              public void setInvalid();
          }
          """
     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface ObjectPage {
          
              public void setInvalid();
          
              public void setEmpty();
          }
          """

