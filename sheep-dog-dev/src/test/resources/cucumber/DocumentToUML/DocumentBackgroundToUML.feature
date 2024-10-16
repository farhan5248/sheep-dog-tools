@debug
Feature: Document Background To UML

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          [background="true"]
          == Setup
          
          === Given The Object0 page is valid
          
          == Submit
          
          === Given The Object1 page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object0 page is valid |
          | specs::Process::Submit | The Object1 page is valid |

  Scenario: No statement, two steps, one scenario

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          [background="true"]
          == Setup
          
          === Given The Object1 page is valid
          === Given The Object2 page is valid
          
          == Submit
          
          === Given The Object page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object1 page is valid |
          | specs::Process::Setup  | The Object2 page is valid |
          | specs::Process::Submit | The Object page is valid  |

  Scenario: No statement, three steps, one scenario

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
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
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object1 page is valid |
          | specs::Process::Setup  | The Object2 page is valid |
          | specs::Process::Setup  | The Object3 page is valid |
          | specs::Process::Submit | The Object page is valid  |

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          
          [background="true"]
          == Setup
          
          Desc line 1
          
          === Given The Object0 page is valid
          
          == Submit
          
          === Given The Object1 page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name      | Comment     |
          | specs::Process::Setup | Desc line 1 |

  Scenario: No statement, one step, two scenarios

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
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
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name         | Message                   |
          | specs::Process::Setup    | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object1 page is valid |
          | specs::Process::Submit 2 | The Object2 page is valid |

  Scenario: No statement, one step, three scenarios

    Given The mbt-transformer plugin, target/mbt/resources/asciidoc/Process.adoc file is created as follows
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
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name         | Message                   |
          | specs::Process::Setup    | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object1 page is valid |
          | specs::Process::Submit 2 | The Object2 page is valid |
          | specs::Process::Submit 3 | The Object3 page is valid |

