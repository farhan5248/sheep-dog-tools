@debug
Feature: UML Feature To Code

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Feature section will be as follows
          |    Name |
          | Process |

# TODO feature statement
  Scenario: One tag, one statement

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1
          Feature: This is a test feature
            Desc line 1
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Feature section will be as follows
          |    Name | Tags |
          | Process | tag1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1 @tag2
          Feature: This is a test feature
            Desc line 1
            Desc line 2
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Feature section will be as follows
          |    Name |      Tags |
          | Process | tag1,tag2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1 @tag2 @tag3
          Feature: This is a test feature
            Desc line 1
            Desc line 2
            Desc line 3
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Feature section will be as follows
          |    Name |           Tags |
          | Process | tag1,tag2,tag3 |

