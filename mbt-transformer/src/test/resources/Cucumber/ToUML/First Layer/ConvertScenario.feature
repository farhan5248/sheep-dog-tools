Feature: Convert Scenario

  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
          Basic EDI claim
      
          Given The blah application, something/Object page is empty

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The claim project, target/uml/pst.uml file is present

  Scenario: Scenario title
    And The target/uml/pst.uml file, Class Interactions section is as follows
      | Class Name           | Interaction Name |
      | specs::dept::process | Submit           |

  Scenario: Scenario tags
    And The target/uml/pst.uml file, Interaction Parameters section is as follows
      | Interaction Name             | Parameter Name |
      | specs::dept::process::Submit | tag1           |

  Scenario: Scenario description
    And The target/uml/pst.uml file, Interaction Comments section is as follows
      | Interaction Name             | Comment         |
      | specs::dept::process::Submit | Basic EDI claim |

  Scenario: Scenario step
    And The target/uml/pst.uml file, Class Element Imports section is as follows
      | Class Name           | Alias               | Imported Element                         |
      | specs::dept::process | blahObjectPageSteps | pst::stepdefs::blah::BlahObjectPageSteps |
    And The target/uml/pst.uml file, Class Properties section is as follows
      | Class Name           | Property Name       | Property Type                            |
      | specs::dept::process | this                | pst::specs::dept::process                |
      | specs::dept::process | BlahObjectPageSteps | pst::stepdefs::blah::BlahObjectPageSteps |
    And The target/uml/pst.uml file, Interaction Messages section is as follows
      | Interaction Name             | Message                                              |
      | specs::dept::process::Submit | The blah application, something/Object page is empty |
    And The target/uml/pst.uml file, Interaction Lifelines section is as follows
      | Interaction Name             | Lifeline Name       | Lifeline Represents                            |
      | specs::dept::process::Submit | this                | pst::specs::dept::process::this                |
      | specs::dept::process::Submit | BlahObjectPageSteps | pst::specs::dept::process::BlahObjectPageSteps |
    And The target/uml/pst.uml file, Interaction Message Occurences section is as follows
      | Interaction Name             | Message Occurence | Lifeline Covered    |
      | specs::dept::process::Submit | SendEvent         | this                |
      | specs::dept::process::Submit | ReceiveEvent      | BlahObjectPageSteps |
