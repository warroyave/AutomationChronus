#Author: wilson.arroyave@sophossolutions.com
@tag
Feature: Chronus Login
  As a user chronus
  I want to use this page to register week hours

  Background: 

  Scenario Outline: Login Chronus
    Given that user wants to  use Chronus
    When he make the login in the page Chronus
      | user   | password   |
      | <user> | <password> |
    Then he must access the page
      | validation_message   |
      | <validation_message> |

    Examples: 
      | user            | password   | validation_message |
      | wilson.arroyave | Me8431346* | wilson.arroyave    |
#      | wilsonarroyave  | Me8431346* | Your login attempt was not successful. Please try again. |