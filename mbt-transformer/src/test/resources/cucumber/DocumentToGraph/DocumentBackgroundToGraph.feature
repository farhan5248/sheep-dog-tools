@debug
Feature: Document Background To Graph

  Scenario: Create a feature file from adoc file

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true",tags="tag3"]
          == Preamble
          
          === Given The Search application, Login page is valid

          == Story One
          
          === Then The Search application, Logout page is enabled
          
          == Story Two
          
          === Then The Search application, Logout page is present
          
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |     Name |        Tag |
          | Preamble | background |
      And The Process.graph file, Paths section will be as follows
          |      Name |
          | Story One |
          | Story Two |
      And The Process.graph file, Edges section will be as follows
          |                                                                                                    Edge Name |
          |                                               start ->  -> Given The Search application, Login page is valid |
          |                                                 Given The Search application, Login page is valid ->  -> end |
          | Given The Search application, Login page is valid ->  -> Then The Search application, Logout page is enabled |
          |                                               Then The Search application, Logout page is enabled ->  -> end |
          | Given The Search application, Login page is valid ->  -> Then The Search application, Logout page is present |
          |                                               Then The Search application, Logout page is present ->  -> end |

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true"]
          == Setup
          
          === Given The Object0 page is valid

          == Submit
          
          === Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                           start ->  -> Given The Object0 page is valid |
          |                             Given The Object0 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object1 page is valid |
          |                             Given The Object1 page is valid ->  -> end |

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true"]
          == Setup

          Desc line 1
          
          === Given The Object0 page is valid

          == Submit
          
          === Given The Object1 page is valid
          
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Paths section will be as follows
          |  Name |        Tag | Description |
          | Setup | background | Desc line 1 |

  Scenario: No statement, one step, two scenarios

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true"]
          == Setup

          === Given The Object0 page is valid

          == Submit 1
          
          === Given The Object1 page is valid
          
          == Submit 2
          
          === Given The Object2 page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          | Given The Object0 page is valid ->  -> Given The Object1 page is valid |
          |                             Given The Object1 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object2 page is valid |
          |                             Given The Object2 page is valid ->  -> end |

  Scenario: No statement, one step, three scenarios

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true"]
          == Setup

          === Given The Object0 page is valid

          == Submit 1
          
          === Given The Object1 page is valid
          
          == Submit 2
          
          === Given The Object2 page is valid

          == Submit 3
          
          === Given The Object3 page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          | Given The Object0 page is valid ->  -> Given The Object1 page is valid |
          |                             Given The Object1 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object2 page is valid |
          |                             Given The Object2 page is valid ->  -> end |
          | Given The Object0 page is valid ->  -> Given The Object3 page is valid |
          |                             Given The Object3 page is valid ->  -> end |

  Scenario: No statement, two steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true"]
          == Setup

          === Given The Object1 page is valid
          === Given The Object2 page is valid

          == Submit
          
          === Given The Object page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                           start ->  -> Given The Object1 page is valid |
          | Given The Object1 page is valid ->  -> Given The Object2 page is valid |
          |                             Given The Object2 page is valid ->  -> end |

  Scenario: No statement, three steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          [background="true"]
          == Setup

          === Given The Object1 page is valid
          === Given The Object2 page is valid
          === Given The Object3 page is valid

          == Submit
          
          === Given The Object page is valid
          """

     When The mbt-transformer plugin, asciidoctor-to-graph goal is executed
     Then The mbt-transformer plugin, target/graphs/specs/Process.graph file will be present
      And The Process.graph file, Edges section will be as follows
          |                                                              Edge Name |
          |                          start ->  -> Given The Object1 page is valid |
          | Given The Object1 page is valid ->  -> Given The Object2 page is valid |
          | Given The Object2 page is valid ->  -> Given The Object3 page is valid |
          |                             Given The Object3 page is valid ->  -> end |

