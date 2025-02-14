@debug
Feature: Document Step Definition To UML

  TODO add tests for document parameters

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
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | 1               | 0 -> h1\|         |

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
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name                                               | Comment     |
          | stepdefs::blah application::Object page::is created as follows | Desc line 1 |

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
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name                                               | Comment                  |
          | stepdefs::blah application::Object page::is created as follows | Desc line 1\nDesc line 2 |
      And The uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | <Index>         | 0 -> h<Index>\|   |

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
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name                                               | Comment                               |
          | stepdefs::blah application::Object page::is created as follows | Desc line 1\nDesc line 2\nDesc line 3 |
      And The uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | <Index>         | 0 -> h<Index>\|   |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

