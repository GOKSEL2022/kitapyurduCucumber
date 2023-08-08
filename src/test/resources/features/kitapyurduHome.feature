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

  Scenario: anasayfadaki_urunleri_sepete_ekleme
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
    And   kullanici urun basliginin yanindaki radio butonun secilebilir oldugunu dogrular
    And   kullanici urun gorselinin yanindaki radio butonun secilebilir oldugunu dogrular
    And   kullanici urunun altinda alisveris sonrasi kazanacagi puani goruntuler
    And   kullanici urun miktarini goruntuler
    And   kullanici tedarik suresini goruntuler
    And   kullanici birim fiyati goruntuler
    And   kullanici toplam fiyati goruntuler
    And   kullanici secili urunu sepetten kaldirmak icin x e tiklar
    When  kullanici secilen Urunun sepetten Cikarildigini dogrular
    Then  kullanici sayfayi kapatir





