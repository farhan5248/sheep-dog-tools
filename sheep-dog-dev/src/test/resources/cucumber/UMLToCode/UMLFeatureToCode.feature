@debug
Feature: UML Feature To Code

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    |
          | Process |

  Scenario: One tag, one statement

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          Desc line 1
          
          [tags="tag1"]
          == Test-Setup: Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    | Tags | Statements  |
          | Process | tag1 | Desc line 1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          Desc line 1
          Desc line 2
          
          [tags="tag1,tag2"]
          == Test-Setup: Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    | Tags      | Statements               |
          | Process | tag1,tag2 | Desc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          [tags="tag1,tag2,tag3"]
          == Test-Setup: Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    | Tags           | Statements                            |
          | Process | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |

