@debug 
Feature: Propose Predicate

  Scenario: no component no predicate no definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name      |
          | The Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: no component no predicate has definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name      |
          | The Input file |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                 |
          | daily batchjob/Input file.feature | The Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                | Suggestion Name           |
          | The Input file is present | The Input file is present |

  Scenario: no component has predicate no definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                 |
          | The Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: no component has predicate has definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                 |
          | The Input file is present |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                 |
          | daily batchjob/Input file.feature | The Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                | Suggestion Name           |
          | The Input file is present | The Input file is present |

  Scenario: has component no predicate no definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: has component no predicate has definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                                 |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                                | Suggestion Name                           |
          | The daily batchjob, Input file is present | The daily batchjob, Input file is present |

  Scenario: has component has predicate no definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: has component has predicate has definition

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Step Name                                 |
          | daily batchjob/Input file.feature | The daily batchjob, Input file is present |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                                | Suggestion Name                           |
          | The daily batchjob, Input file is present | The daily batchjob, Input file is present |

