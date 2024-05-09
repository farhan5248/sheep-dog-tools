@debug
Feature: Graph Step To UML

  Scenario: Convert step keywords

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
          			label:Given The Given page is empty
          		Vertex
          			label:Given The When page is empty
          		Vertex
          			label:Given The Then page is empty
          		Vertex
          			label:Given The But page is empty
          		Vertex
          			label:Given The And page is empty
          		Vertex
          			label:Given The Asterisk page is empty
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Given page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The Given page is empty
          			target:
          				Vertex
          					label:Given The When page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The When page is empty
          			target:
          				Vertex
          					label:Given The Then page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The Then page is empty
          			target:
          				Vertex
          					label:Given The But page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The But page is empty
          			target:
          				Vertex
          					label:Given The And page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The And page is empty
          			target:
          				Vertex
          					label:Given The Asterisk page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The Asterisk page is empty
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                    Message |
          | specs::Process::Submit |    The Given page is empty |
          | specs::Process::Submit |     The When page is empty |
          | specs::Process::Submit |     The Then page is empty |
          | specs::Process::Submit |      The And page is empty |
          | specs::Process::Submit |      The But page is empty |
          | specs::Process::Submit | The Asterisk page is empty |

