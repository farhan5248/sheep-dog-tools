@debug
Feature: Document To Code

  Scenario: Create a feature file from adoc file

    Given The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows
          """
          :tags: tag1
          = Feature: Process
          
          Desc 1
          
          [tags="tag2"]
          == Scenario: Story One
          
          Desc 2
          
          === Given: The blah application, Object page is valid
          
          === Then: The blah application, Object page is created as follows
          
          ----
            text1
          
            text2
          ----
          
          [tags="tag3"]
          == Scenario: Story Two
          
          Desc 3
          
          === Given: The blah application, Object page is invalid
          
          === When: The blah application, Object page is created as follows
          
          |===
          | grp | ins
          | 8 | {ins}
          |===
          
          === Examples: Some data
          
          |===
          | ins
          | 4
          |===
          
          === Examples: Dataset 2
          
          |===
          | ins
          | 5
          | 6
          |===
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object page
          
          == Definition: is valid
          
          == Definition: is invalid
          
          == Definition: is created as follows
          
          === Parameters: 1
          
          |===
          | grp | ins
          |===
          
          === Parameters: 2
          
          |===
          | Content
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file will be created as follows
          """
          @tag1
          Feature: Process
          
            Desc 1
          
            @tag2
            Scenario: Story One
          
              Desc 2
          
              Given The blah application, Object page is valid
               Then The blah application, Object page is created as follows
                    \"\"\"
                      text1
                    
                      text2
                    \"\"\"
          
            @tag3
            Scenario Outline: Story Two
          
              Desc 3
          
              Given The blah application, Object page is invalid
               When The blah application, Object page is created as follows
                    | grp | ins   |
                    | 8   | <ins> |
          
              Examples: Some data
          
                    | ins |
                    | 4   |
          
              Examples: Dataset 2
          
                    | ins |
                    | 5   |
                    | 6   |
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/ObjectPage.java file will be created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface ObjectPage {
          
              public void setGrp(HashMap<String, String> keyMap);
          
              public void setIns(HashMap<String, String> keyMap);
          
              public void setValid(HashMap<String, String> keyMap);
          
              public void setInvalid(HashMap<String, String> keyMap);
          
              public void setContent(HashMap<String, String> keyMap);
          }
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.BlahFactory;
          import io.cucumber.datatable.DataTable;
          
          public class BlahObjectPageSteps {
          
              @Given("^The blah application, Object page is created as follows$")
              public void theBlahApplicationObjectPageIsCreatedAsFollows(DataTable dataTable) {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs(dataTable);
              }
          
              @Given("^The blah application, Object page is valid$")
              public void theBlahApplicationObjectPageIsValid() {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Valid");
              }
          
              @Given("^The blah application, Object page is invalid$")
              public void theBlahApplicationObjectPageIsInvalid() {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Invalid");
              }
          
              @Given("^The blah application, Object page is created as follows$")
              public void theBlahApplicationObjectPageIsCreatedAsFollows(String docString) {
                  BlahFactory.get("ObjectPage").setComponent("blah");
                  BlahFactory.get("ObjectPage").setPath("Object");
                  BlahFactory.get("ObjectPage").setInputOutputs("Content", docString);
              }
          }
          """

