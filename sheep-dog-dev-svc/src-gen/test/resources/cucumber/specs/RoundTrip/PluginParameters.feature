@sheep-dog-dev @round-trip
Feature: PluginParameters

  \@sheep-dog-dev
  \@round-trip

  Scenario: Create two models from different tags

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          @tag1
          
          * Given: The Object1 page is empty
          """
    Given The spec-prj project, src/test/resources/asciidoc/specs/app/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit2
          
          @tag2
          
          * Given: The Object1 page is empty
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
     Then The code-prj project, src-gen/test/resources/cucumber/specs/Process.feature file will be created as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
          
              \@tag1
          
              Given The Unknown service, Object1 page is empty
          """

