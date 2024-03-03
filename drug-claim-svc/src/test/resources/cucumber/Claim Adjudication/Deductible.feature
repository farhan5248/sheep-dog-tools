Feature: Deductible

  Amount paid out of pocket each year before any claims are paid.
  Need
  a field for drug cost
  a field for deductible
  a field for Co-Insurance
  a field for insurer pays
  a field for paid out of pocket
  No Deductible
  Middle Deductible
  High Deductible

  @unit
  Scenario: No Deductible

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |
          |     100.0 |        0.0 |         80.0 | 2345 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          20.0 |      80.0 |

  @unit
  Scenario: Low Deductible

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |
          |     100.0 |       10.0 |         80.0 | 2345 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          28.0 |      72.0 |

  @unit @component
  Scenario: High Deductible

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |
          |     100.0 |      100.0 |         80.0 | 2345 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |         100.0 |       0.0 |

