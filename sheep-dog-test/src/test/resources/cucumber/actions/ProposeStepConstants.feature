@debug
Feature: Propose Step Constants

  Scenario: Component Types

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name |
          | The blah  |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion            | Suggestion Name  |
          | The blah application, | blah application |

  Scenario: Object Types

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name             |
          | The blah plugin, blah |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                 | Suggestion Name |
          | The blah plugin, blah file | blah file       |

  Scenario: State Modality Absent

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                  |
          | The blah plugin, blah file |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                    | Suggestion Name |
          | The blah plugin, blah file is | is              |

  Scenario: State Modality Present no attachments

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                             |
          | The blah plugin, blah file is created |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                                 | Suggestion Name |
          | The blah plugin, blah file is created with | with            |

  Scenario: State Modality Present has attachments

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                                  |
          | The blah plugin, blah file is created with |
     When The suggestion action is performed
     Then The suggestion dialog will be empty

  Scenario: State Details

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name                          |
          | The blah plugin, blah file heading |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                                       | Suggestion Name |
          | The blah plugin, blah file heading section       | section      |

