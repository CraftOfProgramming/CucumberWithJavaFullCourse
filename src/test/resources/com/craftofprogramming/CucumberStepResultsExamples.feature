# Cucumber Step Results
#  1) Success
#  2) Failed Steps
#  3) Undefined
#  4) Pending
#  5) Ambiguous
#  6) Skipped
Feature: Cucumber Step Results Examples Feature

  Scenario: Success Step Result
    When A step result is Success
    Then Life is good!

#  Scenario: Failed Step Result
#    When A step result Fails
#    Then Life is not good!

#  Scenario: Undefined Step Result
#    When A step result is Undefined
#    Then Life is not good!

#  Scenario: Pending Step Result
#    When A step result is Pending
#    Then Life is not good!
#
#  Scenario: Ambiguous Step Result
#    When This step is Ambiguous
