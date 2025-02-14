@debug
Feature: Document StepObject To UML

  I need a test here for selected tags that tests only objects referenced in a selected test case are reversed

  Scenario: No statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class section will be created as follows
          | Class Name                              |
          | stepdefs::blah application::Object page |

  Scenario: One statement

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          Desc line 1
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class Comments section will be created as follows
          | Class Name                              | Comment     |
          | stepdefs::blah application::Object page | Desc line 1 |

  Scenario: Two statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          Desc line 1
          Desc line 2
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class Comments section will be created as follows
          | Class Name                              | Comment                  |
          | stepdefs::blah application::Object page | Desc line 1\nDesc line 2 |

  Scenario: Three statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class Comments section will be created as follows
          | Class Name                              | Comment                               |
          | stepdefs::blah application::Object page | Desc line 1\nDesc line 2\nDesc line 3 |

