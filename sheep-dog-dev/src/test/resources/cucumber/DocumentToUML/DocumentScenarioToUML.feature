@debug
Feature: Document Scenario To UML

  Scenario: No tags, no statements, one step

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                    |
          | specs::Process::Submit | The blah application, Object page is empty |

  Scenario: One tag, one statement, one step

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          [tags="tag1"]
          == Test-Case: Submit
          
          Desc line 1
          
          === Given: The blah application, Object page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag1              |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment     |
          | specs::Process::Submit | Desc line 1 |

  Scenario: Two tags, two statements, two steps

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          [tags="tag1,tag2"]
          == Test-Case: Submit
          
          Desc line 1
          Desc line 2
          
          === Given: The blah application, Object page is empty
          
          === Given: The blah application, Object2 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag1              |
          | specs::Process::Submit | tags            | tag2              |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment                  |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                     |
          | specs::Process::Submit | The blah application, Object page is empty  |
          | specs::Process::Submit | The blah application, Object2 page is empty |

  Scenario: Three tags, three statements, three steps

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          [tags="tag1,tag2,tag3"]
          == Test-Case: Submit
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Given: The blah application, Object page is empty
          
          === Given: The blah application, Object2 page is empty
          
          === Given: The blah application, Object3 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag1              |
          | specs::Process::Submit | tags            | tag2              |
          | specs::Process::Submit | tags            | tag3              |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment                               |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                     |
          | specs::Process::Submit | The blah application, Object page is empty  |
          | specs::Process::Submit | The blah application, Object2 page is empty |
          | specs::Process::Submit | The blah application, Object3 page is empty |

  Scenario: Selected tags

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          [tags="tag1"]
          == Test-Case: Submit
          
          === Given: The blah application, Object page is empty
          
          [tags="tag2"]
          == Test-Case: Submit2
          
          === Given: The blah application, Object page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction section will be created as follows
          | Interaction Name       |
          | specs::Process::Submit |
      And The mbt-transformer plugin, uml/pst.uml file Interaction section won't be created as follows
          | Interaction Name        |
          | specs::Process::Submit2 |

