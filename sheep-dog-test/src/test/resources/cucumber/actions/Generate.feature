Feature: Generate

  @debug
  Scenario: This object doesn't exist creation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The generation action is performed
     Then The src-gen-step-defs/daily batchjob/InputFile.feature file will be created as follows
          """
          Step one
          """

  Scenario: This object step definition doesn't exist creation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/xtext plugin/Input file.feature file is present
     When The generation action is performed
     Then The src/test/resources/cucumber/InputFile.feature file will be created as follows
          """
          Step one
          """

  Scenario: This object step definition parameter set doesn't exist creation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/xtext plugin/Input file.feature file is created as follows
          """
          Text
          """
     When The generation action is performed
     Then The src/test/resources/cucumber/InputFile.feature file will be created as follows
          """
          Step one
          """

