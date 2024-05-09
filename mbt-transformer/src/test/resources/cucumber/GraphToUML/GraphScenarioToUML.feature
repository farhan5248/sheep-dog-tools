@debug
Feature: Graph Scenario To UML

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                               Message |
          | specs::Process::Submit | The blah application, something/Object1 page is empty |

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
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |     Comment |
          | specs::Process::Submit | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps

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
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |     tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                  Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                                     Message |
          | specs::Process::Submit | The blah application, something/Object<Index> page is empty |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: Three tags, three statements, three steps

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
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |     tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                               Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                                     Message |
          | specs::Process::Submit | The blah application, something/Object<Index> page is empty |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

