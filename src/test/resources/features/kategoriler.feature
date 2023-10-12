Feature: kategoriler_test
  Scenario: kategoriler
    Given kullanici kategoriler basligina gelir
    When  kullanici yedi kez tumunu goster ileri tusuna tiklar
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