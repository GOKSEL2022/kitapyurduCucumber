Feature: ilgi_gorenler
  Scenario: ilgi_gorenler_test
    Given kullanici ilgi gorenler basligina gelir
    When  kullanici ilgi gorenler tumunu goster linkine tiklar
    And   kullanici acilan sayfada ilgi gorenler basligini goruntuler
    And   kullanici ilgi gorenler kategorilerden edebiyati secer
    And   kullanici edebiyat alanindan anlati secenegine tiklar
    When  kullanici acilan sayfada ilgi gorenler basligini goruntuler
    Then  kullanici sayfayi kapatir