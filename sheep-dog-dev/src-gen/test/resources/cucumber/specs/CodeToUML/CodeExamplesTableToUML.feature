@sheep-dog-dev
Feature: CodeExamplesTableToUML

  \@sheep-dog-dev

  Scenario: One row, one cell

    Given The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   |
                | <h1> |
          
              Examples: Examples 1
                | h1  |
                | v1 |
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h1\|         |
          | specs::Process::Submit | Examples 1      | 1 -> v1\|         |

  Scenario: Two rows, two cells

    Given The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   | h2   |
                | <h1> | <h2> |
          
              Examples: Examples 1
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h1\|h2\|     |
          | specs::Process::Submit | Examples 1      | 1 -> v1\|v2\|     |
          | specs::Process::Submit | Examples 1      | 2 -> v3\|v4\|     |

  Scenario: Three rows, three cells

    Given The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   | h2   | h3   |
                | <h1> | <h2> | <h3> |
          
              Examples: Examples 1
                    | h1 | h2 | h3 |
                    | v1 | v2 | v3 |
                    | v4 | v5 | v6 |
                    | v7 | v8 | v9 |
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h1\|h2\|h3\| |
          | specs::Process::Submit | Examples 1      | 1 -> v1\|v2\|v3\| |
          | specs::Process::Submit | Examples 1      | 2 -> v4\|v5\|v6\| |
          | specs::Process::Submit | Examples 1      | 3 -> v7\|v8\|v9\| |

