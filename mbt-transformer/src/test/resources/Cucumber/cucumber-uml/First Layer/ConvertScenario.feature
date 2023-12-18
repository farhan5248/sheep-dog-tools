@convert-cucumber-umlpst
Feature: Convert Scenario

  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
          Basic EDI claim
      
          Given The blah application, something/Object page is valid

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The claim project, target/uml/pst.uml file is present

  Scenario: Scenario title
    And The target/uml/pst.uml file, Class Interactions section is as follows
      | Class Name                  | Interaction Name |
      | interactions::dept::process | Submit           |

  Scenario: Scenario tags
    And The target/uml/pst.uml file, Interaction Parameters section is as follows
      | Interaction Name                    | Parameter Name |
      | interactions::dept::process::Submit | tag1           |

  Scenario: Scenario description
    And The target/uml/pst.uml file, Interaction Comments section is as follows
      | Interaction Name                    | Comment         |
      | interactions::dept::process::Submit | Basic EDI claim |

  @debug
  Scenario: Scenario step
    And The target/uml/pst.uml file, Interaction Messages section is as follows
      | Interaction Name                    | Message                                              |
      | interactions::dept::process::Submit | The blah application, something/Object page is valid |

  Scenario: Scenario step1
    And The target/uml/pst.uml file, Class Element Imports section is as follows
      | Class Name                  | Alias      | Imported Element                             |
      | interactions::dept::process | blahObject | pst::subsystems::blah::something::blahObject |
    And The target/uml/pst.uml file, Class Properties section is as follows
      | Class Name                  | Property Name | Property Type                                |
      | interactions::dept::process | this          | pst::interactions::dept::process             |
      | interactions::dept::process | blahObject    | pst::subsystems::blah::something::blahObject |
