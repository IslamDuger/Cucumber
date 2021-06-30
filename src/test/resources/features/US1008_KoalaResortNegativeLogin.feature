
Feature: US1009 Koala  Negative Login

  Scenario:12 kullanici gecerli bilgilerle giris yapar
    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And kullanici isim olarak"gecersiz_username" girer
    And kullanici sifre olarak"gecersiz_password" girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    And sayfayi kapatir
