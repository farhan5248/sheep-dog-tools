@debug
Feature: UML Step To Graph

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
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
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                           Edge Name |
          |                         start ->  -> Given The Object page is empty |
          | Given The Object page is empty ->  -> When The Object page is empty |
          |  When The Object page is empty ->  -> Then The Object page is empty |
          |   Then The Object page is empty ->  -> But The Object page is empty |
          |    But The Object page is empty ->  -> And The Object page is empty |
          |      And The Object page is empty ->  -> * The Object page is empty |
          |                               * The Object page is empty ->  -> end |

