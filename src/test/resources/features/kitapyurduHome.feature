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

    Scenario:anasayfa_altinda_iletisim_alani_doldurulur
      Given kullanici anasayfanin en altina gelir
      When  kullanici iletisim linkine tiklar
      And   kullanici seciniz dropdownından Öneri secer
      And   kullanici adiniz alanina "<adiniz>" girer
      And   kullanici e-posta adresiniz "<e-posta adresiniz>" girer
      And   kullanici mesajiniz alanina "<mesajiniz>" girer
      And   kullanici dogrulama kodu alanina "<dogrulama kodu>" girer
      When  kullanici gonder butona tiklar
      Then  kullanici dogrulama kodu yanlis uyarisini gorur










