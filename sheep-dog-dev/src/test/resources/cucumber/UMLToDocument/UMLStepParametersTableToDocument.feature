@debug
Feature: UML Step Parameters Table To Document

  Scenario: One cell

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          
          === Parameters: 1
          
          |===
          | h1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file will be present
      And The mbt-transformer plugin, Object1 page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row |
          | is created as follows | 1          | h1  |

  Scenario: Two cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          
          === Parameters: 1
          
          |===
          | h1 | h2
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file will be present
      And The mbt-transformer plugin, Object1 page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row    |
          | is created as follows | 1          | h1, h2 |

  Scenario: Three cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          
          === Parameters: 1
          
          |===
          | h1 | h2 | h3
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object1 page.asciidoc file will be present
      And The mbt-transformer plugin, Object1 page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row        |
          | is created as follows | 1          | h1, h2, h3 |

