Feature: Graph Examples Table To Document

  @debug
  Scenario: One row, one cell

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			tag:
          			parameters:h1
          			description:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object page is as follows
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object page is as follows
          		Edge
          			label:
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
      And The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be as follows
          |   Name |   Examples | Row |
          | Submit | Examples 1 |  h1 |
          | Submit | Examples 1 |  v1 |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			tag:
          			parameters:h1,h2
          			description:
          		Path
          			index:1
          			name:Submit/Examples 1/1
          			tag:
          			parameters:h1,h2
          			description:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object page is as follows
          	edges:
          		Edge
          			label:
          			tag:0,1
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object page is as follows
          		Edge
          			label:
          			tag:0,1
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
          	edges:
          		Edge
          			label:
          			tag:0,1
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
          					label:end
          		Edge
          			label:v3
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:0 h2
          		Edge
          			label:v4
          			tag:1
          			source:
          				Vertex
          					label:0 h2
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be as follows
          |   Name |   Examples |    Row |
          | Submit | Examples 1 | h1, h2 |
          | Submit | Examples 1 | v1, v2 |
          | Submit | Examples 1 | v3, v4 |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			tag:
          			parameters:h1,h2,h3
          			description:
          		Path
          			index:1
          			name:Submit/Examples 1/1
          			tag:
          			parameters:h1,h2,h3
          			description:
          		Path
          			index:2
          			name:Submit/Examples 1/2
          			tag:
          			parameters:h1,h2,h3
          			description:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object page is as follows
          	edges:
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object page is as follows
          		Edge
          			label:
          			tag:0,1,2
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
          	edges:
          		Edge
          			label:
          			tag:0,1,2
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
          					label:end
          		Edge
          			label:v4
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:0 h2
          		Edge
          			label:v5
          			tag:1
          			source:
          				Vertex
          					label:0 h2
          			target:
          				Vertex
          					label:0 h3
          		Edge
          			label:v6
          			tag:1
          			source:
          				Vertex
          					label:0 h3
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v7
          			tag:2
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:0 h2
          		Edge
          			label:v8
          			tag:2
          			source:
          				Vertex
          					label:0 h2
          			target:
          				Vertex
          					label:0 h3
          		Edge
          			label:v9
          			tag:2
          			source:
          				Vertex
          					label:0 h3
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be as follows
          |   Name |   Examples |        Row |
          | Submit | Examples 1 | h1, h2, h3 |
          | Submit | Examples 1 | v1, v2, v3 |
          | Submit | Examples 1 | v4, v5, v6 |
          | Submit | Examples 1 | v7, v8, v9 |

          