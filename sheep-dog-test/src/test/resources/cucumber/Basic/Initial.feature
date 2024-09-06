Feature: Process

  Scenario: Generation

    Given The acmetool plugin, src/test/resources/cucumber/Process.feature file, steps snippet is created as follows
          """
          Text
          """
     When The gui action is performed
      And The gui dialog will be set as follows
          | Message |
