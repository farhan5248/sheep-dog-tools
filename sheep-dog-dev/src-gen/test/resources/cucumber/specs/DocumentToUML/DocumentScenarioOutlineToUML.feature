@sheep-dog-dev
Feature: DocumentScenarioOutlineToUML

  \@sheep-dog-dev

  Scenario: No tags, no statement, one step, one example

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The blah application, Object page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Test-Data: Examples 1
          
          |===
          | h3
          | v31
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                                 | Argument Name | Annotation Detail |
          | specs::Process::Submit | The blah application, Object page is created as follows | dataTable     | 0 -> h1 \|        |
          | specs::Process::Submit | The blah application, Object page is created as follows | dataTable     | 1 -> <h3> \|      |
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h3\|         |
          | specs::Process::Submit | Examples 1      | 1 -> v31\|        |

  Scenario: One tag, one statement, one step, one example

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          @tag1
          Desc line 1
          
          === Given: The blah application, Object page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Test-Data: Examples 1
          
          |===
          | h3
          | v31
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag1              |
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment            |
          | specs::Process::Submit | @tag1\nDesc line 1 |

  Scenario Outline: Two tags, two statements, two steps, two examples

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          @tag1 @tag2
          Desc line 1
          Desc line 2
          
          === Given: The blah application, Object1 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Given: The blah application, Object2 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Test-Data: Examples 1
          
          |===
          | h3
          | v31
          |===
          
          === Test-Data: Examples 2
          
          |===
          | h3
          | v32
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag<Index>        |
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment                               |
          | specs::Process::Submit | @tag1 @tag2\nDesc line 1\nDesc line 2 |
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                                        |
          | specs::Process::Submit | The blah application, Object<Index> page is created as follows |
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name  | Annotation Detail |
          | specs::Process::Submit | Examples <Index> | 0 -> h3\|         |
          | specs::Process::Submit | Examples <Index> | 1 -> v3<Index>\|  |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: Three tags, three statements, three steps, three examples

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          @tag1 @tag2 @tag3
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Given: The blah application, Object1 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Given: The blah application, Object2 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Given: The blah application, Object3 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Test-Data: Examples 1
          
          |===
          | h3
          | v31
          |===
          
          === Test-Data: Examples 2
          
          |===
          | h3
          | v32
          |===
          
          === Test-Data: Examples 3
          
          |===
          | h3
          | v33
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag<Index>        |
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment                                                  |
          | specs::Process::Submit | @tag1 @tag2 @tag3\nDesc line 1\nDesc line 2\nDesc line 3 |
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                                        |
          | specs::Process::Submit | The blah application, Object<Index> page is created as follows |
      And The spec-prj project, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name  | Annotation Detail |
          | specs::Process::Submit | Examples <Index> | 0 -> h3\|         |
          | specs::Process::Submit | Examples <Index> | 1 -> v3<Index>\|  |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

  Scenario: Selected tags

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          @tag1
          
          === Given: The blah application, Object page is empty
          
          === Test-Data: Examples 1
          
          |===
          | h3
          | v31
          |===
          
          == Test-Case: Submit2
          
          @tag2
          
          === Given: The blah application, Object page is empty
          
          === Test-Data: Examples 1
          
          |===
          | h3
          | v31
          |===
          """
     When The maven plugin, asciidoctor-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction section will be created as follows
          | Interaction Name       |
          | specs::Process::Submit |
      And The spec-prj project, uml/pst.uml file Interaction section won't be created as follows
          | Interaction Name        |
          | specs::Process::Submit2 |

