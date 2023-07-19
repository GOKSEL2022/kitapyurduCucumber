Feature: Register_alani_deneme

  Background: Sayfa_acilisi
    Given kullanici url ye gider
    When kullanici sayfanin acildigini dogrular
    Then kullanici register butonuna tiklar

    @TC02_01
  Scenario: Register_alani_gecerli_degerlerle_giris
    Given kullanici gecerli username "username" girer
    When  kullanici gecerli e-posta "e-posta" girer
    And   kullanici gecerli sifre "sifre" girer
    When  kullanici radio butonu tiklar
    And   kullanici sign-up butonu tiklar
    And   kullanici basarili kayit yapildigini goruntuler
    Then  kullanici sayfayi kapatir

      Scenario:
        Given
        When

