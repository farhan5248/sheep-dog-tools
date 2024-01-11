Feature: Temp

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      @initial
      Feature: Convert Step Definitions
      
        Background: Create a feature file
          Given The claim project, src/test/cucumber/dept/process.feature file is as follows
            \"\"\"  
            text
            \"\"\"  
          When The mbt-transformer plugin, cucumber-to-uml goal is executed with
            | Tags |
            | tag1 |
          And The mbt-transformer plugin, uml-to-cucumber goal is executed
      
        Scenario: Non existing Java class creation with vertice data tables
          Then The claim project, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"     
      
        Scenario: Non existing Java class creation with vertice doc strings
          Then The claim project, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"   
            
        Scenario: Non existing Java class creation with vertice details
          Then The claim project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"   
      
        Scenario: Non existing Java class creation with edge details
          Then The claim project, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"   
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags    |
      | initial |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  @debug
  Scenario: Java code is generated
    Then The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      @initial
      Feature: Convert Step Definitions
      
        Background: Create a feature file
          Given The claim project, src/test/cucumber/dept/process.feature file is as follows
            \"\"\"  
            text
            \"\"\"  
          When The mbt-transformer plugin, cucumber-to-uml goal is executed with
            | Tags |
            | tag1 |
          And The mbt-transformer plugin, uml-to-cucumber goal is executed
      
        Scenario: Non existing Java class creation with vertice data tables
          Then The claim project, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"     
      
        Scenario: Non existing Java class creation with vertice doc strings
          Then The claim project, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"   
            
        Scenario: Non existing Java class creation with vertice details
          Then The claim project, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"   
      
        Scenario: Non existing Java class creation with edge details
          Then The claim project, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be as follows
            \"\"\"  
            text
            \"\"\"   
      """