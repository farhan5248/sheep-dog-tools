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
          | The blah service,     | blah service     |
          | The blah plugin,      | blah plugin      |
          | The blah batchjob,    | blah batchjob    |
