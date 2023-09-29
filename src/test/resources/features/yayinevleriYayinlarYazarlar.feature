Feature: yayinevleri_yayinlari_ve_yazarlari_inceler
  Background: kayitli_olarak_sayfaya_girer
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris yap linkine tiklar
    And   kullanici e-posta alanina gecerli bir "yekparebiran@gmail.com" girer.
    And   kullanici sifre alanina kayitli sifresini "123456789a." girer.
    And   kullanici beni hatirla checkboxi tiklar.
    And   kullanici giris yap butonuna tiklar.
    And   kullanici sayfaya kayitli hesap ile girdigini dogrular
    And   kullanici kitapYurdu_com textine tiklar

    @haftanin_yayinevi
    Scenario:haftanin_yayinevi
      Given kullanici haftanin yayinevi basligina gelir
      When  kullanici secilen yayinevini goruntuler
      And   kullanici yapilan indirim miktarini goruntuler
      And   kullanici tumunu goster linkine tiklar
      And   kullanici acilan sayfada haftanin yayinevinin adini goruntuler
      And   kullanici cok satanlar icindeki ilk urune tiklar
      When  kullanici acilan urunun ayni yayinevine ait oldugunu dogrular
      Then  kullanici sayfayi kapatir

    Scenario: ayin_yayinevleri
      Given kullanici ayin yayinevleri basligina gelir
      When  kullanici ayin yayinevi basligi altinda yayinevlerinin adlarini gorur
      And   kullanici ayin_yayinevleri tumunu goster linkine tiklar
      And   kullanici ayin_yayinevleri_tumunu_goster acilan sayfada ayin yayinevleri textini goruntuler
      And   kullanici bir yayinevine tiklar
      And   kullanici tikladigi yayinevinin adini acilan sayfada goruntuler
      And   kullanici secilen yayinevi sayfasindaki ilk urune tiklar
      When  kullanici urun adinin yaninda secilen yayinevinin adini gorur
     # Then  kullanici sayfayi kapatir











