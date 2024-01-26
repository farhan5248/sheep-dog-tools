Feature: Debug

  @debug
  Scenario: Generate files
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: Convert Feature
      
        Scenario: Convert Feature
          Given The mbt-transformer plugin, target/Graphs/Process.txt file is as follows
            \"\"\"
            text		
            \"\"\"
          When The mbt-transformer plugin, graph-to-uml goal is executed
          Then The mbt-transformer plugin, target/uml/pst.uml file will be present
          And The target/uml/pst.uml file, Class section will be as follows
            | Class Name           | 
            | specs::dept::process | 
      
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags    |
      | debug |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed
