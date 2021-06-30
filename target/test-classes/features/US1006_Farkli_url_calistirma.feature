
Feature: US_Farkli url

  Scenario Outline:TC Farkli sayfalara
    Given kullanici "<sayfaUrl>" sayfasina gider

  Examples:
    |sayfaUrl|
    |amazon_url|
    |yandex_url|
    |facebook_url|