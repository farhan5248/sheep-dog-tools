@debug
Feature: Code Scenario To UML

  Scenario: No tags, no statements, one step

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
              Given The blah application, something/Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                               |
          | specs::Process::Submit | The blah application, something/Object1 page is empty |

  Scenario: One tag, one statement, one step

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
              Desc line 1
          
              Given The blah application, something/Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag1              |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment     |
          | specs::Process::Submit | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2
            Scenario: Submit
              Desc line 1
              Desc line 2
          
              Given The blah application, something/Object1 page is empty
              Given The blah application, something/Object2 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag<Index>        |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment                  |
          | specs::Process::Submit | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                                     |
          | specs::Process::Submit | The blah application, something/Object<Index> page is empty |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: Three tags, three statements, three steps

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1 @tag2 @tag3
            Scenario: Submit
              Desc line 1
              Desc line 2
              Desc line 3
          
              Given The blah application, something/Object1 page is empty
              Given The blah application, something/Object2 page is empty
              Given The blah application, something/Object3 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction Annotations section will be created as follows
          | Interaction Name       | Annotation Name | Annotation Detail |
          | specs::Process::Submit | tags            | tag<Index>        |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Comments section will be created as follows
          | Interaction Name       | Comment                               |
          | specs::Process::Submit | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, uml/pst.uml file Interaction Messages section will be created as follows
          | Interaction Name       | Message                                                     |
          | specs::Process::Submit | The blah application, something/Object<Index> page is empty |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

  Scenario: Selected tags

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            @tag1
            Scenario: Submit
          
              Given The Object1 page is empty
          
            @tag2
            Scenario: Submit2
          
              Given The Object1 page is empty
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The mbt-transformer plugin, uml/pst.uml file Interaction section will be created as follows
          | Interaction Name       |
          | specs::Process::Submit |
      And The mbt-transformer plugin, uml/pst.uml file Interaction section won't be created as follows
          | Interaction Name        |
          | specs::Process::Submit2 |

