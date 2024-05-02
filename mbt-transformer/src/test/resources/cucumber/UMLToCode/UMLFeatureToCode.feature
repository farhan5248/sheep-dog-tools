@debug @outline
# break this up into smaller scenario
Feature: UML Feature To Code

  Background: Create a graph text file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag2 @tag3
          Feature: Process
          
            Background: Setup
          
              Given The blah application, something/Object page is as follows
                    \"\"\"
                    Text 1
                    
                    Text 2
                    \"\"\"
          
            @tag1
            Scenario: Submit One
          
              Basic EDI claim
          
               When The something/Object page is empty
               Then The something/Object page is empty
                But The something/Object page is empty
                And The something/Object page is empty
                  * The something/Object page is empty
          
            Scenario Outline: Submit Several
          
              Given The DataTable page is as follows
                    |   h1 |   h2 |
                    | <h3> | <h4> |
          
              Examples: Data Set
          
                    |  h3 |  h4 |
                    | v31 | v41 |
          
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Convert class to feature from graph

     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Feature section will be as follows
          |    Name |      Tags |
          | Process | tag2,tag3 |
      And The mbt-transformer plugin, Process.feature file, Background Steps Doc String section will be as follows
          |  Name |                                                            Step |          Content |
          | Setup | Given The blah application, something/Object page is as follows | Text 1\n\nText 2 |
      And The mbt-transformer plugin, Process.feature file, Scenarios section will be as follows
          |       Name | Tags |     Description |
          | Submit One | tag1 | Basic EDI claim |
      And The mbt-transformer plugin, Process.feature file, Scenarios Steps section will be as follows
          |       Name |                                    Step |
          | Submit One | When The something/Object page is empty |
          | Submit One | Then The something/Object page is empty |
          | Submit One |  But The something/Object page is empty |
          | Submit One |  And The something/Object page is empty |
          | Submit One |    * The something/Object page is empty |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Steps Data Table section will be as follows
          |           Name |                                   Step |                Row |
          | Submit Several | Given The DataTable page is as follows | \|   h1 \|   h2 \| |
          | Submit Several | Given The DataTable page is as follows | \| <h3> \| <h4> \| |
      And The mbt-transformer plugin, Process.feature file, Scenario Outline Examples Table section will be as follows
          |           Name | Examples |              Row |
          | Submit Several | Data Set | \|  h3 \|  h4 \| |
          | Submit Several | Data Set | \| v31 \| v41 \| |

