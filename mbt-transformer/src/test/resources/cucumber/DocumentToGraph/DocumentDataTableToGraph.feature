@debug
Feature: Document Data Table To Graph

  Scenario: Convert a delimited listing block

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          === Given The DocString page is as follows
          
          ----
          Text1  
          ----
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be present
      And The Given The DocString page is as follows.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |     Content |
      And The Given The DocString page is as follows.graph file, Edges section will be as follows
          |                                                      Edge Name |
          |                                           start ->  -> Content |
          | Content -> Given The DocString page is as follows-0.txt -> end |
      And The mbt-transformer plugin, target/graphs/resources/Given The DocString page is as follows-0.txt file will be as follows
          """
          Text1
          """

  Scenario: Convert a table with one row

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          === Given The DocString page is as follows
          
          [options="header"]
          |===
          |ins |grp 
          |5   |10  
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be present
      And The Given The DocString page is as follows.graph file, Vertices section will be as follows
          | Vertex Name |
          |       start |
          |         end |
          |       0 ins |
          |       0 grp |
      And The Given The DocString page is as follows.graph file, Edges section will be as follows
          |           Edge Name |
          |  start ->  -> 0 ins |
          | 0 ins -> 5 -> 0 grp |
          |  0 grp -> 10 -> end |

  Scenario: Convert a table with two rows

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          === Given The DocString page is as follows
          
          [options="header"]
          |===
          |ins 
          |4   
          |5   
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be present
      And The Given The DocString page is as follows.graph file, Edges section will be as follows
          |           Edge Name |
          |  start ->  -> 0 ins |
          | 0 ins -> 4 -> 1 ins |
          |   1 ins -> 5 -> end |

  Scenario: Convert a table with multiple rows and columns

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Story One
          
          === Given The DocString page is as follows
          
          [options="header"]
          |===
          |ins |grp 
          |5   |10  
          |4   |8   
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be present
      And The Given The DocString page is as follows.graph file, Edges section will be as follows
          |            Edge Name |
          |   start ->  -> 0 ins |
          |  0 ins -> 5 -> 0 grp |
          | 0 grp -> 10 -> 1 ins |
          |  1 ins -> 4 -> 1 grp |
          |    1 grp -> 8 -> end |

