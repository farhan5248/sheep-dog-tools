@debug
Feature: Document DocString To UML

  Scenario: One line

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.adoc file is as follows
          """
          = Process
          
          == Submit
          
          === Given The Object page is as follows
          
          ----
          text1  
          ----
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is as follows |     docString |        0 -> text1 |

