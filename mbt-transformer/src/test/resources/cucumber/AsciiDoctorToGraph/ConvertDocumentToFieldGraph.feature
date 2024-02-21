Feature: Convert Document To Field Graph

  Scenario: Convert a table to a vertices each with a single edge

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name
          
          == Story One
          
          === Set Object as follows
          
          .Data table expressions
          [options="header"]
          |=============
          |ins |grp |crt
          |5   |10  |15
          |=============
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Edges Graph Vertices section will be as follows
          | Edge Source Vertex Name | Graph Vertex Name |
          |   Set Object as follows |             start |
          |   Set Object as follows |               end |
          |   Set Object as follows |               ins |
          |   Set Object as follows |               grp |
          |   Set Object as follows |               crt |
      And The Process.graph file, Edges Graph Edges section will be as follows
          | Edge Source Vertex Name |  Graph Edge Name |
          |   Set Object as follows | start ->  -> ins |
          |   Set Object as follows |  ins -> 5 -> grp |
          |   Set Object as follows | grp -> 10 -> crt |
          |   Set Object as follows | crt -> 15 -> end |

  Scenario: Convert a table to a vertices each with single and multiple edges

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name
          
          == Story One
          
          === Set Object as follows
          
          .Data table expressions
          [options="header"]
          |=============
          |ins |grp |crt
          |5   |10  |15
          |5   |10  |12
          |=============
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Edges Graph Edges section will be as follows
          | Edge Source Vertex Name |  Graph Edge Name |
          |   Set Object as follows | crt -> 15 -> end |
          |   Set Object as follows | crt -> 12 -> end |

  Scenario: Convert a table to a vertices each with multiple edges

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Feature Name
          
          == Story One
          
          === Set Object as follows
          
          .Data table expressions
          [options="header"]
          |=============
          |ins |grp |crt
          |5   |10  |15
          |4   |8   |12
          |=============
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/Process.graph file will be present
      And The Process.graph file, Edges Graph Edges section will be as follows
          | Edge Source Vertex Name |  Graph Edge Name |
          |   Set Object as follows | start ->  -> ins |
          |   Set Object as follows |  ins -> 5 -> grp |
          |   Set Object as follows | grp -> 10 -> crt |
          |   Set Object as follows | crt -> 15 -> end |
          |   Set Object as follows |  ins -> 4 -> grp |
          |   Set Object as follows |  grp -> 8 -> crt |
          |   Set Object as follows | crt -> 12 -> end |

