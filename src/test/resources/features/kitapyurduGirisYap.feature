Feature: kayitli_kullanici_girisi

  Scenario:giris_yap_alani_bos_birakarak_deneme
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici giris yap butonuna tiklar
    When  kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur
    Then  kullanici sayfayi kapatir


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

  Scenario Outline:invalid_e-posta
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici e-posta alanina invalid "<e-posta>" girer
    And   kullanici sifre alanina kayitli sifresini "<sifre>" girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur
    Then  kullanici sayfayi kapatir
    Examples:
      | e-posta                | sifre       |
      |                        | 123456789a. |
      | yekparebirangmail.com  | 123456789a. |

  Scenario Outline: giris_yaparken_karakter_ve_kucuk_buyuk_harf_ayrimi yapilmamasi_BUG
  Given kullanici kitapyurdu_url ye gider
  When  kullanici anasayfanin acildigini dogrular
  And   kullanici giris yap linkine tiklar
  And   kullanici e-posta alanina kucuk-buyuk harf ve i harfini ı yaparak "<e-posta>" girer
  And   kullanici sifre alanina kayitli sifresini "<sifre>" girer
  And   kullanici beni hatirla checkboxi tiklar
  And   kullanici giris yap butonuna tiklar
  And   kullanici sayfaya giris yaptıgını dogrular
  When  kullanici hesaptan cikis yapar
  Then  kullanici sayfayi kapatir
    Examples:
      | e-posta | sifre |
      | YekpareBirAn@gmail.com | 123456789a. |
      | YEKPAREBİRAN@GMAİL.COM | 123456789a. |
      | yekparebıran@gmail.com | 123456789a. |