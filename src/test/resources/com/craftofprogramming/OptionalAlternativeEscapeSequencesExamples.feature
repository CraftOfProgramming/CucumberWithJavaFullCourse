@All @AlternativeOptional
Feature: Examples of optional, alternative and escape sequences

  Scenario: Simple example with optional text
    Given that my library is initialized
    Then I have 5 books with topic COMPUTING in my library
    And I have 3 books with topic SCI_FI in my library
    And I have 1 book with topic FINANCE in my library
    And I have 1 book with topic NOVEL in my library

  Scenario: Simple example with alternative text
    Given that my library is initialized
    Then I have 1 book with topic NOVEL in my library
    And I have 1 title with topic NOVEL in my library
    And I have 5 books with topic COMPUTING in my library
    And I have 5 titles with topic COMPUTING in my library

  Scenario: Simple example with escape sequence
    Given An example of an escape sequence (yay!)