Feature: Create Step Object From Step

  # TODO read in layer 3 java files and specify how they're merged
  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/Process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
          Given The blah2 service, Json request is executed with
                | i1 | i2 |
                | v5 | v6 |
          Given The blah2 service, Json request is invalid
          Given The blah application, DataTable page, Top section will be as follows
                | h1 | h2 |
                | v1 | v2 |
                | v3 | v4 |
          Given The blah application, DocString page is as follows
                \"\"\"
                text1
                text2
                \"\"\"
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Create new classes
    And The target/uml/pst.uml file, Class section will be as follows
      | Class Name                       |
      | objects::blah::blahObjectPage    |
      | objects::blah::blahDataTablePage |
      | objects::blah::blahDocStringPage |
      | objects::blah2::blah2JsonRequest |

  Scenario: Create new interactions
    And The target/uml/pst.uml file, Class Interactions section will be as follows
      | Class Name                       | Interaction Name   |
      | objects::blah::blahObjectPage    | setIsEmpty         |
      | objects::blah::blahDataTablePage | assertTopSectionh1 |
      | objects::blah::blahDataTablePage | assertTopSectionh2 |
      | objects::blah::blahDocStringPage | setContent         |
      | objects::blah2::blah2JsonRequest | seti1              |
      | objects::blah2::blah2JsonRequest | seti2              |
      | objects::blah2::blah2JsonRequest | transition         |
      | objects::blah2::blah2JsonRequest | setIsInvalid       |

  Scenario: Create new interaction parameters
    And The target/uml/pst.uml file, Interaction Parameters section will be as follows
      | Interaction Name                                     | Parameter Name |
      | objects::blah::blahObjectPage::setIsEmpty            | has none       |
      | objects::blah::blahDataTablePage::assertTopSectionh1 | keyMap         |
      | objects::blah::blahDataTablePage::assertTopSectionh2 | keyMap         |
      | objects::blah::blahDocStringPage::setContent         | contents       |
      | objects::blah2::blah2JsonRequest::seti1              | keyMap         |
      | objects::blah2::blah2JsonRequest::seti2              | keyMap         |
      | objects::blah2::blah2JsonRequest::transition         | has none       |
      | objects::blah2::blah2JsonRequest::setIsInvalid       | has none       |
