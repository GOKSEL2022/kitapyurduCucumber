Feature: ilgi_gorenler
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

  @ilgi_gorenler
  Scenario: ilgi_gorenler_test
    Given kullanici ilgi gorenler basligina gelir
    When  kullanici ilgi gorenler tumunu goster linkine tiklar
    And   kullanici acilan sayfada ilgi gorenler basligini goruntuler
    And   kullanici ilgi gorenler kategorilerden edebiyati secer
    And   kullanici edebiyat alanindan anlati secenegine tiklar
    When  kullanici acilan sayfada ilgi gorenler basligini goruntuler
    And   kullanici listeyiDaralt tum kategoriler linke tiklar
    And   kullanici kategorilerTarih kisisel gelisim linke tiklar
    And   kullanici listelenen urun sayisi ile sayfadaki urun sayisinin esit oldugunu dogrular
    Then  kullanici sayfayi kapatir