@debug
Feature: UML Examples Table To Graph

  Scenario: One row, one cell

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is as follows
                | h1   |
                | <h1> |

              Examples: Examples 1
                | h1 |
                | v1 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                Name | Index |
          | Submit/Examples 1/0 |     0 |
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |         Edge Name | Tag |
          | start ->  -> 0 h1 |   0 |
          | 0 h1 -> v1 -> end |   0 |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is as follows
                | h1   | h2   |
                | <h1> | <h2> |

              Examples: Examples 1
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                Name | Index |
          | Submit/Examples 1/0 |     0 |
          | Submit/Examples 1/1 |     1 |
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |          Edge Name | Tag |
          |  start ->  -> 0 h1 | 0,1 |
          | 0 h1 -> v1 -> 0 h2 |   0 |
          |  0 h2 -> v2 -> end |   0 |
          | 0 h1 -> v3 -> 0 h2 |   1 |
          |  0 h2 -> v4 -> end |   1 |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is as follows
                | h1   | h2   | h3   |
                | <h1> | <h2> | <h3> |

              Examples: Examples 1
                    | h1 | h2 | h3 |
                    | v1 | v2 | v3 |
                    | v4 | v5 | v6 |
                    | v7 | v8 | v9 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                Name | Index |
          | Submit/Examples 1/0 |     0 |
          | Submit/Examples 1/1 |     1 |
          | Submit/Examples 1/2 |     2 |
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |          Edge Name |   Tag |
          |  start ->  -> 0 h1 | 0,1,2 |
          | 0 h1 -> v1 -> 0 h2 |     0 |
          | 0 h2 -> v2 -> 0 h3 |     0 |
          |  0 h3 -> v3 -> end |     0 |
          | 0 h1 -> v4 -> 0 h2 |     1 |
          | 0 h2 -> v5 -> 0 h3 |     1 |
          |  0 h3 -> v6 -> end |     1 |
          | 0 h1 -> v7 -> 0 h2 |     2 |
          | 0 h2 -> v8 -> 0 h3 |     2 |
          |  0 h3 -> v9 -> end |     2 |

          