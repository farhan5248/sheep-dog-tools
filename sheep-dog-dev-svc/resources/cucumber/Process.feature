@tag2 @tag3
Feature: This is a feature

  Background: Setup

    Given The blah application, something/Object page is created as follows
          """
          Text 1
          
          Text 2
          """

  @tag1
  Scenario: Submit One

    Basic EDI claim

     When The blah application, something/Object page is empty
     Then The blah application, something/Object page is empty
      But The blah application, something/Object page is empty
      And The blah application, something/Object page is empty
        * The blah application, something/Object page is empty

  Scenario Outline: Submit Several

    Given The blah application, DataTable page is created as follows
          | h1   | h2   |
          | <h3> | <h4> |

    Examples: Data Set

          | h3  | h4  |
          | v31 | v41 |

