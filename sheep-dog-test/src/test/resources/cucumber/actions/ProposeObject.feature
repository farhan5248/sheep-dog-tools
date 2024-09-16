Feature: Propose Object

  Scenario: No object no component has previous in background

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file background steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The Process.feature file steps snippet is created as follows
          | Step Name |
          | empty     |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: No object no component no previous no component objects

    TODO make this an outline with various steps like "The" or "The batchjob" etc

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name |
          | empty     |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: No object no component no previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name |
          | empty     |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion          | Suggestion Name |
          | The daily batchjob, | daily batchjob  |

  Scenario: No object no component has previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: No object no component has previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion          | Suggestion Name |
          | The Input file      | Input file      |
          | The daily batchjob, | daily batchjob  |

  Scenario: No object has component no previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: No object has component no previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: No object has component has previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob,                       |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: No object has component has previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob,                       |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: Has object no component no previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name      |
          | The Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object no component no previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name      |
          | The Input file |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object no component has previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file                            |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object no component has previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file                            |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component no previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component no previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component has previous no component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob, Input file            |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: Has object has component has previous has component objects

    Add component objects

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob, Input file            |
      And The src-gen-step-defs/daily batchjob file is present
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  @debug
  Scenario: Object description for component object - name + desc

    MOVE to own feature file
    object description for previous object which exists and has doc - name + desc
    object description for previous object which exists and has no doc - name
    object description for previous object which doesn't exist - name

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
      And The src-gen-step-defs/daily batchjob/Input file.feature file is created as follows
          | Object Name                       | Object Description |
          | daily batchjob/Input file.feature | Description        |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                     | Suggestion Name | Suggestion Description                           |
          | The daily batchjob, Input file | Input file      | daily batchjob/Input file.feature\n\nDescription |

