Feature: US001 Amazon Sayfasi Testi
  Scenario: TC01 Arama Kutusunda Iphone Aratilir
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda iphone aratir
    And sayfayi kapatir
  @gr1
  Scenario: TC02 Arama Kutusunda Samsung Aratilir
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda samsung aratir
    And sayfayi kapatir