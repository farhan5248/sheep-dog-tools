Feature: Convert Scenario Outline

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario Outline: Submit
          Given The blah application, DataTable page is as follows
            | h1   | h2   |
            | <h3> | <h4> |
      
          Examples: Examples 1
            | h3  | h4  |
            | v31 | v41 |
      
          Examples: Examples 2
            | h3  | h4  |
            | v32 | v42 |
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Examples title
    And The target/uml/pst.uml file, Interaction Annotations section will be as follows
      | Interaction Name             | Annotation Name |
      | specs::dept::process::Submit | Examples 1      |
      | specs::dept::process::Submit | Examples 2      |

  Scenario: Test scenario Outline tags
  # Need to test Scenario Outline Example tags
    And The target/uml/pst.uml file, Interaction Parameters section will be as follows
      | Interaction Name             | Parameter Name |
      | specs::dept::process::Submit | tag1           |
      
  Scenario: Examples data
  # Scenario Example data applied to data table for MBT, not needed for code generation      
    And The target/uml/pst.uml file, Interaction Annotations section will be as follows
      | Interaction Name             | Annotation Name | Annotation Detail |
      | specs::dept::process::Submit | Examples 1      | 0 -> h3\|h4\|   |
      | specs::dept::process::Submit | Examples 1      | 1 -> v31\|v41\| |
      | specs::dept::process::Submit | Examples 2      | 0 -> h3\|h4\|   |
      | specs::dept::process::Submit | Examples 2      | 1 -> v32\|v42\| |
      
      
