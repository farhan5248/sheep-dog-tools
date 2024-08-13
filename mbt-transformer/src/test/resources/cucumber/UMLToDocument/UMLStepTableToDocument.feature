@debug
Feature: UML Step Table To Document

  Scenario: One row, one cell

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The Object page is as follows
                    | h1 |
                    | v1 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows
          |   Name |                                Step | Row |
          | Submit | Given The Object page is as follows |  h1 |
          | Submit | Given The Object page is as follows |  v1 |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows
          |   Name |                                Step |    Row |
          | Submit | Given The Object page is as follows | h1, h2 |
          | Submit | Given The Object page is as follows | v1, v2 |
          | Submit | Given The Object page is as follows | v3, v4 |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is as follows
                    | h1 | h2 | h3 |
                    | v1 | v2 | v3 |
                    | v4 | v5 | v6 |
                    | v7 | v8 | v9 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows
          |   Name |                                Step |        Row |
          | Submit | Given The Object page is as follows | h1, h2, h3 |
          | Submit | Given The Object page is as follows | v1, v2, v3 |
          | Submit | Given The Object page is as follows | v4, v5, v6 |
          | Submit | Given The Object page is as follows | v7, v8, v9 |
