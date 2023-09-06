@kayitli_kullanici_home
Feature: kayitli_kullanici_hesabi_ile_sayfa_testi
  Background:kayitli_kullanici_girisi_ile_anasayfaya_erisir
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici e-posta alanina gecerli bir "yekparebiran@gmail.com" girer.
    And   kullanici sifre alanina kayitli sifresini "123456789a." girer.
    And   kullanici beni hatirla checkboxi tiklar.
    And   kullanici giris yap butonuna tiklar.
    And   kullanici sayfaya kayitli hesap ile girdigini dogrular

    Scenario: kayitli_kullanici_girisi_ile_anasayfada_islem_yapar
      Given kullanici dergi linkine tiklar
      When  kullanici dergi ile ilgili alanlarin acildigini dogrular
      And   kullanici edebiyat dergileri seceneginin uzerine gelir
      And   kullanici dil ve edebiyat secenegini tiklar
      And   kullanici urunlerin listelendigi sayfada oldugunu dogrular
      And   kullanici sayfadaki ilk urune tiklar
      And   kullanici urunun yaninda fiyat bilgisini goruntuler
      And   kullanici urunun yaninda aciklama yazisini goruntuler
      And   kullanici sepete ekle butonuna tiklar
      And   kullanici urunun sepete eklendiginin belirten alerti gorur
      And   kullanici sepetim butonuna tiklar
      And   kullanici sepete git butonua tiklar
      And   kullanici urun miktarini goruntuler
      And   kullanici tedarik suresini goruntuler
      And   kullanici birim fiyati goruntuler
      And   kullanici toplam fiyati goruntuler
      And   kullanici satin al butonuna tiklar
      And   kullanici adres ekle butonuna tiklar
      And   kullanici adres
