@debug
Feature: Graph Scenario Outline To UML

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is as follows |     dataTable |        0 -> h1 \| |
          | specs::Process::Submit | The Object page is as follows |     dataTable |      1 -> <h1> \| |
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |      Examples 1 |         0 -> h1\| |
          | specs::Process::Submit |      Examples 1 |        1 -> v31\| |

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |     Comment |
          | specs::Process::Submit | Desc line 1 |


  Scenario Outline: Two tags, two statements, two steps, two examples

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |     tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                  Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                              Message |
          | specs::Process::Submit | The Object<Index> page is as follows |
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name |  Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples <Index> |         0 -> h1\| |
          | specs::Process::Submit | Examples <Index> |  1 -> v3<Index>\| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: Three tags, three statements, three steps, three examples

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |     tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |                               Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                              Message |
          | specs::Process::Submit | The Object<Index> page is as follows |
      And The target/uml/pst.uml file, Interaction Annotations section will be as follows
          |       Interaction Name |  Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples <Index> |         0 -> h1\| |
          | specs::Process::Submit | Examples <Index> |  1 -> v3<Index>\| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

