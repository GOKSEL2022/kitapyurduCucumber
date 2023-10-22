Feature:kullanici_anasayfadaki_fonksiyonlari_kullanabilir

  Background:
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici bir saniye bekler

  Scenario:anasayfadaki_fonksiyonlar_kullanilir
    And   kullanici anasayfanin en altina gelir
    And   kullanici bir saniye bekler
    And   kullanici anasayfanin en üst kismina gider
    And   kullanici bir saniye bekler
    Then  kullanici sayfayi kapatir

  Scenario: anasayfadaki_sag_sol_kaydiricilar_test_edilir
    Given kullanici sag yon tusuna tiklar
    When  kullanici sag yon tusunun erisilebilir oldugunu dogrular
    And   kullanici bir saniye bekler
    And   kullanici sol yon tusuna tiklar
    And   kullanici sol yon tusunun erisilebilir oldugunu dogrular
    And   kullanici bir saniye bekler
    And   kullanici anasayfada birden fazla resim oldugunu dogrular
    Then  kullanici sayfayi kapatir

  Scenario: anasayfadaki_urunleri_sepete_ekleme_ve_sepetten_silme
    Given kullanici anasayfadaki ilk urune tiklar
    When  kullanici secilen urunun sayfada goruntulendigini dogrular
    And   kullanici urunun yaninda aciklama yazisini goruntuler
    And   kullanici urunun altinda yorum bolumunu goruntuler
    And   kullanici urunle ilgili aciklamanin altinda temel bilgileri (sayfa,cilt) goruntuler
    And   kullanici urunun yaninda fiyat bilgisini goruntuler
    And   kullanici sepete ekle butonuna tiklar
    And   kullanici urunun sepete eklendiginin belirten alerti gorur
    And   kullanici sepetim butonuna tiklar
    And   kullanici sepete git butonua tiklar
    And   kullanici sectigi urunun sepete eklendigini goruntuler
    And   kullanici bir saniye bekler
    And   kullanici urun basliginin yanindaki radio butonu tiklar
    And   kullanici bir saniye bekler
    And   kullanici urun gorselinin yanindaki radio butonu tiklar
    And   kullanici bir saniye bekler
    And   kullanici urunun altinda alisveris sonrasi kazanacagi puani goruntuler
    And   kullanici bir saniye bekler
    And   kullanici urun miktarini goruntuler
    And   kullanici bir saniye bekler
    And   kullanici tedarik suresini goruntuler
    And   kullanici bir saniye bekler
    And   kullanici birim fiyati goruntuler
    And   kullanici bir saniye bekler
    And   kullanici toplam fiyati goruntuler
    And   kullanici bir saniye bekler
    And   kullanici secili urunu sepetten kaldirmak icin x e tiklar
    When  kullanici secilen Urunun sepetten Cikarildigini dogrular
    Then  kullanici sayfayi kapatir

  Scenario Outline: anasayfa_onerim_var
    Given kullanici fikrinizi bizimle paylasir misiniz sembolune tiklar
    When  kullanici onerim var formunun acildigini dogrular
    And   kullanici ad-soyad alanina "<ad soyad>" girer
    And   kullanici e-posta alanina "<e-posta>" girer
    And   kullanici seciniz kismindan oneriyi secer
    And   kullanici gorusunuz alanina "<gorus>" girer
    And   kullanici dogrulama kodu kismina alti haneli sayi girer
    And   kullanici gonder butonuna tiklar
    When  kullanici girmis oldugunuz dogrulama kodu hatalidir uyarisini gorur
    Then  kullanici sayfayi kapatir
    Examples:
      | ad soyad        | e-posta         | gorus                    |
      | Adi bende sakli | sakli@gmail.com | Akla gelmeyen basa gelir |

    Scenario Outline:anasayfa_altinda_iletisim_alani_doldurulur
      Given kullanici anasayfanin en altina gelir
      When  kullanici iletisim linkine tiklar
      And   kullanici seciniz dropdownindan oneri secer
      And   kullanici adiniz alanina "<adiniz>" girer
      And   kullanici e-posta adresiniz "<e-posta adresiniz>" girer
      And   kullanici mesajiniz alanina "<mesajiniz>" girer
      And   kullanici dogrulama kodu alanina "<dogrulama kodu>" girer
      When  kullanici gonder butona tiklar
      Then  kullanici dogrulama kodu yanlis uyarisini gorur
      Then  kullanici sayfayi kapatir
      Examples:
        | adiniz | e-posta adresiniz | mesajiniz                            | dogrulama kodu |
        | adsiz  | adisz@gmail.com   | adini ben verdim yasini Allah versin | dogrulama kodu |

     Scenario:anasayfadaki_turuncu_arac_cubugu_alanlarin_dogrulama_testi
       Given kullanici cok satan kitaplar basliginin uzerine gelir
       When  kullanici haftalik cok satan kitaplar basligina tiklar
       And   kullanici haftalik cok satan kitaplar sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici yeni cikan kitaplar basligini uzerine gelir
       And   kullanici bir saniye bekler
       And   Kullanici haftalik yeni cikan kitaplar basligina tiklar
       And   kullanici haftalik yeni cikan kitaplar sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici tum kitaplar basliginin uzerine gelir
       And   kullanici tum kitaplar basliginin altinda edebiyat secenegine tiklar
       And   kullanici edebiyat sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici yayincilar basligina tiklar
       And   kullanici yayincilar sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici yazarlar basligina tiklar
       And   kullanici yazarlar sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici cocuk kitaplari basligina tiklar
       And   kullanici cocuk kitaplari sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici sinav kitaplari basligina tiklar
       And   kullanici sinav kitaplari sayfasinin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici ne okusam basligina tiklar
       When  kullanici ne okusam sayfasinin acildigini dogrular
       Then  kullanici sayfayi kapatir

       @gri_alan_testi
     Scenario: anasayfadaki_gri_arac_cubugundaki_alanlarin_testi
       Given kullanici dergi linkine tiklar
       When  kullanici dergi ile ilgili alanlarin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici hobi_oyuncak linkine tiklar
       And   kullanici hobi_oyuncak ile ilgili alanlarin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici kirtasiye linkine tiklar
       And   kullanici kirtasiye ile ilgili alanlarin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici kirkambar linkine tiklar
       And   kullanici temali ve lisansli urunler alaninin acildigini dogrular
       And   kullanici bir saniye bekler
       And   kullanici tum kategoriler linkine tiklar
       And   kullanici tum kategori seceneklerinin gorunur oldugunu dogrular
       And   kullanici bir saniye bekler
       And   kullanici kampanyalar linkine tiklar
       And   kullanici one cikan kampanyalari goruntuler
       And   kullanici bir saniye bekler
       And   kullanici puan katalogu linkine tiklar
       When  kullanici puan katalogu sayfasinin acildigini dogrular
       Then  kullanici sayfayi kapatir

         @siyah_alan_testi
     Scenario:anasayfadaki_siyah_arac_cubugu_seceneklerinin_testi
       Given kullanici listelerim linkine gelir
       When  kullanici acilan listelerim alt secenekleri goruntuler
       And   kullanici siparis takibi linkine gelir
       And   kullanici acilan siparis takibi alt seceneklerini goruntuler
       And   kullanici Turkce linkine gelir
       And   kullanici acilan Turkce alt seceneklerini goruntuler
       And   kullanici TL secenegini gelir
       And   kullanici acilan TL alt seceneklerini goruntuler
       And   kullanici yardim linkine gelir
       And   kullanici yardim ve islem rehberi secenegini goruntuler
       Then  kullanici sayfayi kapatir

     Scenario: alisveris_listesine_ekleme_testi
       Given kullanici anasayfadaki ilk urune gelir
       When  kullanici sayfadaki ilk urunu sepete ekler
       And   kullanici urun alisveris listenize eklendi alertini gorur
       And   kullanici goruntulenen alerte tiklar
       And   kullanici sectigi urunu alisveris listesinde goruntuler
       And   kullanici bir onceki sayfaya doner
       When  kullanici eklemis oldugu urunun tekrar listeye eklenebilecegini dogrular
       Then  kullanici sayfayi kapatir


























