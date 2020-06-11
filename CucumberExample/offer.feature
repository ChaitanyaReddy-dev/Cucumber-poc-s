Feature: Evaluate loan amount

  Scenario:  for salary greater than 15000 and less than 50000
    Given create  LoanService
    When  if i enter salary  20000
    Then we can give fifty thousand loan

  Scenario: for salary greater than 50000
    Given create  LoanService
    When  if i enter salary  70000
    Then we can give one lakh loan

  Scenario: for salary less than 15000
    Given  create  LoanService
    When  if i enter salary  12000
    Then No loan
