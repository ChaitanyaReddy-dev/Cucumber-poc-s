Feature: testing get operation

  Scenario Outline: Api testing by passing name
    Given Execute Get request by "<arg0>"
    When i will pass the path variable "<arg01>"
    Then i should get the same name "<arg02>"
    Examples:
      | arg0   | arg01 | arg02 |
      | /stock | 1     | cakd  |

