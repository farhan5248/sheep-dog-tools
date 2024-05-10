@debug
Feature: UML Scenario Outline To Graph

  Scenario: No tags, no statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is as follows
                | h1   |
                | <h3> |
          
              Examples: Examples 1
                | h3  |
                | v31 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                        Edge Name |
          | start ->  -> Given The Object page is as follows |
          |   Given The Object page is as follows ->  -> end |
      And The Process.graph file, Paths section will be as follows
          |                Name | Index |
          | Submit/Examples 1/0 |     0 |

  Scenario: One tag, one statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            @tag1
            Scenario Outline: Submit
              Desc line 1
              Given The Object page is as follows
                | h1   |
                | <h3> |

              Examples: Examples 1
                | h3  |
                | v31 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                Name |  Tag | Description |
          | Submit/Examples 1/0 | tag1 | Desc line 1 |

  Scenario: Two tags, two statements, two steps, two examples

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            @tag1 @tag2
            Scenario Outline: Submit
              Desc line 1
              Desc line 2
              Given The Object1 page is as follows
                | h1   |
                | <h3> |
              Given The Object2 page is as follows
                | h1   |
                | <h3> |

              Examples: Examples 1
                | h3  |
                | v31 |

              Examples: Examples 2
                | h3  |
                | v32 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                Name |       Tag |              Description |
          | Submit/Examples 1/0 | tag1,tag2 | Desc line 1\nDesc line 2 |
          | Submit/Examples 2/0 | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The Process.graph file, Edges section will be as follows
          |                                                                        Edge Name |
          |                                start ->  -> Given The Object1 page is as follows |
          | Given The Object1 page is as follows ->  -> Given The Object2 page is as follows |
          |                                  Given The Object2 page is as follows ->  -> end |

  Scenario: Three tags, three statements, three steps, three examples

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            @tag1 @tag2 @tag3
            Scenario Outline: Submit
              Desc line 1
              Desc line 2
              Desc line 3
              Given The Object1 page is as follows
                | h1   |
                | <h3> |
              Given The Object2 page is as follows
                | h1   |
                | <h3> |
              Given The Object3 page is as follows
                | h1   |
                | <h3> |

              Examples: Examples 1
                | h3  |
                | v31 |

              Examples: Examples 2
                | h3  |
                | v32 |

              Examples: Examples 3
                | h3  |
                | v33 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                Name |            Tag |                           Description |
          | Submit/Examples 1/0 | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
          | Submit/Examples 2/0 | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
          | Submit/Examples 3/0 | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The Process.graph file, Edges section will be as follows
          |                                                                        Edge Name |
          |                                start ->  -> Given The Object1 page is as follows |
          | Given The Object1 page is as follows ->  -> Given The Object2 page is as follows |
          | Given The Object2 page is as follows ->  -> Given The Object3 page is as follows |
          |                                  Given The Object3 page is as follows ->  -> end |

