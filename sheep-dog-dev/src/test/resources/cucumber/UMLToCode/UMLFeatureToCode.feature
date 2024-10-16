@debug
Feature: UML Feature To Code

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Feature section will be created as follows
          | Name    |
          | Process |

  Scenario: One tag, one statement

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
            Desc line 1
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Feature section will be created as follows
          | Name    | Tags | Statements  |
          | Process | tag1 | Desc line 1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          @tag1 @tag2
          Feature: Process
            Desc line 1
            Desc line 2
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Feature section will be created as follows
          | Name    | Tags      | Statements               |
          | Process | tag1,tag2 | Desc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file is created as follows
          """
          @tag1 @tag2 @tag3
          Feature: Process
            Desc line 1
            Desc line 2
            Desc line 3
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, target/mbt/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file Feature section will be created as follows
          | Name    | Tags           | Statements                            |
          | Process | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |

