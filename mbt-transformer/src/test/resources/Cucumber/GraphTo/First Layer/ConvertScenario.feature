Feature: Convert Scenario

  Background: Create a graph text file
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

  Scenario: Test scenario title
    And The target/uml/pst.uml file, Class Interactions section will be as follows
      | Class Name     | Interaction Name |
      | specs::Process | Scenario 0       |
      | specs::Process | Scenario 1       |

  Scenario: Test scenario step
    And The target/uml/pst.uml file, Class Element Imports section will be as follows
      | Class Name     | Alias               | Imported Element                           |
      | specs::Process | SearchHomePageSteps | pst::stepdefs::search::SearchHomePageSteps |
    And The target/uml/pst.uml file, Class Properties section will be as follows
      | Class Name     | Property Name       | Property Type                              |
      | specs::Process | this                | pst::specs::Process                        |
      | specs::Process | SearchHomePageSteps | pst::stepdefs::search::SearchHomePageSteps |
    And The target/uml/pst.uml file, Interaction Messages section will be as follows
      | Interaction Name           | Message                                    |
      | specs::Process::Scenario 0 | The Search application, Home page is empty |
    And The target/uml/pst.uml file, Interaction Lifelines section will be as follows
      | Interaction Name           | Lifeline Name       | Lifeline Represents                      |
      | specs::Process::Scenario 0 | this                | pst::specs::Process::this                |
      | specs::Process::Scenario 0 | SearchHomePageSteps | pst::specs::Process::SearchHomePageSteps |
    And The target/uml/pst.uml file, Interaction Message Occurences section will be as follows
      | Interaction Name           | Message Occurence | Lifeline Covered    |
      | specs::Process::Scenario 0 | SendEvent         | this                |
      | specs::Process::Scenario 0 | ReceiveEvent      | SearchHomePageSteps |
