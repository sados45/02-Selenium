Feature: US014 BlueRentalCar Sayfasinda Login Islemi
  Scenario: TC01 Exceldeki Email ve Password bilgileri ile Login olunur
    Given kullanici blueRentalCar sayfasina gider
    But login butonuna tiklar
    And kullanici 2 saniye bekler
    And exceldeki "admin_info" sayfasindaki kullanici bilgileri ile login olunur
    And kullanici 2 saniye bekler
    And sayfayi kapatir