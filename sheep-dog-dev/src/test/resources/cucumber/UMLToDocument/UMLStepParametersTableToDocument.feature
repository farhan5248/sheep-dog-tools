@sheep-dog-dev
Feature: UMLStepParametersTableToDocument

  \@sheep-dog-dev

  Scenario: One cell

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row |
          | is created as follows | 1          | h1  |

  Scenario: Two cells

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1 | h2
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row    |
          | is created as follows | 1          | h1, h2 |

  Scenario: Three cells

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1 | h2 | h3
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row        |
          | is created as follows | 1          | h1, h2, h3 |

