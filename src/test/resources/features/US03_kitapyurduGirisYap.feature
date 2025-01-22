@smoke  @regression
Feature: kayitli_kullanici_girisi
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar

  Scenario:giris_yap_alani_bos_birakarak_deneme
    And   kullanici giris yap butonuna tiklar
    When  kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur
    Then  kullanici sayfayi kapatir


  Scenario: kullanici_kayitli_bilgilerle_giris_yapar
    And   kullanici e-posta alanina kayitli e-posta girer
    And   kullanici sifre alanina kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  kullanici sayfaya giris yaptıgını dogrular
    Then  kullanici sayfayi kapatir

  Scenario Outline:invalid_e-posta
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

    #_BUG : Giris yap alaninda e-posta girerken büyük-kücük karakter veya ç-c,ş-s,ı-i,o-ö,g-ğ,u-ü gibi bir harf ayrımı gözetilmiyor.
  Scenario Outline: giris_yaparken_karakter_ve_kucuk_buyuk_harf_ayrimi yapilmamasi
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
      | YEKPAREBıRAN@ğMAıL.çöm | 123456789a. |
      | yekparebıran@gmail.çom | 123456789a. |
      | yekparebıran@Gmail.com | 123456789a. |
      | yekparebıran@GmaIl.com | 123456789a. |
      | yekparebıran@Gmaıl.com | 123456789a. |
      | yekparebiran@Gmaıl.com | 123456789a. |
      | gokselceliktestengineer@gmail.com | 123456789a. |
      | gökşelçeliktestengineer@gmail.com | 123456789a. |
      | ğökşelçeliktestenğineer@gmail.com | 123456789a. |
      | ğökşelçeliktestenğineer@ğmail.çom | 123456789a. |
      | GOkŞelÇelIktestenĞIneer@ĞmaIl.çöm | 123456789a. |


    Scenario Outline: invalid_sifre
      And   kullanici e-posta "<e-posta>" girer
      And   kullanici sifre alanina invalid bir "<sifre>" girer
      And   kullanici beni hatirla checkboxi tiklar
      And   kullanici giris yap butonuna tiklar
      When  kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur
      Then  kullanici sayfayi kapatir
      Examples:
        | e-posta                | sifre       |
        | yekparebiran@gmail.com |             |
        | yekparebiran@gmail.com | 123456789A. |
        | yekparebiran@gmail.com | 123456789a, |

      Scenario: checkbox_tiklanmadan_giris
        And   kullanici e-posta "yekparebiran@gmail.com" girer
        And   kullanici sifre alanina kayitli sifresini "123456789a." girer
        When  kullanici giris yap butonuna tiklar
        Then  kullanici sayfaya giris yaptıgını dogrular
        Then  kullanici sayfayi kapatir

  Scenario: eposta ve sifre alanlari oncesi bosluk birakma testi
    And   kullanici e-posta alanina bosluk birakarak kayitli e-posta girer
    And   kullanici sifre alanina bosluk birakarak kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler
    Then  kullanici sayfayi kapatir


