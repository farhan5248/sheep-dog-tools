Feature: Convert Step Objects

  Background: Create a feature file
    Given The claim project, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
      """
    And The claim project, src/test/java/org/farhan/objects/blah/blahObjectPage.java file is as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      import io.cucumber.java.PendingException;
      import org.farhan.common.blah;
      
      public class blahObjectPage extends blah {
      
          public void assertIsInvalid() {
              throw new PendingException();
          }
      }
      
      """      
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Existing Java methods are preserved
    Then The claim project, src/test/java/org/farhan/objects/blah/blahObjectPage.java file will be as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      import io.cucumber.java.PendingException;
      import org.farhan.common.blah;
      
      public class blahObjectPage extends blah {
      
          public void assertIsInvalid() {
              throw new PendingException();
          }
      
          public void assertIsEmpty() {
              throw new PendingException();
          }
      }
      
      """   
