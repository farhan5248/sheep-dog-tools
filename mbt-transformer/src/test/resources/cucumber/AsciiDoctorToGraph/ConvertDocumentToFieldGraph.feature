@debug
Feature: Convert Document To Field Graph

  Scenario: Convert a table with one row

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          * Set Object as follows
          
          [options="header"]
          |===
          |ins |grp |crt
          |5   |10  |15
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/Graphs/stepdefs/Set Object as follows.graph file will be present
      And The Set Object as follows.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |       0 ins |
          |       0 grp |
          |       0 crt |
      And The Set Object as follows.graph file, Edges section will be as follows
          |            Edge Name |
          |   start ->  -> 0 ins |
          |  0 ins -> 5 -> 0 grp |
          | 0 grp -> 10 -> 0 crt |
          |   0 crt -> 15 -> end |

  Scenario: Convert a table with two rows

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          * Set Object as follows
          
          [options="header"]
          |===
          |ins 
          |4   
          |5   
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/Graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/Graphs/stepdefs/Set Object as follows.graph file will be present
      And The Set Object as follows.graph file, Edges section will be as follows
          |           Edge Name |
          |  start ->  -> 0 ins |
          | 0 ins -> 4 -> 1 ins |
          |   1 ins -> 5 -> end |

  Scenario: Convert a table to a vertices each with multiple edges

    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
          """
          = Process
          
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
     Then The mbt-transformer plugin, target/Graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/Graphs/stepdefs/Set Object as follows.graph file will be present
      And The Set Object as follows.graph file, Edges section will be as follows
          |            Edge Name |
          |   start ->  -> 0 ins |
          |  0 ins -> 5 -> 0 grp |
          | 0 grp -> 10 -> 0 crt |
          | 0 crt -> 15 -> 1 ins |
          |  1 ins -> 4 -> 1 grp |
          |  1 grp -> 8 -> 1 crt |
          |   1 crt -> 12 -> end |

