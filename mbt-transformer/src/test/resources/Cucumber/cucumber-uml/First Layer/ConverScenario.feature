Feature: Convert Scenario

  @convert-cucumber-umlpst @debug
  Scenario: Convert Scenario

    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
	      """
	      Feature: This is a test feature
	      
	        @tag1
	        Scenario: Submit a claim
	          Basic EDI claim
	      
	          Given The blah application, something/Object page is valid
	
	      """
     When The mbt-transformer plugin, cucumber-to-uml goal is executed with
          | Tags |
          | tag1 |
     Then The claim project, target/uml/pst.uml file is present
      And The target/uml/pst.uml file, Class Comments section is as follows
          |                  Class Name |                                                             Comment |
          | interactions::dept::process | This is the description\nThis is the second line of the description |

    And The pst::Logical::interactions::department::businessprocess Class, Interaction section is as follows
      | Name           |
      | Submit a claim |
    And The pst::Logical::interactions::department::businessprocess::Submit a claim Parameter section is as follows
      | Name      | Direction |
      | tag1 | in        |
    And The pst::Logical::interactions::department::businessprocess::Submit a claim Comments section is as follows
      | Body               |
      | Basic EDI claim |

      # Add a test for the step contents
     And The pst::Logical::interactions::department::businessprocess Class, Element Import section is as follows
      | Notes | Alias      | Imported Element                           |
      |       | blahObject | pst::Logical::subsystems::blah::blahObject |
    And The pst::Logical::interactions::department::businessprocess Class, Property section is as follows
      | Name       | Type                                                    |
      | this       | pst::Logical::interactions::dept::process |
      | blahObject | pst::Logical::subsystems::blah::something::blahObject   |
