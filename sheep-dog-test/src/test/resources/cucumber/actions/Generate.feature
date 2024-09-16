@debug
Feature: Generate

  Scenario: The object doesn't exist

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |

  Scenario: The object step definition doesn't exist

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is absent            |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |

  Scenario: The object step definition parameter set doesn't exist

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 | Headers    |
          | The daily batchjob, Input file is present | New Header |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Definition Name | Parameters |
          | daily batchjob/Input file.feature | is present           | Old Header |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows
          | Object Name                       | Step Definition Name | Parameters |
          | daily batchjob/Input file.feature | is present           | New Header |

