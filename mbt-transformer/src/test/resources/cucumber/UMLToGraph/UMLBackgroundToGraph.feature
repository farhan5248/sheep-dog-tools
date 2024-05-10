@debug
Feature: UML Background To Graph

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                           start ->  -> Given The Object0 page is valid |
          |                             Given The Object0 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object1 page is valid |
          |                             Given The Object1 page is valid ->  -> end |

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Desc line 1
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |  Name |        Tag | Description |
          | Setup | background | Desc line 1 |

  Scenario: No statement, one step, two scenarios

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          | Given The Object0 page is valid ->  -> Given The Object1 page is valid |
          |                             Given The Object1 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object2 page is valid |
          |                             Given The Object2 page is valid ->  -> end |

  Scenario: No statement, one step, three scenarios

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid

            Scenario: Submit 3
               Given The Object3 page is valid
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          | Given The Object0 page is valid ->  -> Given The Object1 page is valid |
          |                             Given The Object1 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object2 page is valid |
          |                             Given The Object2 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object3 page is valid |
          |                             Given The Object3 page is valid ->  -> end |

  Scenario: No statement, two steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                           start ->  -> Given The Object1 page is valid |
          | Given The Object1 page is valid ->  -> Given The Object2 page is valid |
          |                             Given The Object2 page is valid ->  -> end |

  Scenario: No statement, three steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
              Given The Object3 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                          start ->  -> Given The Object1 page is valid |
          | Given The Object1 page is valid ->  -> Given The Object2 page is valid |
          | Given The Object2 page is valid ->  -> Given The Object3 page is valid |
          |                             Given The Object3 page is valid ->  -> end |

