Feature: Dispense Fee

  Sometimes this is included in the coverage but not always.
  Some insurers only cover the drug cost or if they do cover the dispense fee, it's a limited number of times.
  Modify these scenarios. Make a plan where the dispense fee
  - is covered
  - is covered but capped
  - is not covered

  @unit
  Scenario: No Dispense Fee

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is as follows
          | Certificate |
          |   123456789 |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance |  DIN | Deductible | Dispense Fee | Drug Cost | Provider |
          |   123456789 |         80.0 | 2345 |       10.0 |          0.0 |     100.0 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          28.0 |      72.0 |

  @unit
  Scenario: Low Dispense Fee

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is as follows
          | Certificate |
          |   123456789 |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance |  DIN | Deductible | Dispense Fee | Drug Cost | Provider |
          |   123456789 |         80.0 | 2345 |       10.0 |          5.0 |     100.0 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          29.0 |      76.0 |

  @unit @component
  Scenario: High Dispense Fee

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is as follows
          | Certificate |
          |   123456789 |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance |  DIN | Deductible | Dispense Fee | Drug Cost | Provider |
          |   123456789 |         80.0 | 2345 |       10.0 |         15.0 |     100.0 | 12345678 |
     Then The Claim response will be as follows
          | Out Of Pocket | Plan Pays |
          |          31.0 |      84.0 |

