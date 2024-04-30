@debug
Feature: Document Scenario Outline To Graph

  Scenario: Create a feature file from adoc file

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [tags="tag3"]
          == Story Two
          
          === When The Search application, Home page is as follows
          
          [options="header"]
          |===
          | grp| ins
          | 8| {ins}
          |===
          
          [examples="true"]
          === Dataset 1
          
          [options="header"]
          |===
          | ins
          | 4
          |===

          [examples="true"]
          === Dataset 2
          
          [options="header"]
          |===
          | ins
          | 5
          | 6
          |===
          
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |                  Name | Index |
          | Story Two/Dataset 1/0 |     0 |
          | Story Two/Dataset 2/0 |     1 |
          | Story Two/Dataset 2/1 |     2 |
      And The Process.graph file, Edges section will be as follows
          |                                                         Edge Name |   Tag |
          | start ->  -> When The Search application, Home page is as follows | 0,1,2 |
          |   When The Search application, Home page is as follows ->  -> end | 0,1,2 |
      And The mbt-transformer plugin, target/graphs/stepdefs/When The Search application Home page is as follows.graph file will be present
      And The When The Search application Home page is as follows.graph file, Edges section will be as follows
          |           Edge Name |   Tag |
          |  start ->  -> 0 grp | 0,1,2 |
          | 0 grp -> 8 -> 0 ins | 0,1,2 |
          |   0 ins -> 4 -> end |     0 |
          |   0 ins -> 5 -> end |     1 |
          |   0 ins -> 6 -> end |     2 |

