@debug
Feature: Document Scenario Outline To UML

  Scenario: No tags, no statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Submit
          
          === Given The Object page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h3
          | v31
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is as follows |     dataTable |        0 -> h1 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable |      1 -> {h3} \| |
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |      Examples 1 |         0 -> h3\| |
          | specs::Process::Submit |      Examples 1 |        1 -> v31\| |

  Scenario: One tag, one statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag1"]
          == Submit
          
          Desc line 1
          
          === Given The Object page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h3
          | v31
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |            tags |              tag1 |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |     Comment |
          | specs::Process::Submit | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps, two examples

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag1,tag2"]
          == Submit
          
          Desc line 1
          Desc line 2
          
          === Given The Object1 page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          === Given The Object2 page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h3
          | v31
          |===
          
          [examples="true"]
          === Examples 2
          
          [options="header"]
          |===
          | h3
          | v32
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |            tags |        tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                  Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                              Message |
          | specs::Process::Submit | The Object<Index> page is as follows |
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name |  Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples <Index> |         0 -> h3\| |
          | specs::Process::Submit | Examples <Index> |  1 -> v3<Index>\| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: Three tags, three statements, three steps, three examples

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag1,tag2,tag3"]
          == Submit
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Given The Object1 page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          === Given The Object2 page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          === Given The Object3 page is as follows
          
          [options="header"]
          |===
          | h1
          | {h3}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h3
          | v31
          |===
          
          [examples="true"]
          === Examples 2
          
          [options="header"]
          |===
          | h3
          | v32
          |===

          [examples="true"]
          === Examples 3
          
          [options="header"]
          |===
          | h3
          | v33
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |            tags |        tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                               Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                              Message |
          | specs::Process::Submit | The Object<Index> page is as follows |
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name |  Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples <Index> |         0 -> h3\| |
          | specs::Process::Submit | Examples <Index> |  1 -> v3<Index>\| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

