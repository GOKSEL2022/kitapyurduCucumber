Feature: listelerim_dropdown_testi
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici listelerim dropdown uzerine gelir

  @favorilerim
  Scenario: favorileri_testi
    And   kullanici acilan menuden favorilerimi secer
    And   kullanici e-posta alanina kayitli e-posta girer
    And   kullanici sifre alanina kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    And   kullanici listelerim dropdown uzerine gelir
    And   kullanici acilan menuden favorilerimi secer
    And   kullanici favorilerime ekli urunleri gorur
    And   kullanici secilen urunleri favori listesinden siler
    And   kullanici sayfayi kapatir

    Scenario: alisveris_listem_test
      And kullanici acilan menuden alisveris listemi secer

    