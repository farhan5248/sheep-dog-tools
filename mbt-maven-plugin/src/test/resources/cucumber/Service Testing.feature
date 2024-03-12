@service
Feature: Service Testing

  Background: Create a feature file

    Given The mbt-maven-plugin plugin, src/test/resources/cucumber/Service Testing.feature file is as follows
          """
          Feature: Service Testing
          
            Scenario: Use a web-service
          
              Given The Admin service, Family Details response is as follows
                    | Family | Maximum |
                    | Sheikh |    10.0 |
               When The Pharmacy service, Claim request is sent with
                    | Drug Cost | Family |
                    |      20.0 | Sheikh |
               Then The Claim response will be as follows
                    | Pay Provider |
                    |         10.0 |
                And The nightly payment request will be triggered at midnight
          """
     When The cucumber-to-uml goal is executed
      And The uml-to-cucumber goal is executed

  Scenario: Create AdminFamilyDetailsResponseSteps.java

     Then The src/test/java/org/farhan/stepdefs/admin/AdminFamilyDetailsResponseSteps.java file will be as follows
          """
          package org.farhan.stepdefs.admin;
          
          import org.farhan.common.AdminFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AdminFamilyDetailsResponseSteps {
          
              @Given("^The Admin service, Family Details response is as follows$")
              public void theAdminServiceFamilyDetailsResponseIsAsFollows(DataTable dataTable) {
                  AdminFactory.get("FamilyDetailsResponse").setComponent("Admin");
                  AdminFactory.get("FamilyDetailsResponse").setPath("Family Details");
                  AdminFactory.get("FamilyDetailsResponse").setInputOutputs(dataTable);
              }
          }
          
          """

  Scenario: Create PharmacyClaimRequestSteps.java

     Then The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimRequestSteps.java file will be as follows
          """
          package org.farhan.stepdefs.pharmacy;
          
          import org.farhan.common.PharmacyFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class PharmacyClaimRequestSteps {
          
              @Given("^The Pharmacy service, Claim request is sent with$")
              public void thePharmacyServiceClaimRequestIsSentWith(DataTable dataTable) {
                  PharmacyFactory.get("ClaimRequest").setComponent("Pharmacy");
                  PharmacyFactory.get("ClaimRequest").setPath("Claim");
                  PharmacyFactory.get("ClaimRequest").setInputOutputs(dataTable);
                  PharmacyFactory.get("ClaimRequest").transition();
              }
          }
          
          """

  Scenario: Create PharmacyClaimResponseSteps.java

     Then The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyClaimResponseSteps.java file will be as follows
          """
          package org.farhan.stepdefs.pharmacy;
          
          import org.farhan.common.PharmacyFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class PharmacyClaimResponseSteps {
          
              @Given("^The Claim response will be as follows$")
              public void theClaimResponseWillBeAsFollows(DataTable dataTable) {
                  PharmacyFactory.get("ClaimResponse").setComponent("Pharmacy");
                  PharmacyFactory.get("ClaimResponse").setPath("Claim");
                  PharmacyFactory.get("ClaimResponse").assertInputOutputs(dataTable);
              }
          }
          
          """

  Scenario: Create PharmacyNightlyPaymentRequestSteps.java

     Then The src/test/java/org/farhan/stepdefs/pharmacy/PharmacyNightlyPaymentRequestSteps.java file will be as follows
          """
          package org.farhan.stepdefs.pharmacy;
          
          import org.farhan.common.PharmacyFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class PharmacyNightlyPaymentRequestSteps {
          
              @Given("^The nightly payment request will be triggered at midnight$")
              public void theNightlyPaymentRequestWillBeTriggeredAtMidnight() {
                  PharmacyFactory.get("NightlyPaymentRequest").setComponent("Pharmacy");
                  PharmacyFactory.get("NightlyPaymentRequest").setPath("nightly payment");
                  PharmacyFactory.get("NightlyPaymentRequest").transition();
              }
          }
          
          """

  Scenario: Create FamilyDetailsResponse.java

     Then The src/test/java/org/farhan/objects/admin/FamilyDetailsResponse.java file will be as follows
          """
          package org.farhan.objects.admin;
          
          import java.util.HashMap;
          
          public interface FamilyDetailsResponse {
          
              public void setFamily(HashMap<String, String> keyMap);
          
              public void setMaximum(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create ClaimRequest.java

     Then The src/test/java/org/farhan/objects/pharmacy/ClaimRequest.java file will be as follows
          """
          package org.farhan.objects.pharmacy;
          
          import java.util.HashMap;
          
          public interface ClaimRequest {
          
              public void setDrugCost(HashMap<String, String> keyMap);
          
              public void setFamily(HashMap<String, String> keyMap);
          
              public void transition();
          }
          
          """

  Scenario: Create ClaimResponse.java

     Then The src/test/java/org/farhan/objects/pharmacy/ClaimResponse.java file will be as follows
          """
          package org.farhan.objects.pharmacy;
          
          import java.util.HashMap;
          
          public interface ClaimResponse {
          
              public void assertPayProvider(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create NightlyPaymentRequest.java

     Then The src/test/java/org/farhan/objects/pharmacy/NightlyPaymentRequest.java file will be as follows
          """
          package org.farhan.objects.pharmacy;
          
          import java.util.HashMap;
          
          public interface NightlyPaymentRequest {
          
              public void transition();
          }
          
          """

