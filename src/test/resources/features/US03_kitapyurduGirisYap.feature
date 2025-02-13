@smoke  @regression  @US03
Feature: kayitli_kullanici_girisi
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar

  @US03_TC01
  Scenario:giris_yap_alani_bos_birakarak_deneme
    And   kullanici giris yap butonuna tiklar
    When  kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur
    Then  kullanici sayfayi kapatir

  @US03_TC02
  Scenario: kullanici_kayitli_bilgilerle_giris_yapar
    And   kullanici e-posta alanina kayitli e-posta girer
    And   kullanici sifre alanina kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  kullanici sayfaya giris yaptıgını dogrular
    Then  kullanici sayfayi kapatir

  @US03_TC03
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


  @US03_TC04 #_BUG : Giris yap alaninda e-posta girerken büyük-kücük karakter veya ç-c,ş-s,ı-i,o-ö,g-ğ,u-ü gibi bir harf ayrımı gözetilmiyor.
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

  @US03_TC05
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

  @US03_TC06
      Scenario: checkbox_tiklanmadan_giris
        And   kullanici e-posta "yekparebiran@gmail.com" girer
        And   kullanici sifre alanina kayitli sifresini "123456789a." girer
        When  kullanici giris yap butonuna tiklar
        Then  kullanici sayfaya giris yaptıgını dogrular
        Then  kullanici sayfayi kapatir

  @US03_TC07
  Scenario: eposta ve sifre alanlari oncesi ve sonrasi icin bosluk ve sayilarla alan testi
    And   kullanici e-posta alanina bosluk birakarak kayitli e-posta girer
    And   kullanici sifre alanina bosluk birakarak kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler
    And   kullanici e-posta alanini temizler
    And   kullanici kayitli e-postadan sonra bosluk birakarak giris yapar
    And   kullanici sifre alanini temizler
    And   kullanici kayitli sifreden sonra bosluk birakarak giris yapar
    And   kullanici giris yap butonuna tiklar
    When  EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler
    And   kullanici e-posta alanini temizler
    And   kullanici e-posta alanina sayilar ile birlikte kayitli e-posta girer
    And   kullanici sifre alanini temizler
    And   kullanici sifre alanina sayilar ile birlikte  kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler
    And   kullanici e-posta alanini temizler
    And   kullanici kayitli e-postadan sonra sayi ile giris yapar
    And   kullanici sifre alanini temizler
    And   kullanici kayitli sifreden sonra sayi ile giris yapar
    And   kullanici giris yap butonuna tiklar
    And   kullanici e-posta alanini temizler
    And   kullanici e-posta alanina sembol ile birlikte kayitli e-posta girer
    And   kullanici sifre alanini temizler
    And   kullanici sifre alanina sembol ile birlikte  kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    When  EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler
    And   kullanici e-posta alanini temizler
    And   kullanici kayitli e-postadan sonra sembol ile giris yapar
    And   kullanici sifre alanini temizler
    And   kullanici kayitli sifreden sonra sembol ile giris yapar
    And   kullanici giris yap butonuna tiklar
    When  EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler
    Then  kullanici sayfayi kapatir

  @US03_TC08
  Scenario: Sifremi Unuttum alaninin yonlendirme dogrulamasi testi
    And kullanici sifremi unuttum linke tiklar
    And kullanici sifre yenileme sayfasina yonlendirildigini dogrular
    And kullanici eposta alanini bos birakarak yenileme baglantisi gonder butona tiklar
    And kullanici Eposta adresi bulunamadi Lutfen tekrar deneyiniz alerti goruntuler
    And kullanici eposta alanina invalid bir mail girer ve yenileme baglantisi gonder butona tiklar
    And kullanici Eposta adresi bulunamadi Lutfen tekrar deneyiniz alerti goruntuler
    And kullanici eposta alanina valid bir mail girer ve yenileme baglantisi gonder butona tiklar
    And kullanici sifre degistirme baglantisi mailinize basariyla gönderildi Lutfen epostanizi kontrol ediniz alerti goruntuler
    And kullanici giris yap linkine tiklar
    And kullanici sifremi unuttum linke tiklar
    And kullanici sifremi unuttum alanina valid maili tekrar girer
    And kullanici az once bir sifre sifirlama talebinde bulundunuz Yeni bir talep olusturabilmeniz icin bir sure beklemeniz gerekmektedir Lutfen eposta kutunuzu kontrol edin alerti goruntuler
    And kullanici sayfayi kapatir





