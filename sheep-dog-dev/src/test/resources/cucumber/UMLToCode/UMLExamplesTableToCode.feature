@debug
Feature: UML Examples Table To Code

  Scenario: One row, one cell

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   |
                | <h1> |
          
              Examples: Examples 1
                | h1 |
                | v1 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Outline Examples Table section will be created as follows
          | Name   | Examples   | Row      |
          | Submit | Examples 1 | \| h1 \| |
          | Submit | Examples 1 | \| v1 \| |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   | h2   |
                | <h1> | <h2> |
          
              Examples: Examples 1
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Outline Examples Table section will be created as follows
          | Name   | Examples   | Row            |
          | Submit | Examples 1 | \| h1 \| h2 \| |
          | Submit | Examples 1 | \| v1 \| v2 \| |
          | Submit | Examples 1 | \| v3 \| v4 \| |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   | h2   | h3   |
                | <h1> | <h2> | <h3> |
          
              Examples: Examples 1
                    | h1 | h2 | h3 |
                    | v1 | v2 | v3 |
                    | v4 | v5 | v6 |
                    | v7 | v8 | v9 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Scenario Outline Examples Table section will be created as follows
          | Name   | Examples   | Row                  |
          | Submit | Examples 1 | \| h1 \| h2 \| h3 \| |
          | Submit | Examples 1 | \| v1 \| v2 \| v3 \| |
          | Submit | Examples 1 | \| v4 \| v5 \| v6 \| |
          | Submit | Examples 1 | \| v7 \| v8 \| v9 \| |

