@debug
Feature: Document Examples Table To UML

  Scenario: One row, one cell

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          == Submit
          
          === Given The Object page is created as follows
          
          [options="header"]
          |===
          | h1
          | {h1}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h1
          | v1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h1\|         |
          | specs::Process::Submit | Examples 1      | 1 -> v1\|         |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          == Submit
          
          === Given The Object page is created as follows
          
          [options="header"]
          |===
          | h1 | h2
          | {h1} | {h2}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h1 | h2
          | v1 | v2
          | v3 | v4
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h1\|h2\|     |
          | specs::Process::Submit | Examples 1      | 1 -> v1\|v2\|     |
          | specs::Process::Submit | Examples 1      | 2 -> v3\|v4\|     |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          == Submit
          
          === Given The Object page is created as follows
          
          [options="header"]
          |===
          | h1 | h2 | h3
          | {h1} | {h2} | {h3}
          |===
          
          [examples="true"]
          === Examples 1
          
          [options="header"]
          |===
          | h1 | h2 | h3
          | v1 | v2 | v3
          | v4 | v5 | v6
          | v7 | v8 | v9
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples 1      | 0 -> h1\|h2\|h3\| |
          | specs::Process::Submit | Examples 1      | 1 -> v1\|v2\|v3\| |
          | specs::Process::Submit | Examples 1      | 2 -> v4\|v5\|v6\| |
          | specs::Process::Submit | Examples 1      | 3 -> v7\|v8\|v9\| |

