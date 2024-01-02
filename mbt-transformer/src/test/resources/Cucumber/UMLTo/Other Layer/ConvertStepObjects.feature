Feature: Convert Step Objects

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

  Scenario: Non existing Java class creation with vertice data tables
    Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahDataTablePage.java file will be as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      import io.cucumber.java.PendingException;
      import org.farhan.common.Blah;
      
      public class BlahDataTablePage extends Blah {
      
          public void assertToph1(HashMap<String, String> keyMap) {
              throw new PendingException();
          }
      
          public void assertToph2(HashMap<String, String> keyMap) {
              throw new PendingException();
          }
      }
      
      """    

  Scenario: Non existing Java class creation with vertice doc strings
    Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahDocStringPage.java file will be as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      import io.cucumber.java.PendingException;
      import org.farhan.common.Blah;
      
      public class BlahDocStringPage extends Blah {
      
          public void setContent(String contents) {
              throw new PendingException();
          }
      }
      
      """
      
  Scenario: Non existing Java class creation with vertice details
    Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/BlahObjectPage.java file will be as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      import io.cucumber.java.PendingException;
      import org.farhan.common.Blah;
      
      public class BlahObjectPage extends Blah {
      
          public void setIsEmpty() {
              throw new PendingException();
          }
      }
      
      """

  Scenario: Non existing Java class creation with edge details
    Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah2/Blah2JsonRequest.java file will be as follows
      """
      package org.farhan.objects.blah2;
      
      import java.util.HashMap;
      import io.cucumber.java.PendingException;
      import org.farhan.common.Blah2;
      
      public class Blah2JsonRequest extends Blah2 {
      
          public void seti1(HashMap<String, String> keyMap) {
              throw new PendingException();
          }
      
          public void seti2(HashMap<String, String> keyMap) {
              throw new PendingException();
          }
      
          public void execute() {
              throw new PendingException();
          }
      
          public void setIsInvalid() {
              throw new PendingException();
          }
      }
      
      """    

            