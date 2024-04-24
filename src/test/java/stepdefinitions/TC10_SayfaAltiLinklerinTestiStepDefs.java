package stepdefinitions;
import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.ReusableMethods;

public class TC10_SayfaAltiLinklerinTestiStepDefs {
    HomePage homePage=new HomePage();
    @And("kullanici yardim ve islem rehberi linke tiklar")
    public void kullaniciYardimVeIslemRehberiLinkeTiklar() {
        ReusableMethods.clickByJS(homePage.yardimVeIslemRehberiLinkSayfaAltiHome);
    }

    @And("kullanici yardim sayfasina yönlendirildigini dogrular")
    public void kullaniciYardimSayfasinaYönlendirildiginiDogrular() {
    }

    @And("kullanici video yardim linke tiklar")
    public void kullaniciVideoYardimLinkeTiklar() {
    }

    @And("kullanici video sayfasinin acildigini dogrular")
    public void kullaniciVideoSayfasininAcildiginiDogrular() {
    }

    @And("kullanici havale_EFTBilgileri linke tiklar")
    public void kullaniciHavale_EFTBilgileriLinkeTiklar() {
    }

    @And("kullanici havale_EFTBilgilerinin goruntulendigini dogrular")
    public void kullaniciHavale_EFTBilgilerininGoruntulendiginiDogrular() {
    }

    @And("kullanici musteri hizmetleri linke tiklar")
    public void kullaniciMusteriHizmetleriLinkeTiklar() {
    }

    @And("kullanici musteri hizmetleri sayfasinin acildigini dogrular")
    public void kullaniciMusteriHizmetleriSayfasininAcildiginiDogrular() {
    }

    @And("kullanici platin uyelik linke tiklar")
    public void kullaniciPlatinUyelikLinkeTiklar() {
    }

    @And("kullanici platin uyelik sayfasinin acildigini dogrular")
    public void kullaniciPlatinUyelikSayfasininAcildiginiDogrular() {
    }

    @And("kullanici gumus uyelik linke tiklar")
    public void kullaniciGumusUyelikLinkeTiklar() {
    }

    @And("kullanici gumus uyelik sayfasinin acildigini dogrular")
    public void kullaniciGumusUyelikSayfasininAcildiginiDogrular() {
    }

    @And("kullanici teslim noktalari linke tiklar")
    public void kullaniciTeslimNoktalariLinkeTiklar() {
    }

    @And("kullanici teslim noktalari sayfasinin acildigini dogrular")
    public void kullaniciTeslimNoktalariSayfasininAcildiginiDogrular() {
    }

    @And("kullanici hemen al linke tiklar")
    public void kullaniciHemenAlLinkeTiklar() {
    }

    @And("kullanici hemen al sayfasinin acildigini dogrular")
    public void kullaniciHemenAlSayfasininAcildiginiDogrular() {
    }
}
