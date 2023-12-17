Feature: Convert Feature

  @convert-cucumber-umlpst
  Scenario: Convert Feature
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      @tag1 @tag2 @tag3
      Feature: This is a test feature
        This is the description
        This is the second line of the description

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The claim project, target/uml/pst.uml file is present
    # Class Interactions, Interaction Comments, Interaction Messages
    And The target/uml/pst.uml file, Class Comments section is as follows
      | Class Name                  | Comment                                                             |
      | interactions::dept::process | This is the description\nThis is the second line of the description |