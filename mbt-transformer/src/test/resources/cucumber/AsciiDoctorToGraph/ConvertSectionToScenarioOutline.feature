@debug
Feature: Convert Section To Scenario Outline


  Scenario: Create a feature file from adoc file

    Given The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag3"]
          == Story Two
          
          === When The Search application, Home page is as follows
          
          [options="header"]
          |===
          | grp| ins
          | 8| {ins}
          |===
          
          [examples="true"]
          === Dataset 1
          
          [options="header"]
          |===
          | ins
          | 4
          |===

          [examples="true"]
          === Dataset 2
          
          [options="header"]
          |===
          | ins
          | 5
          | 6
          |===
          
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/app/Process.graph file will be as follows
          """
          Graph
          	name:Process
          	tag:
          	description:
          	paths:
          		Path
          			index:0
          			name:Story Two/Dataset 1/0
          			tag:tag3
          			parameters:ins
          			description:
          		Path
          			index:1
          			name:Story Two/Dataset 2/0
          			tag:tag3
          			parameters:ins
          			description:
          		Path
          			index:2
          			name:Story Two/Dataset 2/1
          			tag:tag3
          			parameters:ins
          			description:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:When The Search application, Home page is as follows
          	edges:
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:When The Search application, Home page is as follows
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:When The Search application, Home page is as follows
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/graphs/stepdefs/When The Search application Home page is as follows.graph file will be as follows
          """
          Graph
          	name:When The Search application, Home page is as follows
          	tag:
          	description:
          	paths:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 grp
          		Vertex
          			label:0 ins
          	edges:
          		Edge
          			label:
          			tag:0,1,2
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 grp
          		Edge
          			label:8
          			tag:0,1,2
          			source:
          				Vertex
          					label:0 grp
          			target:
          				Vertex
          					label:0 ins
          		Edge
          			label:4
          			tag:0
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:end
          		Edge
          			label:5
          			tag:1
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:end
          		Edge
          			label:6
          			tag:2
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:end
          """
