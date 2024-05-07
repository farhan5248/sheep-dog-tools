@debug
Feature: UML Feature To Code

  Scenario: Convert feature

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag2 @tag3
          Feature: Process
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Feature section will be as follows
          |    Name |      Tags |
          | Process | tag2,tag3 |

  Scenario: Convert background and scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
          
              Given The blah application, Object page is as follows
                    \"\"\"
                    Text 1
                    \"\"\"
          
            @tag1
            Scenario: Submit
          
              Basic EDI claim
          
               When The something/Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps Doc String section will be as follows
          |  Name |                                                  Step | Content |
          | Setup | Given The blah application, Object page is as follows |  Text 1 |
      And The mbt-transformer plugin, Process.feature file, Scenarios section will be as follows
          |   Name | Tags |     Description |
          | Submit | tag1 | Basic EDI claim |

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
               When The something/Object page is empty
               Then The something/Object page is empty
                But The something/Object page is empty
                And The something/Object page is empty
                  * The something/Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be as follows
          |   Name |                                    Step |
          | Submit | When The something/Object page is empty |
          | Submit | Then The something/Object page is empty |
          | Submit |  But The something/Object page is empty |
          | Submit |  And The something/Object page is empty |
          | Submit |    * The something/Object page is empty |

  Scenario: Convert scenario outline

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
          
              Given The Object page is as follows
                    |   h1 |   h2 |
                    | <h3> | <h4> |
          
              Examples: Data Set
          
                    |  h3 |  h4 |
                    | v31 | v41 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be as follows
          |   Name |                                Step |                Row |
          | Submit | Given The Object page is as follows | \|   h1 \|   h2 \| |
          | Submit | Given The Object page is as follows | \| <h3> \| <h4> \| |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be as follows
          |   Name | Examples |              Row |
          | Submit | Data Set | \|  h3 \|  h4 \| |
          | Submit | Data Set | \| v31 \| v41 \| |

