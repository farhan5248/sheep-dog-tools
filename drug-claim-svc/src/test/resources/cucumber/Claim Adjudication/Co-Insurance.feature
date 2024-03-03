Feature: Co-Insurance

  Coninsurance: Percentage of cost covered after paying the deductible.
  Need
  a field for drug cost
  a field for co-insurance
  a field for insurer pays
  a field for paid out of pocket
  No Deductible
  Middle Deductible
  High Deductible

  @unit
  Scenario: No Co-Insurance

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Co-Insurance | Deductible |  DIN | Provider |
          |     100.0 |          0.0 |       10.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |         100.0 |       0.0 |

  @unit
  Scenario: Low Co-Insurance

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Co-Insurance | Deductible |  DIN | Provider |
          |     100.0 |         50.0 |       10.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          55.0 |      45.0 |

  @unit @component
  Scenario: High Co-Insurance

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Co-Insurance | Deductible |  DIN | Provider |
          |     100.0 |        100.0 |       10.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          10.0 |      90.0 |

