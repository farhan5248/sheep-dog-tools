@debug
Feature: UML Doc String To Code

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
