@debug
Feature: Graph Background To UML

  Background: Create a graph text file

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:
          	description:
          	paths:
          		Path
          			index:0
          			name:Preamble
          			tag:background
          			parameters:
          			description:
          		Path
          			index:1
          			name:Story One
          			tag:
          			parameters:
          			description:
          		Path
          			index:2
          			name:Story Two
          			tag:
          			parameters:
          			description:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Search application, Login page is valid
          		Vertex
          			label:Then The Search application, Logout page is enabled
          		Vertex
          			label:Then The Search application, Logout page is present
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Search application, Login page is valid
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The Search application, Login page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			label:
          			tag:1
          			source:
          				Vertex
          					label:Given The Search application, Login page is valid
          			target:
          				Vertex
          					label:Then The Search application, Logout page is enabled
          		Edge
          			label:
          			tag:1
          			source:
          				Vertex
          					label:Then The Search application, Logout page is enabled
          			target:
          				Vertex
          					label:end
          		Edge
          			label:
          			tag:2
          			source:
          				Vertex
          					label:Given The Search application, Login page is valid
          			target:
          				Vertex
          					label:Then The Search application, Logout page is present
          		Edge
          			label:
          			tag:2
          			source:
          				Vertex
          					label:Then The Search application, Logout page is present
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Convert path element to interaction messages

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |          Interaction Name |                                        Message |
          |  specs::Process::Preamble |    The Search application, Login page is valid |
          | specs::Process::Story One | The Search application, Logout page is enabled |
          | specs::Process::Story Two | The Search application, Logout page is present |

          