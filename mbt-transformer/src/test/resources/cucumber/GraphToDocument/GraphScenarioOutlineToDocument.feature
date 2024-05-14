Feature: Graph Scenario Outline To Document

  @debug
  Scenario: No tags, no statement, one step, one example

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			parameters:h1
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
          			label:v31
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
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                                Step |
          | Submit | Given The Object page is as follows |
      And The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be as follows
          |   Name |   Examples | Row |
          | Submit | Examples 1 |  h1 |
          | Submit | Examples 1 | v31 |

  @debug
  Scenario: One tag, one statement, one step, one example

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			tag:tag1
          			parameters:h1
          			description:
          				Desc line 1
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
          			label:v31
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
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name | Tags | Description |
          | Submit | tag1 | Desc line 1 |

  Scenario: Two tags, two statements, two steps, two examples

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			tag:tag1,tag2
          			parameters:h1
          			description:
          				Desc line 1
          				Desc line 2
          		Path
          			index:1
          			name:Submit/Examples 2/0
          			tag:tag1,tag2
          			parameters:h1
          			description:
          				Desc line 1
          				Desc line 2
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object1 page is as follows
          		Vertex
          			label:Given The Object2 page is as follows
          	edges:
          		Edge
          			label:
          			tag:0,1
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object1 page is as follows
          		Edge
          			label:
          			tag:0,1
          			source:
          				Vertex
          					label:Given The Object1 page is as follows
          			target:
          				Vertex
          					label:Given The Object2 page is as follows
          		Edge
          			label:
          			tag:0,1
          			source:
          				Vertex
          					label:Given The Object2 page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object1 page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object1 page is as follows
          	paths:
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
          			tag:0,1
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v31
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v32
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object2 page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object2 page is as follows
          	paths:
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
          			tag:0,1
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v31
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v32
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name |      Tags |              Description |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                                 Step |
          | Submit | Given The Object1 page is as follows |
          | Submit | Given The Object2 page is as follows |
      And The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be as follows
          |   Name |   Examples | Row |
          | Submit | Examples 1 |  h1 |
          | Submit | Examples 1 | v31 |
          | Submit | Examples 2 |  h1 |
          | Submit | Examples 2 | v32 |

  Scenario: Three tags, three statements, three steps, three examples

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit/Examples 1/0
          			tag:tag1,tag2,tag3
          			parameters:h1
          			description:
          				Desc line 1
          				Desc line 2
          				Desc line 3
          		Path
          			index:1
          			name:Submit/Examples 2/0
          			tag:tag1,tag2,tag3
          			parameters:h1
          			description:
          				Desc line 1
          				Desc line 2
          				Desc line 3
          		Path
          			index:2
          			name:Submit/Examples 3/0
          			tag:tag1,tag2,tag3
          			parameters:h1
          			description:
          				Desc line 1
          				Desc line 2
          				Desc line 3
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Object1 page is as follows
          		Vertex
          			label:Given The Object2 page is as follows
          		Vertex
          			label:Given The Object3 page is as follows
          	edges:
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Object1 page is as follows
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:Given The Object1 page is as follows
          			target:
          				Vertex
          					label:Given The Object2 page is as follows
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:Given The Object2 page is as follows
          			target:
          				Vertex
          					label:Given The Object3 page is as follows
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:Given The Object3 page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object1 page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object1 page is as follows
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
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v31
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v32
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v33
          			tag:2
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object2 page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object2 page is as follows
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
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v31
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v32
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v33
          			tag:2
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The Object3 page is as follows.graph file is as follows
          """
          Graph
          	name:Given The Object3 page is as follows
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
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 h1
          		Edge
          			label:v31
          			tag:0
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v32
          			tag:1
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          		Edge
          			label:v33
          			tag:2
          			source:
          				Vertex
          					label:0 h1
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name |           Tags |                           Description |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                                 Step |
          | Submit | Given The Object1 page is as follows |
          | Submit | Given The Object2 page is as follows |
          | Submit | Given The Object3 page is as follows |
      And The mbt-transformer plugin, Process.adoc file, Scenario Outline Examples Table section will be as follows
          |   Name |   Examples | Row |
          | Submit | Examples 1 |  h1 |
          | Submit | Examples 1 | v31 |
          | Submit | Examples 2 |  h1 |
          | Submit | Examples 2 | v32 |
          | Submit | Examples 2 |  h1 |
          | Submit | Examples 2 | v33 |

