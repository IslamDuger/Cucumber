@rapor2
Feature: US1010_Kullanici Data

  Scenario: TC13 DataTableStepDefinition dosyasi ve gerekli step definition’lari olusturun
    Given kullanici "editor_datatables_url" sayfasina gider
    Then new butonuna Basar
    And tum bilgileri Girer
    And Create tusuna Basar
    When kullanici ilk isim ile arama Yapar
    Then isim bolumunde isminin oldugunu Dogrular
    And sayfayi kapatir