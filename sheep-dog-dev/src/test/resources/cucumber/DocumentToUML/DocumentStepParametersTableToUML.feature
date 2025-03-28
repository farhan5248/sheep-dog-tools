@debug
Feature: Document Step Parameters Table To UML

  Scenario: One cell

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | 1               | 0 -> h1\|         |

  Scenario: Two cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1 | h2
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | 1               | 0 -> h1\|h2\|     |

  Scenario: Three cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1 | h2 | h3
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | 1               | 0 -> h1\|h2\|h3\| |

