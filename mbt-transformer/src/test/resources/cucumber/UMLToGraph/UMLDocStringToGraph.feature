@debug
Feature: UML DocString To Graph

  Scenario: Convert doc strings

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is as follows
                    \"\"\"
                    text1
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                        Edge Name |
          | start ->  -> Given The Object page is as follows |
          |   Given The Object page is as follows ->  -> end |
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file will be present
      And The Given The Object page is as follows.graph file, Edges section will be as follows
          |                                                   Edge Name |
          |                                        start ->  -> Content |
          | Content -> Given The Object page is as follows-0.txt -> end |
      And The mbt-transformer plugin, target/graphs/resources/Given The Object page is as follows-0.txt file will be as follows
          """
          text1
          """

