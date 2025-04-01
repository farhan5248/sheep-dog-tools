@debug
Feature: CodeToDocument

  TODO make test for the specific mappings

  Scenario: Create an adoc file from feature file

    Given The code-prj project, src/test/resources/cucumber/app/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
          
            Desc 1
          
            Background: Setup
          
            @tag2
            Scenario: Story One
          
              Desc 2
          
              Given The Search application, Login page is valid
               When The Search application, Home page is created as follows
                    | grp | ins |
                    |  10 |   5 |
               Then The Search application, Logout page is created as follows
                    \"\"\"
                      text1
                      
                      text2
                    \"\"\"
          
            @tag3
            Scenario Outline: Story Two
          
              Desc 3
          
              Given The Search application, Login page is invalid
               When The Search application, Home page is created as follows
                    | grp |   ins |
                    |   8 | <ins> |
               Then The Search application, Logout page is invalid
          
              Examples: Some data
          
                    | ins |
                    |   4 |
          
              Examples: Dataset 2
          
                    | ins |
                    |   5 |
                    |   6 |
          """
     When The maven plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The maven plugin, uml-to-asciidoctor goal is executed with
          | Tags |
          | tag1 |
     Then The spec-prj project, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows
          """
          = Test-Suite: Process
          
          Desc 1
          
          [tags="tag1"]
          == Test-Setup: Setup
          
          [tags="tag2"]
          == Test-Case: Story One
          
          Desc 2
          
          === Given: The Search application, Login page is valid
          
          === When: The Search application, Home page is created as follows
          
          |===
          | grp | ins
          | 10  | 5  
          |===
          
          === Then: The Search application, Logout page is created as follows
          
          ----
            text1
            
            text2
          ----
          
          [tags="tag3"]
          == Test-Case: Story Two
          
          Desc 3
          
          === Given: The Search application, Login page is invalid
          
          === When: The Search application, Home page is created as follows
          
          |===
          | grp | ins  
          | 8   | {ins}
          |===
          
          === Then: The Search application, Logout page is invalid
          
          === Test-Data: Some data
          
          |===
          | ins
          | 4  
          |===
          
          === Test-Data: Dataset 2
          
          |===
          | ins
          | 5  
          | 6  
          |===
          """

