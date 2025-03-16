@debug
Feature: UML DocString To Document

  Scenario: One line

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          ----
          text1
          ----
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is deleted
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Doc String section will be created as follows
          | Name   | Step                                         | Content |
          | Submit | Given: The Object page is created as follows | text1   |

