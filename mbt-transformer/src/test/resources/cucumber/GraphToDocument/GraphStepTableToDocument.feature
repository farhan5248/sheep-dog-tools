@debug
Feature: Graph Step Table To Document

  Scenario: One row, one cell

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object page is as follows
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object page is as follows
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object page is as follows
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 h1
          		Vertex
          			label:1 h1
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v1
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows
          |   Name |                                Step | Row |
          | Submit | Given The Object page is as follows |  h1 |
          | Submit | Given The Object page is as follows |  v1 |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object page is as follows
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object page is as follows
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object page is as follows
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 h1
          		Vertex
          			label:0 h2
          		Vertex
          			label:1 h1
          		Vertex
          			label:1 h2
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v1
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:0 h2
          		Edge
          			label:v2
          			tag:0
          			source:
          				Vertex
          					label:0 h2
          			target:
          				Vertex
          					label:1 h1
          		Edge
          			label:v3
          			tag:0
          			source:
          				Vertex
          					label:1 h1
          			target:
          				Vertex
          					label:1 h2
          		Edge
          			label:v4
          			tag:0
          			source:
          				Vertex
          					label:1 h2
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows
          |   Name |                                Step |    Row |
          | Submit | Given The Object page is as follows | h1, h2 |
          | Submit | Given The Object page is as follows | v1, v2 |
          | Submit | Given The Object page is as follows | v3, v4 |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object page is as follows
          	edges:
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object page is as follows
          		Edge
          			tag:0
          			source:
          				Vertex
          					label:Given The Object page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object page is as follows
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 h1
          		Vertex
          			label:0 h2
          		Vertex
          			label:0 h3
          		Vertex
          			label:1 h1
          		Vertex
          			label:1 h2
          		Vertex
          			label:1 h3
          		Vertex
          			label:2 h1
          		Vertex
          			label:2 h2
          		Vertex
          			label:2 h3
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v1
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:0 h2
          		Edge
          			label:v2
          			tag:0
          			source:
          				Vertex
          					label:0 h2
          			target:
          				Vertex
          					label:0 h3
          		Edge
          			label:v3
          			tag:0
          			source:
          				Vertex
          					label:0 h3
          			target:
          				Vertex
          					label:1 h1
          		Edge
          			label:v4
          			tag:0
          			source:
          				Vertex
          					label:1 h1
          			target:
          				Vertex
          					label:1 h2
          		Edge
          			label:v5
          			tag:0
          			source:
          				Vertex
          					label:1 h2
          			target:
          				Vertex
          					label:1 h3
          		Edge
          			label:v6
          			tag:0
          			source:
          				Vertex
          					label:1 h3
          			target:
          				Vertex
          					label:2 h1
          		Edge
          			label:v7
          			tag:0
          			source:
          				Vertex
          					label:2 h1
          			target:
          				Vertex
          					label:2 h2
          		Edge
          			label:v8
          			tag:0
          			source:
          				Vertex
          					label:2 h2
          			target:
          				Vertex
          					label:2 h3
          		Edge
          			label:v9
          			tag:0
          			source:
          				Vertex
          					label:2 h3
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Step Table section will be as follows
          |   Name |                                Step |        Row |
          | Submit | Given The Object page is as follows | h1, h2, h3 |
          | Submit | Given The Object page is as follows | v1, v2, v3 |
          | Submit | Given The Object page is as follows | v4, v5, v6 |
          | Submit | Given The Object page is as follows | v7, v8, v9 |

