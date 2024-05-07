@debug
Feature: UML Background To Code

  Scenario: Convert background and scenario

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Background: Setup
          
              Given The blah application, Object page is as follows
                    \"\"\"
                    Text 1
                    \"\"\"
          
            @tag1
            Scenario: Submit
          
              Basic EDI claim
          
               When The something/Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, Process.feature file, Background Steps Doc String section will be as follows
          |  Name |                                                  Step | Content |
          | Setup | Given The blah application, Object page is as follows |  Text 1 |
      And The mbt-transformer plugin, Process.feature file, Scenarios section will be as follows
          |   Name | Tags |     Description |
          | Submit | tag1 | Basic EDI claim |
