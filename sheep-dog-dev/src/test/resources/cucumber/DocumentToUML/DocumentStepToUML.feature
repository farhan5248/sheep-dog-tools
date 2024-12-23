@debug
Feature: Document Step To UML

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given The blah application, Given page is empty
          === When The blah application, When page is empty
          === Then The blah application, Then page is empty
          === And The blah application, And page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                   |
          | specs::Process::Submit | The blah application, Given page is empty |
          | specs::Process::Submit | The blah application, When page is empty  |
          | specs::Process::Submit | The blah application, Then page is empty  |
          | specs::Process::Submit | The blah application, And page is empty   |
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name                                                    |
          | objects::Blah::GivenPage::The blah application, Given page is empty |
          | objects::Blah::WhenPage::The blah application, When page is empty   |
          | objects::Blah::ThenPage::The blah application, Then page is empty   |
          | objects::Blah::AndPage::The blah application, And page is empty     |

