@debug
Feature: UML Step To Code

  Scenario: Step with no arguments

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
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
     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The mbt-transformer plugin, ObjectPage.java file, Object section will be as follows
          | Interface Name |                 Package |            Import |
          |     ObjectPage | org.farhan.objects.blah | java.util.HashMap |
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          | Method Name | Visibility | Return Type |
          |  setContent |     public |        void |
      And The mbt-transformer plugin, ObjectPage.java file, Fields section will be as follows
          | Method Name | Parameter Name |         Parameter Type |
          |  setContent |         keyMap | HashMap<String,String> |

  