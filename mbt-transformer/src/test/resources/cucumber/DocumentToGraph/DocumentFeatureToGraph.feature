@debug
Feature: Document Feature To Graph

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Graph section will be as follows
          |    Name |
          | Process |

  Scenario: One tag, one statement

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          :tags: tag1
          = Process
          
          Desc line 1
          
          == Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Graph section will be as follows
          |    Name |  Tag | Description |
          | Process | tag1 | Desc line 1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          :tags: tag1,tag2
          = Process
          
          Desc line 1
          Desc line 2
          
          == Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Graph section will be as follows
          |    Name |       Tag |              Description |
          | Process | tag1,tag2 | Desc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          :tags: tag1,tag2,tag3
          = Process
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          == Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Graph section will be as follows
          |    Name |            Tag |                           Description |
          | Process | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |

