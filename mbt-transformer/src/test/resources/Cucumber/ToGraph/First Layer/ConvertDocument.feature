Feature: Convert Document

  Scenario: One Section One Vertex One Edge
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
      """
      = Process
      
      == Scenario One
      
      === Step 1

      """
    When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
    Then The Process.graph file, Vertices section will be as follows
      | Vertex Name |
      | start       |
      | end         |
      | Step 1      |
    Then The Process.graph file, Edges section will be as follows
      | Edge Name           |
      | start ->  -> Step 1 |
      | Step 1 ->  -> end   |

  Scenario: One Section Many Vertices One Edge
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
      """
      = Feature Name
      
      == Scenario name
      
      === Step 1
      
      === Step 2

      """
    When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
    Then The Process.graph file, Vertices section will be as follows
      | Vertex Name |
      | start       |
      | end         |
      | Step 1      |
      | Step 2      |
    Then The Process.graph file, Edges section will be as follows
      | Edge Name            |
      | start ->  -> Step 1  |
      | Step 1 ->  -> Step 2 |
      | Step 2 ->  -> end    |

  Scenario: Many Sections One Vertex One Edge
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
      """
      = Feature Name
      
      == Scenario 1
      
      === Step 1
      
      == Scenario 2
      
      === Step 1
      
      """
    When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
    Then The Process.graph file, Vertices section will be as follows
      | Vertex Name |
      | start       |
      | end         |
      | Step 1      |
    Then The Process.graph file, Edges section will be as follows
      | Edge Name           |
      | start ->  -> Step 1 |
      | Step 1 ->  -> end   |
