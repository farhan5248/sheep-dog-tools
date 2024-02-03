Feature: Convert Feature

  Scenario: Create a feature file
    Given The mbt-transformer plugin, target/Graphs/Process.graph file is as follows
      """
      Graph
      	name:Process
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
      			source:
      				Vertex
      					label:start
      			target:
      				Vertex
      					label:The Search application, Home page is empty
      			tag:
      			value:
      		Edge
      			label:Scenario One
      			source:
      				Vertex
      					label:The Search application, Home page is empty
      			target:
      				Vertex
      					label:end
      			tag:
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
    Then The mbt-transformer plugin, src/test/resources/Cucumber/Process.feature file will be as follows
      """
      Feature: Process
      
        Scenario: Scenario 0
      
              * The Search application, Home page is empty
                | ins |
                |   5 |
      
        Scenario: Scenario 1
      
              * The Search application, Home page is empty
                | ins |
                |   4 |
      
      
      """
