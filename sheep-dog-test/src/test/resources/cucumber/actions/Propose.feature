@debug
Feature: Propose

  Scenario: Suggestion

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          | Step Name |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion Name | Suggestion |

