Feature: Create Step Definition From Step

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
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
           Then The blah application, DocString page will be as follows
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
      | Class Name                             |
      | stepdefs::blah::blahObjectPageSteps    |
      | stepdefs::blah::blahDataTablePageSteps |
      | stepdefs::blah::blahDocStringPageSteps |
      | stepdefs::blah2::blah2JsonRequestSteps |

  Scenario: Create new interaction
    And The target/uml/pst.uml file, Class Interactions section will be as follows
      | Class Name                             | Interaction Name                                         |
      | stepdefs::blah::blahObjectPageSteps    | theBlahApplicationObjectPageIsEmpty                      |
      | stepdefs::blah::blahDataTablePageSteps | theBlahApplicationDataTablePageTopSectionWillBeAsFollows |
      | stepdefs::blah::blahDocStringPageSteps | theBlahApplicationDocStringPageWillBeAsFollows           |
      | stepdefs::blah2::blah2JsonRequestSteps | theBlah2ServiceJsonRequestIsExecutedWith                 |
      | stepdefs::blah2::blah2JsonRequestSteps | theBlah2ServiceJsonRequestIsInvalid                      |

  Scenario: Create new interaction annotations
    And The target/uml/pst.uml file, Interaction Annotations section will be as follows
      | Interaction Name                                                         | Annotation Name                                        |
      | stepdefs::blah::blahObjectPageSteps::theBlahApplicationObjectPageIsEmpty | @Given("^The blah application, Object page is empty$") |

  Scenario: Create new interaction parameters
    And The target/uml/pst.uml file, Interaction Parameters section will be as follows
      | Interaction Name                                                                                 | Parameter Name |
      | stepdefs::blah::blahObjectPageSteps::theBlahApplicationObjectPageIsEmpty                         | has none       |
      | stepdefs::blah::blahDataTablePageSteps::theBlahApplicationDataTablePageTopSectionWillBeAsFollows | dataTable      |
      | stepdefs::blah::blahDocStringPageSteps::theBlahApplicationDocStringPageWillBeAsFollows           | docString      |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith                 | dataTable      |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsInvalid                      | has none       |

  Scenario: Create new interaction messages
    And The target/uml/pst.uml file, Interaction Messages section will be as follows
      | Interaction Name                                                                                 | Message          |
      | stepdefs::blah::blahObjectPageSteps::theBlahApplicationObjectPageIsEmpty                         | setIsEmpty       |
      | stepdefs::blah::blahDataTablePageSteps::theBlahApplicationDataTablePageTopSectionWillBeAsFollows | assertAttributes |
      | stepdefs::blah::blahDocStringPageSteps::theBlahApplicationDocStringPageWillBeAsFollows           | assertAttributes |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith                 | execute          |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith                 | setAttributes    |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsInvalid                      | execute          |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsInvalid                      | setIsInvalid     |

  Scenario: Create new interaction message annotations
    TODO Need to verify table headers as passed through to create layer 3 objects

    And The target/uml/pst.uml file, Interaction Messages section will be as follows
      | Interaction Name                                                                                 | Message          | Argument Name | Annotation Detail |
      | stepdefs::blah::blahDataTablePageSteps::theBlahApplicationDataTablePageTopSectionWillBeAsFollows | assertAttributes | keyMap        | 0 -> h1 \|h2 \|   |
      | stepdefs::blah2::blah2JsonRequestSteps::theBlah2ServiceJsonRequestIsExecutedWith                 | setAttributes    | keyMap        | 0 -> i1 \|i2 \|   |
