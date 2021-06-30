@sek
Feature:US1017 Guru Web Tables
  Scenario:Kullanici liste alabilmeli asagidaki testi yapin
    Given kullanici "guru_url" sayfasina gider
    Then Company listesini consola yazdirir
    And DCB Bank'in listede oldugunu test eder

  