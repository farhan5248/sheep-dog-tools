@debug
Feature: UML Step Object To Document

  Scenario: No statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Object section will be created as follows
          | Name         |
          | Object1 page |

  Scenario: One statement

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          Desc line 1
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Object section will be created as follows
          | Name         | Statements  |
          | Object1 page | Desc line 1 |

  Scenario: Two statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          Desc line 1
          Desc line 2
          
          == Definition: is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Object section will be created as follows
          | Name         | Statements               |
          | Object1 page | Desc line 1\nDesc line 2 |

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
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Object section will be created as follows
          | Name         | Statements                            |
          | Object1 page | Desc line 1\nDesc line 2\nDesc line 3 |

