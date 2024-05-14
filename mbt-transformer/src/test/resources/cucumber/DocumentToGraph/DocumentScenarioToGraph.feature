@debug
Feature: Document Scenario To Graph

  Scenario: No tags, no statements, one step

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Submit
          
          === Given The Object1 page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                    Edge Name |
          | start ->  -> Given The Object1 page is empty |
          |   Given The Object1 page is empty ->  -> end |

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
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |   Name |  Tag | Description |
          | Submit | tag1 | Desc line 1 |

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
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |   Name |       Tag |              Description |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                           start ->  -> Given The Object1 page is empty |
          | Given The Object1 page is empty ->  -> Given The Object2 page is empty |
          |                             Given The Object2 page is empty ->  -> end |

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
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |   Name |            Tag |                           Description |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                           start ->  -> Given The Object1 page is empty |
          | Given The Object1 page is empty ->  -> Given The Object2 page is empty |
          | Given The Object2 page is empty ->  -> Given The Object3 page is empty |
          |                             Given The Object3 page is empty ->  -> end |

