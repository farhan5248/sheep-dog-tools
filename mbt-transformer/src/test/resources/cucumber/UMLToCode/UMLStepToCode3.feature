@debug
Feature: UML Step To Code 3

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is empty
          """

  Scenario: Preserve existing java methods

      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file is as follows
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
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                           Method Name |
          | theBlahApplicationObjectPageIsInvalid |
          |   theBlahApplicationObjectPageIsEmpty |

  Scenario: Existing Java step object methods are preserved

      And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface ObjectPage {
          
              public void assertIsInvalid();
          }
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          |     Method Name |
          | assertIsInvalid |
          |        setEmpty |

