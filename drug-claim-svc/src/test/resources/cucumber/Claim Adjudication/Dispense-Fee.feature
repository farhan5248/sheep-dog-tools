Feature: Dispense-Fee

  Sometimes this is included in the coverage but not always.
  Some insurers only cover the drug cost or if they do cover the dispense fee, it's a limited number of times.
  Modify these scenarios. Make a plan where the dispense fee
  - is covered
  - is covered but capped
  - is not covered

  @unit
  Scenario: No Dispense-Fee

    Given The Admin application, Family page is as follows
          | Family |
          | Sheikh |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance | Dispense-Fee |
          |     100.0 |       10.0 |         80.0 |          0.0 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          28.0 |      72.0 |

  @unit
  Scenario: Low Dispense-Fee

    Given The Admin application, Family page is as follows
          | Family |
          | Sheikh |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance | Dispense-Fee |
          |     100.0 |       10.0 |         80.0 |          5.0 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          29.0 |      76.0 |

  @unit @component
  Scenario: High Dispense-Fee

    Given The Admin application, Family page is as follows
          | Family |
          | Sheikh |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance | Dispense-Fee |
          |     100.0 |       10.0 |         80.0 |         15.0 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          31.0 |      84.0 |

