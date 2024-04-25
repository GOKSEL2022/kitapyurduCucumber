package stepdefinitions;
import io.cucumber.java.en.And;
import pages.HomePage;
import pages.Yardim_VideoPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.clickByJS;
import static utilities.ReusableMethods.waitFor;

public class TC10_SayfaAltiLinklerinTestiStepDefs {
    HomePage homePage=new HomePage();
    Yardim_VideoPage yardim_videoPage=new Yardim_VideoPage();
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

    @And("kullanici sayfayi yeniler")
    public void kullaniciSayfayiYeniler() {
        Driver.getDriver().navigate().refresh();
    }
}
