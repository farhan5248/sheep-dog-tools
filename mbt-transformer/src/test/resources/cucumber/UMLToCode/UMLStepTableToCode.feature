@debug
Feature: UML Step Table To Code

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
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file, Object section will be as follows
          | Interface Name |                 Package |            Import |
          |     ObjectPage | org.farhan.objects.blah | java.util.HashMap |
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          |        Method Name | Visibility | Return Type |
          | assertTopSectionH1 |     public |        void |
          | assertTopSectionH2 |     public |        void |
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          |        Method Name | Parameter Name |         Parameter Type |
          | assertTopSectionH1 |         keyMap | HashMap<String,String> |
          | assertTopSectionH2 |         keyMap | HashMap<String,String> |

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

          