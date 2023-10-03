
Feature: US003 Amazon testi
  #Feature file de kullanacağımız scenario'larda ortak adımlar var ise Feature: anahtar kelimesinden
#sonra Background: anahtar kelimesi ile ortak adımları belirtebiliriz. Background yapısı
#@BeforeMethod mantığı ile çalışır.

  #TASK: 3 tane Scenario: oluşturup Amazon sayfasında iphone, samsung ve nokia aratınız.
  Background: Amazon Sayfasina Gidilir
    * kullanici amazon sayfasina gider
  @iphone @amazon
  Scenario: TC01 arama kutusunda iphone aratilir
    * kullanici arama kutusunda iphone aratir
    * sayfayi kapatir
  @samsung
  Scenario: TC02 arama kutusunda samsung aratilir
    * kullanici arama kutusunda samsung aratir
    * sayfayi kapatir

  #Daha önce oluşturduğunuz steplerin methodlarını tekrar kullanmak istediğinizde,
  #Given,And,Then,When,But anahtar kelimeli yerine *(yıldız) kullanılabilir

