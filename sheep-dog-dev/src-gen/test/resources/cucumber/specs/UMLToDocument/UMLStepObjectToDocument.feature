@sheep-dog-dev
Feature: UMLStepObjectToDocument

  \@sheep-dog-dev

  Scenario: No statements

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Header section will be created as follows
          | Name        |
          | Object page |

  Scenario: One statement

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          Desc line 1
          
          == Step-Definition: is empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Header section will be created as follows
          | Name        | Statements  |
          | Object page | Desc line 1 |

  Scenario: Two statements

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          Desc line 1
          Desc line 2
          
          == Step-Definition: is empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Header section will be created as follows
          | Name        | Statements               |
          | Object page | Desc line 1\nDesc line 2 |

  Scenario: Three statements

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          == Step-Definition: is empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file Header section will be created as follows
          | Name        | Statements                            |
          | Object page | Desc line 1\nDesc line 2\nDesc line 3 |

