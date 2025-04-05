@sheep-dog-dev
Feature: UMLStepParametersTableToCode

  \@sheep-dog-dev

  Scenario: Three cells

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page Top section will be created as follows
          
          |===
          | h1
          | v1
          |===
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: Top section will be created as follows
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          
          === Step-Parameters: 2
          
          |===
          | h1 | h2
          |===
          
          === Step-Parameters: 3
          
          |===
          | h1 | h2 | h3
          |===
          """
      And The maven plugin, asciidoctor-to-uml goal is executed
     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file Fields section will be created as follows
          | Method Name        | Visibility | Return Type | Parameter Name | Parameter Type         |
          | assertTopSectionH1 | public     | void        | keyMap         | HashMap<String,String> |
          | assertTopSectionH2 | public     | void        | keyMap         | HashMap<String,String> |
          | assertTopSectionH3 | public     | void        | keyMap         | HashMap<String,String> |

