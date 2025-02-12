@debug
Feature: Document Step Table To UML

  Scenario: One row, one cell

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The Object page is created as follows
          
          [options="header"]
          |===
          | h1
          | v1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                               | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 0 -> h1 \|        |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 1 -> v1 \|        |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The Object page is created as follows
          
          [options="header"]
          |===
          | h1 | h2
          | v1 | v2
          | v3 | v4
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                               | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 0 -> h1 \|h2 \|   |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 1 -> v1 \|v2 \|   |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 2 -> v3 \|v4 \|   |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The Object page is created as follows
          
          [options="header"]
          |===
          | h1 | h2 | h3
          | v1 | v2 | v3
          | v4 | v5 | v6
          | v7 | v8 | v9
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                               | Argument Name | Annotation Detail    |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 0 -> h1 \|h2 \|h3 \| |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 1 -> v1 \|v2 \|v3 \| |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 2 -> v4 \|v5 \|v6 \| |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 3 -> v7 \|v8 \|v9 \| |

  Scenario: Escaped cell data

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The Object page is created as follows
          
          [options="header"]
          |===
          | h1
          | \| v1 \|
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                               | Argument Name | Annotation Detail    |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 0 -> h1 \|           |
          | specs::Process::Submit | The Object page is created as follows | dataTable     | 1 -> \\\| v1 \\\| \| |

