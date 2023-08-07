Feature:kullanici_anasayfadaki_fonksiyonlari_kullanabilir

  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici bir saniye bekler

  Scenario:anasayfadaki_fonksiyonlar_kullanilir
    And   kullanici anasayfanin en altina gelir
    And   kullanici bir saniye bekler
    And   kullanici anasayfanin en üst kismina gider
    And   kullanici bir saniye bekler
    Then  kullanici sayfayi kapatir

  Scenario: anasayfadaki_sag_sol_kaydiricilar_test_edilir
    Given kullanici sag yon tusuna tiklar
    When  kullanici sag yon tusunun erisilebilir oldugunu dogrular
    And   kullanici bir saniye bekler
    And   kullanici sol yon tusuna tiklar
    And   kullanici sol yon tusunun erisilebilir oldugunu dogrular
    And   kullanici bir saniye bekler
    And   kullanici anasayfada birden fazla resim oldugunu dogrular
    Then  kullanici sayfayi kapatir


