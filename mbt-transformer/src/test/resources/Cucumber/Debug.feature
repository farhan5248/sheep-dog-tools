Feature: Temp

  @debug
  Scenario: Generate files
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: Convert Document
      
        @debug
        Scenario: One Section One Vertex One Edge
          Given The mbt-transformer plugin, src/test/resources/AsciiDoc/oneSectionOneVertexOneEdge.adoc file is as follows
            \"\"\"
            Text
            \"\"\"
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
      
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags    |
      | debug |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed
