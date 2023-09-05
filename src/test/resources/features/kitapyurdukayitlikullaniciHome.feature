@kayitli_kullanici_home
Feature: kayitli_kullanici_hesabi_ile_sayfa_testi
  Background:kayitli_kullanici_girisi_ile_anasayfaya_erisir
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici e-posta alanina gecerli bir "yekparebiran@gmail.com" girer.
    And   kullanici sifre alanina kayitli sifresini "123456789a." girer.
    And   kullanici beni hatirla checkboxi tiklar.
    And   kullanici giris yap butonuna tiklar.
    And   kullanici sayfaya kayitli hesap ile girdigini dogrular

    Scenario: kayitli_kullanici_girisi_ile_anasayfada_islem_yapar
      Given kullanici dergi linkine tiklar
      When  kullanici dergi ile ilgili alanlarin acildigini dogrular
      And   kullanici edebiyat dergileri seceneginin uzerine gelir
      And   kullanici dil ve edebiyat secenegini tiklar
      And   kullanici urunlerin listelendigi sayfada oldugunu dogrular
      And   kullanici sayfadaki ilk urune tiklar
