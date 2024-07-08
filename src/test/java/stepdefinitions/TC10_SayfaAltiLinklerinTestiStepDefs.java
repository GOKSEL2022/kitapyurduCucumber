package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class TC10_SayfaAltiLinklerinTestiStepDefs {
    AllPages allPages=new AllPages();
    @And("kullanici yardim ve islem rehberi linke tiklar")
    public void kullaniciYardimVeIslemRehberiLinkeTiklar() {
        clickByJS(allPages.homePage().yardimVeIslemRehberiLinkSayfaAltiHome);
    }
    @And("kullanici yardim sayfasina yönlendirildigini dogrular")
    public void kullaniciYardimSayfasinaYönlendirildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yardim");
    }
    @And("kullanici video yardim linke tiklar")
    public void kullaniciVideoYardimLinkeTiklar() {
        clickByJS(allPages.homePage().videoYardimLinkSayfaAltiHome);
    }
    @And("kullanici video sayfasinin acildigini dogrular")
    public void kullaniciVideoSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yardim/video");
    }
    @And("kullanici havale_EFTBilgileri linke tiklar")
    public void kullaniciHavale_EFTBilgileriLinkeTiklar() {
        clickByJS(allPages.homePage().havaleEFTBilgileriLinkSayfaAltiHome);
    }
    @And("kullanici havale_EFTBilgilerinin goruntulendigini dogrular")
    public void kullaniciHavale_EFTBilgilerininGoruntulendiginiDogrular() {
        assert allPages.yardim_videoPage().bankaHesapBilgilerimizTextTitleYardimVideo.isDisplayed();
    }
    @And("kullanici musteri hizmetleri linke tiklar")
    public void kullaniciMusteriHizmetleriLinkeTiklar() {
        clickByJS(allPages.homePage().musteriHizmetleriLinkSayfaAltiHome);
    }
    @And("kullanici musteri hizmetleri sayfasinin acildigini dogrular")
    public void kullaniciMusteriHizmetleriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("iletisim");
    }
    @And("kullanici platin uyelik linke tiklar")
    public void kullaniciPlatinUyelikLinkeTiklar() {
        clickByJS(allPages.homePage().platinUyelikLinkSayfaAltiHome);
    }
    @And("kullanici platin uyelik sayfasinin acildigini dogrular")
    public void kullaniciPlatinUyelikSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("platin-uyelik");
    }
    @And("kullanici gumus uyelik linke tiklar")
    public void kullaniciGumusUyelikLinkeTiklar() {
        clickByJS(allPages.homePage().gumusUyelikLinkSayfaAltiHome);
    }
    @And("kullanici gumus uyelik sayfasinin acildigini dogrular")
    public void kullaniciGumusUyelikSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("gumus-uyelik");
    }
    @And("kullanici teslim noktalari linke tiklar")
    public void kullaniciTeslimNoktalariLinkeTiklar() {
        clickByJS(allPages.homePage().teslimNoktalariLinkSayfaAltiHome);
    }
    @And("kullanici teslim noktalari sayfasinin acildigini dogrular")
    public void kullaniciTeslimNoktalariSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("teslim-noktalari");
    }
    @And("kullanici hemen al linke tiklar")
    public void kullaniciHemenAlLinkeTiklar() {
        clickByJS(allPages.homePage().hemenAlLinkSayfaAltiHome);
    }
    @And("kullanici hemen al sayfasinin acildigini dogrular")
    public void kullaniciHemenAlSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hemen-al");
    }
    @And("kullanici sayfayi yeniler")
    public void kullaniciSayfayiYeniler() {
        Driver.getDriver().navigate().refresh();
    }
    @And("kullanici kabul et ve devam et butona tiklar")
    public void kullaniciKabulEtVeDevamEtButonaTiklar() {
        clickByJS(allPages.yardim_videoPage().kabulEtVeKapatButonYardimVideo);
    }
    @When("kullanici cok satan kitaplar linke tiklar")
    public void kullanici_cok_satan_kitaplar_linke_tiklar() {
        clickByJS(allPages.homePage().cokSatanKitaplarLinkSayfaAltiHome);
    }
    @When("kullanici cok satan kitaplar sayfasina yonlendirildigini dogrular")
    public void kullanici_cok_satan_kitaplar_sayfasina_yonlendirildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("cok-satan-kitaplar");
    }
    @When("kullanici yeni cikan kitaplar linke tiklar")
    public void kullanici_yeni_cikan_kitaplar_linke_tiklar() {
        clickByJS(allPages.homePage().yeniSatanKitaplarLinkSayfaAltiHome);
    }
    @When("kullanici yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullanici_yeni_cikan_kitaplar_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yeni-cikan-kitaplar");
    }
    @When("kullanici kargo odeyen avantajli urunler linke tiklar")
    public void kullanici_kargo_odeyen_avantajli_urunler_linke_tiklar(){
        clickByJS(allPages.homePage().kargoOdeyenAvantajliUrunlerLinkSayfaAltiHome);
    }
    @When("kullanici kargo odeyen avantajli urunler sayfasinin acildigini dogrular")
    public void kullanici_kargo_odeyen_avantajli_urunler_sayfasinin_acildigini_dogrular() {
        assert allPages.homePage().kargoOdeyenAvantajliUrunlerLinkSayfaAltiHome.getText().contains("Kargo Ödeyen Avantajlı Ürünler");
    }
    @When("kullanici kampanyalar linke tiklar")
    public void kullanici_kampanyalar_linke_tiklar() {
        clickByJS(allPages.homePage().kampanyalarLinkSayfaAltiHome);
    }
    @When("kullanici kampanyalar sayfasinin acildigini dogrular")
    public void kullanici_kampanyalar_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kampanyalar");
    }
    @When("kullanici ayin yazarlari linke tiklar")
    public void kullanici_ayin_yazarlari_linke_tiklar() {
        clickByJS(allPages.homePage().ayinYazarlariLinkSayfaAltiHome);
    }
    @When("kullanici ayin yazarlari sayfasinin acildigini dogrular")
    public void kullanici_ayin_yazarlari_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getPageSource().contains("ayin-yazarlari");
    }
    @When("kullanici ayin yayinevleri linke tiklar")
    public void kullanici_ayin_yayinevleri_linke_tiklar() {
        clickByJS(allPages.homePage().ayinYayinevleriLinkSayfaAltiHome);
    }
    @When("kullanici ayin yayinevleri sayfasinin acildigini dogrular")
    public void kullanici_ayin_yayinevleri_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getPageSource().contains("ayin-yayinevleri");
    }
    @When("kullanici puan katalogu linke tiklar")
    public void kullanici_puan_katalogu_linke_tiklar() {
        clickByJS(allPages.homePage().puanKataloguLinkSayfaAltiHome);
    }
    @When("kullanici eDergi linke tiklar")
    public void kullanici_e_dergi_linke_tiklar() {
        clickByJS(allPages.homePage().eDergiLinkSayfaAltiHome);
    }
    @When("kullanici eDergi sayfasinin acildigini dogrular")
    public void kullanici_e_dergi_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("magazine/book_magazine");
    }
    @When("kullanici ne okusam linke tiklar")
    public void kullanici_ne_okusam_linke_tiklar() {
        clickByJS(allPages.homePage().neOkusamLinkSayfaAltiHome);
    }
    @When("kullanici kelepir kitaplar linke tiklar")
    public void kullanici_kelepir_kitaplar_linke_tiklar() {
        clickByJS(allPages.homePage().kelepirKitaplarLinkSayfaAltiHome);
    }
    @When("kullanici kelepir kitaplar sayfasinin acildigini dogrular")
    public void kullanici_kelepir_kitaplar_sayfasinin_acildigini_dogrular() {
        assert allPages.indexPage().kelepirTextTitleIndex.isDisplayed();
    }
    @When("kullanici Kitap Hediye Kartlari linke tiklar")
    public void kullanici_kitap_hediye_kartlari_linke_tiklar() {
        clickByJS(allPages.homePage().kitapHediyeKartlariLinkSayfaAltiHome);
    }
    @When("kullanici Kitap Hediye Kartlarir sayfasinin acildigini dogrular")
    public void kullanici_kitap_hediye_kartlarir_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kategori/cesitli-kitap-hediye-karti");
    }
    @And("kullanici sinav kitaplari linke tiklar")
    public void kullaniciSinavKitaplariLinkeTiklar() {
        clickByJS(allPages.homePage().sinavKitaplariLinkSayfaAltiHome);
    }
    @And("kullanici cocuk kitaplari linke tiklar")
    public void kullaniciCocukKitaplariLinkeTiklar() {
        clickByJS(allPages.homePage().cocukKitaplariLinkSayfaAltiHome);
    }
    @And("kullanici cep boy kitaplar linke tiklar")
    public void kullaniciCepBoyKitaplarLinkeTiklar() {
        clickByJS(allPages.homePage().cepBoyKitaplariLinkSayfaAltiHome);
    }
    @And("kullanici cep boy kitaplar sayfasinin acildigini dogrular")
    public void kullaniciCepBoyKitaplarSayfasininAcildiginiDogrular() {
        assert allPages.indexPage().cepBoyLitaplardaTekFiyatTextTitleIndex.isDisplayed();
    }
    @And("kullanici ingilizce kitaplar linke tiklar")
    public void kullaniciIngilizceKitaplarLinkeTiklar() {
        clickByJS(allPages.homePage().ingilizceKitaplarLinkSayfaAltiHome);
    }
    @And("kullanici ingilizce kitaplar sayfasinin acildigini dogrular")
    public void kullaniciIngilizceKitaplarSayfasininAcildiginiDogrular() {
        assert allPages.indexPage().ingilizceKitaplarArtikCepYakmiyorTextIndex.isDisplayed();
    }
    @And("kullanici bookinzi kultur_sanat urunleri linke tiklar")
    public void kullaniciBookinziKultur_sanatUrunleriLinkeTiklar() {
        clickByJS(allPages.homePage().bookinziKulturSanatUrunleriLinkSayfaAltiHome);
    }
    @And("kullanici bookinzi kultur_sanat urunleri sayfasinin acildigini dogrular")
    public void kullaniciBookinziKultur_sanatUrunleriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getPageSource().contains("bookinzi");
    }
    @And("kullanici oyundan daha fazlasi linke tiklar")
    public void kullaniciOyundanDahaFazlasiLinkeTiklar() {
        clickByJS(allPages.homePage().oyundanDahaFazlasiLinkSayfaAltiHome);
    }
    @And("kullanici oyundan daha fazlasi sayfasinin acildigini dogrular")
    public void kullaniciOyundanDahaFazlasiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("hobi-oyuncak");
    }
    @And("kullanici montessori oyuncaklari linke tiklar")
    public void kullaniciMontessoriOyuncaklariLinkeTiklar() {
        clickByJS(allPages.homePage().montessoriOyuncaklariLinkSayfaAltiHome);
    }
    @And("kullanici montessori oyuncaklari sayfasinin acildigini dogrular")
    public void kullaniciMontessoriOyuncaklariSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("montessori-oyuncaklari");
    }
    @And("kullanici king of puzzle urunleri linke tiklar")
    public void kullaniciKingOfPuzzleUrunleriLinkeTiklar() {
        clickByJS(allPages.homePage().kingOfPuzzleUrunleriLinkSayfaAltiHome);
    }
    @And("kullanici king of puzzle urunleri sayfasinin acildigini dogrular")
    public void kullaniciKingOfPuzzleUrunleriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kingofpuzzle");
    }
    @And("kullanici akil defteri linke tiklar")
    public void kullaniciAkilDefteriLinkeTiklar() {
        clickByJS(allPages.homePage().kabuleEtVeKapatAlertHome);
        waitFor(2);
        clickByJS(allPages.homePage().akilDefteriLinkSayfaAltiHome);
    }
    @And("kullanici akil defteri sayfasinin acildigini dogrular")
    public void kullaniciAkilDefteriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("akil-defteri");
    }
    @And("kullanici kitapyurdu sesli kitaplar linke tiklar")
    public void kullaniciKitapyurduSesliKitaplarLinkeTiklar() {
        clickByJS(allPages.homePage().kitapyurduSesliKitaplarLinkSayfaAltiHome);
    }
    @And("kullanici kitapyurdu sesli kitaplar sayfasinin acildigini dogrular")
    public void kullaniciKitapyurduSesliKitaplarSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("sesli-kitap");
    }
    @And("kullanici kitapyurdu eKitap linke tiklar")
    public void kullaniciKitapyurduEKitapLinkeTiklar() {
        clickByJS(allPages.homePage().kitapyurduEkitapLinkSayfaAltiHome);
    }
    @And("kullanici kitapyurdu eKitap  sayfasinin acildigini dogrular")
    public void kullaniciKitapyurduEKitapSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("e-kitap");
    }
    @And("kullanici kutuphanem uygulamasi linke tiklar")
    public void kullaniciKutuphanemUygulamasiLinkeTiklar() {
        clickByJS(allPages.homePage().kutuphanemUygulamasiLinkSayfaAltiHome);
    }
    @And("kullanici kutuphanem uygulamasi sayfasinin acildigini dogrular")
    public void kullaniciKutuphanemUygulamasiSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kutuphanem");
    }
    @And("kullanici kitapyurdu chrome eklentileri linke tiklar")
    public void kullaniciKitapyurduChromeEklentileriLinkeTiklar() {
        clickByJS(allPages.homePage().kitapyurduChromeEklentileriLinkSayfaAltiHome);
    }
    @And("kullanici kitapyurdu chrome eklentileri sayfasinin acildigini dogrular")
    public void kullaniciKitapyurduChromeEklentileriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("eklentiler");
    }
    @And("kullanici onayli yorumlar linke tiklar")
    public void kullaniciOnayliYorumlarLinkeTiklar() {
        clickByJS(allPages.homePage().onayliYorumlarLinkSayfaAltiHome);
    }
    @And("kullanici onayli yorumlar sayfasinin acildigini goruntuler")
    public void kullaniciOnayliYorumlarSayfasininAcildiginiGoruntuler() {
        assert Driver.getDriver().getCurrentUrl().contains("onayli-yorum");
    }
    @And("kullanici KDY platformu linke tiklar")
    public void kullaniciKDYPlatformuLinkeTiklar() {
        clickByJS(allPages.homePage().kdyPlatformuLinkSayfaAltiHome);
    }
    @And("kullanici KDY platformu sayfasinin acildigini dogrular")
    public void kullaniciKDYPlatformuSayfasininAcildiginiDogrular() {
        switchToWindow(1);
        assert Driver.getDriver().getCurrentUrl().contains("kdy");
    }
    @And("kullanici KDD platformu linke tiklar")
    public void kullaniciKDDPlatformuLinkeTiklar() {
        clickByJS(allPages.homePage().kddPlatformuLinkSayfaAltiHome);
    }
    @And("kullanici KDD platformu sayfasinin acildigini dogrular")
    public void kullaniciKDDPlatformuSayfasininAcildiginiDogrular() {
        switchToWindow(1);
        assert Driver.getDriver().getCurrentUrl().contains("kdd");
    }
    @And("kullanici Kitapdergisi.com linke tiklar")
    public void kullaniciKitapdergisiComLinkeTiklar() {
        clickByJS(allPages.homePage().kitapDergisiComLinkSayfaAltiHome);
    }
    @And("kullanici Kitapdergisi.com sayfasinin acildigini dogrular")
    public void kullaniciKitapdergisiComSayfasininAcildiginiDogrular() {
        switchToWindow(1);
        assert Driver.getDriver().getCurrentUrl().contains("kitapdergisi");
    }
    @And("kullanici sikSorulanSorular linke tiklar")
    public void kullaniciSikSorulanSorularLinkeTiklar() {
        clickByJS(allPages.kdyPage().sikSorulanSorularLinkKDY);
    }
    @And("kullanici ilk soruya tiklar")
    public void kullaniciIlkSoruyaTiklar() {
        clickByJS(allPages.kdyPage().ilkSoruSikSorulanSorularLinkKDY);
    }

    @And("kullanici acilan cevabi goruntuler")
    public void kullaniciAcilanCevabiGoruntuler() {
        assert allPages.kdyPage().ilkCevapSikSorulanSorularLinkKDY.isDisplayed();
    }

    @And("kullanici sikSorulanSorular arama alaninda punto aratir")
    public void kullaniciSikSorulanSorularAramaAlanindaPuntoAratir() {
        allPages.kdyPage().aramaTextboxKdy.sendKeys("punto", Keys.ENTER);
    }

    @And("kullanici gosterilen sonuclarin punto ile ilgili oldugunu dogrular")
    public void kullaniciGosterilenSonuclarinPuntoIleIlgiliOldugunuDogrular() {
        assert allPages.kdyPage().puntoIcerenTextAramaAlaniKdy.getText().contains("punto");
    }

    @And("kullanici arama alanini temizler ve arama alaninda telif aratir")
    public void kullaniciAramaAlaniniTemizlerVeAramaAlanindaTelifAratir() {
        allPages.kdyPage().aramaTextboxKdy.clear();
        allPages.kdyPage().aramaTextboxKdy.sendKeys("telif", Keys.ENTER);
    }

    @And("kullanici gosterilen sonuclarin telif ile ilgili oldugunu dogrular")
    public void kullaniciGosterilenSonuclarinTelifIleIlgiliOldugunuDogrular() {
        assert allPages.kdyPage().telifAramaSonucuIcerenTextAramaAlaniKdy.getText().contains("telif");
    }

    @And("kullanici sikSorulanSorular sayfasinda baski butonuna tiklar")
    public void kullaniciSikSorulanSorularSayfasindaBaskiButonunaTiklar() {
    }

    @And("kullanici gosterilen sonuclarin baski ile ilgili oldugunu dogrular")
    public void kullaniciGosterilenSonuclarinBaskiIleIlgiliOldugunuDogrular() {
    }

    @And("kullanici sikSorulanSorular sayfasinda kitap butonuna tiklar")
    public void kullaniciSikSorulanSorularSayfasindaKitapButonunaTiklar() {
    }

    @And("kullanici gosterilen sonuclarin kitap ile ilgili oldugunu dogrular")
    public void kullaniciGosterilenSonuclarinKitapIleIlgiliOldugunuDogrular() {
    }

    @And("kullanici sikSorulanSorular sayfasinda basvuru butonuna tiklar")
    public void kullaniciSikSorulanSorularSayfasindaBasvuruButonunaTiklar() {
    }

    @And("kullanici gosterilen sonuclarin basvuru ile ilgili oldugunu dogrular")
    public void kullaniciGosterilenSonuclarinBasvuruIleIlgiliOldugunuDogrular() {
    }

    @And("kullanici sikSorulanSorular sayfasinda telif butonuna tiklar")
    public void kullaniciSikSorulanSorularSayfasindaTelifButonunaTiklar() {
    }

    @And("kullanici kdd platform sayfasinda iletisim linke tiklar")
    public void kullaniciKddPlatformSayfasindaIletisimLinkeTiklar() {
    }

    @And("kullanici KDD platformunda iletisim sayfasinin acildigini dogrular")
    public void kullaniciKDDPlatformundaIletisimSayfasininAcildiginiDogrular() {
    }

    @And("kullanici e-posta adresiniz,konu ve mesajiniz alanlarini doldurur")
    public void kullaniciEPostaAdresinizKonuVeMesajinizAlanlariniDoldurur() {
    }

    @And("kullanici kdd platform sayfasinda devam et butona tiklar")
    public void kullaniciKddPlatformSayfasindaDevamEtButonaTiklar() {
    }
}