@debug @outline
Feature: UML Step To Code

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

  Scenario: Create new step object Java class for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DataTablePage.java file will be present
      And The mbt-transformer plugin, DataTablePage.java file, Object section will be as follows
          | Interface Name |                 Package |            Import |
          |  DataTablePage | org.farhan.objects.blah | java.util.HashMap |
      And The mbt-transformer plugin, DataTablePage.java file, Fields section will be as follows
          |        Method Name | Visibility | Return Type |
          | assertTopSectionH1 |     public |        void |
          | assertTopSectionH2 |     public |        void |
      And The mbt-transformer plugin, DataTablePage.java file, Fields section will be as follows
          |        Method Name | Parameter Name |         Parameter Type |
          | assertTopSectionH1 |         keyMap | HashMap<String,String> |
          | assertTopSectionH2 |         keyMap | HashMap<String,String> |

  Scenario: Create new step object Java class for graph edges

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DocStringPage.java file will be present
      And The mbt-transformer plugin, DocStringPage.java file, Object section will be as follows
          | Interface Name |                 Package |            Import |
          |  DocStringPage | org.farhan.objects.blah | java.util.HashMap |
      And The mbt-transformer plugin, DocStringPage.java file, Fields section will be as follows
          | Method Name | Visibility | Return Type |
          |  setContent |     public |        void |
      And The mbt-transformer plugin, DocStringPage.java file, Fields section will be as follows
          | Method Name | Parameter Name |         Parameter Type |
          |  setContent |         keyMap | HashMap<String,String> |

  Scenario: Non existing Java class creation with vertice details

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file, Object section will be as follows
          | Interface Name |                 Package |            Import |
          |     ObjectPage | org.farhan.objects.blah | java.util.HashMap |
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          | Method Name | Visibility | Return Type |
          |    setEmpty |     public |        void |
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          | Method Name | Parameter Name |         Parameter Type |
          |    setEmpty |         keyMap | HashMap<String,String> |

  Scenario: Non existing Java class creation with edge details

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah2/JsonRequest.java file will be present
      And The mbt-transformer plugin, JsonRequest.java file, Object section will be as follows
          | Interface Name |                  Package |            Import |
          |    JsonRequest | org.farhan.objects.blah2 | java.util.HashMap |
      And The mbt-transformer plugin, JsonRequest.java file, Fields section will be as follows
          | Method Name | Visibility | Return Type |
          |       setI1 |     public |        void |
          |       setI2 |     public |        void |
      And The mbt-transformer plugin, JsonRequest.java file, Fields section will be as follows
          | Method Name | Parameter Name |         Parameter Type |
          |       setI1 |         keyMap | HashMap<String,String> |
          |       setI2 |         keyMap | HashMap<String,String> |

