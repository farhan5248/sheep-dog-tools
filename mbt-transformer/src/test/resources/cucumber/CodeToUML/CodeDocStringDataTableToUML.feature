@debug
Feature: Convert Step To Message

  Scenario: Convert data table rows

    Use annotations to store the multiple rows of data
    Argument values are used for default values like in PL/SQL

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                         Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The blah application, Object page is as follows |     dataTable |   0 -> h1 \|h2 \| |
          | specs::Process::Submit | The blah application, Object page is as follows |     dataTable |   1 -> v1 \|v2 \| |
          | specs::Process::Submit | The blah application, Object page is as follows |     dataTable |   2 -> v3 \|v4 \| |

  Scenario: Convert doc string lines

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: Process
          
            Scenario: Submit
          
              Given The blah application, Object page is as follows
                    \"\"\"
                    text1
                       text2
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                         Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The blah application, Object page is as follows |     docString |        0 -> text1 |
          | specs::Process::Submit | The blah application, Object page is as follows |     docString |     1 ->    text2 |

