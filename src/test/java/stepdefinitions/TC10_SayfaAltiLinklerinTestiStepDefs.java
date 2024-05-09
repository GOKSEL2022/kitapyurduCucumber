package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.IndexPage;
import pages.Yardim_VideoPage;
import pages.YeniCikanKitaplarPage;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
public class TC10_SayfaAltiLinklerinTestiStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    Yardim_VideoPage yardim_videoPage=new Yardim_VideoPage();
    YeniCikanKitaplarPage yeniCikanKitaplarPage=new YeniCikanKitaplarPage();
    @And("kullanici yardim ve islem rehberi linke tiklar")
    public void kullaniciYardimVeIslemRehberiLinkeTiklar() {
        clickByJS(homePage.yardimVeIslemRehberiLinkSayfaAltiHome);
    }

    @And("kullanici yardim sayfasina yönlendirildigini dogrular")
    public void kullaniciYardimSayfasinaYönlendirildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yardim");
    }
    @And("kullanici video yardim linke tiklar")
    public void kullaniciVideoYardimLinkeTiklar() {
        clickByJS(homePage.videoYardimLinkSayfaAltiHome);
    }

    @And("kullanici video sayfasinin acildigini dogrular")
    public void kullaniciVideoSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yardim/video");
    }

    @And("kullanici havale_EFTBilgileri linke tiklar")
    public void kullaniciHavale_EFTBilgileriLinkeTiklar() {
        clickByJS(homePage.havaleEFTBilgileriLinkSayfaAltiHome);
    }

    @And("kullanici havale_EFTBilgilerinin goruntulendigini dogrular")
    public void kullaniciHavale_EFTBilgilerininGoruntulendiginiDogrular() {
        assert yardim_videoPage.bankaHesapBilgilerimizTextTitleYardimVideo.isDisplayed();
    }

    @And("kullanici musteri hizmetleri linke tiklar")
    public void kullaniciMusteriHizmetleriLinkeTiklar() {
        clickByJS(homePage.musteriHizmetleriLinkSayfaAltiHome);
    }
    @And("kullanici musteri hizmetleri sayfasinin acildigini dogrular")
    public void kullaniciMusteriHizmetleriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("iletisim");
    }

    @And("kullanici platin uyelik linke tiklar")
    public void kullaniciPlatinUyelikLinkeTiklar() {
        clickByJS(homePage.platinUyelikLinkSayfaAltiHome);
    }

    @And("kullanici platin uyelik sayfasinin acildigini dogrular")
    public void kullaniciPlatinUyelikSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("platin-uyelik");
    }

    @And("kullanici gumus uyelik linke tiklar")
    public void kullaniciGumusUyelikLinkeTiklar() {
        clickByJS(homePage.gumusUyelikLinkSayfaAltiHome);
    }

    @And("kullanici gumus uyelik sayfasinin acildigini dogrular")
    public void kullaniciGumusUyelikSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("gumus-uyelik");
    }

    @And("kullanici teslim noktalari linke tiklar")
    public void kullaniciTeslimNoktalariLinkeTiklar() {
        clickByJS(homePage.teslimNoktalariLinkSayfaAltiHome);
    }

    @And("kullanici teslim noktalari sayfasinin acildigini dogrular")
    public void kullaniciTeslimNoktalariSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("teslim-noktalari");
    }

    @And("kullanici hemen al linke tiklar")
    public void kullaniciHemenAlLinkeTiklar() {
        clickByJS(homePage.hemenAlLinkSayfaAltiHome);
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
        clickByJS(yardim_videoPage.kabulEtVeKapatButonYardimVideo);
    }
    @When("kullanici cok satan kitaplar linke tiklar")
    public void kullanici_cok_satan_kitaplar_linke_tiklar() {
        clickByJS(homePage.cokSatanKitaplarLinkSayfaAltiHome);
    }
    @When("kullanici cok satan kitaplar sayfasina yonlendirildigini dogrular")
    public void kullanici_cok_satan_kitaplar_sayfasina_yonlendirildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("cok-satan-kitaplar");

    }
    @When("kullanici yeni cikan kitaplar linke tiklar")
    public void kullanici_yeni_cikan_kitaplar_linke_tiklar() {
        clickByJS(homePage.yeniSatanKitaplarLinkSayfaAltiHome);

    }
    @When("kullanici yeni cikan kitaplar sayfasinin acildigini dogrular")
    public void kullanici_yeni_cikan_kitaplar_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("yeni-cikan-kitaplar");

    }
    @When("kullanici kargo odeyen avantajli urunler linke tiklar")
    public void kullanici_kargo_odeyen_avantajli_urunler_linke_tiklar(){
        clickByJS(homePage.kargoOdeyenAvantajliUrunlerLinkSayfaAltiHome);
    }
    @When("kullanici kargo odeyen avantajli urunler sayfasinin acildigini dogrular")
    public void kullanici_kargo_odeyen_avantajli_urunler_sayfasinin_acildigini_dogrular() {
        assert homePage.kargoOdeyenAvantajliUrunlerLinkSayfaAltiHome.getText().contains("Kargo Ödeyen Avantajlı Ürünler");
    }
    @When("kullanici kampanyalar linke tiklar")
    public void kullanici_kampanyalar_linke_tiklar() {
        clickByJS(homePage.kampanyalarLinkSayfaAltiHome);
    }
    @When("kullanici kampanyalar sayfasinin acildigini dogrular")
    public void kullanici_kampanyalar_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kampanyalar");
    }
    @When("kullanici ayin yazarlari linke tiklar")
    public void kullanici_ayin_yazarlari_linke_tiklar() {
        clickByJS(homePage.ayinYazarlariLinkSayfaAltiHome);
    }
    @When("kullanici ayin yazarlari sayfasinin acildigini dogrular")
    public void kullanici_ayin_yazarlari_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getPageSource().contains("ayin-yazarlari");
    }
    @When("kullanici ayin yayinevleri linke tiklar")
    public void kullanici_ayin_yayinevleri_linke_tiklar() {
        clickByJS(homePage.ayinYayinevleriLinkSayfaAltiHome);
    }
    @When("kullanici ayin yayinevleri sayfasinin acildigini dogrular")
    public void kullanici_ayin_yayinevleri_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getPageSource().contains("ayin-yayinevleri");
    }
    @When("kullanici puan katalogu linke tiklar")
    public void kullanici_puan_katalogu_linke_tiklar() {
        clickByJS(homePage.puanKataloguLinkSayfaAltiHome);
    }
    @When("kullanici eDergi linke tiklar")
    public void kullanici_e_dergi_linke_tiklar() {
        clickByJS(homePage.eDergiLinkSayfaAltiHome);
    }
    @When("kullanici eDergi sayfasinin acildigini dogrular")
    public void kullanici_e_dergi_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("magazine/book_magazine");
    }
    @When("kullanici ne okusam linke tiklar")
    public void kullanici_ne_okusam_linke_tiklar() {
        clickByJS(homePage.neOkusamLinkSayfaAltiHome);
    }
    @When("kullanici kelepir kitaplar linke tiklar")
    public void kullanici_kelepir_kitaplar_linke_tiklar() {
        clickByJS(homePage.kelepirKitaplarLinkSayfaAltiHome);
    }
    @When("kullanici kelepir kitaplar sayfasinin acildigini dogrular")
    public void kullanici_kelepir_kitaplar_sayfasinin_acildigini_dogrular() {
        assert indexPage.kelepirTextTitleIndex.isDisplayed();
    }
    @When("kullanici Kitap Hediye Kartlari linke tiklar")
    public void kullanici_kitap_hediye_kartlari_linke_tiklar() {
        clickByJS(homePage.kitapHediyeKartlariLinkSayfaAltiHome);
    }
    @When("kullanici Kitap Hediye Kartlarir sayfasinin acildigini dogrular")
    public void kullanici_kitap_hediye_kartlarir_sayfasinin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kategori/cesitli-kitap-hediye-karti");

    }

}
