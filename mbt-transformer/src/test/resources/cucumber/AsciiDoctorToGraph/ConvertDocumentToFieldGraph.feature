@debug
Feature: Convert Document To Field Graph

  Scenario: Convert a table to a vertices each with a single edge

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name
          
          == Story One
          
          * Set Object as follows
          
          [options="header"]
          |===
          |ins |grp |crt
          |5   |10  |15
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Edges Graph Vertices section will be as follows
          | Edge Source Vertex Name | Graph Vertex Name |
          |   Set Object as follows |             start |
          |   Set Object as follows |               end |
          |   Set Object as follows |             0 ins |
          |   Set Object as follows |             0 grp |
          |   Set Object as follows |             0 crt |
      And The Process.graph file, Edges Graph Edges section will be as follows
          | Edge Source Vertex Name |      Graph Edge Name |
          |   Set Object as follows |   start ->  -> 0 ins |
          |   Set Object as follows |  0 ins -> 5 -> 0 grp |
          |   Set Object as follows | 0 grp -> 10 -> 0 crt |
          |   Set Object as follows |   0 crt -> 15 -> end |

  Scenario: Convert a table to a vertices each with single and multiple edges

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name
          
          == Story One
          
          * Set Object as follows
          
          [options="header"]
          |===
          |ins |grp |crt
          |5   |10  |15
          |5   |10  |12
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Edges Graph Edges section will be as follows
          | Edge Source Vertex Name |      Graph Edge Name |
          |   Set Object as follows |   start ->  -> 0 ins |
          |   Set Object as follows |  0 ins -> 5 -> 0 grp |
          |   Set Object as follows | 0 grp -> 10 -> 0 crt |
          |   Set Object as follows | 0 crt -> 15 -> 1 ins |
          |   Set Object as follows |  1 ins -> 5 -> 1 grp |
          |   Set Object as follows | 1 grp -> 10 -> 1 crt |
          |   Set Object as follows |   1 crt -> 12 -> end |

  Scenario: Convert a table to a vertices each with multiple edges

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name
          
          == Story One
          
          * Set Object as follows
          
          [options="header"]
          |===
          |ins |grp |crt
          |5   |10  |15
          |4   |8   |12
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Edges Graph Edges section will be as follows
          | Edge Source Vertex Name |      Graph Edge Name |
          |   Set Object as follows |   start ->  -> 0 ins |
          |   Set Object as follows |  0 ins -> 5 -> 0 grp |
          |   Set Object as follows | 0 grp -> 10 -> 0 crt |
          |   Set Object as follows | 0 crt -> 15 -> 1 ins |
          |   Set Object as follows |  1 ins -> 4 -> 1 grp |
          |   Set Object as follows |  1 grp -> 8 -> 1 crt |
          |   Set Object as follows |   1 crt -> 12 -> end |

