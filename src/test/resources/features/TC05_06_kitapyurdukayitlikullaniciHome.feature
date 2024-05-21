@regression
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
      And   kullanici adres ekle butonuna tiklar.
      And   kullanici Adres Ekle sayfasinin acildigini dogrular
      And   kullanici adres ekle sayfasina adres basligi girer
      And   kullanici ad_sirketAdi girer
      And   kullanici soyad_unvan girer
      And   kullanici ulke girer
      And   kullanici sehir girer
      And   kullanici ilce girer
      And   kullanici mahalle girer
      And   kullanici adres girer
      And   kullanici posta_kodu girer
      And   kullanici cep_telefonu girer
      And   kullanici sabit_telefon girer
      And   kullanici fatura_turu secer
      And   kullanici TC kimlik no girer
      And   kullanici kaydet butonuna tiklar
      And   kullanici kart ile ode basligini goruntuler
      And   kullanici rastgele kart numarasi girer
      And   kullanici kart uzerindeki isim girer
      And   kullanici son kullanma tarihi girer
      And   kullanici CVC girer
      And   kullanici toplam tutari goruntuler
      When  kullanici kart numarasi gecersiz kontrol ediniz alertini gorur
      Then kullanici sayfayi kapatir

        @kelepir
        Scenario:kayitli_kullanici_olarak_anasayfada_kelepir_arama_yapma
          Given kullanici kitapYurdu_com textine tiklar
          When kullanici anasayfanin en altina gelir
          And   kullanici konu dropdownindan cocuk kitaplarini secer
          And   kullanici fiyat ust sinir textboxina ucret olarak yuz elli girer
          And   kullanici indirim alt sinir dropdownindan yuzde yetmisi secer
          And   kullanici kelepir ara butonuna tiklar
          And   kullanici listelenen urun sayisini gorur
          And   kullanici sayfada bulunan urunlerin hepsini sepete ekler
          And   kullanici urunun sepete eklendiginin belirten alerti gorur
          And   kullanici sepetim butonuna tiklar
          And   kullanici secili urunleri sepetten kaldirmak icin x e tiklar
          When  kullanici alisveris sepetiniz bos yazisini gorur
          Then  kullanici sayfayi kapatir







