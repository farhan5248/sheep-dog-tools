@debug
Feature: Propose Predicate

  Scenario: no predicate no definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: no predicate has definition has description

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Definition Name | Step Definition Description |
          | daily batchjob/Input file.feature | is present           | Creates empty file          |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                                | Suggestion Name | Suggestion Description |
          | The daily batchjob, Input file is present | is present      | Creates empty file     |

  Scenario: has predicate no definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: has predicate has definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                                | Suggestion Name |
          | The daily batchjob, Input file is present | is present      |

