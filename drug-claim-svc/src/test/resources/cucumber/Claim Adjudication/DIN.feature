Feature: DIN

  @unit @component
  Scenario: Unknown DIN

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is as follows
          | Certificate |
          |   123456789 |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance |  DIN | Deductible | Drug Cost | Provider |
          |   123456789 |         80.0 | 1234 |       10.0 |     100.0 | 12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          |    Unknown DIN |

  @unit
  Scenario: Known DIN with different cost

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
      And The Admin application, Provider page is as follows
          | Provider |
          | 12345678 |
      And The Admin application, Member page is as follows
          | Certificate |
          |   123456789 |
     When The Pharmacy service, Claim request is sent with
          | Certificate | Co-Insurance |  DIN | Deductible | Drug Cost | Provider |
          |   123456789 |         80.0 | 2345 |       10.0 |     100.0 | 12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          | Different Cost |

  @unit
  Scenario: Known DIN with same cost

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
          | Certificate | Co-Insurance |  DIN | Deductible | Drug Cost | Provider |
          |   123456789 |         80.0 | 2345 |       10.0 |     100.0 | 12345678 |
     Then The Claim response will be as follows
          | Reject Message |
          |    No Problems |

