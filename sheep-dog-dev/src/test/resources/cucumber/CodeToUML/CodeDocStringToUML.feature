@debug
Feature: Convert Doc String To UML

  Scenario: One line

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is created as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The Object page is created as follows
                    \"\"\"
                    text1
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be created as follows
          |       Interaction Name |                       Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The Object page is created as follows |     docString |        0 -> text1 |
