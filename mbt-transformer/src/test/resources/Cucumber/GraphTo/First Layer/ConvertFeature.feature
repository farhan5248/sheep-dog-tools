Feature: Convert Feature

  Scenario: Create a UML file
    Given The mbt-transformer plugin, target/Graphs/Process.txt file is as follows
      """
      Graph
      	name:Process
      	vertices:
      		Vertex
      			label:start
      		Vertex
      			label:end
      		Vertex
      			label:Set Object as follows
      	edges:
      		Edge
      			label:
      			source:
      				Vertex
      					label:start
      			target:
      				Vertex
      					label:Set Object as follows
      			tag:
      			value:
      		Edge
      			label:Scenario One
      			source:
      				Vertex
      					label:Set Object as follows
      			target:
      				Vertex
      					label:end
      			tag:
      			value:
      				
      """
    When The mbt-transformer plugin, graph-to-uml goal is executed
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present
    And The target/uml/pst.uml file, Class section will be as follows
      | Class Name     |
      | specs::Process |
