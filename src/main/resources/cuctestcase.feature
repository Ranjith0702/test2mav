Feature: Spotify

  Scenario: Playing a song
    Given I open spotify
    When I click on play button
    Then I should hear a song