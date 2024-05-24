package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.clickByJS;

public class TC03_GirisYapStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici giris yap linkine tiklar")
    public void kullaniciGirisYapLinkineTiklar() {
        allPages.homePage().girisYapLinkHome.click();
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
}
