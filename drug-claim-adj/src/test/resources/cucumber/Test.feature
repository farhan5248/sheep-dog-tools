Feature: Adjudicate a claim

  @debug
  Scenario: Test 1

    Given The Admin application, Family page is as follows
          | Family |
          | Sheikh |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Family |
          |      10.0 | Sheikh |
     Then The Claim resource will be as follows
          | Pay Provider |
          |          5.0 |

