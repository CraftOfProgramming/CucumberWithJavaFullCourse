@All @StepArgs @Smoke @Read @Update
Feature: Example with DataTable And DocString Step Argument

  Scenario: Simple Example with A Data Table
    Given that my library is initialized empty
    And the following table of books:
      | title   | Number of Pages | Topic     | Year of Publication | Authors |
      | BookOne | 42              | COMPUTING | 2020                | Nilton  |
      | BookTwo | 400             | SCI_FI    | 2021                | Santos  |
    When I search for the book with title "BookOne" and topic COMPUTING
    Then I find the book "BookOne"
    When I search for the book with title "BookTwo" and topic SCI_FI
    Then I find the book "BookTwo"

  Scenario: Simple Example with A Doc String
    Given that my library is initialized empty
    And the following list of books:
    """list_of_books
    BookThree, 200, COMPUTING, 2020, Cassandra
    BookFour, 300, NOVEL, 2021, Miranda
    """
    When I search for the book with title "BookThree" and topic COMPUTING
    Then I find the book "BookThree"
    When I search for the book with title "BookFour" and topic NOVEL
    Then I find the book "BookFour"

  Scenario: Simple Example with user defined parameter type
    Given that my library is initialized empty
    When I add the book Awesome Cucumber, 42, COMPUTING, 2021, Nilton
    Then I find the book "Awesome Cucumber"
