Feature: Convert Document

  Scenario: One Section One Vertex One Edge
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/oneSectionOneVertexOneEdge.adoc file is as follows
      """
      = Feature Name
      
      == Scenario One
      
      === Step 1

      """
    When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
    Then The oneSectionOneVertexOneEdge graph file, Vertices section will be as follows
      | Vertex |
      | start  |
      | end    |
      | Step 1 |
    Then The oneSectionOneVertexOneEdge graph file, Edges section will be as follows
      | Edge                |
      | start ->  -> Step 1 |
      | Step 1 ->  -> end   |
