@debug
Feature: Generate

  Scenario: This object doesn't exist creation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows
          | Object Name                       | Step Name                                 |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present |

  Scenario: This object step definition doesn't exist creation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                                |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is absent |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows
          | Object Name                       | Step Name                                 |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present |

  Scenario: This object step definition parameter set doesn't exist creation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 | Headers    |
          | The daily batchjob, Input file is present | New Header |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                                 | Parameters |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present | Old Header |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/Input file.feature file will be created as follows
          | Object Name                       | Step Name                                 | Parameters |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present | New Header |

