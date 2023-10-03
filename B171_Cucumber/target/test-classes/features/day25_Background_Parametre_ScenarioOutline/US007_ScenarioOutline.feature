Feature: US007 Google Testi

  Scenario Outline: TC01 Google sayfasinda Arama kutusunda arac aratilir
    Given kullanici parametreli method ile propertiesden "googleUrl" sayfasina gider
    Then arama kutusunda scenarioOutline ile "<araclar>" aratir
    And sayfa basliginin scenarioOutline ile "<araclar>" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclar |
      | volvo   |
      | bmw     |
      | ford    |