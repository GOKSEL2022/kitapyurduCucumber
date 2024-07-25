Feature: listelerim_dropdown_testi
  Scenario: Listelerim menu testi
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici listelerim dropdown uzerine gelir
    And   kullanici acilan menuden favorilerimi secer