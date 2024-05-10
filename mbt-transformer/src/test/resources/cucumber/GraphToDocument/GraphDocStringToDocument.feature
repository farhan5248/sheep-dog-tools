@debug
Feature: Graph DocString To Document

  Scenario: One line

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
          	tag:
          	description:
          	paths:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Content
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Content
          		Edge
          			label:Given The Object page is as follows-0.txt
          			tag:0
          			source:
          				Vertex
          					label:Content
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/resources/Given The Object page is as follows-0.txt file is as follows
          """
          text1
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Scenarios Steps Doc String section will be as follows
          |   Name |                                Step | Content |
          | Submit | Given The Object page is as follows |   text1 |

