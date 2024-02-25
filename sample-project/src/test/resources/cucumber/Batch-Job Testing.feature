@batchjob
Feature: Batch-Job Testing

  Scenario: Run a Batch-job

    Given The acme batchjob, batchjobuser/inbox/Input.txt file isn't empty
      But The Input.txt file is invalid
     When The Input.txt file is uploaded
     Then The nightly job won't be triggered
      But The reporting job will be triggered

          