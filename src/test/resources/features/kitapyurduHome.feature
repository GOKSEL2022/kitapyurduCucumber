Feature:kullanici_anasayfadaki_fonksiyonlari_kullanabilir
  Scenario:anasayfadaki_fonksiyonlar_kullanilir
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici bir saniye bekler
    And   kullanici anasayfanin en altina gelir
    And   kullanici bir saniye bekler
    And   kullanici anasayfanin en üst kismina gider
    And   kullanici bir saniye bekler
    Then  kullanici sayfayi kapatir

