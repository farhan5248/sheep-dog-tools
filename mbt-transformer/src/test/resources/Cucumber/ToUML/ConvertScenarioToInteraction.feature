Feature: Convert Scenario To Interaction

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
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
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Convert scenario title
    And The target/uml/pst.uml file, Class Interactions section will be as follows
      | Class Name           | Interaction Name |
      | specs::dept::process | Submit           |

  Scenario: Convert scenario tags
    And The target/uml/pst.uml file, Interaction Parameters section will be as follows
      | Interaction Name             | Parameter Name |
      | specs::dept::process::Submit | tag1           |

  Scenario: Convert scenario description
    And The target/uml/pst.uml file, Interaction Comments section will be as follows
      | Interaction Name             | Comment         |
      | specs::dept::process::Submit | Basic EDI claim |

  Scenario: Convert scenario step
    And The target/uml/pst.uml file, Class Element Imports section will be as follows
      | Class Name           | Imported Element                         |
      | specs::dept::process | pst::stepdefs::blah::BlahObjectPageSteps |
    And The target/uml/pst.uml file, Class Properties section will be as follows
      | Class Name           | Property Name       | Property Type                            |
      | specs::dept::process | this                | pst::specs::dept::process                |
      | specs::dept::process | BlahObjectPageSteps | pst::stepdefs::blah::BlahObjectPageSteps |
    And The target/uml/pst.uml file, Interaction Messages section will be as follows
      | Interaction Name             | Message                                              |
      | specs::dept::process::Submit | The blah application, something/Object page is empty |
    And The target/uml/pst.uml file, Interaction Lifelines section will be as follows
      | Interaction Name             | Lifeline Name       | Lifeline Represents                            |
      | specs::dept::process::Submit | this                | pst::specs::dept::process::this                |
      | specs::dept::process::Submit | BlahObjectPageSteps | pst::specs::dept::process::BlahObjectPageSteps |
    And The target/uml/pst.uml file, Interaction Message Occurences section will be as follows
      | Interaction Name             | Message Occurence | Lifeline Covered    |
      | specs::dept::process::Submit | SendEvent         | this                |
      | specs::dept::process::Submit | ReceiveEvent      | BlahObjectPageSteps |
