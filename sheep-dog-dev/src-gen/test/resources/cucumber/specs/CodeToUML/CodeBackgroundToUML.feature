@sheep-dog-dev
Feature: CodeBackgroundToUML

  \@sheep-dog-dev

  Scenario: No statement, one step, one scenario

    Given The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                   |
          | specs::Process::Setup  | The Object0 page is valid |
          | specs::Process::Submit | The Object1 page is valid |

  Scenario: One statement, one step, one scenario

    Given The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Background: Setup
              Desc line 1
              Given The Object0 page is valid
          
            Scenario: Submit
               Given The Object1 page is valid
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name      | Comment     |
          | specs::Process::Setup | Desc line 1 |

  Scenario: One statement, one step, two scenarios

    Given The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Background: Setup
              Desc line 1
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name         | Message                   |
          | specs::Process::Setup    | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object1 page is valid |
          | specs::Process::Submit 2 | The Object2 page is valid |

  Scenario: One statement, one step, three scenarios

    Given The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Background: Setup
              Desc line 1
              Given The Object0 page is valid
          
            Scenario: Submit 1
               Given The Object1 page is valid
          
            Scenario: Submit 2
               Given The Object2 page is valid
          
            Scenario: Submit 3
               Given The Object3 page is valid
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name         | Message                   |
          | specs::Process::Setup    | The Object0 page is valid |
          | specs::Process::Submit 1 | The Object1 page is valid |
          | specs::Process::Submit 2 | The Object2 page is valid |
          | specs::Process::Submit 3 | The Object3 page is valid |

  Scenario Outline: No statement, two steps, one scenario

    Given The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                         |
          | specs::Process::Setup  | The Object<Index> page is valid |
          | specs::Process::Submit | The Object page is valid        |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: No statement, three steps, one scenario

    Given The code-prj project, src/test/resources/cucumber/specs/Process.feature file is created as follows
          """
          Feature: Process
          
            Background: Setup
              Given The Object1 page is valid
              Given The Object2 page is valid
              Given The Object3 page is valid
          
            Scenario: Submit
               Given The Object page is valid
          """
     When The maven plugin, cucumber-to-uml goal is executed
     Then The spec-prj project, uml/pst.uml file will be present
      And The spec-prj project, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                         |
          | specs::Process::Setup  | The Object<Index> page is valid |
          | specs::Process::Submit | The Object page is valid        |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

