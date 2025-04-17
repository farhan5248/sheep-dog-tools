@sheep-dog-dev
Feature: DocumentExamplesTableToUML

  \@sheep-dog-dev

  Scenario: One row, one cell

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          * Given: The Object page is created as follows
          +
          |===
          | h1
          | {h1}
          |===
          
          * Test-Data: Examples 1
          +
          |===
          | h1
          | v1
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail  |
          | specs::Process::Submit | Examples 1      | Data -> h1\|\nv1\| |

  Scenario: Two rows, two cells

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          * Given: The Object page is created as follows
          +
          |===
          | h1 | h2
          | {h1} | {h2}
          |===
          
          * Test-Data: Examples 1
          +
          |===
          | h1 | h2
          | v1 | v2
          | v3 | v4
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail                    |
          | specs::Process::Submit | Examples 1      | Data -> h1\|h2\|\nv1\|v2\|\nv3\|v4\| |

  Scenario: Three rows, three cells

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          * Given: The Object page is created as follows
          +
          |===
          | h1 | h2 | h3
          | {h1} | {h2} | {h3}
          |===
          
          * Test-Data: Examples 1
          +
          @tag1 @tag2 @tag3
          Desc1
          Desc2
          Desc3
          +
          |===
          | h1 | h2 | h3
          | v1 | v2 | v3
          | v4 | v5 | v6
          | v7 | v8 | v9
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail                                              |
          | specs::Process::Submit | Examples 1      | Data -> h1\|h2\|h3\|\nv1\|v2\|v3\|\nv4\|v5\|v6\|\nv7\|v8\|v9\| |
          | specs::Process::Submit | Examples 1      | Tags -> tag1\ntag2\ntag3                                       |
          | specs::Process::Submit | Examples 1      | Description -> @tag1 @tag2 @tag3\nDesc1\nDesc2\nDesc3                             |

