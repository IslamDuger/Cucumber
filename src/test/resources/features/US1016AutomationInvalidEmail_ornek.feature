
Feature: US1016 Automation Invalid email
  Scenario:Cucumber ile asagidaki testi yapalim
    Given kullanici "Automation_Praxtice" sayfasina gider
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin “Invalid email address” oldugunu dogrulayin