Feature: Convert First Layer

  @convert-cucumber-umlpst @debug
  Scenario: Convert Feature
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      @tag1 @tag2 @tag3
      Feature: This is a test feature
        This is the description
        This is the second line of the description

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The claim project, target/uml/pst.uml file is present
    # Class Interactions, Interaction Comments, Interaction Messages
    And The target/uml/pst.uml file, Class Comments section is as follows
      | Class Name                  | Comment                                                             |
      | interactions::dept::process | This is the description\nThis is the second line of the description |

  @convert-cucumber-umlpst
  Scenario: Convert Scenario
    Given The claim project, src/test/cucumber/department/businessprocess.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit a claim
          Basic EDI claim
          No deductible
      
          Given The blah application, something/Object is empty

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Parameter | Value |
      | tags      | tag1  |
    Then The claim project, target/uml/pst.uml file is present
    And The pst::Logical::interactions::department::businessprocess Class, Element Import section is as follows
      | Notes | Alias      | Imported Element                           |
      |       | blahObject | pst::Logical::subsystems::blah::blahObject |
    And The pst::Logical::interactions::department::businessprocess Class, Property section is as follows
      | Name       | Type                                                    |
      | this       | pst::Logical::interactions::department::businessprocess |
      | blahObject | pst::Logical::subsystems::blah::something::blahObject   |
    And The pst::Logical::interactions::department::businessprocess Class, Interaction section is as follows
      | Name           |
      | Submit a claim |
    And The pst::Logical::interactions::department::businessprocess::Submit a claim Comments section is as follows
      | Body               |
      | A scenario comment |
    And The pst::Logical::interactions::department::businessprocess::Submit a claim Parameter section is as follows
      | Name      | Direction |
      | Automated | in        |
      | High      | in        |
