@debug
Feature: Code Step To UML

  Scenario Outline: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
          
              <Keyword> The blah application, Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                    Message |
          | specs::Process::Submit | The blah application, Object page is empty |

    Examples: Keywords

          | Keyword |
          |   Given |
          |    When |
          |    Then |
          |     And |
          |     But |
          |       * |

