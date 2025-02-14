@debug
Feature: UML Step Object To Code

  TODO map uml layer 2 documentation to java code

  Background: Create model

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object page
          
          == Definition: is empty
          """
      And The mbt-transformer plugin, asciidoctor-to-uml goal is executed

  Scenario: No statements layer 2

     When The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Import                    |
          | io.cucumber.java.en.Given |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file Object section will be created as follows
          | Class Name          | Package                  |
          | BlahObjectPageSteps | org.farhan.stepdefs.blah |

  Scenario: No statements layer 3

     When The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows
          | Import            |
          | java.util.HashMap |
      And The mbt-transformer plugin, ObjectPage.java file Object section will be created as follows
          | Interface Name | Package                 |
          | ObjectPage     | org.farhan.objects.blah |

