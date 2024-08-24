@debug
Feature: Code Scenario Outline To UML

  Scenario: No tags, no statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario Outline: Submit
              Given The Object page is created as follows
                | h1   |
                | <h3> |
          
              Examples: Examples 1
                | h3  |
                | v31 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be created as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is created as follows |     dataTable |        0 -> h1 \| |
          | specs::Process::Submit | The Object page is created as follows |     dataTable |      1 -> <h3> \| |
      And The target/uml/pst.uml file, Interaction Annotations section will be created as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |      Examples 1 |         0 -> h3\| |
          | specs::Process::Submit |      Examples 1 |        1 -> v31\| |

  Scenario: One tag, one statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1
            Scenario Outline: Submit
              Desc line 1
              Given The Object page is created as follows
                | h1   |
                | <h3> |

              @tag1
              Examples: Examples 1
                Desc line 1
                | h3  |
                | v31 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Annotations section will be created as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |            tags |              tag1 |
      And The target/uml/pst.uml file, Interaction Comments section will be created as follows
          |       Interaction Name |     Comment |
          | specs::Process::Submit | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps, two examples

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2
            Scenario Outline: Submit
              Desc line 1
              Desc line 2
              Given The Object1 page is created as follows
                | h1   |
                | <h3> |
              Given The Object2 page is created as follows
                | h1   |
                | <h3> |

              @tag1 @tag2
              Examples: Examples 1
                Desc line 1
                Desc line 2
                | h3  |
                | v31 |

              Examples: Examples 2
                | h3  |
                | v32 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Annotations section will be created as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |            tags |        tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be created as follows
          |       Interaction Name |                  Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The target/uml/pst.uml file, Interaction Messages section will be created as follows
          |       Interaction Name |                              Message |
          | specs::Process::Submit | The Object<Index> page is created as follows |
      And The target/uml/pst.uml file, Interaction Annotations section will be created as follows
          |       Interaction Name |  Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples <Index> |         0 -> h3\| |
          | specs::Process::Submit | Examples <Index> |  1 -> v3<Index>\| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |

  Scenario Outline: Three tags, three statements, three steps, three examples

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2 @tag3
            Scenario Outline: Submit
              Desc line 1
              Desc line 2
              Desc line 3
              Given The Object1 page is created as follows
                | h1   |
                | <h3> |
              Given The Object2 page is created as follows
                | h1   |
                | <h3> |
              Given The Object3 page is created as follows
                | h1   |
                | <h3> |

              Examples: Examples 1
                | h3  |
                | v31 |

              Examples: Examples 2
                | h3  |
                | v32 |

              Examples: Examples 3
                | h3  |
                | v33 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Annotations section will be created as follows
          |       Interaction Name | Annotation Name | Annotation Detail |
          | specs::Process::Submit |            tags |        tag<Index> |
      And The target/uml/pst.uml file, Interaction Comments section will be created as follows
          |       Interaction Name |                               Comment |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The target/uml/pst.uml file, Interaction Messages section will be created as follows
          |       Interaction Name |                              Message |
          | specs::Process::Submit | The Object<Index> page is created as follows |
      And The target/uml/pst.uml file, Interaction Annotations section will be created as follows
          |       Interaction Name |  Annotation Name | Annotation Detail |
          | specs::Process::Submit | Examples <Index> |         0 -> h3\| |
          | specs::Process::Submit | Examples <Index> |  1 -> v3<Index>\| |

    Examples: Indices

          | Index |
          |     1 |
          |     2 |
          |     3 |

