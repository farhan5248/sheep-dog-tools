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
          
          === Given: The blah application, Login page is valid
          === When: The blah application, Home page is created as follows
          
          |===
          | grp | ins
          | 10 | 5
          |===
          
          === Then: The blah application, Logout page is created as follows
          
          ----
            text1
          
            text2
          ----
          
          [tags="tag3"]
          == Scenario: Story Two
          
          Desc 3
          
          === Given: The blah application, Login page is invalid
          === When: The blah application, Home page is created as follows
          
          |===
          | grp | ins
          | 8 | {ins}
          |===
          
          === Then: The blah application, Logout page is invalid
          
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
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Home page.asciidoc file is created as follows
          """
          = Object: Home page
          
          == Definition: is created as follows
          
          === Parameters: 1
          
          |===
          | grp | ins
          |===
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Login page.asciidoc file is created as follows
          """
          = Object: Login page
          
          == Definition: is valid
          
          == Definition: is invalid
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Logout page.asciidoc file is created as follows
          """
          = Object: Logout page
          
          == Definition: is created as follows
          
          === Parameters: 1
          
          |===
          | Content
          |===
          
          == Definition: is invalid
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
          
              Given The blah application, Login page is valid
               When The blah application, Home page is created as follows
                    | grp | ins |
                    | 10  | 5   |
               Then The blah application, Logout page is created as follows
                    \"\"\"
                      text1
                    
                      text2
                    \"\"\"
          
            @tag3
            Scenario Outline: Story Two
          
              Desc 3
          
              Given The blah application, Login page is invalid
               When The blah application, Home page is created as follows
                    | grp | ins   |
                    | 8   | <ins> |
               Then The blah application, Logout page is invalid
          
              Examples: Some data
          
                    | ins |
                    | 4   |
          
              Examples: Dataset 2
          
                    | ins |
                    | 5   |
                    | 6   |
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/HomePage.java file is created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface HomePage {
          
              public void setGrp(HashMap<String, String> keyMap);
          
              public void setIns(HashMap<String, String> keyMap);
          }
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/LoginPage.java file is created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface LoginPage {
          
              public void setValid(HashMap<String, String> keyMap);
          
              public void setInvalid(HashMap<String, String> keyMap);
          }
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/objects/blah/LogoutPage.java file is created as follows
          """
          package org.farhan.objects.blah;
          
          import java.util.HashMap;
          
          public interface LogoutPage {
          
              public void setContent(HashMap<String, String> keyMap);
          
              public void setInvalid(HashMap<String, String> keyMap);
          }
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahHomePageSteps.java file is created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.BlahFactory;
          import io.cucumber.datatable.DataTable;
          
          public class BlahHomePageSteps {
          
              @Given("^The blah application, Home page is created as follows$")
              public void theBlahApplicationHomePageIsCreatedAsFollows(DataTable dataTable) {
                  BlahFactory.get("HomePage").setComponent("blah");
                  BlahFactory.get("HomePage").setPath("Home");
                  BlahFactory.get("HomePage").setInputOutputs(dataTable);
              }
          }
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahLoginPageSteps.java file is created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.BlahFactory;
          
          public class BlahLoginPageSteps {
          
              @Given("^The blah application, Login page is valid$")
              public void theBlahApplicationLoginPageIsValid() {
                  BlahFactory.get("LoginPage").setComponent("blah");
                  BlahFactory.get("LoginPage").setPath("Login");
                  BlahFactory.get("LoginPage").setInputOutputs("Valid");
              }
          
              @Given("^The blah application, Login page is invalid$")
              public void theBlahApplicationLoginPageIsInvalid() {
                  BlahFactory.get("LoginPage").setComponent("blah");
                  BlahFactory.get("LoginPage").setPath("Login");
                  BlahFactory.get("LoginPage").setInputOutputs("Invalid");
              }
          }
          """
      And The mbt-transformer plugin, src/test/java/org/farhan/stepdefs/blah/BlahLogoutPageSteps.java file is created as follows
          """
          package org.farhan.stepdefs.blah;
          
          import io.cucumber.java.en.Given;
          import org.farhan.common.BlahFactory;
          
          public class BlahLogoutPageSteps {
          
              @Given("^The blah application, Logout page is created as follows$")
              public void theBlahApplicationLogoutPageIsCreatedAsFollows(String docString) {
                  BlahFactory.get("LogoutPage").setComponent("blah");
                  BlahFactory.get("LogoutPage").setPath("Logout");
                  BlahFactory.get("LogoutPage").setInputOutputs("Content", docString);
              }
          
              @Given("^The blah application, Logout page is invalid$")
              public void theBlahApplicationLogoutPageIsInvalid() {
                  BlahFactory.get("LogoutPage").setComponent("blah");
                  BlahFactory.get("LogoutPage").setPath("Logout");
                  BlahFactory.get("LogoutPage").setInputOutputs("Invalid");
              }
          }
          """

