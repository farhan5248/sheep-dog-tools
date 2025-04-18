@sheep-dog-test
Feature: ProposeObject

  \@sheep-dog-test

  Scenario: No object no component has previous in background

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file background steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name |
          | empty     |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: No object no component no previous no component objects

    TODO make this an outline with various steps like "The" or "The batchjob" etc

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name |
          | empty     |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be empty

  Scenario: No object no component no previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name |
          | empty     |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion          | Suggestion Name |
          | The daily batchjob, | daily batchjob  |

  Scenario: No object no component has previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: No object no component has previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | empty                                     |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion          | Suggestion Name |
          | The Input file      | Input file      |
          | The daily batchjob, | daily batchjob  |

  Scenario: No object has component no previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be empty

  Scenario: No object has component no previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name           |
          | The daily batchjob, |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                     | Suggestion Name |
          | The daily batchjob, Input file | Input file      |

  Scenario: No object has component has previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob,                       |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: No object has component has previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob,                       |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion     | Suggestion Name |
          | The Input file | Input file      |

  Scenario: Has object no component no previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name      |
          | The Input file |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion        | Suggestion Name |
          | The Input file is | is              |

  Scenario: Has object no component no previous has component objects

    TODO the assertion should be that is present won't be suggested because this step has no component

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name      |
          | The Input file |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion        | Suggestion Name |
          | The Input file is | is              |

  Scenario: Has object no component has previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file                            |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion        | Suggestion Name |
          | The Input file is | is              |

  Scenario: Has object no component has previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The Input file                            |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                | Suggestion Name |
          | The Input file is present | is present      |

  Scenario: Has object has component no previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                        | Suggestion Name |
          | The daily batchjob, Input file is | is              |

  Scenario: Has object has component no previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                      |
          | The daily batchjob, Input file |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                                | Suggestion Name |
          | The daily batchjob, Input file is present | is present      |

  Scenario: Has object has component has previous no component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob, Input file            |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                        | Suggestion Name |
          | The daily batchjob, Input file is | is              |

  Scenario: Has object has component has previous has component objects

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                 |
          | The daily batchjob, Input file is present |
          | The daily batchjob, Input file            |
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/daily batchjob/Input file.asciidoc file is created as follows
          | Object Name                       | Step Definition Name |
          | daily batchjob/Input file.feature | is present           |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                                | Suggestion Name |
          | The daily batchjob, Input file is present | is present      |

