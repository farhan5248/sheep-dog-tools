@debug
Feature: Propose Object

  Scenario: No object no component no previous no components

    TODO make this an outline with various steps like "The" or "The batchjob" etc

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name |
          | empty     |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: No object no component no previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name |
          | empty     |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion          | Suggestion Name     |
          | The daily batchjob, | The daily batchjob, |

  Scenario: No object no component has previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | The Input file  |

  Scenario: No object no component has previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion          | Suggestion Name     |
          | The daily batchjob, | The daily batchjob, |
          | The Input file      | The Input file      |

  Scenario: No object has component no previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: No object has component no previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: No object has component has previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob,                       |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | The Input file  |

  Scenario: No object has component has previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob,                       |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | The Input file  |

  Scenario: Has object no component no previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name      |
          | The Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object no component no previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name      |
          | The Input file |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object no component has previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file                            |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object no component has previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file                            |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component no previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component no previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component has previous no components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob, Input file            |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component has previous has components

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob, Input file            |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

