@kategoriler
Feature: kategoriler_test
  Background: kayitli_olarak_sayfaya_girer
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici e-posta alanina gecerli bir "yekparebiran@gmail.com" girer.
    And   kullanici sifre alanina kayitli sifresini "123456789a." girer.
    And   kullanici beni hatirla checkboxi tiklar.
    And   kullanici giris yap butonuna tiklar.
    And   kullanici sayfaya kayitli hesap ile girdigini dogrular
    And   kullanici kitapYurdu_com textine tiklar


  Scenario: kategoriler
    Given kullanici kategoriler basligina gelir
    And   kullanici kategoriler tumunu goster linkine tiklar
    And   kullanici acilan sayfada tum kategorileri goruntuler
    And   kullanici tum kategoriler icinden edebiyata tiklar
    And   kullanici acilan sayfada edebiyat urunleri oldugunu dogrular
    And   kullanici alt kategorilerden belgesel romana tiklar
    And   kullanici acilan sayfada belgesel roman basligini goruntuler
    And   kullanici listeyi daralt menuden Ayse Kulin i  secer
    And   kullanici acilan sayfada Ayse Kulin in romanlarini goruntuler
    And   kullanici sayfadaki urunleri sepete ekler
    And   kullanici urunun sepete eklendiginin belirten alerti gorur
    Then  kullanici sayfayi kapatir