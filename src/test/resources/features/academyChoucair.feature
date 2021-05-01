  @stories
  Feature: Academy Choucair
    As a use, I want to learn how automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline:  Search for a automation course
    Given that Daniel wants to learn automation at the academy Choucair
      |user    |password  |
      |<user> |<password>|
    When he search for the course on the Choucair Academy platform
      |course  |
      |<course>|
    Then he finds the course called
      |course  |
      |<course>|
    Examples:
      |user     |password    |course               |
      |  1094966668| Choucair2021* | Metodología Bancolombia|