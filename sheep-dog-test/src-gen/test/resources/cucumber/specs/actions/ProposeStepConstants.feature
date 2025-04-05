@sheep-dog-test
Feature: ProposeStepConstants

  \@sheep-dog-test

  Scenario: Component types

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name |
          | The blah  |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion            | Suggestion Name  |
          | The blah application, | blah application |

  Scenario: Object types

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name             |
          | The blah plugin, blah |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                 | Suggestion Name |
          | The blah plugin, blah file | blah file       |

  Scenario: State modality absent no details

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                  |
          | The blah plugin, blah file |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                         | Suggestion Name | Suggestion Description |
          | The blah plugin, blah file is      | is              | is                     |
          | The blah plugin, blah file details | details name    | Specify section etc    |

  Scenario: State modality absent incomplete details

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                          |
          | The blah plugin, blah file heading |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                                 | Suggestion Name |
          | The blah plugin, blah file heading section | section         |

  Scenario: State modality absent has details

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                  |
          | The blah plugin, blah file heading section |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                                    | Suggestion Name |
          | The blah plugin, blah file heading section is | is              |

  Scenario: State modality present has details

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                     |
          | The blah plugin, blah file heading section is |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                                            | Suggestion Name | Suggestion Description |
          | The blah plugin, blah file heading section is created | attribute name  | Specify created etc    |

  Scenario: State modality present no attribute

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                     |
          | The blah plugin, blah file is |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                            | Suggestion Name | Suggestion Description |
          | The blah plugin, blah file is created | attribute name  | Specify created etc    |

  Scenario: State modality present no attachments

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                             |
          | The blah plugin, blah file is created |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be set as follows
          | Suggestion                                 | Suggestion Name |
          | The blah plugin, blah file is created with | with            |

  Scenario: State modality present has attachments

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process2.asciidoc file steps snippet is created as follows
          | Step Name                                  |
          | The blah plugin, blah file is created with |
     When The xtext plugin, propose test step action is performed
     Then The xtext plugin, propose content dialog will be empty

