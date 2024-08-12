@debug
Feature: UML Scenario To Document

  Scenario: No tags, no statements, one step

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is empty |

  Scenario: One tag, one statement, one step

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
              Desc line 1

              Given The Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name | Tags | Description |
          | Submit | tag1 | Desc line 1 |

  Scenario: Two tags, two statements, two steps

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            @tag1 @tag2
            Scenario: Submit
              Desc line 1
              Desc line 2

              Given The Object1 page is empty
              Given The Object2 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name |      Tags |              Description |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is empty |
          | Submit | Given The Object2 page is empty |

  Scenario: Three tags, three statements, three steps

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            @tag1 @tag2 @tag3
            Scenario: Submit
              Desc line 1
              Desc line 2
              Desc line 3

              Given The Object1 page is empty
              Given The Object2 page is empty
              Given The Object3 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name |           Tags |                           Description |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is empty |
          | Submit | Given The Object2 page is empty |
          | Submit | Given The Object3 page is empty |

