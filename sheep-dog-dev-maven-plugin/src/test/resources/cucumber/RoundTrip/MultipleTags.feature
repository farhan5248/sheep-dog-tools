@debug
Feature: Multiple Tags

  Scenario: Create two models from different tags

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          [tags="tag1"]
          == Scenario: Submit
          
          === Given: The Object1 page is empty
          """
    Given The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          [tags="tag2"]
          == Scenario: Submit2
          
          === Given: The Object1 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, asciidoctor-to-uml goal is executed with
          | Tags |
          | tag2 |
      And The mbt-transformer plugin, uml-to-cucumber goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be created as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
          
              Given The Unknown service, Object1 page is empty
          """

