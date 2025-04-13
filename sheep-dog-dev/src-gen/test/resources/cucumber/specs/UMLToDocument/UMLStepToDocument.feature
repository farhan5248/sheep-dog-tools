@sheep-dog-dev
Feature: UMLStepToDocument

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
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name   | Step                                             |
          | Submit | Given: The blah application, Given page is empty |
          | Submit | When: The blah application, When page is empty   |
          | Submit | Then: The blah application, Then page is empty   |
          | Submit | And: The blah application, And page is empty     |

  Scenario: Convert apostrophes

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit's'
          
          * Given: The blah application, Given page isn't empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name      | Step                                                |
          | Submit's' | Given: The blah application, Given page isn't empty |

