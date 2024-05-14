@smoke  @regression
Feature: sayfa_altinda_yer_alan_linklerin_testi
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici anasayfanin en altina gelir

    @yardimciSayfalar
  Scenario: yardimci_sayfalar_linklerinin_calistigi_dogrulanir
      And kullanici yardim ve islem rehberi linke tiklar
      And kullanici yardim sayfasina yönlendirildigini dogrular
      And kullanici bir saniye bekler
      And kullanici anasayfanin en altina gelir
      And kullanici video yardim linke tiklar
      And kullanici video sayfasinin acildigini dogrular
      And kullanici kabul et ve devam et butona tiklar
      And kullanici bir saniye bekler
      And kullanici anasayfanin en altina gelir
      And kullanici havale_EFTBilgileri linke tiklar
      And kullanici havale_EFTBilgilerinin goruntulendigini dogrular
      And kullanici bir saniye bekler
      And kullanici sayfayi yeniler
      And kullanici bir saniye bekler
      And kullanici musteri hizmetleri linke tiklar
      And kullanici musteri hizmetleri sayfasinin acildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici platin uyelik linke tiklar
      And kullanici platin uyelik sayfasinin acildigini dogrular
      And kullanici gumus uyelik linke tiklar
      And kullanici gumus uyelik sayfasinin acildigini dogrular
      And kullanici teslim noktalari linke tiklar
      And kullanici teslim noktalari sayfasinin acildigini dogrular
      And kullanici hemen al linke tiklar
      And kullanici hemen al sayfasinin acildigini dogrular
      Then kullanici sayfayi kapatir

    @populerSayfalar
    Scenario:   populer_sayfalar_linklerinin_calistigi_dogrulanir
        And kullanici cok satan kitaplar linke tiklar
        And kullanici cok satan kitaplar sayfasina yonlendirildigini dogrular
        And kullanici anasayfanin en altina gelir
        And kullanici yeni cikan kitaplar linke tiklar
        And kullanici yeni cikan kitaplar sayfasinin acildigini dogrular
        And kullanici kabul et ve devam et butona tiklar
        And kullanici anasayfanin en altina gelir
        And kullanici kargo odeyen avantajli urunler linke tiklar
        And kullanici kargo odeyen avantajli urunler sayfasinin acildigini dogrular
        And kullanici anasayfanin en altina gelir
        And kullanici kampanyalar linke tiklar
        And kullanici kampanyalar sayfasinin acildigini dogrular
        And kullanici anasayfanin en altina gelir
        And kullanici ayin yazarlari linke tiklar
        And kullanici ayin yazarlari sayfasinin acildigini dogrular
        And kullanici anasayfanin en altina gelir
        And kullanici ayin yayinevleri linke tiklar
        And kullanici ayin yayinevleri sayfasinin acildigini dogrular
        And kullanici anasayfanin en altina gelir
        And kullanici puan katalogu linke tiklar
        And kullanici puan katalogu sayfasinin acildigini dogrular
        And kullanici bir saniye bekler
        And kullanici anasayfanin en altina gelir
        And kullanici eDergi linke tiklar
        And kullanici eDergi sayfasinin acildigini dogrular
        And kullanici bir saniye bekler
        And kullanici anasayfanin en altina gelir
        And kullanici ne okusam linke tiklar
        And kullanici ne okusam sayfasinin acildigini dogrular
        And kullanici bir saniye bekler
        And kullanici anasayfanin en altina gelir
        And kullanici kelepir kitaplar linke tiklar
        And kullanici kelepir kitaplar sayfasinin acildigini dogrular
        And kullanici bir saniye bekler
        And kullanici anasayfanin en altina gelir
        And kullanici Kitap Hediye Kartlari linke tiklar
        And kullanici Kitap Hediye Kartlarir sayfasinin acildigini dogrular
        Then kullanici sayfayi kapatir

     @ozelSayfalar
    Scenario: ozelSayfalar_linkleri_test_edilir
         And kullanici sinav kitaplari linke tiklar
         And kullanici sinav kitaplari sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici cocuk kitaplari linke tiklar
         And kullanici cocuk kitaplari sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici cep boy kitaplar linke tiklar
         And kullanici cep boy kitaplar sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici ingilizce kitaplar linke tiklar
         And kullanici ingilizce kitaplar sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici bookinzi kultur_sanat urunleri linke tiklar
         And kullanici bookinzi kultur_sanat urunleri sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici oyundan daha fazlasi linke tiklar
         And kullanici oyundan daha fazlasi sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici montessori oyuncaklari linke tiklar
         And kullanici montessori oyuncaklari sayfasinin acildigini dogrular
         And kullanici king of puzzle urunleri linke tiklar
         And kullanici king of puzzle urunleri sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici akil defteri linke tiklar
         And kullanici akil defteri sayfasinin acildigini dogrular
         And kullanici anasayfanin en altina gelir
         And kullanici sayfayi kapatir








