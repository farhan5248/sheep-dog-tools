Feature: Certificate

  Certificate is also known as card-holder or plan member.

  @unit @component
  Scenario: Unknown Certificate

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
          | Drug Cost | Deductible | Co-Insurance |  DIN | Provider | Certificate |
          |     100.0 |       10.0 |         80.0 | 2345 | 12345678 |   123456780 |
     Then The Claim response will be as follows
          |      Reject Message |
          | Unknown Certificate |

  @unit
  Scenario: Known Certificate

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
          | Drug Cost | Deductible | Co-Insurance |  DIN | Provider | Certificate |
          |     100.0 |       10.0 |         80.0 | 2345 | 12345678 |   123456789 |
     Then The Claim response will be as follows
          | Reject Message |
          |    No Problems |

