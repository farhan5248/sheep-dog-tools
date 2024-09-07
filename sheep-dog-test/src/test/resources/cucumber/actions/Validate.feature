Feature: Validate

  Scenario: This object doesn't exist validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message                                                          |
          | This object doesn't exist for: daily batchjob/Input file.feature |

  @debug
  Scenario: This object step definition doesn't exist validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                                |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is absent |
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message                                                                          |
          | This object step definition doesn't exist for: daily batchjob/Input file.feature |

  Scenario: This object step definition parameter set doesn't exist validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 | Headers    |
          | The daily batchjob, Input file is present | New Header |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                                 | Parameters |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present | Old Header |
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message                                                                                        |
          | This object step definition parameter set doesn't exist for: daily batchjob/Input file.feature |

