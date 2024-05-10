@debug
Feature: UML Step Table To Graph

  Scenario: One row, one cell

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The Object page is as follows
                    | h1 |
                    | v1 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |         Edge Name |
          | start ->  -> 0 h1 |
          | 0 h1 -> v1 -> end |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |          Edge Name |
          |  start ->  -> 0 h1 |
          | 0 h1 -> v1 -> 0 h2 |
          | 0 h2 -> v2 -> 1 h1 |
          | 1 h1 -> v3 -> 1 h2 |
          |  1 h2 -> v4 -> end |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is as follows
                    | h1 | h2 | h3 |
                    | v1 | v2 | v3 |
                    | v4 | v5 | v6 |
                    | v7 | v8 | v9 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |          Edge Name |
          |  start ->  -> 0 h1 |
          | 0 h1 -> v1 -> 0 h2 |
          | 0 h2 -> v2 -> 0 h3 |
          | 0 h3 -> v3 -> 1 h1 |
          | 1 h1 -> v4 -> 1 h2 |
          | 1 h2 -> v5 -> 1 h3 |
          | 1 h3 -> v6 -> 2 h1 |
          | 2 h1 -> v7 -> 2 h2 |
          | 2 h2 -> v8 -> 2 h3 |
          |  2 h3 -> v9 -> end |

