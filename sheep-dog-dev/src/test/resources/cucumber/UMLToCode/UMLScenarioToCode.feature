@debug
Feature: UML Scenario To Code

  Scenario: No tags, no statements, one step

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The blah application, something/Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be created as follows
          | Name   | Step                                                        |
          | Submit | Given The blah application, something/Object1 page is empty |

  Scenario: One tag, one statement, one step

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
              Desc line 1
          
              Given The blah application, something/Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenarios section will be created as follows
          | Name   | Tags | Description |
          | Submit | tag1 | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2
            Scenario: Submit
              Desc line 1
              Desc line 2
          
              Given The blah application, something/Object1 page is empty
              Given The blah application, something/Object2 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenarios section will be created as follows
          | Name   | Tags      | Description              |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be created as follows
          | Name   | Step                                                              |
          | Submit | Given The blah application, something/Object<Index> page is empty |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: Three tags, three statements, three steps

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2 @tag3
            Scenario: Submit
              Desc line 1
              Desc line 2
              Desc line 3
          
              Given The blah application, something/Object1 page is empty
              Given The blah application, something/Object2 page is empty
              Given The blah application, something/Object3 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenarios section will be created as follows
          | Name   | Tags           | Description                           |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be created as follows
          | Name   | Step                                                              |
          | Submit | Given The blah application, something/Object<Index> page is empty |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

