Feature: DIN

  @unit
  Scenario: No DIN on file regardless of cost

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |
          |     100.0 |       10.0 |         80.0 | 1234 |
     Then The Claim response will be as follows
          | Reject Message |
          |    Unknown DIN |

  @unit
  Scenario: DIN on file with different cost

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |      90.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |
          |     100.0 |       10.0 |         80.0 | 2345 |
     Then The Claim response will be as follows
          | Reject Message |
          | Different Cost |

  @unit @component
  Scenario: DIN on file with same cost

    Given The Admin application, DIN page is as follows
          |  DIN | Drug Cost |
          | 2345 |     100.0 |
     When The Pharmacy service, Claim request is sent with
          | Drug Cost | Deductible | Co-Insurance |  DIN |
          |     100.0 |       10.0 |         80.0 | 2345 |
     Then The Claim response will be as follows
          | Reject Message |
          |    No Problems |

