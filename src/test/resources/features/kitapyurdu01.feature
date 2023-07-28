@TC01
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
    And   kullanici adrese teslim et checkboxin secili oldugunu gorur
    And   kullanici adres ekle butonuna tiklar
    And   kullanici adiniz girer
    And   kullanici soyadiniz girer
    And   kullanici e-posta adresiniz girer
    And   kullanici ad_sirket adi girer
    And   kullanici soyad_unvan bilgilerini girer
    And   kullanici ulke olarak Türkiye secer
    And   kullanici sehir olarak Samsun secer
    And   kullanici ilce olarak Carsamba secer
    And   kullanici mahalle olarak Sarıcalı Mah secer
    And   kullanici adres girer
    And   kullanici posta kodu girer
    And   kullanici cep telefonu girer
    And   kullanici sabit telefon girer
    And   kullanici TC Kimlik No girer
    And   kullanici devam et butonuna tiklar







