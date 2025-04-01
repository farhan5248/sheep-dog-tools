@debug
Feature: PluginParameters

  Scenario: Create two models from different tags

    Given The spec-prj project, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          [tags="tag1"]
          == Test-Case: Submit
          
          === Given: The Object1 page is empty
          """
    Given The spec-prj project, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          [tags="tag2"]
          == Test-Case: Submit2
          
          === Given: The Object1 page is empty
          """
     When The maven plugin, asciidoctor-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The maven plugin, asciidoctor-to-uml goal is executed with
          | Tags |
          | tag2 |
      And The maven plugin, uml-to-cucumber goal is executed with
          | Tags |
          | tag1 |
     Then The code-prj project, src/test/resources/cucumber/Process.feature file will be created as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
          
              Given The Unknown service, Object1 page is empty
          """

