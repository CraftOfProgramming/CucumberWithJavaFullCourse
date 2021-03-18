@All @Basic @Smoke
Feature: Example With Basic Book Queries

  Background:
    Given that my library is initialized
    And that the total number of books is 10

  @Read
  Scenario: Search a book given its title
    When I search for the book with title "Effective Java"
    Then I find the book "Effective Java"

  @Read
  Scenario: Search for the most popular topic in my library
    When I search for the most popular topic
    Then I find the topic COMPUTING
    But I don't find the topic FINANCE
    And I don't find the topic SCI_FI