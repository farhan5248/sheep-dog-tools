@debug
Feature: Convert DocString To Annotation

  Background: Create a graph text file

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:
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
      And The mbt-transformer plugin, target/graphs/stepdefs/Given The DocString page is as follows.graph file is as follows
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
      And The mbt-transformer plugin, target/graphs/resources/Given The DocString page is as follows-0.txt file is as follows
          """
          text1
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Convert doc strings

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                          Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The DocString page is as follows |     docString |        0 -> text1 |

