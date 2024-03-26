@debug
Feature: Graph Background To Document

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
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be as follows
          """
          :tags: tag1
          = Process
          
          [background="true"]
          == Preamble
          
          === Given The Search application, Login page is valid

          == Story One
          
          === Then The Search application, Logout page is enabled
          
          == Story Two
          
          === Then The Search application, Logout page is present
          
          """

