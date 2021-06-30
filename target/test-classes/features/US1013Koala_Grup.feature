@sip
Feature: Manger_login_test
  Scenario Outline: TC_01_reservation_manager_profile
    Given kullanici "kr_url" sayfasina gider
    Then clicks on log button
    And user enters manager_id "<gecersiz_username>"
    And user enters manager_password "<gecersiz_password>"
    And clicks on login button
    And verify login "manager" is displayed

    Examples:
    |gecersiz_username    |gecersiz_password    |
    |kr_valid_username    |kr_valid_password    |
    |kr_gecersiz_username5|kr_gecersiz_password5|
    |kr_gecersiz_username6|kr_gecersiz_password6|


