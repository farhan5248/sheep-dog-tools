@debug
Feature: UML Step To Code

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Given page is empty
          === When: The blah application, When page is empty
          === Then: The blah application, Then page is empty
          === And: The blah application, And page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenarios Steps section will be created as follows
          | Name   | Step                                            |
          | Submit | Given The blah application, Given page is empty |
          | Submit | When The blah application, When page is empty   |
          | Submit | Then The blah application, Then page is empty   |
          | Submit | And The blah application, And page is empty     |

  Scenario: Convert apostrophes

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit's'
          
          === Given: The blah application, Given page isn't empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenarios Steps section will be created as follows
          | Name      | Step                                               |
          | Submit's' | Given The blah application, Given page isn't empty |

