Feature: Adjudicate a claim

  @unit
  Scenario: Test 1

    Given The Admin application, Family page is as follows
          | Family |
          | Sheikh |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Family |
          |      20.0 | Sheikh |
     Then The Claim resource will be as follows
          | Pay Provider |
          |         10.0 |

  @unit @component
  Scenario: Test 1

    Given The Admin application, Family page is as follows
          | Family |
          | Sheikh |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Family |
          |      30.0 | Sheikh |
     Then The Claim resource will be as follows
          | Pay Provider |
          |         15.0 |

