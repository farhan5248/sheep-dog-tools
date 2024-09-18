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

  Scenario: Object Types

    Given The xtext plugin, src/test/resources/cucumber/Process.feature file steps snippet is created as follows
          | Step Name             |
          | The blah plugin, blah |
     When The suggestion action is performed
     Then The suggestion dialog will be set as follows
          | Suggestion                      | Suggestion Name |
          | The blah plugin, blah file      | blah file       |
          | The blah plugin, blah page      | blah page       |
          | The blah plugin, blah response  | blah response   |
          | The blah plugin, blah dialog    | blah dialog     |
          | The blah plugin, blah directory | blah directory  |
          | The blah plugin, blah request   | blah request    |
          | The blah plugin, blah goal      | blah goal       |
          | The blah plugin, blah job       | blah job        |
          | The blah plugin, blah action    | blah action     |

