@debug
Feature: Application Testing

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Application Testing.feature file is created as follows
          """
          Feature: Application Testing
          
            Scenario: Use an application
          
              Given The acme application, Log-In request is sent with
                    |  User | Password |
                    | admin | 12345678 |
                And The Home page, Account Search section is present
               When The Account Search request is sent with
                    |   Patient |
                    | John Done |
               Then The Account Details page, Claims History table won't be present
          """
     When The cucumber-to-uml goal is executed
      And The uml-to-cucumber goal is executed

  Scenario: Create AcmeAccountDetailsPageSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeAccountDetailsPageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeAccountDetailsPageSteps {
          
              @Given("^The Account Details page, Claims History table won't be present$")
              public void theAccountDetailsPageClaimsHistoryTableWontBePresent() {
                  AcmeFactory.get("AccountDetailsPage").setComponent("acme");
                  AcmeFactory.get("AccountDetailsPage").setPath("Account Details");
                  AcmeFactory.get("AccountDetailsPage").assertInputOutputs("Present", "ClaimsHistoryTable");
              }
          }
          
          """

  Scenario: Create AcmeAccountSearchRequestSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeAccountSearchRequestSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeAccountSearchRequestSteps {
          
              @Given("^The Account Search request is sent with$")
              public void theAccountSearchRequestIsSentWith(DataTable dataTable) {
                  AcmeFactory.get("AccountSearchRequest").setComponent("acme");
                  AcmeFactory.get("AccountSearchRequest").setPath("Account Search");
                  AcmeFactory.get("AccountSearchRequest").setInputOutputs(dataTable);
                  AcmeFactory.get("AccountSearchRequest").transition();
              }
          }
          
          """

  Scenario: Create AcmeHomePageSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeHomePageSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeHomePageSteps {
          
              @Given("^The Home page, Account Search section is present$")
              public void theHomePageAccountSearchSectionIsPresent() {
                  AcmeFactory.get("HomePage").setComponent("acme");
                  AcmeFactory.get("HomePage").setPath("Home");
                  AcmeFactory.get("HomePage").setInputOutputs("Present", "AccountSearchSection");
              }
          }
          
          """

  Scenario: Create AcmeLogInRequestSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeLogInRequestSteps.java file will be created as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeLogInRequestSteps {
          
              @Given("^The acme application, Log-In request is sent with$")
              public void theAcmeApplicationLogInRequestIsSentWith(DataTable dataTable) {
                  AcmeFactory.get("LogInRequest").setComponent("acme");
                  AcmeFactory.get("LogInRequest").setPath("Log-In");
                  AcmeFactory.get("LogInRequest").setInputOutputs(dataTable);
                  AcmeFactory.get("LogInRequest").transition();
              }
          }
          
          """

  Scenario: Create AccountDetailsPage.java

     Then The src/test/java/org/farhan/objects/acme/AccountDetailsPage.java file will be created as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface AccountDetailsPage {
          
              public void assertClaimsHistoryTablePresent(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create AccountSearchRequest.java

     Then The src/test/java/org/farhan/objects/acme/AccountSearchRequest.java file will be created as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface AccountSearchRequest {
          
              public void transition();
          
              public void setPatient(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create HomePage.java

     Then The src/test/java/org/farhan/objects/acme/HomePage.java file will be created as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface HomePage {
          
              public void setAccountSearchSectionPresent(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create LogInRequest.java

     Then The src/test/java/org/farhan/objects/acme/LogInRequest.java file will be created as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface LogInRequest {
          
              public void transition();
          
              public void setUser(HashMap<String, String> keyMap);
          
              public void setPassword(HashMap<String, String> keyMap);
          }
          
          """

