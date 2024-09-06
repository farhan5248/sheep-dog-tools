Feature: Validate

  @debug
  Scenario: This object doesn't exist validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message                                                                                                    |
          | This object doesn't exist for: /resource/myproject/src-gen-step-defs/daily%20batchjob/Input%20file.feature |

  Scenario: This object step definition doesn't exist validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/xtext plugin/Input file.feature file is present
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message                                                                                                                    |
          | This object step definition doesn't exist for: /resource/myproject/src-gen-step-defs/daily%20batchjob/Input%20file.feature |

  Scenario: This object step definition parameter set doesn't exist validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/xtext plugin/Input file.feature file is created as follows
          """
          Text
          """
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message                                                                                                                                  |
          | This object step definition parameter set doesn't exist for: /resource/myproject/src-gen-step-defs/daily%20batchjob/Input%20file.feature |

