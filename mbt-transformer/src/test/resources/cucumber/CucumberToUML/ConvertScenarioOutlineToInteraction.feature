Feature: Convert Scenario Outline To Interaction

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
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

  Scenario: Convert title

      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name |
          | specs::Process::Submit |      Examples 1 |
          | specs::Process::Submit |      Examples 2 |

  Scenario: Convert tag

# Need to test Scenario Outline Example tags
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |

  Scenario: Convert example data

# Scenario Example data applied to data table for MBT, not needed for code generation      
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |      Examples 1 |     0 -> h3\|h4\| |
          | specs::Process::Submit |      Examples 1 |   1 -> v31\|v41\| |
          | specs::Process::Submit |      Examples 2 |     0 -> h3\|h4\| |
          | specs::Process::Submit |      Examples 2 |   1 -> v32\|v42\| |

