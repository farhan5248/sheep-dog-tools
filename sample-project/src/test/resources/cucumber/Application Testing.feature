@application
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

