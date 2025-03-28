@debug
Feature: UML Step Table To Document

  Scenario: One row, one cell

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          |===
          | h1
          | v1
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is deleted
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Step Table section will be created as follows
          | Name   | Step                                         | Row |
          | Submit | Given: The Object page is created as follows | h1  |
          | Submit | Given: The Object page is created as follows | v1  |

  Scenario: Two rows, two cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          |===
          | h1 | h2
          | v1 | v2
          | v3 | v4
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is deleted
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Step Table section will be created as follows
          | Name   | Step                                         | Row    |
          | Submit | Given: The Object page is created as follows | h1, h2 |
          | Submit | Given: The Object page is created as follows | v1, v2 |
          | Submit | Given: The Object page is created as follows | v3, v4 |

  Scenario: Three rows, three cells

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          |===
          | h1 | h2 | h3
          | v1 | v2 | v3
          | v4 | v5 | v6
          | v7 | v8 | v9
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is deleted
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Step Table section will be created as follows
          | Name   | Step                                         | Row        |
          | Submit | Given: The Object page is created as follows | h1, h2, h3 |
          | Submit | Given: The Object page is created as follows | v1, v2, v3 |
          | Submit | Given: The Object page is created as follows | v4, v5, v6 |
          | Submit | Given: The Object page is created as follows | v7, v8, v9 |

  Scenario: Escaped cell data

    Given The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is created as follows
          """
          = Test-Suite: Process
          
          == Test-Case: Submit
          
          === Given: The Object page is created as follows
          
          |===
          | h1
          | \| v1 \|
          |===
          """
     When The mbt-transformer plugin, asciidoctor-to-uml goal is executed
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file is deleted
      And The mbt-transformer plugin, uml-to-asciidoctor goal is executed
     Then The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file will be present
      And The mbt-transformer plugin, src/test/resources/asciidoc/Process.asciidoc file Scenarios Steps Step Table section will be created as follows
          | Name   | Step                                         | Row          |
          | Submit | Given: The Object page is created as follows | h1           |
          | Submit | Given: The Object page is created as follows | \\\| v1 \\\| |

