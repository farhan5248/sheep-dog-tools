@debug
Feature: Document To Document

  Scenario: Create an adoc file from adoc file

    Given The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          Desc 1
          
          [tags="tag2"]
          == Test-Case: Story One
          
          Desc 2
          
          === Given: The blah application, Object page is valid
          
          === Then: The blah application, Object page is created as follows
          
          ----
            text1
          
            text2
          ----
          
          [tags="tag3"]
          == Test-Case: Story Two
          
          Desc 3
          
          === Given: The blah application, Object page is invalid
          
          === When: The blah application, Object page is created as follows
          
          |===
          | grp | ins
          | 8 | {ins}
          |===
          
          === Test-Data: Some data
          
          |===
          | ins
          | 4
          |===
          
          === Test-Data: Dataset 2
          
          |===
          | ins
          | 5
          | 6
          |===
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is valid
          
          == Step-Definition: is invalid
          
          == Step-Definition: is created as follows
          
          === Step-Parameters: 1
          
          |===
          | grp | ins
          |===
          
          === Step-Parameters: 2
          
          |===
          | Content
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/app/Process.asciidoc file will be created as follows
          """
          = Test-Suite: Process
          
          Desc 1
          
          [tags="tag2"]
          == Test-Case: Story One
          
          Desc 2
          
          === Given: The blah application, Object page is valid
          
          === Then: The blah application, Object page is created as follows
          
          ----
            text1
          
            text2
          ----
          
          [tags="tag3"]
          == Test-Case: Story Two
          
          Desc 3
          
          === Given: The blah application, Object page is invalid
          
          === When: The blah application, Object page is created as follows
          
          |===
          | grp | ins  
          | 8   | {ins}
          |===
          
          === Test-Data: Some data
          
          |===
          | ins
          | 4  
          |===
          
          === Test-Data: Dataset 2
          
          |===
          | ins
          | 5  
          | 6  
          |===
          """
      And The mbt-transformer plugin, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file will be created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is created as follows
          
          === Step-Parameters: 1
          
          |===
          | grp | ins
          |===
          
          === Step-Parameters: 2
          
          |===
          | Content
          |===
          
          == Step-Definition: is invalid
          
          == Step-Definition: is valid
          """

