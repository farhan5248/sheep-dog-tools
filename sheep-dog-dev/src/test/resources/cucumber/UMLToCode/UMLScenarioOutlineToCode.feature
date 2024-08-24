@debug
Feature: UML Scenario Outline To Code

  Scenario: No tags, no statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   |
                | <h3> |
          
              Examples: Examples 1
                | h3  |
                | v31 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be created as follows
          |   Name |                                Step |
          | Submit | Given The Object page is created as follows |
          | Submit | Given The Object page is created as follows |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be created as follows
          |   Name |   Examples |       Row |
          | Submit | Examples 1 | \|  h3 \| |
          | Submit | Examples 1 | \| v31 \| |

  Scenario: One tag, one statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1
            Scenario Outline: Submit
              Desc line 1
              Given The Object page is created as follows
                | h1   |
                | <h3> |

              Examples: Examples 1
                | h3  |
                | v31 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenario Outlines section will be created as follows
          |   Name | Tags | Description |
          | Submit | tag1 | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps, two examples

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2
            Scenario Outline: Submit
              Desc line 1
              Desc line 2
              Given The Object1 page is created as follows
                | h1   |
                | <h3> |
              Given The Object2 page is created as follows
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
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenario Outlines section will be created as follows
          |   Name |      Tags |              Description |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be created as follows
          |   Name |                                       Step |
          | Submit | Given The Object<Index> page is created as follows |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be created as follows
          |   Name |         Examples |             Row |
          | Submit | Examples <Index> |       \|  h3 \| |
          | Submit | Examples <Index> | \| v3<Index> \| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: Three tags, three statements, three steps, three examples

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2 @tag3
            Scenario Outline: Submit
              Desc line 1
              Desc line 2
              Desc line 3
              Given The Object1 page is created as follows
                | h1   |
                | <h3> |
              Given The Object2 page is created as follows
                | h1   |
                | <h3> |
              Given The Object3 page is created as follows
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
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenario Outlines section will be created as follows
          |   Name |           Tags |                           Description |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be created as follows
          |   Name |                                       Step |
          | Submit | Given The Object<Index> page is created as follows |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be created as follows
          |   Name |         Examples |             Row |
          | Submit | Examples <Index> |       \|  h3 \| |
          | Submit | Examples <Index> | \| v3<Index> \| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

