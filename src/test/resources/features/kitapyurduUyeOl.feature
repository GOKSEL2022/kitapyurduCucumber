@TC02
Feature: uye_olma_senaryolari
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici uye ol linkine tiklar

  Scenario:kullanici_sayfaya_deger_girmeden_uye_olmayi_dener
    And   kullanici uye ol butonuna tiklar
    When  kullanici doldurulmasi gerekli alanlarin valid degerlerini gorur
    Then  kullanici sayfayi kapatir

  Scenario:kullanici_ad_alanini_bos_birakarak_uye_olmayi_dener
    Given kullanici soyad alanina iki ile otuz karakter araliginda deger girer
    When  kullanici e-posta alanina gecerli bir deger girer
    And   kullanici sifre sekiz ile yirmi araliginda bir deger girer
    And   kullanici yazmis oldugu sifreyi tekrar girer
    And   kullanici kisisel verilerin korunmasi checkboxi isaretler
    When  kullanici uye ol butonuna tiklar
    When  kullanici ad alani iki ile otuz karakter olmali uyarisini gorur
    Then  kullanici sayfayi kapatir

