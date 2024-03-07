Feature: Convert Vertex Or Edge To Message

  Background: Create a graph text file

    Given The mbt-transformer plugin, target/Graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:
          	description:
          		
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
          		Edge
          			label:Story One
          			tag:
          			description:
          				
          			source:
          				Vertex
          					label:The Search application, Home page is empty
          			target:
          				Vertex
          					label:end
          """
    Given The mbt-transformer plugin, target/Graphs/stepdefs/The Search application Home page is empty.graph file is as follows
          """
          Graph
          	name:The Search application, Home page is empty
          	tag:
          	description:
          		
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 ins
          		Vertex
          			label:1 ins
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
          					label:0 ins
          		Edge
          			label:4
          			tag:
          			description:
          				
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:1 ins
          		Edge
          			label:5
          			tag:
          			description:
          				
          			source:
          				Vertex
          					label:1 ins
          			target:
          				Vertex
          					label:end
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
          |          Interaction Name |                                    Message |
          | specs::Process::Story One | The Search application, Home page is empty |
      And The target/uml/pst.uml file, Interaction Lifelines section will be as follows
          |          Interaction Name |       Lifeline Name |                      Lifeline Represents |
          | specs::Process::Story One |                this |                pst::specs::Process::this |
          | specs::Process::Story One | SearchHomePageSteps | pst::specs::Process::SearchHomePageSteps |
      And The target/uml/pst.uml file, Interaction Message Occurences section will be as follows
          |          Interaction Name | Message Occurence |    Lifeline Covered |
          | specs::Process::Story One |         SendEvent |                this |
          | specs::Process::Story One |      ReceiveEvent | SearchHomePageSteps |

  @debug
  Scenario: Convert path element to message annotations

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |          Interaction Name |                                    Message | Argument Name | Annotation Detail |
          | specs::Process::Story One | The Search application, Home page is empty |     dataTable |       0 -> ins \| |
          | specs::Process::Story One | The Search application, Home page is empty |     dataTable |         1 -> 4 \| |
          | specs::Process::Story One | The Search application, Home page is empty |     dataTable |         2 -> 5 \| |

