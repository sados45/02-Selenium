
Feature: US004 Amazon Testi
  Background: Amazon sayfasina gidilir
    Given kullanici parametreli method ile "https://amazon.com" sayfasina gider

  Scenario: Arama kutusunda Nokia aratilir
    Then kullanici arama kutusunda "nokia" aratir

  Scenario: Arama kutusunda motorola aratilir
    When kullanici arama kutusunda "motorola" aratir

  Scenario: Arama kutusunda reeder aratilir
    And kullanici arama kutusunda "reeder" aratir

    #Feature file'i daha dinamik hale getirebilmek için gitmek istediğimiz url'i yada aratmak istediğimi
  #bir kelimeyi ""(tırnak) içinde yukarıdaki örnekteki gibi yazarak dinamik hale getirebiliriz. Tırnak içinde
  #yazdığımız step'in methodunu oluşturduğumuzda parametreli bir method oluşturur. Böyle sadece tırnak içindeki
  #url'i yada aratmak istediğimiz kelimeyi feature file dan değiştirerek tekrar tekrar method oluşturmadan
  #istediğimiz url'e gidebilir veya istediğimiz kelimeyi aratabiliriz.