@sheep-dog-dev
Feature: UMLBackgroundToDocument

  \@sheep-dog-dev

  Scenario: One statement, one step, one scenario

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Setup: Setup
          
          Desc line 1
          
          * Given: The Object0 page is valid
          
          == Test-Case: Submit
          
          * Given: The Object page is valid
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background section will be created as follows
          | Name  | Description |
          | Setup | Desc line 1 |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name  | Step                             |
          | Setup | Given: The Object0 page is valid |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name   | Step                            |
          | Submit | Given: The Object page is valid |

  Scenario: No statement, one step, one scenario

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Setup: Setup
          
          * Given: The Object0 page is valid
          
          == Test-Case: Submit
          
          * Given: The Object page is valid
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name  | Step                             |
          | Setup | Given: The Object0 page is valid |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name   | Step                            |
          | Submit | Given: The Object page is valid |

  Scenario: No statement, one step, two scenarios

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Setup: Setup
          
          * Given: The Object0 page is valid
          
          == Test-Case: Submit 1
          
          * Given: The Object page is valid
          
          == Test-Case: Submit 2
          
          * Given: The Object2 page is valid
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name  | Step                             |
          | Setup | Given: The Object0 page is valid |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name     | Step                             |
          | Submit 1 | Given: The Object page is valid  |
          | Submit 2 | Given: The Object2 page is valid |

  Scenario: No statement, one step, three scenarios

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Setup: Setup
          
          * Given: The Object0 page is valid
          
          == Test-Case: Submit 1
          
          * Given: The Object page is valid
          
          == Test-Case: Submit 2
          
          * Given: The Object2 page is valid
          
          == Test-Case: Submit 3
          
          * Given: The Object3 page is valid
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name  | Step                             |
          | Setup | Given: The Object0 page is valid |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name     | Step                             |
          | Submit 1 | Given: The Object page is valid  |
          | Submit 2 | Given: The Object2 page is valid |
          | Submit 3 | Given: The Object3 page is valid |

  Scenario: No statement, two steps, one scenario

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Setup: Setup
          
          * Given: The Object page is valid
          * Given: The Object2 page is valid
          
          == Test-Case: Submit
          
          * Given: The Object page is valid
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name  | Step                             |
          | Setup | Given: The Object page is valid  |
          | Setup | Given: The Object2 page is valid |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name   | Step                            |
          | Submit | Given: The Object page is valid |

  Scenario: No statement, three steps, one scenario

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Setup: Setup
          
          * Given: The Object page is valid
          * Given: The Object2 page is valid
          * Given: The Object3 page is valid
          
          == Test-Case: Submit
          
          * Given: The Object page is valid
          """
     When The maven plugin, asciidoctor-to-uml goal is executed
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is deleted
      And The maven plugin, uml-to-asciidoctor goal is executed
     Then The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file will be present
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Background Steps section will be created as follows
          | Name  | Step                             |
          | Setup | Given: The Object page is valid  |
          | Setup | Given: The Object2 page is valid |
          | Setup | Given: The Object3 page is valid |
      And The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file Scenarios Steps section will be created as follows
          | Name   | Step                            |
          | Submit | Given: The Object page is valid |

