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
      And   kullanici favorilerime ekle secenegini tiklar
      And   kullanici urun basarili sekilde favorilerinize eklenedi mesajini gorur
      And   kullanici listelerim linkine gelir
      And   kullanici listelerim linkinde favorilerim secenegini tiklar
      And   kullanici favorilere ekledigi urunun favori listesinde oldugunu goruntuler
      And   kullanici sayfayi kapatir

      @adres_ekle
    Scenario: kayitli_kullanici_girisi_ile_urun_filtreleme_yapar
      Given kullanici dergi linkine tiklar
      When  kullanici dergi ile ilgili alanlarin acildigini dogrular
      And   kullanici edebiyat dergileri seceneginin uzerine gelir
      And   kullanici dil ve edebiyat secenegini tiklar
      And   kullanici ayni sayfadaki ilk urune tiklar
      And   kullanici sepete ekle butonuna tiklar
      And   kullanici urunun sepete eklendiginin belirten alerti gorur
      And   kullanici sepetim butonuna tiklar
      And   kullanici sepete git butonua tiklar
      And   kullanici urun miktarini goruntuler
      And   kullanici tedarik suresini goruntuler
      And   kullanici birim fiyati goruntuler
      And   kullanici toplam fiyati goruntuler
      And   kullanici satin al_index butonuna tiklar
      And   kullanici adres ekle butonuna tiklar
      And   kullanici Adres Ekle sayfasinin acildigini dogrular
      And   kullanici adres ekle sayfasina adres basligi girer
      And   kullanici ad_sirketAdi girer
      And   kullanici soyad_unvan girer
      And   kullanici ulke olarak Türkiye secer
      And   kullanici sehir olarak Samsun secer
      And   kullanici ilce olarak Carsamba secer
      And   kullanici mahalle girer
      And   kullanici adres girer
      And   kullanici posta_kodu girer
      And   kullanici cep_telefonu girer
      And   kullanici sabit_telefon girer
      And   kullanici fatura_turu secer
      And   kullanici TC kimlik no girer
      And   kullanici kaydet butonuna tiklar

