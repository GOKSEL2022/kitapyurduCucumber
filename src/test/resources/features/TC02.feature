@TC02
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

      @TC02_02
  Scenario: username_bos_birakilir
    Given kullanici username alanini bos birakir
    When  kullanici gecerli e-posta "e-posta" girer
    And   kullanici gecerli sifre "sifre" girer
    And   kullanici radio butonu tiklar
    And   kullanici sign-up butonu tiklar
    When  kullanici Please enter a valid account username mesajini gorur
    Then  kullanici sayfayi kapatir

        @TC02_03
        Scenario: email_bos_birakilir
          Given kullanici gecerli username "username" girer
          When  kullanici email alanini bos birakir
          And   kullanici gecerli sifre "sifre" girer
          And   kullanici radio butonu tiklar
          And   kullanici sign-up butonu tiklar
          And   kullanici email alaninin bos birakilmamasi uyarisini gorur
          Then  kullanici sayfayi kapatir

          @TC02_04
          Scenario: gecersiz_email_girilir
            Given kullanici gecerli username "username" girer
            When  kullanici email alanina gecersiz deger girer
            And   kullanici gecerli sifre "sifre" girer
            And   kullanici radio butonu tiklar
            And   kullanici sign-up butonu tiklar
            When  kullanici Lutfen posta adresine @ isareti ekleyin uyarisini gorur
            Then  kullanici sayfayi kapatir





