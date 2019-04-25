Feature: shout feature
Scenario: Sean shouts
Given  Sean is 10 meters away from Lucia
When sean shouts "Free coffee"
Then  Lucia Listens to the message

Scenario: Sean shouts away from Lucia 
    Given Sean is 200 meters away from Lucia
    When sean shouts "Free coffee"
    Then Lucia "cannot Listens" to the message
