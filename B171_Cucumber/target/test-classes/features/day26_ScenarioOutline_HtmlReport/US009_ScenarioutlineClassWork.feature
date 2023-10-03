#USER STORY : US_manager_login_test
#Scenario:kullanici tum manager login bilgileriyle giriş yapabilmeli
#Given kullanici ana sayfada
#When kullanici login sayfasina gider
#And kullanıcı adini girer
#And sifreyi girer
#And login buttoning basar
#Then login islemi gerçekleşir
#url : https://www.bluerentalcars.com/
#Managers:  "sam.walker@bluerentalcars.com","c!fas_art",
#		    "kate.brown@bluerentalcars.com","tad1$Fas",
#		    "raj.khan@bluerentalcars.com","v7Hg_va^",
#		    "pam.raymond@bluerentalcars.com”,"Nga^g6!"

Feature: US009 BlueRentalCar Login Islemi

  Scenario Outline: TC01 kullanici tum manager login bilgileriyle giriş yapabilmeli
    Given kullanici parametreli method ile propertiesden "blueRentalUrl" sayfasina gider
    When login butonuna tiklar
    * kullanici "<email>" ve "<password>" bilgilerini girer
    * kullanici 3 saniye bekler
    Then kullanici login oldugunu dogrular
    * kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |

