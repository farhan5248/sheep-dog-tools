@sheep-dog-test
Feature: ValidateWarning

  \@sheep-dog-test

  Scenario: This object doesn't exist validation

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
     When The xtext plugin, validate warning action is performed
     Then The xtext plugin, validate warning dialog will be set as follows
          | Message                                                                                  |
          | daily batchjob/Input file.feature doesn't exist in src/test/resources/asciidoc/stepdefs/ |

  Scenario: This object step definition doesn't exist validation

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is absent            |
     When The xtext plugin, validate warning action is performed
     Then The xtext plugin, validate warning dialog will be set as follows
          | Message                                                       |
          | is present doesn't exist in daily batchjob/Input file.feature |

  Scenario: This object step definition parameter set doesn't exist validation

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 | Headers    |
          | The daily batchjob, Input file is present | New Header |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name | Parameters |
          | daily batchjob/Input file.feature | is present           | Old Header |
     When The xtext plugin, validate warning action is performed
     Then The xtext plugin, validate warning dialog will be set as follows
          | Message                                                                         |
          | \| New Header doesn't exist in daily batchjob/Input file.feature for is present |

  Scenario: This object doesn't exist and there is an alternate

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/app/Input file.asciidoc file is created as follows
          | Object Name                           | Step Definition Name |
          | daily batchjob/app/Input file.feature | is present           |
     When The xtext plugin, validate warning action is performed
     Then The xtext plugin, validate warning dialog will be set as follows
          | Message                                                                                  |
          | daily batchjob/Input file.feature doesn't exist in src/test/resources/asciidoc/stepdefs/ |
      And The xtext plugin, quickfix dialog will be set as follows
          | Message                                       |
          | The daily batchjob, app/Input file is present |

