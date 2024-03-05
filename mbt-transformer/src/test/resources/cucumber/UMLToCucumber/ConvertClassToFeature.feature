Feature: Convert Class To Feature

  Background: Create a graph text file

    Given The mbt-transformer plugin, target/Graphs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1,tag2
          	description:
          		Desc
          		Line 2
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:The Search application, Home page is empty
          	edges:
          		Edge
          			label:
          			tag:
          			description:
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:The Search application, Home page is empty
          			value:
          		Edge
          			label:Story One
          			tag:tag1,tag2
          			description:
          				Desc
          				Line 2
          			source:
          				Vertex
          					label:The Search application, Home page is empty
          			target:
          				Vertex
          					label:end
          			value:
          				Graph
          					name:The Search application, Home page is empty
          					vertices:
          						Vertex
          							label:start
          						Vertex
          							label:end
          						Vertex
          							label:ins
          					edges:
          						Edge
          							label:
          							source:
          								Vertex
          									label:start
          							target:
          								Vertex
          									label:ins
          							tag:
          							value:
          
          						Edge
          							label:5
          							source:
          								Vertex
          									label:ins
          							target:
          								Vertex
          									label:end
          							tag:
          							value:
          								5
          						Edge
          							label:4
          							source:
          								Vertex
          									label:ins
          							target:
          								Vertex
          									label:end
          							tag:
          							value:
          								4
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed

  Scenario: Convert class to feature from graph

     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be as follows
          """
          @tag1 @tag2
          Feature: Process
          
            Desc
            Line 2
          
            @tag1 @tag2
            Scenario: Story One.0
          
              Desc
              Line 2
          
                  * The Search application, Home page is empty
                    | ins |
                    |   5 |
          
            @tag1 @tag2
            Scenario: Story One.1
          
              Desc
              Line 2
          
                  * The Search application, Home page is empty
                    | ins |
                    |   4 |
          
          
          """

