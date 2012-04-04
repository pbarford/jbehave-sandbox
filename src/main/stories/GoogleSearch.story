Google Search story

Meta:
@category google

Narrative: 

Testing google search for soccer

Scenario: Google Search story for soccer

Given the user is on the search site
When the user searches for <criteria>
!-- We don't care for the results
Then the user should see the search results

Examples:
|criteria|
|soccer|