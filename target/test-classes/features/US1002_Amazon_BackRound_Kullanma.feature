@rapor2
Feature: US1002_Amazon Background Kullanma

  Background: sayfayi acma

    Given kullanici amazon sayfasina gider

    Scenario: TC02_IPhone arama testi
      Given iPhone icin arama yapar
      Then sonuclarin iPhone icerdigini test eder

    Scenario: TC03_Tea pot arama testi
      And tea pot icin arama yapar
      Then sonuclarin tea pot icerdigini test eder

 Scenario: TC04_Flower arama test eder
      And flower icin arama yapar
      Then sonuclarin flower icerdigini test eder
      And sayfayi kapatir
