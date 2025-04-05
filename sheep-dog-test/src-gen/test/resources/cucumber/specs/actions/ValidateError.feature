@sheep-dog-test
Feature: ValidateError

  \@sheep-dog-test

  Scenario: No steps have a component

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                    |
          | The Input file is present    |
          | The Input file is downloaded |
     When The xtext plugin, validate error action is performed as follows
          | Selected Step |
          | 1             |
     Then The xtext plugin, validate error dialog will be set as follows
          | Message                              |
          | The first step must have a component |

  Scenario: First step doesn't have a component

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                    |
          | The Input file is present                    |
          | The daily batchjob, Input file is downloaded |
     When The xtext plugin, validate error action is performed as follows
          | Selected Step |
          | 1             |
     Then The xtext plugin, validate error dialog will be set as follows
          | Message                              |
          | The first step must have a component |

  Scenario: First step does have a component

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file is downloaded              |
     When The xtext plugin, validate error action is performed as follows
          | Selected Step |
          | 1             |
     Then The xtext plugin, validate error dialog will be empty

