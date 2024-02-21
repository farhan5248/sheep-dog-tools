Feature: Convert Scenario To Interaction

  Background: Create a feature file

    Given The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file is as follows
          """
          Feature: This is a test feature
          
            @tag1
            Scenario: Submit
              Basic EDI claim
          
              Given The blah application, something/Object page is empty
          
          """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The mbt-transformer plugin, target/uml/pst.uml file will be present

  Scenario: Convert scenario title

      And The target/uml/pst.uml file, Class Interactions section will be as follows
          |     Class Name | Interaction Name |
          | specs::Process |           Submit |

  Scenario: Convert scenario tags

      And The target/uml/pst.uml file, Interaction Parameters section will be as follows
          |       Interaction Name | Parameter Name |
          | specs::Process::Submit |           tag1 |

  Scenario: Convert scenario description

      And The target/uml/pst.uml file, Interaction Comments section will be as follows
          |       Interaction Name |         Comment |
          | specs::Process::Submit | Basic EDI claim |

  Scenario: Convert scenario step

      And The target/uml/pst.uml file, Class Element Imports section will be as follows
          |     Class Name |                         Imported Element |
          | specs::Process | pst::stepdefs::blah::BlahObjectPageSteps |
      And The target/uml/pst.uml file, Class Properties section will be as follows
          |     Class Name |       Property Name |                            Property Type |
          | specs::Process |                this |                      pst::specs::Process |
          | specs::Process | BlahObjectPageSteps | pst::stepdefs::blah::BlahObjectPageSteps |
      And The target/uml/pst.uml file, Interaction Messages section will be as follows
          |       Interaction Name |                                              Message |
          | specs::Process::Submit | The blah application, something/Object page is empty |
      And The target/uml/pst.uml file, Interaction Lifelines section will be as follows
          |       Interaction Name |       Lifeline Name |                      Lifeline Represents |
          | specs::Process::Submit |                this |                pst::specs::Process::this |
          | specs::Process::Submit | BlahObjectPageSteps | pst::specs::Process::BlahObjectPageSteps |
      And The target/uml/pst.uml file, Interaction Message Occurences section will be as follows
          |       Interaction Name | Message Occurence |    Lifeline Covered |
          | specs::Process::Submit |         SendEvent |                this |
          | specs::Process::Submit |      ReceiveEvent | BlahObjectPageSteps |

