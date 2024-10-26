@debug
Feature: Code Feature To UML

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Class section will be created as follows
          | Class Name     |
          | specs::Process |

  Scenario: One tag, one statement

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
            Desc line 1
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Class Annotations section will be created as follows
          | Class Name     | Annotation Name | Annotation Detail |
          | specs::Process | tags            | tag1              |
      And The target/mbt/uml/pst.uml file Class Comments section will be created as follows
          | Class Name     | Comment     |
          | specs::Process | Desc line 1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          @tag1 @tag2
          Feature: Process
            Desc line 1
            Desc line 2
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Class Annotations section will be created as follows
          | Class Name     | Annotation Name | Annotation Detail |
          | specs::Process | tags            | tag1              |
          | specs::Process | tags            | tag2              |
      And The target/mbt/uml/pst.uml file Class Comments section will be created as follows
          | Class Name     | Comment                  |
          | specs::Process | Desc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          @tag1 @tag2 @tag3
          Feature: This is a test feature
            Desc line 1
            Desc line 2
            Desc line 3
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/mbt/uml/pst.uml file will be present
      And The target/mbt/uml/pst.uml file Class Annotations section will be created as follows
          | Class Name     | Annotation Name | Annotation Detail |
          | specs::Process | tags            | tag1              |
          | specs::Process | tags            | tag2              |
          | specs::Process | tags            | tag3              |
      And The target/mbt/uml/pst.uml file Class Comments section will be created as follows
          | Class Name     | Comment                               |
          | specs::Process | Desc line 1\nDesc line 2\nDesc line 3 |

  Scenario: Selected tags

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          @tag1
          Feature: Process
          """
      And The mbt-transformer plugin, src/test/resources/cucumber/app/Process.feature file is created as follows
          """
          @tag2
          Feature: Process
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, target/mbt/tag1/uml/pst.uml file will be present
      And The target/mbt/tag1/uml/pst.uml file Class section will be created as follows
          | Class Name     |
          | specs::Process |
      But The target/mbt/tag1/uml/pst.uml file Class section won't be created as follows
          | Class Name          |
          | specs::app::Process |

