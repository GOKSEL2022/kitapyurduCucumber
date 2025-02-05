package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;
import static utilities.ReusableMethods.clickWithTimeOut;

public class US03_GirisYapStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    String symbol="++--//^^%*!..$#{[]}&";
    int randomNumber = Faker.instance().number().numberBetween(1000, 9999);

    @And("kullanici giris yap linkine tiklar")
    public void kullaniciGirisYapLinkineTiklar() {
        Driver.getDriver().manage().deleteAllCookies();
        allPages.homePage().girisYapLinkHome.click();
        if (allPages.indexPage().cookiesKabulEtVeKapatGirisYapIndex.isDisplayed()){
            clickWithTimeOut(allPages.indexPage().cookiesKabulEtVeKapatGirisYapIndex,3);
            clickWithTimeOut(allPages.homePage().girisYapLinkHome,3);
        }else if (allPages.homePage().girisYapLinkHome.isEnabled())
            clickWithTimeOut(allPages.homePage().girisYapLinkHome,3);
    }
    @And("kullanici e-posta alanina kayitli e-posta girer")
    public void kullaniciEPostaAlaninaKayitliEPostaGirer() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_eposta"));
    }
    @And("kullanici sifre alanina kayitli sifresini girer")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_sifre"));
    }
    @And("kullanici beni hatirla checkboxi tiklar")
    public void kullaniciBeniHatirlaCheckboxiTiklar() {
       clickByJS(allPages.indexPage().checkBoxBeniHatirlaHosgeldinizIndex);
    }
    @And("kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
       allPages.indexPage().girisYapButonHosgeldinizIndex.click();
    }
    @When("kullanici sayfaya giris yaptıgını dogrular")
    public void kullaniciSayfayaGirisYaptıgınıDogrular() {
        assert allPages.indexPage().textMerhabaAccountIndex.getText().contains("Merhaba");
    }
    @When("kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur")
    public void kullaniciEPostaAdresinizYaDaSifrenizYanlısUyarisiniGorur() {
        assert allPages.indexPage().epostaAdresiVeSifreYanlisHataMesajiIndex.isDisplayed();
    }
    @And("kullanici sifre alanina kayitli sifresini {string} girer")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer(String string) {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(string);
    }
    @And("kullanici e-posta alanina invalid {string} girer")
    public void kullaniciEPostaAlaninaInvalidGirer(String string) {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }
    @And("kullanici e-posta alanina kucuk-buyuk harf ve i harfini ı yaparak {string} girer")
    public void kullaniciEPostaAlaninaKucukBuyukHarfVeIHarfiniIYaparakGirer(String string) {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }
    @When("kullanici hesaptan cikis yapar")
    public void kullaniciHesaptanCikisYapar() {
        actions.moveToElement(allPages.indexPage().textMerhabaAccountIndex).perform();
        clickByJS(allPages.indexPage().cikisLinkAccountIndex);
    }
    @And("kullanici e-posta {string} girer")
    public void kullaniciEPostaGirer(String string) {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }
    @And("kullanici sifre alanina invalid bir {string} girer")
    public void kullaniciSifreAlaninaInvalidBirGirer(String string) {
    }

    @And("kullanici e-posta alanina bosluk birakarak kayitli e-posta girer")
    public void kullaniciEPostaAlaninaBoslukBirakarakKayitliEPostaGirer() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(Keys.SPACE,Keys.SPACE,ConfigReader.getProperty("gecerli_eposta"));

    }

    @And("kullanici sifre alanina bosluk birakarak kayitli sifresini girer")
    public void kullaniciSifreAlaninaBoslukBirakarakKayitliSifresiniGirer() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(Keys.SPACE,Keys.SPACE,ConfigReader.getProperty("gecerli_sifre"));
    }

    @When("EPosta Adresi ya da sifreniz yanlis Sifrenizi girerken buyuk kucuk harf ayrimina dikkat ediniz alerti goruntuler")
    public void epostaAdresiYaDaSifrenizYanlisSifreniziGirerkenBuyukKucukHarfAyriminaDikkatEdinizAlertiGoruntuler() {
        assert allPages.indexPage().ePostaAdresiYadaSifrenizYanlisSifreniziGirerkenBuyukKucukHarfAyriminaDikkatEdinizAlertIndex.isDisplayed();
    }

    @And("kullanici e-posta alanini temizler")
    public void kullaniciEPostaAlaniniTemizler() throws InterruptedException {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.clear();
        Thread.sleep(2000);

    }

    @And("kullanici kayitli e-postadan sonra bosluk birakarak giris yapar")
    public void kullaniciKayitliEPostadanSonraBoslukBirakarakGirisYapar() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_eposta"),Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @And("kullanici sifre alanini temizler")
    public void kullaniciSifreAlaniniTemizler() throws InterruptedException {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.clear();
        Thread.sleep(2000);
    }

    @And("kullanici kayitli sifreden sonra bosluk birakarak giris yapar")
    public void kullaniciKayitliSifredenSonraBoslukBirakarakGirisYapar() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_sifre"),Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }

    @And("kullanici e-posta alanina sayilar ile birlikte kayitli e-posta girer")
    public void kullaniciEPostaAlaninaSayilarIleBirlikteKayitliEPostaGirer() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(randomNumber+ConfigReader.getProperty("gecerli_eposta"));
    }

    @And("kullanici sifre alanina sayilar ile birlikte  kayitli sifresini girer")
    public void kullaniciSifreAlaninaSayilarIleBirlikteKayitliSifresiniGirer() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(randomNumber+ConfigReader.getProperty("gecerli_sifre"));
    }

    @And("kullanici kayitli e-postadan sonra sayi ile giris yapar")
    public void kullaniciKayitliEPostadanSonraSayiIleGirisYapar() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_eposta")+randomNumber);
    }

    @And("kullanici kayitli sifreden sonra sayi ile giris yapar")
    public void kullaniciKayitliSifredenSonraSayiIleGirisYapar() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_sifre")+randomNumber);
    }

    @And("kullanici e-posta alanina sembol ile birlikte kayitli e-posta girer")
    public void kullaniciEPostaAlaninaSembolIleBirlikteKayitliEPostaGirer() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_eposta")+symbol);
    }

    @And("kullanici sifre alanina sembol ile birlikte  kayitli sifresini girer")
    public void kullaniciSifreAlaninaSembolIleBirlikteKayitliSifresiniGirer() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_sifre")+symbol);
    }

    @And("kullanici kayitli e-postadan sonra sembol ile giris yapar")
    public void kullaniciKayitliEPostadanSonraSembolIleGirisYapar() {
        allPages.indexPage().textBoxEpostaHosgeldinizIndex.sendKeys(symbol+ConfigReader.getProperty("gecerli_eposta"));
    }

    @And("kullanici kayitli sifreden sonra sembol ile giris yapar")
    public void kullaniciKayitliSifredenSonraSembolIleGirisYapar() {
        allPages.indexPage().textBoxSifreHosgeldinizIndex.sendKeys(symbol+ConfigReader.getProperty("gecerli_sifre"));
    }

    @And("kullanici sifremi unuttum linke tiklar")
    public void kullaniciSifremiUnuttumLinkeTiklar() {
        clickByJS(allPages.indexPage().sifremiUnuttumLinkGirisYapIndex);
    }

    @And("kullanici sifre yenileme sayfasina yonlendirildigini dogrular")
    public void kullaniciSifreYenilemeSayfasinaYonlendirildiginiDogrular() {
    }
}
