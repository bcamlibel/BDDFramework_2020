@web

  Feature: Login feature

    Background:

      Given I am on home page


      @login

      Scenario Outline: Verify invalid for multiple users



        When I enter <username> into username text fields on home screen
        And I enter <password> into password text fields on home screen
        And I click on login button on home screen
        Then I verify that I am in valid login page


        Examples:

        |   username       |    password  |

        | bill@sample.com  | test123      |
        | john@sample.com  | test133      |
        | bill@sample.com  | test123      |
