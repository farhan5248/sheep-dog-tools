@debug
Feature: UML Step To Code 2

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
      And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Common step def file parts

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be present
      And The mbt-transformer plugin, BlahDataTablePageSteps.java file, Object section will be as follows
          |         Interface Name |                  Package |
          | BlahDataTablePageSteps | org.farhan.stepdefs.blah |
      And The mbt-transformer plugin, BlahDataTablePageSteps.java file, Object section will be as follows
          |                          Import |
          |   org.farhan.common.BlahFactory |
          |       io.cucumber.java.en.Given |
          | io.cucumber.datatable.DataTable |
      And The mbt-transformer plugin, BlahDataTablePageSteps.java file, Fields section will be as follows
          |                                              Method Name | Visibility | Return Type |
          | theBlahApplicationDataTablePageTopSectionWillBeAsFollows |     public |        void |
      And The mbt-transformer plugin, BlahDataTablePageSteps.java file, Fields section will be as follows
          |                                              Method Name |                                                                       Annotation |
          | theBlahApplicationDataTablePageTopSectionWillBeAsFollows | @Given("^The blah application, DataTable page, Top section will be as follows$") |

  Scenario: Create new step definition Java class with a data table for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDataTablePageSteps.java file will be present
      And The mbt-transformer plugin, BlahDataTablePageSteps.java file, Fields section will be as follows
          |                                              Method Name | Parameter Name | Parameter Type |
          | theBlahApplicationDataTablePageTopSectionWillBeAsFollows |      dataTable |      DataTable |
      And The mbt-transformer plugin, BlahDataTablePageSteps.java file, Fields section will be as follows
          |                                              Method Name |                                                                     Statement |
          | theBlahApplicationDataTablePageTopSectionWillBeAsFollows |                        BlahFactory.get("DataTablePage").setComponent("blah"); |
          | theBlahApplicationDataTablePageTopSectionWillBeAsFollows |                        BlahFactory.get("DataTablePage").setPath("DataTable"); |
          | theBlahApplicationDataTablePageTopSectionWillBeAsFollows | BlahFactory.get("DataTablePage").assertInputOutputs(dataTable, "TopSection"); |

  Scenario: Create new step definition Java class with a doc string for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahDocStringPageSteps.java file will be present
      And The mbt-transformer plugin, BlahDocStringPageSteps.java file, Fields section will be as follows
          |                                Method Name | Parameter Name | Parameter Type |
          | theBlahApplicationDocStringPageIsAsFollows |      docString |         String |
      And The mbt-transformer plugin, BlahDocStringPageSteps.java file, Fields section will be as follows
          |                                Method Name |                                                               Statement |
          | theBlahApplicationDocStringPageIsAsFollows |                  BlahFactory.get("DocStringPage").setComponent("blah"); |
          | theBlahApplicationDocStringPageIsAsFollows |                  BlahFactory.get("DocStringPage").setPath("DocString"); |
          | theBlahApplicationDocStringPageIsAsFollows | BlahFactory.get("DocStringPage").setInputOutputs("Content", docString); |

  Scenario: Create new step definition Java class with no arguments for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                         Method Name |                                               Statement |
          | theBlahApplicationObjectPageIsEmpty |     BlahFactory.get("ObjectPage").setComponent("blah"); |
          | theBlahApplicationObjectPageIsEmpty |        BlahFactory.get("ObjectPage").setPath("Object"); |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setInputOutputs("Empty"); |

  Scenario: Create new step definition Java class for graph edges

     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah2/Blah2JsonRequestSteps.java file will be present
      And The mbt-transformer plugin, Blah2JsonRequestSteps.java file, Fields section will be as follows
          |                              Method Name |                                                   Statement |
          | theBlah2ServiceJsonRequestIsExecutedWith |      Blah2Factory.get("JsonRequest").setComponent("blah2"); |
          | theBlah2ServiceJsonRequestIsExecutedWith |            Blah2Factory.get("JsonRequest").setPath("Json"); |
          | theBlah2ServiceJsonRequestIsExecutedWith | Blah2Factory.get("JsonRequest").setInputOutputs(dataTable); |
          | theBlah2ServiceJsonRequestIsExecutedWith |               Blah2Factory.get("JsonRequest").transition(); |
      And The mbt-transformer plugin, Blah2JsonRequestSteps.java file, Fields section will be as follows
          |                      Method Name |                                              Statement |
          | theBlah2ServiceJsonRequestIsSent | Blah2Factory.get("JsonRequest").setComponent("blah2"); |
          | theBlah2ServiceJsonRequestIsSent |       Blah2Factory.get("JsonRequest").setPath("Json"); |
          | theBlah2ServiceJsonRequestIsSent |          Blah2Factory.get("JsonRequest").transition(); |

