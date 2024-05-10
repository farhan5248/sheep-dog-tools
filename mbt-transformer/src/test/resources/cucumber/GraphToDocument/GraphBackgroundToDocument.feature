@debug
Feature: Graph Background To Document

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Setup
          			tag:background
          		Path
          			index:1
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object0 page is valid
          		Vertex
          			label:Given The Object1 page is valid
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object0 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object1 page is valid
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object1 page is valid
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is valid |

  Scenario: No statement, two steps, one scenario

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Setup
          			tag:background
          		Path
          			index:1
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object1 page is valid
          		Vertex
          			label:Given The Object2 page is valid
          		Vertex
          			label:Given The Object page is valid
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object1 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object1 page is valid
          			target:
          				Vertex
          					label:Given The Object2 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object2 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object2 page is valid
          			target:
          				Vertex
          					label:Given The Object page is valid
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object page is valid
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object1 page is valid |
          | Setup | Given The Object2 page is valid |

  Scenario: No statement, three steps, one scenario

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Setup
          			tag:background
          		Path
          			index:1
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object1 page is valid
          		Vertex
          			label:Given The Object2 page is valid
          		Vertex
          			label:Given The Object3 page is valid
          		Vertex
          			label:Given The Object page is valid
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object1 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object1 page is valid
          			target:
          				Vertex
          					label:Given The Object2 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object2 page is valid
          			target:
          				Vertex
          					label:Given The Object3 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object3 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object3 page is valid
          			target:
          				Vertex
          					label:Given The Object page is valid
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object page is valid
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object1 page is valid |
          | Setup | Given The Object2 page is valid |
          | Setup | Given The Object3 page is valid |

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Setup
          			tag:background
          			description:
          				Desc line 1
          		Path
          			index:1
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object0 page is valid
          		Vertex
          			label:Given The Object1 page is valid
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object0 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object1 page is valid
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object1 page is valid
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
#      And The mbt-transformer plugin, Process.adoc file, Background  section will be as follows
#          |  Name | Description |
#          | Setup | Desc line 1 |
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                            Step |
          | Submit | Given The Object1 page is valid |

  Scenario: One statement, one step, two scenarios

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Setup
          			tag:background
          		Path
          			index:1
          			name:Submit 1
          		Path
          			index:2
          			name:Submit 2
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object0 page is valid
          		Vertex
          			label:Given The Object1 page is valid
          		Vertex
          			label:Given The Object2 page is valid
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object0 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object1 page is valid
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object1 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:2
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object2 page is valid
          		Edge
          			tag:2
          			source:
          				Vertex
          					label:Given The Object2 page is valid
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
#      And The mbt-transformer plugin, Process.adoc file, Background  section will be as follows
#          |  Name | Description |
#          | Setup | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |     Name |                            Step |
          | Submit 1 | Given The Object1 page is valid |
          | Submit 2 | Given The Object2 page is valid |

  Scenario: One statement, one step, three scenarios

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Setup
          			tag:background
          		Path
          			index:1
          			name:Submit 1
          		Path
          			index:2
          			name:Submit 2
          		Path
          			index:3
          			name:Submit 3
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object0 page is valid
          		Vertex
          			label:Given The Object1 page is valid
          		Vertex
          			label:Given The Object2 page is valid
          		Vertex
          			label:Given The Object3 page is valid
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object0 page is valid
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object1 page is valid
          		Edge
          			tag:1
          			source:
          				Vertex
          					label:Given The Object1 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:2
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object2 page is valid
          		Edge
          			tag:2
          			source:
          				Vertex
          					label:Given The Object2 page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			tag:3
          			source:
          				Vertex
          					label:Given The Object0 page is valid
          			target:
          				Vertex
          					label:Given The Object3 page is valid
          		Edge
          			tag:3
          			source:
          				Vertex
          					label:Given The Object3 page is valid
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
#      And The mbt-transformer plugin, Process.adoc file, Background  section will be as follows
#          |  Name | Description |
#          | Setup | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Process.adoc file, Background Steps section will be as follows
          |  Name |                            Step |
          | Setup | Given The Object0 page is valid |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |     Name |                            Step |
          | Submit 1 | Given The Object1 page is valid |
          | Submit 2 | Given The Object2 page is valid |
          | Submit 3 | Given The Object3 page is valid |

