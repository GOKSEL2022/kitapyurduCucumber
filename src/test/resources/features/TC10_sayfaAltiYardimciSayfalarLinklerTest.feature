Feature: sayfa_altinda_yer_alan_linklerin_testi
  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici anasayfanin en altina gelir

    @yardimciSayfalar
  Scenario: yardimci_sayfalar_linklerinin_calistigi_dogrulanir
      And kullanici yardim ve islem rehberi linke tiklar
      And kullanici yardim sayfasina yönlendirildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici video yardim linke tiklar
      And kullanici video sayfasinin acildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici havale_EFTBilgileri linke tiklar
      And kullanici havale_EFTBilgilerinin goruntulendigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici musteri hizmetleri linke tiklar
      And kullanici musteri hizmetleri sayfasinin acildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici platin uyelik linke tiklar
      And kullanici platin uyelik sayfasinin acildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici gumus uyelik linke tiklar
      And kullanici gumus uyelik sayfasinin acildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici teslim noktalari linke tiklar
      And kullanici teslim noktalari sayfasinin acildigini dogrular
      And kullanici anasayfanin en altina gelir
      And kullanici hemen al linke tiklar
      And kullanici hemen al sayfasinin acildigini dogrular
      Then kullanici sayfayi kapatir

