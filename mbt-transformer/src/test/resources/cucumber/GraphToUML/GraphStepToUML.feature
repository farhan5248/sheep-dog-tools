@debug
Feature: Graph Step To UML

  Background: Create a graph text file

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1,tag2
          	description:
          		Desc
          		Line 2
          	paths:
          		Path
          			index:0
          			name:Story One
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
          			label:Given The Search application, Home page is empty
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Search application, Home page is empty
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The Search application, Home page is empty
          			target:
          				Vertex
          					label:end
          """
    Given The mbt-transformer plugin, target/graphs/stepdefs/Given The Search application Home page is empty.graph file is as follows
          """
          Graph
          	name:Given The Search application, Home page is empty
          	tag:
          	description:
          		
          	paths:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 ins
          		Vertex
          			label:0 grp
          		Vertex
          			label:1 ins
          		Vertex
          			label:1 grp
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:0 ins
          		Edge
          			label:5
          			tag:0
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:0 grp
          		Edge
          			label:10
          			tag:0
          			source:
          				Vertex
          					label:0 grp
          			target:
          				Vertex
          					label:1 ins
          		Edge
          			label:4
          			tag:0
          			source:
          				Vertex
          					label:1 ins
          			target:
          				Vertex
          					label:1 grp
          		Edge
          			label:8
          			tag:0
          			source:
          				Vertex
          					label:1 grp
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

  Scenario: Convert path element to message annotations

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |          Interaction Name |                                    Message | Argument Name | Annotation Detail |
          | specs::Process::Story One | The Search application, Home page is empty |     dataTable | 0 -> grp \|ins \| |
          | specs::Process::Story One | The Search application, Home page is empty |     dataTable |    1 -> 10 \|5 \| |
          | specs::Process::Story One | The Search application, Home page is empty |     dataTable |     2 -> 8 \|4 \| |

