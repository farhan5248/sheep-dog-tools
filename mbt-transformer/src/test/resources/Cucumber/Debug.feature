Feature: Temp

  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      @initial
      Feature: Convert Feature
      
        Scenario: Convert Feature
          Given The claim project, src/test/cucumber/dept/process.feature file is as follows
            \"\"\"
            text
            \"\"\"
          When The mbt-transformer plugin, cucumber-to-uml goal is executed with
            | Tags |
            | tag1 |
          Then The claim project, target/uml/pst.uml file is present
          And The target/uml/pst.uml file, Class section is as follows
            | Class Name           | 
            | specs::dept::process | 
          And The target/uml/pst.uml file, Class Comments section is as follows
            | Class Name           | Comment                                                             |
            | specs::dept::process | This is the description\nThis is the second line of the description |
      
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags    |
      | initial |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  @debug
  Scenario: Java code is generated
    Then The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      @initial
      Feature: Convert Feature
      
        Scenario: Convert Feature
          Given The claim project, src/test/cucumber/dept/process.feature file is as follows
            \"\"\"
            text
            \"\"\"
          When The mbt-transformer plugin, cucumber-to-uml goal is executed with
            | Tags |
            | tag1 |
          Then The claim project, target/uml/pst.uml file is present
          And The target/uml/pst.uml file, Class section is as follows
            | Class Name           | 
            | specs::dept::process | 
          And The target/uml/pst.uml file, Class Comments section is as follows
            | Class Name           | Comment                                                             |
            | specs::dept::process | This is the description\nThis is the second line of the description |
      
      """
      