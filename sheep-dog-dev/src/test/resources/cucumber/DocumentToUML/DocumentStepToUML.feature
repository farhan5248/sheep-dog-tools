@debug
Feature: Document Step To UML

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          == Submit
          
          === Given The Given page is empty
          ===  When The When page is empty
          ===  Then The Then page is empty
          ===   But The But page is empty
          ===   And The And page is empty
          ===     * The Asterisk page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                    |
          | specs::Process::Submit | The Given page is empty    |
          | specs::Process::Submit | The When page is empty     |
          | specs::Process::Submit | The Then page is empty     |
          | specs::Process::Submit | The And page is empty      |
          | specs::Process::Submit | The But page is empty      |
          | specs::Process::Submit | The Asterisk page is empty |

