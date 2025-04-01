@debug
Feature: DocumentDocStringToUML

  Scenario: One line

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          ----
          text1
          ----
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                               | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is created as follows | docString     | 0 -> text1        |

