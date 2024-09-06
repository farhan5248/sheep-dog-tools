@debug
Feature: Initial

  Scenario: Generation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name |
     When The generation action is performed
     Then The src/test/resources/cucumber/StepObject.feature file will be created as follows
          """
          Step one
          """

  Scenario: Validation

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name |
     When The validation action is performed
     Then The validation dialog will be set as follows
          | Message |

  Scenario: Suggestion

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion Name | Suggestion |

