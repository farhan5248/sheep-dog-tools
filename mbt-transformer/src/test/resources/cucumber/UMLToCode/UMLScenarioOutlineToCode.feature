@debug
Feature: UML Scenario Outline To Code

  Scenario: Convert scenario outline

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
          
              Given The Object page is as follows
                    |   h1 |   h2 |
                    | <h3> | <h4> |
          
              Examples: Data Set
          
                    |  h3 |  h4 |
                    | v31 | v41 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be as follows
          |   Name |                                Step |                Row |
          | Submit | Given The Object page is as follows | \|   h1 \|   h2 \| |
          | Submit | Given The Object page is as follows | \| <h3> \| <h4> \| |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be as follows
          |   Name | Examples |              Row |
          | Submit | Data Set | \|  h3 \|  h4 \| |
          | Submit | Data Set | \| v31 \| v41 \| |

