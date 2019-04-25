Feature: Login feature
@valid.
Scenario Outline: Vaild user Scenario
Given The URL of TestMe App
When User Enter <username> as username
And user Enter <Password> as Password
Then User is in <page>
 Examples:
 |username| Password|page|
 |Lalitha|Password123|page|
 |admin|Password@456|Admin home|
 @invalid
 Scenario: invalid scenario
Given The URL of Testme App
When user enters invalid data
|abcxyz|Password123|
|Lalitha|abc123|
|abc123|abc123|
Then user is in loginpage
|fgr|
|sdjwer|
|dsfetgreve|