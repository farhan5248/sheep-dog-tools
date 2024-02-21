Feature: Convert Step Object To Interaction

  Background: Create a feature file
    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
      """
    And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file is as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      
      public interface ObjectPage {
      
          public void assertIsInvalid();
      }

      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags |
      | tag1 |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Existing Java step object methods are preserved
    Then The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be as follows
      """
      package org.farhan.objects.blah;
      
      import java.util.HashMap;
      
      public interface ObjectPage {
      
          public void assertIsInvalid();
      
          public void assertIsEmpty();
      }

      """
