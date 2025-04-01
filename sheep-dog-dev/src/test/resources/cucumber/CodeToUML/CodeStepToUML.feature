@debug
Feature: CodeStepToUML

  Scenario: Convert step keywords

    Given The code-prj project, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The blah application, Given page is empty
              When The blah application, When page is empty
              Then The blah application, Then page is empty
              And The blah application, And page is empty
              But The blah application, But page is empty
              * The blah application, Asterisk page is empty
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                      |
          | specs::Process::Submit | The blah application, Given page is empty    |
          | specs::Process::Submit | The blah application, When page is empty     |
          | specs::Process::Submit | The blah application, Then page is empty     |
          | specs::Process::Submit | The blah application, And page is empty      |
          | specs::Process::Submit | The blah application, But page is empty      |
          | specs::Process::Submit | The blah application, Asterisk page is empty |

