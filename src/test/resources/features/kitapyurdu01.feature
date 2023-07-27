Feature: anasayfa_acilisi
  Scenario: kitapyurdu_sayfasi_acilir
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici arama cubugunda safahat aratir
    And   kullanici arama sonuclarinda safahat oldugunu dogrular
    And   kullanici safahat kitabina tiklar
    And   kullanici safahat ile ilgili aciklama yazisini gorur
    And   kullanici sepete ekle butonuna tiklar
    And   kullanici urunun sepete eklendiginin belirten alerti gorur
    And   kullanici sepetim butonuna tiklar
    And   kullanici satin al butonuna tiklar
    And   kullanici uye olmadan devam et butonuna tiklar
    And   Kullanici





