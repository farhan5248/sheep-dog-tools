Feature: Convert Vertex Or Edge To Message

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
          			label:Scenario One
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
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Convert path element to class imports

      And The target/uml/pst.uml file, Class Element Imports section will be as follows
          |     Class Name |                           Imported Element |
          | specs::Process | pst::stepdefs::search::SearchHomePageSteps |

  Scenario: Convert path element to class attributes

      And The target/uml/pst.uml file, Class Properties section will be as follows
          |     Class Name |       Property Name |                              Property Type |
          | specs::Process |                this |                        pst::specs::Process |
          | specs::Process | SearchHomePageSteps | pst::stepdefs::search::SearchHomePageSteps |

  Scenario: Convert path element to interaction messages

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |               Interaction Name |                                    Message |
          | specs::Process::Scenario One.0 | The Search application, Home page is empty |
      And The target/uml/pst.uml file, Interaction Lifelines section will be as follows
          |               Interaction Name |       Lifeline Name |                      Lifeline Represents |
          | specs::Process::Scenario One.0 |                this |                pst::specs::Process::this |
          | specs::Process::Scenario One.0 | SearchHomePageSteps | pst::specs::Process::SearchHomePageSteps |
      And The target/uml/pst.uml file, Interaction Message Occurences section will be as follows
          |               Interaction Name | Message Occurence |    Lifeline Covered |
          | specs::Process::Scenario One.0 |         SendEvent |                this |
          | specs::Process::Scenario One.0 |      ReceiveEvent | SearchHomePageSteps |

  Scenario: Convert path element to message annotations

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |               Interaction Name |                                    Message | Argument Name | Annotation Detail |
          | specs::Process::Scenario One.0 | The Search application, Home page is empty |     dataTable |       0 -> ins \| |
          | specs::Process::Scenario One.0 | The Search application, Home page is empty |     dataTable |         1 -> 5 \| |
          | specs::Process::Scenario One.1 | The Search application, Home page is empty |     dataTable |       0 -> ins \| |
          | specs::Process::Scenario One.1 | The Search application, Home page is empty |     dataTable |         1 -> 4 \| |

