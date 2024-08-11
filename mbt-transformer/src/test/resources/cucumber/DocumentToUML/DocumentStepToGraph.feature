@debug
Feature: Document Step To Graph

  Scenario: Convert step keywords

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Submit
          
          === Given The Object page is empty
          ===  When The Object page is empty
          ===  Then The Object page is empty
          ===   But The Object page is empty
          ===   And The Object page is empty
          ===     * The Object page is empty
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                           Edge Name |
          |                         start ->  -> Given The Object page is empty |
          | Given The Object page is empty ->  -> When The Object page is empty |
          |  When The Object page is empty ->  -> Then The Object page is empty |
          |   Then The Object page is empty ->  -> But The Object page is empty |
          |    But The Object page is empty ->  -> And The Object page is empty |
          |      And The Object page is empty ->  -> * The Object page is empty |
          |                               * The Object page is empty ->  -> end |

