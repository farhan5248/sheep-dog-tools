@debug
Feature: Document Feature To UML

  Scenario: No tags, no statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is created as follows
          """
          = Process
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Class section will be created as follows
          | Class Name     |
          | specs::Process |

  Scenario: One tag, one statement

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is created as follows
          """
          :tags: tag1
          = Process
          
          Desc line 1
          
          == Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Class Annotations section will be created as follows
          | Class Name     | Annotation Name | Annotation Detail |
          | specs::Process | tags            | tag1              |
      And The target/uml/pst.uml file, Class Comments section will be created as follows
          | Class Name     | Comment     |
          | specs::Process | Desc line 1 |

  Scenario: Two tags, two statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is created as follows
          """
          :tags: tag1,tag2
          = Process
          
          Desc line 1
          Desc line 2
          
          == Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Class Annotations section will be created as follows
          | Class Name     | Annotation Name | Annotation Detail |
          | specs::Process | tags            | tag1              |
          | specs::Process | tags            | tag2              |
      And The target/uml/pst.uml file, Class Comments section will be created as follows
          | Class Name     | Comment                  |
          | specs::Process | Desc line 1\nDesc line 2 |

  Scenario: Three tags, three statements

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is created as follows
          """
          :tags: tag1,tag2,tag3
          = Process
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          == Story One
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Class Annotations section will be created as follows
          | Class Name     | Annotation Name | Annotation Detail |
          | specs::Process | tags            | tag1              |
          | specs::Process | tags            | tag2              |
          | specs::Process | tags            | tag3              |
      And The target/uml/pst.uml file, Class Comments section will be created as follows
          | Class Name     | Comment                               |
          | specs::Process | Desc line 1\nDesc line 2\nDesc line 3 |

