Feature: Convert Interaction To Step Object

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
      And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Create new step object Java class for graph vertices

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DataTablePage.java file will be as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface DataTablePage {
          
              public void assertTopSectionh1(HashMap<String, String> keyMap);
          
              public void assertTopSectionh2(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create new step object Java class for graph edges

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/DocStringPage.java file will be as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface DocStringPage {
          
              public void setContent(String contents);
          }
          
          """

  Scenario: Non existing Java class creation with vertice details

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface ObjectPage {
          
              public void setIsEmpty();
          }
          
          """

  Scenario: Non existing Java class creation with edge details

     Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah2/JsonRequest.java file will be as follows
          """
          package org.farhan.objects.blah2;
          
          import java.util.HashMap;
          
          public interface JsonRequest {
          
              public void seti1(HashMap<String, String> keyMap);
          
              public void seti2(HashMap<String, String> keyMap);
          
              public void transition();
          
              public void setIsInvalid();
          }
          
          """

            