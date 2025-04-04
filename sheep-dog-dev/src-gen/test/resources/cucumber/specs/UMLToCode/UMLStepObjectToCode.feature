@sheep-dog-dev
Feature: UMLStepObjectToCode

  \@sheep-dog-dev
  TODO map uml layer 2 documentation to java code

  Background: Create model

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
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

  Scenario: No statements layer 2

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Object section will be created as follows
          | Import                    |
          | io.cucumber.java.en.Given |
      And The code-prj project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Object section will be created as follows
          | Class Name          | Package                  |
          | BlahObjectPageSteps | org.farhan.stepdefs.blah |

  Scenario: No statements layer 3

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file Object section will be created as follows
          | Import            |
          | java.util.HashMap |
      And The code-prj project, src/test/java/org/farhan/objects/blah/ObjectPage.java file Object section will be created as follows
          | Interface Name | Package                 |
          | ObjectPage     | org.farhan.objects.blah |

