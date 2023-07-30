Feature: kayitli_kullanici_girisi
  Scenario: kullanici_kayitli_bilgilerle_giris_yapar
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici e-posta alanina kayitli e-posta girer
    And   kullanici sifre alanina kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  kullanici sayfaya giris yaptıgını dogrular
    Then  kullanici sayfayi kapatir
