@debug
Feature: Graph Step To Document

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
          			label:When The When page is empty
          		Vertex
          			label:Then The Then page is empty
          		Vertex
          			label:But The But page is empty
          		Vertex
          			label:And The And page is empty
          		Vertex
          			label:* The Asterisk page is empty
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
          					label:When The When page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:When The When page is empty
          			target:
          				Vertex
          					label:Then The Then page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Then The Then page is empty
          			target:
          				Vertex
          					label:But The But page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:But The But page is empty
          			target:
          				Vertex
          					label:And The And page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:And The And page is empty
          			target:
          				Vertex
          					label:* The Asterisk page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:* The Asterisk page is empty
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps section will be as follows
          |   Name |                          Step |
          | Submit | Given The Given page is empty |
          | Submit |   When The When page is empty |
          | Submit |   Then The Then page is empty |
          | Submit |     And The And page is empty |
          | Submit |     But The But page is empty |
          | Submit |  * The Asterisk page is empty |

