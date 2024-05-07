@debug
Feature: UML Step To Code 2

  Scenario: Step with data table

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page, Top section will be as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Object section will be as follows
          |      Interface Name |                  Package |
          | BlahObjectPageSteps | org.farhan.stepdefs.blah |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Object section will be as follows
          |                          Import |
          |   org.farhan.common.BlahFactory |
          |       io.cucumber.java.en.Given |
          | io.cucumber.datatable.DataTable |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                                           Method Name | Visibility | Return Type |
          | theBlahApplicationObjectPageTopSectionWillBeAsFollows |     public |        void |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                                           Method Name |                                                                    Annotation |
          | theBlahApplicationObjectPageTopSectionWillBeAsFollows | @Given("^The blah application, Object page, Top section will be as follows$") |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                                           Method Name | Parameter Name | Parameter Type |
          | theBlahApplicationObjectPageTopSectionWillBeAsFollows |      dataTable |      DataTable |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                                           Method Name |                                                                  Statement |
          | theBlahApplicationObjectPageTopSectionWillBeAsFollows |                        BlahFactory.get("ObjectPage").setComponent("blah"); |
          | theBlahApplicationObjectPageTopSectionWillBeAsFollows |                           BlahFactory.get("ObjectPage").setPath("Object"); |
          | theBlahApplicationObjectPageTopSectionWillBeAsFollows | BlahFactory.get("ObjectPage").assertInputOutputs(dataTable, "TopSection"); |

  Scenario: Step with Docstring

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is as follows
                    \"\"\"
                    text1
                    text2
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                             Method Name | Parameter Name | Parameter Type |
          | theBlahApplicationObjectPageIsAsFollows |      docString |         String |
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                             Method Name |                                                            Statement |
          | theBlahApplicationObjectPageIsAsFollows |                  BlahFactory.get("ObjectPage").setComponent("blah"); |
          | theBlahApplicationObjectPageIsAsFollows |                     BlahFactory.get("ObjectPage").setPath("Object"); |
          | theBlahApplicationObjectPageIsAsFollows | BlahFactory.get("ObjectPage").setInputOutputs("Content", docString); |

  Scenario: Step with no arguments

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The mbt-transformer plugin, BlahObjectPageSteps.java file, Fields section will be as follows
          |                         Method Name |                                               Statement |
          | theBlahApplicationObjectPageIsEmpty |     BlahFactory.get("ObjectPage").setComponent("blah"); |
          | theBlahApplicationObjectPageIsEmpty |        BlahFactory.get("ObjectPage").setPath("Object"); |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setInputOutputs("Empty"); |

