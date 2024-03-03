Feature: Co-Payment

  Fixed amount at the time of service like $20 for a doctors visit.
  Need
  a field for drug cost
  a field for co-payment
  a field for Co-Insurance
  a field for insurer pays
  a field for paid out of pocket
  No Deductible
  Middle Deductible
  High Deductible

  @unit
  Scenario: No Co-Payment

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Co-Payment | Co-Insurance | Deductible |  DIN |
          |     100.0 |        0.0 |         80.0 |       10.0 | 2345 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          28.0 |      72.0 |

  @unit
  Scenario: Low Co-Payment

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Co-Payment | Co-Insurance | Deductible |  DIN |
          |     100.0 |       10.0 |         80.0 |       10.0 | 2345 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          38.0 |      62.0 |

  @unit @component
  Scenario: High Co-Payment

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Co-Payment | Co-Insurance | Deductible |  DIN |
          |     100.0 |      110.0 |         80.0 |       10.0 | 2345 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |         100.0 |       0.0 |

