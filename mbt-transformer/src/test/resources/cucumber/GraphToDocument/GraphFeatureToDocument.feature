@debug
Feature: Graph Feature To Document

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Feature section will be as follows
          |    Name |
          | Process |

  Scenario: One tag, one statement

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1
          	description:
          		Desc line 1
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Feature section will be as follows
          |    Name | Tags |
          | Process | tag1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1,tag2
          	description:
          		Desc line 1
          		Desc line 2
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Feature section will be as follows
          |    Name |      Tags |
          | Process | tag1,tag2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, target/graphs/specs/Process.graph file is as follows
          """
          Graph
          	name:Process
          	tag:tag1,tag2,tag3
          	description:
          		Desc line 1
          		Desc line 2
          		Desc line 3
          """
     When The mbt-transformer plugin, graph-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file will be present
      And The mbt-transformer plugin, Process.adoc file, Feature section will be as follows
          |    Name |           Tags |
          | Process | tag1,tag2,tag3 |

