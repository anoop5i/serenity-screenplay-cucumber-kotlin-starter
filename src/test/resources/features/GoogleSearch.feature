Feature: Google Search

  @Test
  Scenario: User can search
    Given User navigate to the url "http://www.google.com"
    When User perform a search with text "test"
    Then User can see the return values contains links with text "Test"
