Feature: US008 Google Testi

  Scenario Outline: TC01 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda scenarioOutline ile propertiesden "<araclar>" aratir
    And sayfa basliginin scenarioOutline ile propertiesden "<araclar>" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclar |
      | arac1   |
      | arac2   |
      | arac3   |