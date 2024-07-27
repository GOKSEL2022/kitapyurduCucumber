Feature: listelerim_dropdown_testi
  Scenario: Listelerim menu testi
    Given kullanici kitapyurdu_url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici listelerim dropdown uzerine gelir
    And   kullanici acilan menuden favorilerimi secer
    And   kullanici e-posta alanina kayitli e-posta girer
    And   kullanici sifre alanina kayitli sifresini girer
    And   kullanici beni hatirla checkboxi tiklar
    And   kullanici giris yap butonuna tiklar