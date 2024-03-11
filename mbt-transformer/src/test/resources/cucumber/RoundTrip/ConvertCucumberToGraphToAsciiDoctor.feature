@debug
Feature: Convert Cucumber To Graph To AsciiDoctor

  TODO make test for the specific mappings

  Scenario: Create an adoc file from feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          @tag1
          Feature: Process
          
            Desc 1
          
            @tag2
            Scenario: Story One
          
              Desc 2
          
                  Given The Search application, Login page is valid
                  When The Search application, Home page is as follows
                    | grp | ins |
                    |  10 |   5 |
                  Then The Search application, Logout page is valid
          
            @tag3
            Scenario: Story Two
          
              Desc 3
          
                  Given The Search application, Login page is invalid
                  When The Search application, Home page is as follows
                    | grp | ins |
                    |   8 |   4 |
                  Then The Search application, Logout page is invalid
          
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
      And The mbt-transformer plugin, uml-to-graph goal is executed
      And The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, target/Graphs/specs/Process.graph file will be as follows
          """
          Graph
          	name:Process
          	tag:tag1
          	description:
          		Desc 1
          	paths:
          		Path
          			index:0
          			name:Story One
          			tag:tag2
          			description:
          				Desc 2
          		Path
          			index:1
          			name:Story Two
          			tag:tag3
          			description:
          				Desc 3
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:Given The Search application, Login page is valid
          		Vertex
          			label:When The Search application, Home page is as follows
          		Vertex
          			label:Then The Search application, Logout page is valid
          		Vertex
          			label:Given The Search application, Login page is invalid
          		Vertex
          			label:Then The Search application, Logout page is invalid
          	edges:
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Search application, Login page is valid
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Given The Search application, Login page is valid
          			target:
          				Vertex
          					label:When The Search application, Home page is as follows
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:When The Search application, Home page is as follows
          			target:
          				Vertex
          					label:Then The Search application, Logout page is valid
          		Edge
          			label:
          			tag:0
          			source:
          				Vertex
          					label:Then The Search application, Logout page is valid
          			target:
          				Vertex
          					label:end
          		Edge
          			label:
          			tag:1
          			source:
          				Vertex
          					label:start
          			target:
          				Vertex
          					label:Given The Search application, Login page is invalid
          		Edge
          			label:
          			tag:1
          			source:
          				Vertex
          					label:Given The Search application, Login page is invalid
          			target:
          				Vertex
          					label:When The Search application, Home page is as follows
          		Edge
          			label:
          			tag:1
          			source:
          				Vertex
          					label:When The Search application, Home page is as follows
          			target:
          				Vertex
          					label:Then The Search application, Logout page is invalid
          		Edge
          			label:
          			tag:1
          			source:
          				Vertex
          					label:Then The Search application, Logout page is invalid
          			target:
          				Vertex
          					label:end
          """
      And The mbt-transformer plugin, target/Graphs/stepdefs/When The Search application Home page is as follows.graph file will be as follows
          """
          Graph
          	name:When The Search application, Home page is as follows
          	tag:
          	description:
          		
          	paths:
          	vertices:
          		Vertex
          			label:start
          		Vertex
          			label:end
          		Vertex
          			label:0 grp
          		Vertex
          			label:0 ins
          	edges:
          		Edge
          			label:
          			tag:0,1
          			source:
          				Vertex
          					label:start
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
          					label:0 ins
          		Edge
          			label:5
          			tag:0
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:end
          		Edge
          			label:8
          			tag:1
          			source:
          				Vertex
          					label:0 grp
          			target:
          				Vertex
          					label:0 ins
          		Edge
          			label:4
          			tag:1
          			source:
          				Vertex
          					label:0 ins
          			target:
          				Vertex
          					label:end
          """
     Then The mbt-transformer plugin, src/test/resources/AsciiDoc/Process.adoc file will be as follows
          """
          :tags: tag1
          = Process
          
          Desc 1
          
          [tags="tag2"]
          == Story One
          
          Desc 2
          
          * Given The Search application, Login page is valid
          * When The Search application, Home page is as follows
          
          [options="header"]
          |===
          | grp| ins
          | 10| 5
          |===
          
          * Then The Search application, Logout page is valid
          
          [tags="tag3"]
          == Story Two
          
          Desc 3
          
          * Given The Search application, Login page is invalid
          * When The Search application, Home page is as follows
          
          [options="header"]
          |===
          | grp| ins
          | 8| 4
          |===
          
          * Then The Search application, Logout page is invalid
          
          """

      