@debug
Feature: Document Background To UML

  Scenario: One statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Background: Setup
          
          Desc line 1
          
          === Given: The Object0 page is valid
          
          == Scenario: Submit
          
          === Given: The Object page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name      | Comment     |
          | specs::Process::Setup | Desc line 1 |

  Scenario: No statement, one step, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Background: Setup
          
          === Given: The Object0 page is valid
          
          == Scenario: Submit
          
          === Given: The Object page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object0 page is valid |
          | specs::Process::Submit | The Object page is valid  |

  Scenario: No statement, one step, two scenarios

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Background: Setup
          
          === Given: The Object0 page is valid
          
          == Scenario: Submit 1
          
          === Given: The Object page is valid
          
          == Scenario: Submit 2
          
          === Given: The Object2 page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name         | Message                   |
          | specs::Process::Setup    | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object page is valid  |
          | specs::Process::Submit 2 | The Object2 page is valid |

  Scenario: No statement, one step, three scenarios

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Background: Setup
          
          === Given: The Object0 page is valid
          
          == Scenario: Submit 1
          
          === Given: The Object page is valid
          
          == Scenario: Submit 2
          
          === Given: The Object2 page is valid
          
          == Scenario: Submit 3
          
          === Given: The Object3 page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name         | Message                   |
          | specs::Process::Setup    | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object page is valid  |
          | specs::Process::Submit 2 | The Object2 page is valid |
          | specs::Process::Submit 3 | The Object3 page is valid |

  Scenario: No statement, two steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Background: Setup
          
          === Given: The Object page is valid
          === Given: The Object2 page is valid
          
          == Scenario: Submit
          
          === Given: The Object page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object page is valid  |
          | specs::Process::Setup  | The Object2 page is valid |
          | specs::Process::Submit | The Object page is valid  |

  Scenario: No statement, three steps, one scenario

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Background: Setup
          
          === Given: The Object page is valid
          === Given: The Object2 page is valid
          === Given: The Object3 page is valid
          
          == Scenario: Submit
          
          === Given: The Object page is valid
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object page is valid  |
          | specs::Process::Setup  | The Object2 page is valid |
          | specs::Process::Setup  | The Object3 page is valid |
          | specs::Process::Submit | The Object page is valid  |

