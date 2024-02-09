Feature: Convert Background To Interaction

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        Background: Setup
          Given The blah1 application, Object1 page is valid
      
        @tag1
        Scenario: Submit
          And The blah2 application, Object2 page is empty

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Create background steps
    And The target/uml/pst.uml file, Interaction Messages section will be as follows
      | Interaction Name             | Message                                      |
      | specs::dept::process::Submit | The blah1 application, Object1 page is valid |
      | specs::dept::process::Submit | The blah2 application, Object2 page is empty |
