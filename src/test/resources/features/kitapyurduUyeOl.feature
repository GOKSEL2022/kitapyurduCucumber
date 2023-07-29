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

  Scenario Outline: kullanici_ad_alanina_invalid_degerler_girer
    Given kullanici ad alanina "<ad alani>" girer
    When  kullanici soyad alanina iki ile otuz karakter araliginda "<soyad>" deger girer
    And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
    And   kullanici sifre alanina sekiz ile yirmi araliginda bir "<sifre>" girer
    And   kullanici yazmis oldugu sifreyi"<sifre tekrari>" girer
    And   kullanici kisisel verilerin korunmasi checkboxi isaretler
    And   kullanici uye ol butonuna tiklar
    When  kullanici ad alani iki ile otuz karakter olmali uyarisini gorur
    Then  kullanici sayfayi kapatir
    Examples:
      | ad alani                        | soyad  | e-posta          | sifre     | sifre tekrari |
      |                                 | Bilgin | bilgin@gmail.com | 123456789 | 123456789     |
      | abccdefgghiijklmnooprsstuuvyzxw | Guclu  | guclu@gmail.com  | 12345678a | 12345678a     |
      | a                               | Olgun  | olgun@gmail.com  | 12345678b | 12345678b     |

    @valid_hesap_girisi
    Scenario Outline: kullanici_ad_alanina_valid_degerler_girer
      Given kullanici ad alani "<ad alani>" girer
      When  kullanici soyad alanina iki ile otuz karakter araliginda "<soyad>" deger girer
      And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
      And   kullanici sifre alanina sekiz ile yirmi araliginda bir "<sifre>" girer
      And   kullanici yazmis oldugu sifreyi"<sifre tekrari>" girer
      And   kullanici kisisel verilerin korunmasi checkboxi isaretler
      And   kullanici uye ol butonuna tiklar
      When  kullanici hesabiniz olusturuldu mesajini gorur
      Then  kullanici sayfayi kapatir
      Examples:
        | ad alani                       | soyad  | e-posta          | sifre | sifre tekrari |
        | ab                             | Bilgin | bilgin@gmail.com | 123456789 | 123456789 |
        | abc                            | Guclu  | guclu@gmail.com  | 123456789 | 123456789 |
        | abccdefgghiijklmnooprsstuuvyz  | Olgun  | olgun@gmail.com  | 123456789 | 123456789 |
        | abccdefgghiijklmnooprsstuuvyzx | Zengin | zengin@gmail.com | 123456789 | 123456789 |

      @valid_soyad_alani
      Scenario Outline:kullanici_soyad_alanina_valid_degerler_girer
        Given kullanici ad alani "<ad alani>" girer
        When  kullanici soyad alanina "<soyad>" girer
        And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
        And   kullanici sifre alanina "<sifre>" girer
        And   kullanici sifre tekrari alanina "<sifre tekrari>" girer
        And   kullanici kisisel verilerin korunmasi checkboxi isaretler
        And   kullanici uye ol butonuna tiklar
        And   kullanici hesabiniz olusturuldu mesajini gorur
        Then  kullanici sayfayi kapatir
        Examples:
          | ad alani | soyad                          | e-posta          | sifre     | sifre tekrari |
          | axby     | xy                             | xyzt@gmail.com   | 123456789 | 123456789     |
          | acvb     | xyz                            | eposta@gmail.com | 123456789 | 123456789     |
          | away     | abccdefgghiijklmnooprsstuuvyz  | a1b2c3@gmail.com | 123456789 | 123456789     |
          | acbnm    | abccdefgghiijklmnooprsstuuvyzx | aeiu@gmaail.com  | 123456789 | 123456789     |


  @soyad_invalid_giris
      Scenario Outline:kullanici_soyad_alanina_invalid_degerler_girer
        Given kullanici ad alani "<ad alani>" girer
        When  kullanici soyad alanina "<soyad>" girer
        And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
        And   kullanici sifre alanina "<sifre>" girer
        And   kullanici sifre tekrari alanina "<sifre tekrari>" girer
        And   kullanici kisisel verilerin korunmasi checkboxi isaretler
        When  kullanici uye ol butonuna tiklar
        When  kullanici soyad alanina iki ile otuz karakter araliginda olmali hata mesajini gorur
        Then  kullanici sayfayi kapatir
        Examples:
          | ad alani | soyad                           | e-posta        | sifre     | sifre tekrari |
          | abcd     |                                 | xyz@gmail.com  | 123456789 | 123456789     |
          | abcde    | a                               | abcd@gmail.com | 123456789 | 123456789     |
          | abcdef   | abccdefgghiijklmnooprsstuuvyzxw | 123@gmail.com  | 123456789 | 123456789     |





