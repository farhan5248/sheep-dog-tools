Feature: Convert Graph To Class

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
          			label:0 crt
          		Vertex
          			label:1 ins
          		Vertex
          			label:1 grp
          		Vertex
          			label:1 crt
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
          					label:0 crt
          		Edge
          			label:15
          			tag:0
          			source:
          				Vertex
          					label:0 crt
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
          					label:1 crt
          		Edge
          			label:12
          			tag:0
          			source:
          				Vertex
          					label:1 crt
          			target:
          				Vertex
          					label:end
          """
     When The mbt-transformer plugin, graph-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Create a class from a graph

      And The target/uml/pst.uml file, Class section will be as follows
          |     Class Name |
          | specs::Process |
      And The target/uml/pst.uml file, Class Comments section will be as follows
          |     Class Name |      Comment |
          | specs::Process | Desc\nLine 2 |
      And The target/uml/pst.uml file, Class Annotations section will be as follows
          |     Class Name | Annotation Name | Annotation Detail |
          | specs::Process |            tags |              tag1 |
          | specs::Process |            tags |              tag2 |

