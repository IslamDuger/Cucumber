   Feature:US1014 Dataprovider Ornek
     Scenario Outline:Dataprovider kullanarak asagidaki gorevi tamamlayin
     Given kullanici "kr_url" sayfasina gider
     And Log in yazisina tiklar
     And kullanici isim olarak"<username>" girer
     And kullanici sifre olarak"<password>" girer
     And Login butonuna basar
     Then sayfaya giris yapamadigini kontrol eder

    Examples:
    |username|password|
    |Manager  |Manager |
    |Manager2 |Manager2 |
    |Manager3 |Manager3 |
    |Manager4 |Manager4 |
    |Manager5 |Manager5 |