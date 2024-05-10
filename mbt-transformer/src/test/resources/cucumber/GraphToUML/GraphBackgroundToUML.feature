@debug
Feature: Graph Background To UML

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                   Message |
          |  specs::Process::Setup | The Object0 page is valid |
          | specs::Process::Submit | The Object1 page is valid |

  Scenario Outline: No statement, two steps, one scenario

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                         Message |
          |  specs::Process::Setup | The Object<Index> page is valid |
          | specs::Process::Submit |        The Object page is valid |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: No statement, three steps, one scenario

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                         Message |
          |  specs::Process::Setup | The Object<Index> page is valid |
          | specs::Process::Submit |        The Object page is valid |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |      Interaction Name |     Comment |
          | specs::Process::Setup | Desc line 1 |

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |         Interaction Name |                   Message |
          |    specs::Process::Setup | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object1 page is valid |
          | specs::Process::Submit 2 | The Object2 page is valid |

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
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |         Interaction Name |                   Message |
          |    specs::Process::Setup | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object1 page is valid |
          | specs::Process::Submit 2 | The Object2 page is valid |
          | specs::Process::Submit 3 | The Object3 page is valid |

