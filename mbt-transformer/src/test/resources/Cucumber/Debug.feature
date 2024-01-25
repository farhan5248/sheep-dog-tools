
Feature: Temp

  @debug
  Scenario: Generate files
    Given The mbt-transformer plugin, src/test/resources/Cucumber/dept/process.feature file is as follows
      """
      Feature: Convert Document
      
        @debug
        Scenario: One Section One Vertex One Edge
          Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
            \"\"\"
            Text
            \"\"\"
          When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
          Then The Process.graph file, Edges Graph Vertices section will be as follows
               | Edge Source Vertex Name                        | Graph Vertex Name |
               | Set Object as follows ->  -> end | start       |
          Then The Process.graph file, Edges Graph Edges section will be as follows
               | Edge Source Vertex Name                        | Graph Edge Name        |
               | Set Object as follows ->  -> end | start ->  -> ins |
      
      """
    When The mbt-transformer plugin, cucumber-to-uml goal is executed with
      | Tags    |
      | debug |
    And The mbt-transformer plugin, uml-to-cucumber goal is executed
