@debug
Feature: UML Background To Graph

  Scenario: Convert feature to graph

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1
          Feature: Process
          
            Background: Preamble
          
              Given The Search application, Login page is valid
          
            Scenario: Story One
          
               Then The Search application, Logout page is enabled
          
            Scenario: Story Two
          
               Then The Search application, Logout page is present
          
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |     Name |        Tag |
          | Preamble | background |
      And The Process.graph file, Paths section will be as follows
          |      Name |
          | Story One |
          | Story Two |
      And The Process.graph file, Edges section will be as follows
          |                                                                                                    Edge Name |
          |                                               start ->  -> Given The Search application, Login page is valid |
          |                                                 Given The Search application, Login page is valid ->  -> end |
          | Given The Search application, Login page is valid ->  -> Then The Search application, Logout page is enabled |
          |                                               Then The Search application, Logout page is enabled ->  -> end |
          | Given The Search application, Login page is valid ->  -> Then The Search application, Logout page is present |
          |                                               Then The Search application, Logout page is present ->  -> end |

