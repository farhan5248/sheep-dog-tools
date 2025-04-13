@sheep-dog-dev
Feature: UMLStepDefinitionToCode

  \@sheep-dog-dev

  Background: Create model

    Given The spec-prj project, src/test/resources/asciidoc/specs/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          * Given: The blah application, Object page is empty
          
          * Given: The blah application, Object page Top section will be created as follows
          +
          |===
          | h1
          | v1
          |===
          
          * Given: The blah application, Object page Top section won't be created as follows
          +
          |===
          | h1
          | v1
          |===
          
          * Given: The blah application, Object page is created as follows
          
          ----
          text1
          ----
          """
      And The spec-prj project, src/test/resources/asciidoc/stepdefs/blah application/Object page.asciidoc file is created as follows
          """
          = Step-Object: Object page
          
          == Step-Definition: is empty
          
          == Step-Definition: Top section will be created as follows
          
          * Step-Parameters: 1
          +
          |===
          | h1
          |===
          
          == Step-Definition: Top section won't be created as follows
          
          * Step-Parameters: 1
          +
          |===
          | h1
          |===
          
          == Step-Definition: is created as follows
          
          * Step-Parameters: 1
          +
          |===
          | Content
          |===
          """
      And The maven plugin, asciidoctor-to-uml goal is executed

  Scenario: Layer 2 without parameters without DI

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Import                        |
          | org.farhan.common.BlahFactory |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                         | Annotation                                             | Visibility | Return Type |
          | theBlahApplicationObjectPageIsEmpty | @Given("^The blah application, Object page is empty$") | public     | void        |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                         | Statement                                               |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setComponent("blah");     |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setPath("Object");        |
          | theBlahApplicationObjectPageIsEmpty | BlahFactory.get("ObjectPage").setInputOutputs("Empty"); |

  Scenario: Layer 2 with datatable without DI

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Import                          |
          | io.cucumber.datatable.DataTable |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                                                  | Parameter Name | Parameter Type |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | dataTable      | DataTable      |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                                                  | Statement                                                                  |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | BlahFactory.get("ObjectPage").setComponent("blah");                        |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | BlahFactory.get("ObjectPage").setPath("Object");                           |
          | theBlahApplicationObjectPageTopSectionWillBeCreatedAsFollows | BlahFactory.get("ObjectPage").assertInputOutputs(dataTable, "TopSection"); |

  Scenario: Layer 2 with datatable, negative without DI

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                                                  | Statement                                                                        |
          | theBlahApplicationObjectPageTopSectionWontBeCreatedAsFollows | BlahFactory.get("ObjectPage").setComponent("blah");                              |
          | theBlahApplicationObjectPageTopSectionWontBeCreatedAsFollows | BlahFactory.get("ObjectPage").setPath("Object");                                 |
          | theBlahApplicationObjectPageTopSectionWontBeCreatedAsFollows | BlahFactory.get("ObjectPage").assertInputOutputs(dataTable, "TopSection", true); |

  Scenario: Layer 2 with docstring without DI

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                                    | Parameter Name | Parameter Type |
          | theBlahApplicationObjectPageIsCreatedAsFollows | docString      | String         |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                                    | Statement                                                            |
          | theBlahApplicationObjectPageIsCreatedAsFollows | BlahFactory.get("ObjectPage").setComponent("blah");                  |
          | theBlahApplicationObjectPageIsCreatedAsFollows | BlahFactory.get("ObjectPage").setPath("Object");                     |
          | theBlahApplicationObjectPageIsCreatedAsFollows | BlahFactory.get("ObjectPage").setInputOutputs("Content", docString); |

  Scenario: Layer 3

     When The maven plugin, uml-to-cucumber goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/objects/blah/ObjectPage.java file Methods section will be created as follows
          | Method Name              | Visibility | Return Type | Parameter Name | Parameter Type         |
          | setEmpty                 | public     | void        | keyMap         | HashMap<String,String> |
          | assertTopSectionNegative | public     | void        | keyMap         | HashMap<String,String> |
          | assertTopSectionH1       | public     | void        | keyMap         | HashMap<String,String> |
          | setContent               | public     | void        | keyMap         | HashMap<String,String> |

  Scenario: Layer 2 without parameters with spring

     When The maven plugin, uml-to-cucumber-spring goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Import                             |
          | org.farhan.common.TestSteps        |
          | org.farhan.objects.blah.ObjectPage |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Extends   |
          | TestSteps |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Constructor Name    | Statement      |
          | BlahObjectPageSteps | super(object); |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                         | Statement                        |
          | theBlahApplicationObjectPageIsEmpty | object.setComponent("blah");     |
          | theBlahApplicationObjectPageIsEmpty | object.setPath("Object");        |
          | theBlahApplicationObjectPageIsEmpty | object.setInputOutputs("Empty"); |

  Scenario: Layer 2 without parameters with guice

     When The maven plugin, uml-to-cucumber-guice goal is executed
     Then The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file will be present
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Import                           |
          | com.google.inject.Inject         |
          | io.cucumber.guice.ScenarioScoped |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Class Annotation |
          | ScenarioScoped   |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Header section will be created as follows
          | Constructor Name    | Constructor Annotation |
          | BlahObjectPageSteps | Inject                 |
      And The code-prj project, src-gen/test/java/org/farhan/stepdefs/blah/BlahObjectPageSteps.java file Methods section will be created as follows
          | Method Name                         | Statement                        |
          | theBlahApplicationObjectPageIsEmpty | object.setComponent("blah");     |
          | theBlahApplicationObjectPageIsEmpty | object.setPath("Object");        |
          | theBlahApplicationObjectPageIsEmpty | object.setInputOutputs("Empty"); |

