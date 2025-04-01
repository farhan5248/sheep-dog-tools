@debug
Feature: ProposeStepTable

  Scenario: Invalid step

    Given The spec-prj project, src/test/resources/asciidoc/Process2.asciidoc file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
     When The xtext plugin, propose test step table action is performed
     Then The xtext plugin, propose content dialog will be empty

  Scenario: Valid step but no object

    Given The spec-prj project, src/test/resources/asciidoc/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                            |
          | The daily batchjob, Input file is created as follows |
     When The xtext plugin, propose test step table action is performed
     Then The xtext plugin, propose content dialog will be empty

  Scenario: Valid step has object but no definition

    Given The spec-prj project, src/test/resources/asciidoc/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                            |
          | The daily batchjob, Input file is created as follows |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step table action is performed
     Then The xtext plugin, propose content dialog will be empty

  Scenario: Valid step has object has definition has parameters

    Given The spec-prj project, src/test/resources/asciidoc/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                            |
          | The daily batchjob, Input file is created as follows |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name  | Parameters |
          | daily batchjob/Input file.feature | is created as follows | H1         |
     When The xtext plugin, propose test step table action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion | Suggestion Name |
          | \| H1 \|   | \| H1 \|        |

