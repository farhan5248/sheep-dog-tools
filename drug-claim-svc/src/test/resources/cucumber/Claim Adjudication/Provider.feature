Feature: Provider

  @unit
  Scenario: Unknown Provider

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN | Provider |
          |     100.0 |       10.0 |         80.0 | 1234 | 99999999 |
     Then The Claim response will be as follows
          |   Reject Message |
          | Unknown Provider |

  @unit @component
  Scenario: Known Provider

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN | Provider |
          |     100.0 |       10.0 |         80.0 | 2345 | 12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          |    No Problems |

