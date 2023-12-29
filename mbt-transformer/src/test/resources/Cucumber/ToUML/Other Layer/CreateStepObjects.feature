Feature: Create Step Objects

  # TODO read in layer 3 java files and specify how they're merged
  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
          Given The blah2 service, Json request is executed with
                | i1 | i2 |
                | v5 | v6 |
          Given The blah2 service, Json request is invalid
          Given The blah application, DataTable page, Top section is as follows
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
    Then The claim project, target/uml/pst.uml file is present

  Scenario: Non existing UML class creation
    And The target/uml/pst.uml file, Class section is as follows
      | Class Name                       |
      | objects::blah::blahObjectPage    |
      | objects::blah::blahDataTablePage |
      | objects::blah::blahDocStringPage |
      | objects::blah2::blah2JsonRequest |

  Scenario: Non existing UML interaction creation
    And The target/uml/pst.uml file, Class Interactions section is as follows
      | Class Name                       | Interaction Name |
      | objects::blah::blahObjectPage    | assertIsEmpty    |
      | objects::blah::blahDataTablePage | assertToph1      |
      | objects::blah::blahDataTablePage | assertToph2      |
      | objects::blah::blahDocStringPage | assertContent    |
      | objects::blah2::blah2JsonRequest | seti1            |
      | objects::blah2::blah2JsonRequest | seti2            |
      | objects::blah2::blah2JsonRequest | execute          |
      | objects::blah2::blah2JsonRequest | setIsInvalid     |

  Scenario: Non existing UML interaction parameter creation
    And The target/uml/pst.uml file, Interaction Parameters section is as follows
      | Interaction Name                                  | Parameter Name |
      | objects::blah::blahObjectPage::assertIsEmpty      | has none       |
      | objects::blah::blahDataTablePage::assertToph1     | keyMap         |
      | objects::blah::blahDataTablePage::assertToph2     | keyMap         |
      | objects::blah::blahDocStringPage::assertContent   | contents       |
      | objects::blah2::blah2JsonRequest::seti1           | keyMap         |
      | objects::blah2::blah2JsonRequest::seti2           | keyMap         |
      | objects::blah2::blah2JsonRequest::execute         | has none       |
      | objects::blah2::blah2JsonRequest::setIsInvalid    | has none       |