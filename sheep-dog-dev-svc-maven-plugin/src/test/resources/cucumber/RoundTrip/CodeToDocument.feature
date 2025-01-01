@debug
Feature: Code To Document

  TODO make test for the specific mappings

  Scenario: Create an adoc file from feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
          
            Desc 1
          
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
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows
          """
          :tags:tag1
          = Feature: Process
          
          Desc 1
          
          [tags="tag2"]
          == Scenario: Story One
          
          Desc 2
          
          === Given The Search application, Login page is valid
          
          === When The Search application, Home page is created as follows
          
          [options="header"]
          |===
          | grp | ins
          | 10  | 5  
          |===
          
          === Then The Search application, Logout page is created as follows
          
          ----
            text1
            
            text2
          ----
          
          [tags="tag3"]
          == Scenario: Story Two
          
          Desc 3
          
          === Given The Search application, Login page is invalid
          
          === When The Search application, Home page is created as follows
          
          [options="header"]
          |===
          | grp | ins  
          | 8   | {ins}
          |===
          
          === Then The Search application, Logout page is invalid
          
          === Examples: Some data
          
          [options="header"]
          |===
          | ins
          | 4  
          |===
          
          === Examples: Dataset 2
          
          [options="header"]
          |===
          | ins
          | 5  
          | 6  
          |===
          """

