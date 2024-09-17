@debug
Feature: Propose Object Documentation

  Scenario: Documentation for component  - qname

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name |
          | empty     |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Object Description |
          | daily batchjob/Input file.feature | Description        |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion          | Suggestion Name | Suggestion Description |
          | The daily batchjob, | daily batchjob  | daily batchjob         |

  Scenario: Documentation for component object - qname + desc

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Object Description |
          | daily batchjob/Input file.feature | Description        |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                     | Suggestion Name | Suggestion Description            |
          | The daily batchjob, Input file | Input file      | daily batchjob/Input file.feature |

  Scenario: Documentation for previous object which doesn't exist - qname

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name | Suggestion Description                                 |
          | The Input file | Input file      | Referred in: The daily batchjob, Input file is present |

  Scenario: Documentation for previous object which exists and has no doc - qname

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Object Description |
          | daily batchjob/Input file.feature | empty              |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name | Suggestion Description                                 |
          | The Input file | Input file      | Referred in: The daily batchjob, Input file is present |

  Scenario: Documentation for previous object which exists and has doc - qname + desc

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Object Description |
          | daily batchjob/Input file.feature | Description        |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name | Suggestion Description                                 |
          | The Input file | Input file      | Referred in: The daily batchjob, Input file is present |

