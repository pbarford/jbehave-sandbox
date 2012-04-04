Yahoo Search story

Meta:
@category yahoo

Narrative: 

Testing yahoo search for tennis

Scenario: Yahoo search story for tennis

Given the user is on the search site
When the user searches for <criteria>
!-- We don't care for the results
Then the user should see the search results

Examples:
|criteria|
|tennis|