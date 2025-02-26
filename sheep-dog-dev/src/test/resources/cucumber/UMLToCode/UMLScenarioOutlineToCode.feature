@debug
Feature: UML Scenario Outline To Code

  Scenario: No tags, no statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          == Scenario: Submit
          
          === Given: The blah application, Object page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Examples: Examples 1
          
          |===
          | h3
          | v31
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Steps Data Table section will be created as follows
          | Name   | Step                                                          |
          | Submit | Given The blah application, Object page is created as follows |
          | Submit | Given The blah application, Object page is created as follows |
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Examples Table section will be created as follows
          | Name   | Examples   | Row       |
          | Submit | Examples 1 | \| h3 \|  |
          | Submit | Examples 1 | \| v31 \| |

  Scenario: One tag, one statement, one step, one example

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          [tags="tag1"]
          == Scenario: Submit
          
          Desc line 1
          
          === Given: The blah application, Object page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Examples: Examples 1
          
          |===
          | h3
          | v31
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outlines section will be created as follows
          | Name   | Tags | Description |
          | Submit | tag1 | Desc line 1 |

  Scenario Outline: Two tags, two statements, two steps, two examples

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          [tags="tag1,tag2"]
          == Scenario: Submit
          
          Desc line 1
          Desc line 2
          
          === Given: The blah application, Object1 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Given: The blah application, Object2 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Examples: Examples 1
          
          |===
          | h3
          | v31
          |===
          
          === Examples: Examples 2
          
          |===
          | h3
          | v32
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outlines section will be created as follows
          | Name   | Tags      | Description              |
          | Submit | tag1,tag2 | Desc line 1\nDesc line 2 |
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Steps Data Table section will be created as follows
          | Name   | Step                                                                 |
          | Submit | Given The blah application, Object<Index> page is created as follows |
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Examples Table section will be created as follows
          | Name   | Examples         | Row             |
          | Submit | Examples <Index> | \| h3 \|        |
          | Submit | Examples <Index> | \| v3<Index> \| |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |

  Scenario Outline: Three tags, three statements, three steps, three examples

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Feature: Process
          
          [tags="tag1,tag2,tag3"]
          == Scenario: Submit
          
          Desc line 1
          Desc line 2
          Desc line 3
          
          === Given: The blah application, Object1 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Given: The blah application, Object2 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Given: The blah application, Object3 page is created as follows
          
          |===
          | h1
          | {h3}
          |===
          
          === Examples: Examples 1
          
          |===
          | h3
          | v31
          |===
          
          === Examples: Examples 2
          
          |===
          | h3
          | v32
          |===
          
          === Examples: Examples 3
          
          |===
          | h3
          | v33
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, uml-to-cucumber goal is executed
     Then The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file will be present
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outlines section will be created as follows
          | Name   | Tags           | Description                           |
          | Submit | tag1,tag2,tag3 | Desc line 1\nDesc line 2\nDesc line 3 |
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Steps Data Table section will be created as follows
          | Name   | Step                                                                 |
          | Submit | Given The blah application, Object<Index> page is created as follows |
      And The mbt-transformer plugin, src/test/resources/cucumber/Process.feature file Scenario Outline Examples Table section will be created as follows
          | Name   | Examples         | Row             |
          | Submit | Examples <Index> | \| h3 \|        |
          | Submit | Examples <Index> | \| v3<Index> \| |

    Examples: Indices

          | Index |
          | 1     |
          | 2     |
          | 3     |

