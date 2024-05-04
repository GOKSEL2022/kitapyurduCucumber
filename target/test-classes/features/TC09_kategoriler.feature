@kategoriler
Feature: kategoriler_test
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


  Scenario: kategoriler
    Given kullanici kategoriler basligina gelir
    And   kullanici kategoriler tumunu goster linkine tiklar
    And   kullanici acilan sayfada tum kategorileri goruntuler
    And   kullanici tum kategoriler icinden edebiyata tiklar
    And   kullanici acilan sayfada edebiyat urunleri oldugunu dogrular
    And   kullanici alt kategorilerden belgesel romana tiklar
    And   kullanici acilan sayfada belgesel roman basligini goruntuler
    And   kullanici listeyi daralt menuden Ayse Kulin i  secer
    And   kullanici acilan sayfada Ayse Kulin in romanlarini goruntuler
    And   kullanici sayfadaki urunleri sepete ekler
    And   kullanici urunun sepete eklendiginin belirten alerti gorur
    Then  kullanici sayfayi kapatir

    @onayli_yorumlar
    Scenario: onayli_yorumlar
      Given kullanici anasayfanin en altina gelir
      When  kullanici onayli yorumlar linkine tiklar
      And   kullanici onayli yorumlarla ilgili secenekleri goruntuler
      And   kullanici onayli yorumlari inceleyin secenegine tiklar
      And   kullanici onayli yorumlar sayfasinin acildigini dogrular
      And   kullanici sirala dropdownindan en begenilenleri secer
      And   kullanici en begenilen yorum ile en yeni yorumun ayni olmadigini dogrular
      And   kullanici yorumun yaninda ilgili kitabi gorur
      And   kullanici yorumlarin altinda bulunan evet sembolunun aktif oldugunu dogrular
      And   kullanici evet sembolunden sonra hayir sembolune tikladiginda bu yorumu daha once oyladiniz uyarisini gorur
      And   kullanici bu yorumu yanitla linke tiklar
      When  kullanici yanitlama iznine sahip degilsiniz uyarisini gorur
      Then  kullanici sayfayi kapatir


