@debug
Feature: UML Step Definition To Document

  TODO there's no test for no parameters and docstring vs datatable. Other tests implicitly cover docstring as a special parameter with the name content

  Scenario: No statement, one step parameter

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          === Parameters: 1
          
          |===
          | h1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row |
          | is created as follows | 1          | h1  |

  Scenario: One statement, one step parameter

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
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
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Step Definition section will be created as follows
          | Name                  | Description |
          | is created as follows | Desc line 1 |

  Scenario Outline: Two statements, two step parameters

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          Desc line 2
          
          === Parameters: 1
          
          |===
          | h1
          |===
          
          === Parameters: 2
          
          |===
          | h2
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Step Definition section will be created as follows
          | Name                  | Description              |
          | is created as follows | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Object page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row      |
          | is created as follows | <Index>    | h<Index> |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: Three statements, three step parameters

    Given The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Object: Object1 page
          
          == Definition: is created as follows
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Parameters: 1
          
          |===
          | h1
          |===
          
          === Parameters: 2
          
          |===
          | h2
          |===
          
          === Parameters: 3
          
          |===
          | h3
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be present
      And The mbt-transformer plugin, Object page.asciidoc file Step Definition section will be created as follows
          | Name                  | Description                           |
          | is created as follows | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Object page.asciidoc file Step Definition Parameters Table section will be created as follows
          | Name                  | Parameters | Row      |
          | is created as follows | <Index>    | h<Index> |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

