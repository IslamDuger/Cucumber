@rapor2
Feature: US1012 Amazon Arama

  Scenario: TC16 Kullanici Amazonda Mehmet aratir
    Given kullanici "amazon_url" sayfasina gider
    Then Todays deals sekmesine tiklar
    And Todays deals sayfasinda "Mehmet" icin arama yapar
    Then ilk ilan isminde "Mehmet" gectigini test eder

