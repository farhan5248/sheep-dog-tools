Feature: Convert Step

  Background: Create a feature file
    Given The claim project, src/test/cucumber/dept/process.feature file is as follows
      """
      Feature: This is a test feature
      
        @tag1
        Scenario: Submit
      
          Given The blah application, Object page is empty
          Given The blah2 service, Json request is executed with
                | i1 | i2 |
                | v5 | v6 |
          Given The blah2 service, Json request is invalid
          Given The blah application, DataTable page, Top section is as follows
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
    Then The claim project, target/uml/pst.uml file is present

  Scenario: Layer 2 creation
  # Specify what the layer 2 method arguments look like for data tables, doc strings and neither
  # Specify steps without as follows such as empty, valid etc
  # Specify setAttributes with a transition step executed with
    And The target/uml/pst.uml file, Interaction Messages section is as follows
      | Interaction Name             | Message                                      |
      | specs::dept::process::Submit | The blah application, Object page is empty   |


# layer 2 linking
# layer 3 creation
# layer 3 linking
# layer 2 java
# layer 3 java 
