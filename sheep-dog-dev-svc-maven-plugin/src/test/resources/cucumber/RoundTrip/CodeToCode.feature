@debug
Feature: Code To Code

  Background: Create a feature file

    The formatting of the data and example tables is intentionally different to make sure that the file is regenerated

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          @tag2 @tag3
          Feature: Process
          
            Background: Setup
          
              Given The blah application, something/Object page is created as follows
                    \"\"\"
                    Text 1
                    
                    Text 2
                    \"\"\"
          
            @tag1
            Scenario: Submit One
          
              Basic EDI claim
          
               When The blah application, something/Object page is empty
               Then The blah application, something/Object page is empty
                And The blah application, something/Object page is empty
          
            Scenario Outline: Submit Several
          
              Given The blah application, DataTable page is created as follows
                    |   h1 |   h2 |
                    | <h3> | <h4> |
          
              Examples: Data Set
          
                    |  h3 |  h4 |
                    | v31 | v41 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-cucumber goal is executed with
          | Tags |
          | tag1 |

  Scenario: Feature file is preserved

     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be created as follows
          """
          @tag2 @tag3
          Feature: Process
          
            Background: Setup
          
              Given The blah application, something/Object page is created as follows
                    \"\"\"
                    Text 1
                    
                    Text 2
                    \"\"\"
          
            @tag1
            Scenario: Submit One
          
              Basic EDI claim
          
               When The blah application, something/Object page is empty
               Then The blah application, something/Object page is empty
                And The blah application, something/Object page is empty
          
            Scenario Outline: Submit Several
          
              Given The blah application, DataTable page is created as follows
                    | h1   | h2   |
                    | <h3> | <h4> |
          
              Examples: Data Set
          
                    | h3  | h4  |
                    | v31 | v41 |
          """

