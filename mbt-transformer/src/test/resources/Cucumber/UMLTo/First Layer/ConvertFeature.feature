Feature: Convert Feature

  Scenario: Convert Feature
    Given The mbt-transformer plugin, target/uml/pst.uml file is present
    And The target/uml/pst.uml file, Class section is as follows
      | Class Name           | 
      | specs::dept::process | 
    And The target/uml/pst.uml file, Class Comments section is as follows
      | Class Name           | Comment                                                             |
      | specs::dept::process | This is the description\nThis is the second line of the description |
    When The mbt-transformer plugin, uml-to-cucumber goal is executed
    Then The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file will be as follows
      """
      @tag1 @tag2 @tag3
      Feature: This is a test feature
        This is the description
        This is the second line of the description

      """
      