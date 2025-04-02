@sheep-dog-dev
Feature: UMLFeatureToCode

  \@sheep-dog-dev

  Scenario: No tags, no statements

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/resources/cucumber/Process.feature file will be present
      And The code-prj project, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    |
          | Process |

  Scenario: One tag, one statement

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          @tag1
          Desc line 1
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/resources/cucumber/Process.feature file will be present
      And The code-prj project, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    | Tags | Statements          |
          | Process | tag1 | \@tag1\nDesc line 1 |

  Scenario: Two tags, two statements

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          @tag1 @tag2
          Desc line 1
          Desc line 2
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/resources/cucumber/Process.feature file will be present
      And The code-prj project, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    | Tags      | Statements                              |
          | Process | tag1,tag2 | \@tag1 \@tag2\nDesc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          @tag1 @tag2 @tag3
          Desc line 1
          Desc line 2
          Desc line 3
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src/test/resources/cucumber/Process.feature file will be present
      And The code-prj project, src/test/resources/cucumber/Process.feature file Feature section will be created as follows
          | Name    | Tags           | Statements                                                  |
          | Process | tag1,tag2,tag3 | \@tag1 \@tag2 \@tag3\nDesc line 1\nDesc line 2\nDesc line 3 |

