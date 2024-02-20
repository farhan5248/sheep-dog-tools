Feature: Convert Document To Object Graph

  Scenario: Convert a section to a vertex each with a single edge

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Process

          == Story One

          === Step 1
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |      Step 1 |
      And The Process.graph file, Edges section will be as follows
          |               Edge Name |
          | start -> null -> Step 1 |
          |   Step 1 -> null -> end |

  Scenario: Convert multiple sections to multiple vertices each with a single edge

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name

          == Story name

          === Step 1

          === Step 2
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |      Step 1 |
          |      Step 2 |
      And The Process.graph file, Edges section will be as follows
          |                Edge Name |
          |  start -> null -> Step 1 |
          | Step 1 -> null -> Step 2 |
          |    Step 2 -> null -> end |

  Scenario: Convert multiple sections to just one vertex and edge

    The goal here is to not have duplicate vertices or edges

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name

          == Story 1

          === Step 1

          == Story 2

          === Step 1
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |      Step 1 |
      And The Process.graph file, Edges section will be as follows
          |               Edge Name |
          | start -> null -> Step 1 |
          |   Step 1 -> null -> end |

