@debug
Feature: Document Step To UML

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Given page is empty
          === When: The blah application, When page is empty
          === Then: The blah application, Then page is empty
          === And: The blah application, And page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                   |
          | specs::Process::Submit | The blah application, Given page is empty |
          | specs::Process::Submit | The blah application, When page is empty  |
          | specs::Process::Submit | The blah application, Then page is empty  |
          | specs::Process::Submit | The blah application, And page is empty   |

  Scenario: Convert apostrophes

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit's'
          
          === Given: The blah application, Given page isn't empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name          | Message                                      |
          | specs::Process::Submit's' | The blah application, Given page isn't empty |

