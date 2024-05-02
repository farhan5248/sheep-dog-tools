@debug @outline
Feature: Code Step To UML

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
          
              Given The blah application, Object page is empty
              Given The blah application, Given1 page is empty
               When The blah application, When1 page is empty
               Then The blah application, Then1 page is empty
                And The blah application, And1 page is empty
                But The blah application, But1 page is empty
                  * The blah application, Asterisk page is empty
          """

  Scenario: Convert step keywords

     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                      Message |
          | specs::Process::Submit |   The blah application, Given1 page is empty |
          | specs::Process::Submit |    The blah application, When1 page is empty |
          | specs::Process::Submit |    The blah application, Then1 page is empty |
          | specs::Process::Submit |     The blah application, And1 page is empty |
          | specs::Process::Submit |     The blah application, But1 page is empty |
          | specs::Process::Submit | The blah application, Asterisk page is empty |

