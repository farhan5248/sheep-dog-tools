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

    Given The Admin application, DIN page is created as follows
          | DIN  | Drug Cost |
          | 2345 | 100.0     |
      And The Admin application, Provider page is created as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is created as follows
          | Certificate |
          | 123456789   |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance | Co-Payment | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 80.0         | 0.0        | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 28.0          | 72.0      |

  @unit
  Scenario: Low Co-Payment

    Given The Admin application, DIN page is created as follows
          | DIN  | Drug Cost |
          | 2345 | 100.0     |
      And The Admin application, Provider page is created as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is created as follows
          | Certificate |
          | 123456789   |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance | Co-Payment | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 80.0         | 10.0       | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 38.0          | 62.0      |

  @unit @component
  Scenario: High Co-Payment

    Given The Admin application, DIN page is created as follows
          | DIN  | Drug Cost |
          | 2345 | 100.0     |
      And The Admin application, Provider page is created as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is created as follows
          | Certificate |
          | 123456789   |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance | Co-Payment | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 80.0         | 110.0      | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 100.0         | 0.0       |

