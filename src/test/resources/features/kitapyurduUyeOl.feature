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

    @invalid_ad
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
      | +-*/?][<>%&$#'!",.              | Olgun  | olgun@gmail.com  | 12345678b | 12345678b     |

    @valid_ad
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

      @valid_soyad
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


  @invalid_soyad
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
      | abcdef   | +-*/?][<>%&$#'!",.              | 123@gmail.com  | 123456789 | 123456789     |
      | abcdef   | abccdefgghiijklmnooprsstuuvyzxw | 123@gmail.com  | 123456789 | 123456789     |

  @valid_e-posta
      Scenario Outline:e-posta_alanina_valid_deger_girer
        Given kullanici ad alani "<ad alani>" girer
        When  kullanici soyad alanina "<soyad>" girer
        And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
        And   kullanici sifre alanina "<sifre>" girer
        And   kullanici sifre tekrari alanina "<sifre tekrari>" girer
        And   kullanici kisisel verilerin korunmasi checkboxi isaretler
        And   kullanici uye ol butonuna tiklar
        When  kullanici hesabiniz olusturuldu mesajini gorur
        Then  kullanici sayfayi kapatir
        Examples:
          | ad alani | soyad | e-posta         | sifre     | sifre tekrari |
          | ahmet    | soyad | ahmet@gmail.com | 123456789 | 123456789     |

    @invalid_e-posta
      Scenario Outline:e-posta_alanina_invalid_deger_girer
      Given kullanici ad alani "<ad alani>" girer
      When  kullanici soyad alanina "<soyad>" girer
      And   kullanici e-posta alanina invalid bir "<e-posta>" girer
      And   kullanici sifre alanina "<sifre>" girer
      And   kullanici sifre tekrari alanina "<sifre tekrari>" girer
      And   kullanici kisisel verilerin korunmasi checkboxi isaretler
      When  kullanici uye ol butonuna tiklar
      Then  kullanici gecerli e-posta girmelisiniz mesajini gorur
      Then  kullanici sayfayi kapatir
      Examples:
        | ad alani | soyad     | e-posta                    | sifre     | sifre tekrari |
        | isim_a   | soyisim_a |                            | 123456789 | 123456789     |
        | isim_b   | soyisim_b | gecersizgmail.com          | 123456789 | 123456789     |
        | isim_c   | soyisim_c | +-*/?][<>%&$#'!"@gmail.com | 123456789 | 123456789     |

      @valid_sifre
      Scenario Outline: valid_sifre_girisi
        Given kullanici ad alani "<ad alani>" girer
        When  kullanici soyad alanina "<soyad>" girer
        And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
        And   kullanici sifre alanina valid "<sifre>" girer
        And   kullanici sifre tekrari alanina valid "<sifre tekrari>" girer
        And   kullanici kisisel verilerin korunmasi checkboxi isaretler
        And   kullanici uye ol butonuna tiklar
        When  kullanici hesabiniz olusturuldu mesajini gorur
        Then  kullanici sayfayi kapatir
        Examples:
          | ad alani | soyad | e-posta         | sifre                | sifre tekrari        |
          | ali      | can   | can@gmail.com   | 12345678             | 12345678             |
          | ayse     | hanim | hanim@gmail.com | 123456789            | 123456789            |
          | veli     | han   | han@gmail.com   | 1234567890123456789  | 1234567890123456789  |
          | fatma    | betul | betul@gmail.com | 12345678901234567890 | 12345678901234567890 |

        @invalid_sifre
      Scenario Outline: invalid_sifre
          Given kullanici ad alani "<ad alani>" girer
          When  kullanici soyad alanina "<soyad>" girer
          And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
          And   kullanici sifre alanina invalid "<sifre>" girer
          And   kullanici sifre tekrari alanina invalid "<sifre tekrari>" girer
          And   kullanici kisisel verilerin korunmasi checkboxi isaretler
          And   kullanici uye ol butonuna tiklar
          When  kullanici sifreniz sekiz ile yirmi karakter arasinda olmali mesajini gorur
          Then  kullanici sayfayi kapatir
          Examples:
            | ad alani | soyad | e-posta | sifre                 | sifre tekrari         |
            | ad_a | soyad_a | ad_a@gmail.com |                       |                       |
            | ad_b | soyad_b | ad_b@gmail.com | 1234567               | 1234567               |
            | ad_c | soyad_c | ad_c@gmail.com | 123456789012345678901 | 123456789012345678901 |
            | ad_d | soyad_d | ad_d@gmail.com | 12345678              |                       |
          
          Scenario Outline: sifre_tekrari_olmadan_giris
            Given kullanici ad alani "<ad alani>" girer
            When  kullanici soyad alanina "<soyad>" girer
            And   kullanici e-posta alanina gecerli bir "<e-posta>" girer
            And   kullanici sifre alanina "<sifre>" girer
            And   kullanici sifre tekrari alanina "<sifre tekrari>" girer
            And   kullanici kisisel verilerin korunmasi checkboxi isaretler
            And   kullanici uye ol butonuna tiklar
            When  kullanici sifreniz birbiriyle uyusmuyor mesajini gorur
            Then  kullanici sayfayi kapatir
            Examples:
              | ad alani | soyad  | e-posta            | sifre    | sifre tekrari |
              | ad1      | soyad1 | e-posta1@gmail.com | 12345678 |               |





