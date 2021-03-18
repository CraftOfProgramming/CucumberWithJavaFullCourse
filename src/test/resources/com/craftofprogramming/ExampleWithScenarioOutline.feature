@All @Smoke
Feature: Example With Basic Scenario Outline

#  @Invalid
  Background:
    Given that my library is initialized
    And that the total number of books is 10

  @Outline
  Scenario Outline: Search a book given its title and topic
    When I search for the book with title <title> and topic <topic>
    Then I find the book <title>
    Examples: Book title And Topic
      | title                           | topic     |
      | "Effective Java"                | COMPUTING |
      | "Design Patterns"               | COMPUTING |
      | "Dune"                          | SCI_FI    |
      | "One Hundred Years Of Solitude" | NOVEL     |