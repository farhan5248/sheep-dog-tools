@sheep-dog-dev
Feature: DocumentStepDefinitionToUML

  \@sheep-dog-dev
  TODO add tests for document parameters

  Background: Create a test case

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is created as follows
          
          |===
          | h1
          |===
          """

  Scenario: No statement, one step parameter

      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | 1               | 0 -> h1\|         |

  Scenario: One statement, one step parameter

      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name                                               | Comment     |
          | stepdefs::blah application::Object page::is created as follows | Desc line 1 |

  Scenario Outline: Two statements, two step parameters

      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          Desc line 2
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          
          === Step-Parameters: 2
          
          |===
          | h2
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name                                               | Comment                  |
          | stepdefs::blah application::Object page::is created as follows | Desc line 1\nDesc line 2 |
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | <Index>         | 0 -> h<Index>\|   |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: Three statements, three step parameters

      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Step-Parameters: 1
          
          |===
          | h1
          |===
          
          === Step-Parameters: 2
          
          |===
          | h2
          |===
          
          === Step-Parameters: 3
          
          |===
          | h3
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name                                               | Comment                               |
          | stepdefs::blah application::Object page::is created as follows | Desc line 1\nDesc line 2\nDesc line 3 |
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name                                               | Annotation Name | Annotation Detail |
          | stepdefs::blah application::Object page::is created as follows | <Index>         | 0 -> h<Index>\|   |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

