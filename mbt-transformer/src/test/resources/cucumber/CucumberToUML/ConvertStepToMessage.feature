Feature: Convert Step To Message

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
          
              Given The blah application, Given1 page is empty
               When The blah application, When1 page is empty
               Then The blah application, Then1 page is empty
                And The blah application, And1 page is empty
                But The blah application, But1 page is empty
                  * The blah application, Asterisk page is empty
              Given The blah application, DataTable page is as follows
                    | h1 | h2 |
                    | v1 | v2 |
                    | v3 | v4 |
              Given The blah application, DocString page is as follows
                    \"\"\"
                    text1
                       text2
                    \"\"\"
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Convert step keywords

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                      Message |
          | specs::Process::Submit |   The blah application, Given1 page is empty |
          | specs::Process::Submit |    The blah application, When1 page is empty |
          | specs::Process::Submit |    The blah application, Then1 page is empty |
          | specs::Process::Submit |     The blah application, And1 page is empty |
          | specs::Process::Submit |     The blah application, But1 page is empty |
          | specs::Process::Submit | The blah application, Asterisk page is empty |

  Scenario: Convert data table and doc strings

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                            Message | Argument Name |
          | specs::Process::Submit | The blah application, DocString page is as follows |     docString |
          | specs::Process::Submit | The blah application, DataTable page is as follows |     dataTable |

  Scenario: Convert data table rows

    Use annotations to store the multiple rows of data
    Argument values are used for default values like in PL/SQL

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                            Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The blah application, DataTable page is as follows |     dataTable |   0 -> h1 \|h2 \| |
          | specs::Process::Submit | The blah application, DataTable page is as follows |     dataTable |   1 -> v1 \|v2 \| |
          | specs::Process::Submit | The blah application, DataTable page is as follows |     dataTable |   2 -> v3 \|v4 \| |

  Scenario: Convert doc string lines

      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                            Message | Argument Name | Annotation Detail |
          | specs::Process::Submit | The blah application, DocString page is as follows |     docString |        0 -> text1 |
          | specs::Process::Submit | The blah application, DocString page is as follows |     docString |     1 ->    text2 |

