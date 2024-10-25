@debug
Feature: UML Step To Document

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is empty
               When The Object page is empty
               Then The Object page is empty
                But The Object page is empty
                And The Object page is empty
                  * The Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, Process.asciidoc file Scenarios Steps section will be created as follows
          | Name   | Step                           |
          | Submit | Given The Object page is empty |
          | Submit | When The Object page is empty  |
          | Submit | Then The Object page is empty  |
          | Submit | And The Object page is empty   |
          | Submit | But The Object page is empty   |
          | Submit | * The Object page is empty     |

  Scenario: Convert apostrophes

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit's
          
              Given The Object page isn't empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, Process.asciidoc file Scenarios Steps section will be created as follows
          | Name     | Step                              |
          | Submit's | Given The Object page isn't empty |

