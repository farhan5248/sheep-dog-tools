@debug
Feature: UML DocString To Document

  Scenario: One line

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is as follows
                    \"\"\"
                    text1
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Doc String section will be as follows
          |   Name |                                Step | Content |
          | Submit | Given The Object page is as follows |   text1 |
