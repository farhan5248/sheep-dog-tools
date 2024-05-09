@debug
Feature: Graph Step Table To UML

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is as follows |     dataTable |        0 -> h1 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable |        1 -> v1 \| |

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is as follows |     dataTable |   0 -> h1 \|h2 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable |   1 -> v1 \|v2 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable |   2 -> v3 \|v4 \| |

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                       Message | Argument Name |    Annotation Detail |
          | specs::Process::Submit | The Object page is as follows |     dataTable | 0 -> h1 \|h2 \|h3 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable | 1 -> v1 \|v2 \|v3 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable | 2 -> v4 \|v5 \|v6 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable | 3 -> v7 \|v8 \|v9 \| |

