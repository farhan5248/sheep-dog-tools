@sheep-dog-dev
Feature: UMLDocStringToDocument

  \@sheep-dog-dev

  Scenario: One line

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          ----
          text1
          ----
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Doc String section will be created as follows
          | Name   | Step                                         | Content |
          | Submit | Given: The Object page is created as follows | text1   |

