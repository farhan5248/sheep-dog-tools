@debug
Feature: Batch-Job Testing

  This feature covers having an input file, running the plugin, and verifying the output file.
  You can have multiple input files or multiple output files.
  You can check their contents or their presence, absence, validity etc

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Batch-Job Testing.feature file is as follows
          """
          Feature: Batch-Job Testing
          
            Scenario: Run a Batch-job
          
              Given The acme batchjob, batchjobuser/inbox/Orders.txt file isn't empty
                But The Orders.txt file is invalid
               When The Orders.txt file is uploaded
               Then The nightly job won't be triggered at midnight
                But The reporting job will be triggered at 7 am
          """
     When The cucumber-to-uml goal is executed
      And The uml-to-cucumber goal is executed

  Scenario: Create AcmeOrdersTxtFileSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeOrdersTxtFileSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeOrdersTxtFileSteps {
          
              @Given("^The acme batchjob, batchjobuser/inbox/Orders.txt file isn't empty$")
              public void theAcmeBatchjobBatchjobuserInboxOrdersTxtFileIsntEmpty() {
                  AcmeFactory.get("OrdersTxtFile").setComponent("acme");
                  AcmeFactory.get("OrdersTxtFile").setPath("batchjobuser/inbox/Orders.txt");
                  AcmeFactory.get("OrdersTxtFile").setInputOutputs("");
              }
          
              @Given("^The Orders.txt file is invalid$")
              public void theOrdersTxtFileIsInvalid() {
                  AcmeFactory.get("OrdersTxtFile").setComponent("acme");
                  AcmeFactory.get("OrdersTxtFile").setPath("Orders.txt");
                  AcmeFactory.get("OrdersTxtFile").setInputOutputs("Invalid");
              }
          
              @Given("^The Orders.txt file is uploaded$")
              public void theOrdersTxtFileIsUploaded() {
                  AcmeFactory.get("OrdersTxtFile").setComponent("acme");
                  AcmeFactory.get("OrdersTxtFile").setPath("Orders.txt");
                  AcmeFactory.get("OrdersTxtFile").setInputOutputs("Uploaded");
              }
          }
          
          """

  Scenario: Create AcmeNightlyJobSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeNightlyJobSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeNightlyJobSteps {
          
              @Given("^The nightly job won't be triggered at midnight$")
              public void theNightlyJobWontBeTriggeredAtMidnight() {
                  AcmeFactory.get("NightlyJob").setComponent("acme");
                  AcmeFactory.get("NightlyJob").setPath("nightly");
                  AcmeFactory.get("NightlyJob").transition();
              }
          }
          
          """

  Scenario: Create AcmeReportingJobSteps.java

     Then The src/test/java/org/farhan/stepdefs/acme/AcmeReportingJobSteps.java file will be as follows
          """
          package org.farhan.stepdefs.acme;
          
          import org.farhan.common.AcmeFactory;
          import io.cucumber.java.en.Given;
          import io.cucumber.datatable.DataTable;
          
          public class AcmeReportingJobSteps {
          
              @Given("^The reporting job will be triggered at 7 am$")
              public void theReportingJobWillBeTriggeredAt7Am() {
                  AcmeFactory.get("ReportingJob").setComponent("acme");
                  AcmeFactory.get("ReportingJob").setPath("reporting");
                  AcmeFactory.get("ReportingJob").transition();
              }
          }
          
          """

  Scenario: Create OrdersTxtFile.java

     Then The src/test/java/org/farhan/objects/acme/OrdersTxtFile.java file will be as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface OrdersTxtFile {
          
              public void set(HashMap<String, String> keyMap);
          
              public void setInvalid(HashMap<String, String> keyMap);
          
              public void setUploaded(HashMap<String, String> keyMap);
          }
          
          """

  Scenario: Create NightlyJob.java

     Then The src/test/java/org/farhan/objects/acme/NightlyJob.java file will be as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface NightlyJob {
          
              public void transition();
          }
          
          """

  Scenario: Create ReportingJob.java

     Then The src/test/java/org/farhan/objects/acme/ReportingJob.java file will be as follows
          """
          package org.farhan.objects.acme;
          
          import java.util.HashMap;
          
          public interface ReportingJob {
          
              public void transition();
          }
          
          """

