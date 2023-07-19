@TC01
Feature:Sayfa_acilisi_dogrulama
  Scenario:Sayfa_acilisi_dogrulama
    Given kullanici url ye gider
    When  kullanici sayfanin acildigini dogrular
    And   kullanici register butonuna tiklar
    When  kullanici doldurulacak alanlari goruntuler
    Then  kullanici sayfayi kapatir