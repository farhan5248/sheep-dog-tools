@debug
Feature: Graph DocString To Document

  Scenario: Create an adoc file from feature file

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1
          	description:
          	paths:
          		Path
          			index:0
          			name:Submit
          			tag:
          			parameters:
          			description:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The DocString page is as follows
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The DocString page is as follows
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The DocString page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file is as follows
          """
          Graph
          	name:Given The DocString page is as follows
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
          			label:Given The DocString page is as follows-0.txt
          			tag:0
          			source:
          				Vertex
          					label:Content
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/resources/Given The DocString page is as follows-0.txt file is as follows
          """
          text1
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be as follows
          """
          :tags: tag1
          = Process
          
          == Submit
          
          === Given The DocString page is as follows
          
          ----
          text1
          ----
          
          """

