@debug
Feature: UML DocString To Graph

  Scenario: Convert doc strings

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1
          Feature: Process
          
            Scenario: Submit
          
              Given The DocString page is as follows
                    \"\"\"
                    text1
                    \"\"\"
          
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be as follows
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
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file will be as follows
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
      And The mbt-transformer plugin, target/graphs/resources/Given The DocString page is as follows-0.txt file will be as follows
          """
          text1
          """

