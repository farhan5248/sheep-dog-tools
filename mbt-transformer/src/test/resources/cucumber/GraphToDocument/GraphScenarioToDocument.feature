Feature: Graph Scenario To Document

  @debug
  Scenario: No tags, no statements, one step

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
          			label:Given The blah application, something/Object1 page is empty
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                                                        Step |
          | Submit | Given The blah application, something/Object1 page is empty |

  Scenario: One tag, one statement, one step

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit
          			tag:tag1
          			description:
          				Desc line 1
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The blah application, something/Object1 page is empty
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name | Tags | Description |
          | Submit | tag1 | Desc line 1 |

  Scenario: Two tags, two statements, two steps

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit
          			tag:tag1,tag2
          			description:
          				Desc line 1
          				Desc line 2
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The blah application, something/Object1 page is empty
          		Vertex
          			label:Given The blah application, something/Object2 page is empty
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          			target:
          				Vertex
          					label:Given The blah application, something/Object2 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object2 page is empty
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name |      Tags |              Description |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                                                        Step |
          | Submit | Given The blah application, something/Object1 page is empty |
          | Submit | Given The blah application, something/Object2 page is empty |

  Scenario: Three tags, three statements, three steps

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	paths:
          		Path
          			index:0
          			name:Submit
          			tag:tag1,tag2,tag3
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
          			label:Given The blah application, something/Object1 page is empty
          		Vertex
          			label:Given The blah application, something/Object2 page is empty
          		Vertex
          			label:Given The blah application, something/Object3 page is empty
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object1 page is empty
          			target:
          				Vertex
          					label:Given The blah application, something/Object2 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object2 page is empty
          			target:
          				Vertex
          					label:Given The blah application, something/Object3 page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The blah application, something/Object3 page is empty
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios section will be as follows
          |   Name |           Tags |                           Description |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                                                        Step |
          | Submit | Given The blah application, something/Object1 page is empty |
          | Submit | Given The blah application, something/Object2 page is empty |

          