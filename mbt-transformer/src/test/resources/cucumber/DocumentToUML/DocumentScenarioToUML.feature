@debug
Feature: Document Scenario To UML

  Scenario: No tags, no statements, one step

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Submit
          
          === Given The Object1 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
      And The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                   Message |
          | specs::Process::Submit | The Object1 page is empty |

  Scenario: One tag, one statement, one step

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag1"]
          == Submit
          
          Desc line 1
          
          === Given The Object1 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
      And The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |     Comment |
          | specs::Process::Submit | Desc line 1 |

  Scenario: Two tags, two statements, two steps

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag1,tag2"]
          == Submit
          
          Desc line 1
          Desc line 2
          
          === Given The Object1 page is empty

          === Given The Object2 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
      And The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |
          | specs::Process::Submit |           tag2 |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                  Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                   Message |
          | specs::Process::Submit | The Object1 page is empty |
          | specs::Process::Submit | The Object2 page is empty |

  Scenario: Three tags, three statements, three steps

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag1,tag2,tag3"]
          == Submit
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Given The Object1 page is empty

          === Given The Object2 page is empty
          
          === Given The Object3 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
      And The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |
          | specs::Process::Submit |           tag2 |
          | specs::Process::Submit |           tag3 |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                               Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                   Message |
          | specs::Process::Submit | The Object1 page is empty |
          | specs::Process::Submit | The Object2 page is empty |
          | specs::Process::Submit | The Object3 page is empty |

