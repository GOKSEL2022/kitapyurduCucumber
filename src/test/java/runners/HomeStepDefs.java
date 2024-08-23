package runners;
/*

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import yogi.pages.AllPages;
import yogi.utilities.ConfigReader;
import yogi.utilities.Driver;

import static yogi.utilities.ReusableMethods.click;
import static yogi.utilities.ReusableMethods.scroll;

public class HomeStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
    @Given("kullaniciGC yogi urlye gider")
    public void kullanici_gc_yogi_urlye_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("kullaniciGC anasayfanin acildigini dogrular")
    public void kullanici_gc_anasayfanin_acildigini_dogrular() {
        assert allPages.homePage().yogiTasarimLogoHome.isDisplayed();
    }
    @And("kullaniciGC girisYapUyeOl alanini goruntuler")
    public void kullanicigcGirisYapUyeOlAlaniniGoruntuler() {
        assert allPages.homePage().girisYapButonHome.isDisplayed();
    }
    @And("kullaniciGC blog logosunu goruntuler")
    public void kullanicigcBlogLogosunuGoruntuler() {
        assert allPages.homePage().blogButonHome.isDisplayed();
    }
    @And("kullaniciGC sepet logosunu goruntuler")
    public void kullanicigcSepetLogosunuGoruntuler() {
        assert allPages.homePage().sepetimButonHome.isDisplayed();
    }
    @And("kullaniciGC Yogi logoyu goruntuler")
    public void kullanicigcYogiLogoyuGoruntuler() {
        assert allPages.homePage().yogiTasarimLogoHome.isDisplayed();
    }
    @And("kullaniciGC logo alti alt basliklari goruntuler")
    public void kullanicigcLogoAltiAltBasliklariGoruntuler() {
        softAssert.assertTrue(allPages.homePage().kisiyeOzelUrunlerLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().birYasKonseptleriLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().ozelGunlerLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().evDekorasyonUrunleriLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().davetiyelerLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().bebekCikolatalariLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().okullaraOzelLinkTitleHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().firmalaraOzelLinkTitleHome.isDisplayed());
        softAssert.assertAll();
    }
    @And("kullaniciGC anasayfadaki gorsel ogeleri goruntuler")
    public void kullanicigcAnasayfadakiGorselOgeleriGoruntuler() throws InterruptedException {
        scroll(allPages.homePage().okullaraOzelImageJPGLinkHome);
        Thread.sleep(2);
        softAssert.assertTrue(allPages.homePage().okullaraOzelImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().kisiyeOzelTasarimDuvarSaatleriImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().birbirindenGuzelDavetiyeModelleriImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().ozelTasarimZibinBaskiImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().karsilamaPanosuImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().kisiyeOzelTisortBaskiImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().sevgiliyeOzelHediyelerImageJPGLinkHome.isDisplayed());
        softAssert.assertTrue(allPages.homePage().yenidoganHastaneCikisiImageJPGLinkHome.isDisplayed());
        softAssert.assertAll();
    }

    @And("kullaniciGC gorsel oge altindaki linkleri goruntuler")
    public void kullanicigcGorselOgeAltindakiLinkleriGoruntuler() {
        softAssert.assertTrue(allPages.homePage().yeniUrunlerFirsatKosesiTitleButonHome.isEnabled());
        softAssert.assertTrue(allPages.homePage().vitrindekilerFirsatKosesiTitleButonHome.isEnabled());
        softAssert.assertTrue(allPages.homePage().cokSatanlarFirsatKosesiTitleButonHome.isEnabled());
        softAssert.assertTrue(allPages.homePage().indirimdekilerFirsatKosesiTitleButonHome.isEnabled());
        softAssert.assertAll();
    }
    @When("kullaniciGC sayfayi kapatir")
    public void kullanici_gc_sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @When("kullaniciGC girisyap_uye ol alani uzerine gelir ve dropdown menuyu goruntuler")
    public void kullanici_gc_girisyap_uye_ol_alani_uzerine_gelir_ve_dropdown_menuyu_goruntuler() {
        actions.moveToElement(allPages.homePage().girisYapButonHome).perform();
        assert allPages.homePage().girisYapLinkDropdownMenuHome.isDisplayed();
    }
    @When("kullaniciGC blog logosunun aktif oldugunu dogrular")
    public void kullanici_gc_blog_logosunun_aktif_oldugunu_dogrular() {
        assert allPages.homePage().blogButonHome.isEnabled();
    }
    @When("kullaniciGC sepet logosunun aktif oldugunu dogrular")
    public void kullanici_gc_sepet_logosunun_aktif_oldugunu_dogrular() {
        assert allPages.homePage().sepetimButonHome.isEnabled();
    }
    @When("kullaniciGC giris yap sayfasina gider ve yogi logonun anasayfaya yonlendirdigini dogrular")
    public void kullanici_gc_giris_yap_sayfasina_gider_ve_yogi_logonun_anasayfaya_yonlendirdigini_dogrular() throws InterruptedException {
        actions.moveToElement(allPages.homePage().girisYapButonHome).perform();
        click(allPages.homePage().girisYapLinkDropdownMenuHome);
        click(allPages.homePage().yogiTasarimLogoHome);
        //Driver.getDriver().navigate().back();
        assert allPages.homePage().birbirindenGuzelBabalarGunuHediyelikleriImageJPGHome.isDisplayed();
    }
    @And("kullaniciGC kisiye ozel urunler basligina tiklar")
    public void kullanicigcKisiyeOzelUrunlerBasliginaTiklar() {
        click(allPages.homePage().kisiyeOzelUrunlerLinkTitleHome);
    }
    @And("kullaniciGC kisiye ozel urunler sayfasinin acildigini dogrular")
    public void kullanicigcKisiyeOzelUrunlerSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("kisiye-ozel-urunler");
    }
    @And("kullaniciGC bir yas konseptleri basliga tiklar")
    public void kullanicigcBirYasKonseptleriBasligaTiklar() {
        click(allPages.homePage().birYasKonseptleriLinkTitleHome);
    }
    @And("kullaniciGC bir yas konseptleri sayfasinin acildigini dogrular")
    public void kullanicigcBirYasKonseptleriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("1-yas-konseptleri");
    }
    @And("kullaniciGC ozel gunler basliga tiklar")
    public void kullanicigcOzelGunlerBasligaTiklar() {
        click(allPages.homePage().ozelGunlerLinkTitleHome);
    }
    @And("kullaniciGC ozel gunler sayfasinin acildigini dogrular")
    public void kullanicigcOzelGunlerSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("ozel-gunler");
    }
    @And("kullaniciGC ev dekorasyon urunleri basliga tiklar")
    public void kullanicigcEvDekorasyonUrunleriBasligaTiklar() {
        click(allPages.homePage().evDekorasyonUrunleriLinkTitleHome);
    }
    @And("kullaniciGC ev dekorasyon urunleri sayfasinin acildigini dogrular")
    public void kullanicigcEvDekorasyonUrunleriSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("ev-dekorasyon-urunleri");
    }
    @And("kullaniciGC davetiyeler basliga tiklar")
    public void kullanicigcDavetiyelerBasligaTiklar() {
        click(allPages.homePage().davetiyelerLinkTitleHome);
    }
    @And("kullaniciGC davetiyeler sayfasinin acildigini dogrular")
    public void kullanicigcDavetiyelerSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("davetiyeler");
    }
    @And("kullaniciGC bebek cikolatalari basliga tiklar")
    public void kullanicigcBebekCikolatalariBasligaTiklar() {
        click(allPages.homePage().bebekCikolatalariLinkTitleHome);
    }
    @And("kullaniciGC bebek cikolatalari sayfasinin acildigini dogrular")
    public void kullanicigcBebekCikolatalariSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("bebek-cikolatalari");
    }
    @And("kullaniciGC okullara ozel basliga tiklar")
    public void kullanicigcOkullaraOzelBasligaTiklar() {
        click(allPages.homePage().okullaraOzelLinkTitleHome);
    }
    @And("kullaniciGC okullara ozel sayfasinin acildigini dogrular")
    public void kullanicigcOkullaraOzelSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("okullara-ozel");
    }
    @And("kullaniciGC firmalara ozel basliga tiklar")
    public void kullanicigcFirmalaraOzelBasligaTiklar() {
        click(allPages.homePage().firmalaraOzelLinkTitleHome);
    }
    @And("kullaniciGC firmalara ozel sayfasinin acildigini dogrular")
    public void kullanicigcFirmalaraOzelSayfasininAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("firmalara-ozel");


    }

}

 */
