Feature: Maximum

  Most the customer pays during the policy period, like a year.
  Once this max is reached the insurer pays 100%.
  Does this mean deductibles don't matter at that point, like is the maximum supposed to be a cap on deductibles?
  That's what I'm interpreting it as for now

  @unit
  Scenario: No Maximum

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance | Maximum |  DIN | Provider |
          |     100.0 |       10.0 |         80.0 |     0.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          20.0 |      80.0 |

  @unit
  Scenario: Low Maximum

    The maximum is less than the deductible so only $5 out of the $10 will count

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance | Maximum |  DIN | Provider |
          |     100.0 |       10.0 |         80.0 |     5.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          24.0 |      76.0 |

  @unit @component
  Scenario: High Maximum

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance | Maximum |  DIN |  Provider |
          |     100.0 |       10.0 |         80.0 |    15.0 | 2345 |  12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          28.0 |      72.0 |

