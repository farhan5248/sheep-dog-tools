@plugin
Feature: Plug-In Testing

  Scenario: Run a plug-in

    Given The acme-tool plugin, src/test/resources/cucumber/Input.txt file is as follows
          """
          Text
          """
      And The Input.txt file is valid
     When The do-it goal is executed with
          | Parameters |
          |          1 |
     Then The target/Output.txt file will be present
      And The Output.txt file, Results table will be as follows
          | Lines |
          |  Text |

          