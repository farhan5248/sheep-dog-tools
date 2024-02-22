Feature: Create Step Object From Step

# TODO read in layer 3 java files and specify how they're merged
  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
          
              Given The blah application, Object page is empty
              Given The blah2 service, Json request is executed with
                    | i1 | i2 |
                    | v5 | v6 |
              Given The blah2 service, Json request is sent
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
          |                   Class Name |
          |    objects::blah::ObjectPage |
          | objects::blah::DataTablePage |
          | objects::blah::DocStringPage |
          |  objects::blah2::JsonRequest |

  Scenario: Create new interactions

      And The target/uml/pst.uml file, Class Interactions section will be as follows
          |                   Class Name |   Interaction Name |
          |    objects::blah::ObjectPage |           setEmpty |
          | objects::blah::DataTablePage | assertTopSectionH1 |
          | objects::blah::DataTablePage | assertTopSectionH2 |
          | objects::blah::DocStringPage |         setContent |
          |  objects::blah2::JsonRequest |              setI1 |
          |  objects::blah2::JsonRequest |              setI2 |
          |  objects::blah2::JsonRequest |         transition |

  Scenario Outline: Create new interaction parameters

      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |   Interaction Name |   Parameter Name |
          | <Interaction Name> | <Parameter Name> |

    Examples: Doc Strings

          |                         Interaction Name | Parameter Name |
          | objects::blah::DocStringPage::setContent |         keyMap |

    Examples: Data Tables

          |                                 Interaction Name | Parameter Name |
          | objects::blah::DataTablePage::assertTopSectionH1 |         keyMap |
          | objects::blah::DataTablePage::assertTopSectionH2 |         keyMap |
          |               objects::blah2::JsonRequest::setI1 |         keyMap |
          |               objects::blah2::JsonRequest::setI2 |         keyMap |

    Examples: Edge Transitions

          |                        Interaction Name | Parameter Name |
          | objects::blah2::JsonRequest::transition |       has none |

    Examples: Vertex States

          |                    Interaction Name | Parameter Name |
          | objects::blah::ObjectPage::setEmpty |       has none |

