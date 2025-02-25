@debug
Feature: Document Feature To UML

  Scenario: No statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class section will be created as follows
          | Class Name     |
          | specs::Process |

  Scenario: One statement

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          Desc line 1
          
          == Scenario: Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class Comments section will be created as follows
          | Class Name     | Comment     |
          | specs::Process | Desc line 1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          Desc line 1
          Desc line 2
          
          == Scenario: Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class Comments section will be created as follows
          | Class Name     | Comment                  |
          | specs::Process | Desc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          == Scenario: Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, uml/pst.uml file will be present
      And The uml/pst.uml file Class Comments section will be created as follows
          | Class Name     | Comment                               |
          | specs::Process | Desc line 1\nDesc line 2\nDesc line 3 |

