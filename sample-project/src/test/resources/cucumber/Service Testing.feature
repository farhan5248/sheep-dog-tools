@service
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

