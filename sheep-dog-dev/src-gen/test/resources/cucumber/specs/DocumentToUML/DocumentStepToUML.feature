@sheep-dog-dev
Feature: DocumentStepToUML

  \@sheep-dog-dev

  Scenario: Convert step keywords

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          * Given: The blah application, Given page is empty
          * When: The blah application, When page is empty
          * Then: The blah application, Then page is empty
          * And: The blah application, And page is empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                   |
          | specs::Process::Submit | The blah application, Given page is empty |
          | specs::Process::Submit | The blah application, When page is empty  |
          | specs::Process::Submit | The blah application, Then page is empty  |
          | specs::Process::Submit | The blah application, And page is empty   |

  Scenario: Convert apostrophes

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit's'
          
          * Given: The blah application, Given page isn't empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name          | Message                                      |
          | specs::Process::Submit's' | The blah application, Given page isn't empty |

