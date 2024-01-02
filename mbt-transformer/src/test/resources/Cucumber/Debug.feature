Feature: Temp

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      text  
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags    |
      | initial |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  @debug
  Scenario: Java code is generated
    Then The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      text 
      """