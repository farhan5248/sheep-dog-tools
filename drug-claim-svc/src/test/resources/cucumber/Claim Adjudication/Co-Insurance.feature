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
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 0.0          | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 100.0         | 0.0       |

  @unit
  Scenario: Low Co-Insurance

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
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 50.0         | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 55.0          | 45.0      |

  @unit @component
  Scenario: High Co-Insurance

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
          | Certificate | Co-Insurance | DIN  | Deductible | Drug Cost | Provider |
          | 123456789   | 100.0        | 2345 | 10.0       | 100.0     | 12345678 |
     Then The Claim response will be created as follows
          | Out Of Pocket | Plan Pays |
          | 10.0          | 90.0      |

