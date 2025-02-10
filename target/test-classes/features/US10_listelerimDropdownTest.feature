@listelerim_dropdown  @smoke  @regression
Feature: listelerim_dropdown_testi
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular

  @favorilerim
  Scenario: favorilerim_testi
    And   kullanici acilan menuden favorilerimi secer
    And   kullanici e-posta alanina kayitli e-posta girer
    And   kullanici sifre alanina kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar
    And   kullanici sayfaya kayitli hesap ile girdigini dogrular
    And   kullanici kabul et ve devam et butona tiklar
    And   kullanici kitapYurdu_com textine tiklar
    And   kullanici naneyi yedik lokantasi adli eseri favorileme ekler
    And   kullanici urun basarili sekilde favorilerinize eklenedi mesajini gorur
    And   kullanici listelerim dropdown uzerine gelir
    And   kullanici acilan menuden favorilerimi secer
    And   kullanici favorilerime ekli urunleri gorur
    And   kullanici secilen urunleri favori listesinden siler
    And   kullanici favorilere ekledigi urunun favori listesinden silindigini dogrular
    And   kullanici sayfayi kapatir

    Scenario: alisveris_listem_test
      And   kullanici acilan menuden alisveris listemi secer
      And   kullanici e-posta alanina kayitli e-posta girer
      And   kullanici sifre alanina kayitli sifresini girer
      And   kullanici beni hatirla checkboxi tiklar
      And   kullanici giris yap butonuna tiklar
      And   kullanici sayfaya kayitli hesap ile girdigini dogrular
      And   kullanici kabul et ve devam et butona tiklar
      And   kullanici kitapYurdu_com textine tiklar
      And   kullanici alisveris listem sayfasinda ekli urunleri goruntuler
      And   kullanici alisveris listem sayfasindaki ekli urunleri siler
      And   kullanici alisveris listeme ekledigi urunun alisveris listesinden silindigini dogrular
      And   kullanici sayfayi kapatir

      @okuma_listelerim
      Scenario: okuma_listelerim_test
        And   kullanici acilan menuden okuma listelerimi secer
        And   kullanici e-posta alanina kayitli e-posta girer
        And   kullanici sifre alanina kayitli sifresini girer
        And   kullanici beni hatirla checkboxi tiklar
        And   kullanici giris yap butonuna tiklar
        And   kullanici okuma listelerim sayfasinda ekli urunleri goruntuler
        And   kullanici okuma listelerim sayfasindaki ekli urunleri siler
        And   kullanici okuma listelerim ekledigi urunun alisveris listesinden silindigini dogrular
        And   kullanici kitapYurdu_com textine tiklar
        And   kullanici kavgam kitabina tiklar
        And   kullanici okuyacagim linke tiklar
        And   kullanici Kavgam urunu Okuyacagim listenize eklendi alerti goruntuler
        And   kullanici okuyorum linke tiklar
        And   kullanici Kavgam urunu Okuyorum listenize eklendi alerti goruntuler
        And   kullanici okudum linke tiklar
        And   kullanici Kavgam urunu Okudum listenize eklendi alerti goruntuler
        And   kullanici sayfayi kapatir



    