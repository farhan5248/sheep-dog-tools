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
      | Edge Name               |
      | start -> null -> Step 1 |
      | Step 1 -> null -> end   |

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
      | Edge Name                |
      | start -> null -> Step 1  |
      | Step 1 -> null -> Step 2 |
      | Step 2 -> null -> end    |

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
      | Edge Name               |
      | start -> null -> Step 1 |
      | Step 1 -> null -> end   |

  Scenario: Single Outgoing Edge from All Vertices
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
      """
      = Feature Name
      
      == Scenario One
      
      === Set Object as follows
      
      .Data table expressions
      [options="header"]
      |=============
      |ins |grp |crt
      |5   |10  |15
      |=============
      """
    When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
    Then The Process.graph file, Edges Graph Vertices section will be as follows
      | Edge Source Vertex Name | Graph Vertex Name |
      | Set Object as follows   | start             |
      | Set Object as follows   | end               |
      | Set Object as follows   | ins               |
      | Set Object as follows   | grp               |
      | Set Object as follows   | crt               |
    Then The Process.graph file, Edges Graph Edges section will be as follows
      | Edge Source Vertex Name | Graph Edge Name      |
      | Set Object as follows   | start ->  -> ins |
      | Set Object as follows   | ins -> 5 -> grp      |
      | Set Object as follows   | grp -> 10 -> crt     |
      | Set Object as follows   | crt -> 15 -> end     |

  Scenario: Multiple Outgoing Edges From One Vertex
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
      """
      = Feature Name
      
      == Scenario One
      
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
    Then The Process.graph file, Edges Graph Edges section will be as follows
      | Edge Source Vertex Name | Graph Edge Name  |
      | Set Object as follows   | crt -> 15 -> end |
      | Set Object as follows   | crt -> 12 -> end |

  Scenario: Multiple Outgoing Edges From All Vertex
    Given The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file is as follows
      """
      = Feature Name
      
      == Scenario One
      
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
    Then The Process.graph file, Edges Graph Edges section will be as follows
      | Edge Source Vertex Name | Graph Edge Name      |
      | Set Object as follows   | start ->  -> ins |
      | Set Object as follows   | ins -> 5 -> grp      |
      | Set Object as follows   | grp -> 10 -> crt     |
      | Set Object as follows   | crt -> 15 -> end     |
      | Set Object as follows   | ins -> 4 -> grp      |
      | Set Object as follows   | grp -> 8 -> crt      |
      | Set Object as follows   | crt -> 12 -> end     |
