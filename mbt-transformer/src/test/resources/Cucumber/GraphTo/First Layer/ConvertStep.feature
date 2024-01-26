Feature: Convert Step

  Scenario: Parse Data Tables
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
    Then The mbt-transformer plugin, target/uml/pst.uml file will be present
    And The target/uml/pst.uml file, Interaction Messages section will be as follows
      | Interaction Name           | Message                                    | Argument Name | Annotation Detail |
      | specs::Process::Scenario 0 | The Search application, Home page is empty | dataTable     | 0 -> ins \|       |
      | specs::Process::Scenario 0 | The Search application, Home page is empty | dataTable     | 1 -> 5 \|         |
      | specs::Process::Scenario 0 | The Search application, Home page is empty | dataTable     | 2 -> 4 \|         |
