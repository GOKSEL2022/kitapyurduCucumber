package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.IndexPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03_GirisYapStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici giris yap linkine tiklar")
    public void kullaniciGirisYapLinkineTiklar() {
        homePage.girisYapLinkHome.click();
    }

    @And("kullanici e-posta alanina kayitli e-posta girer")
    public void kullaniciEPostaAlaninaKayitliEPostaGirer() {
        indexPage.textBoxEpostaHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_eposta"));
    }

    @And("kullanici sifre alanina kayitli sifresini girer")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer() {
        indexPage.textBoxSifreHosgeldinizIndex.sendKeys(ConfigReader.getProperty("gecerli_sifre"));
    }

    @And("kullanici beni hatirla checkboxi tiklar")
    public void kullaniciBeniHatirlaCheckboxiTiklar() {
        ReusableMethods.clickByJS(indexPage.checkBoxBeniHatirlaHosgeldinizIndex);
    }

    @And("kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        indexPage.girisYapButonHosgeldinizIndex.click();
    }

    @When("kullanici sayfaya giris yaptıgını dogrular")
    public void kullaniciSayfayaGirisYaptıgınıDogrular() {
        Assert.assertTrue(indexPage.textMerhabaAccountIndex.getText().contains("Merhaba"));
    }
    @When("kullanici e-posta adresiniz ya da sifreniz yanlıs uyarisini gorur")
    public void kullaniciEPostaAdresinizYaDaSifrenizYanlısUyarisiniGorur() {
        Assert.assertTrue(indexPage.epostaAdresiVeSifreYanlisHataMesajiIndex.isDisplayed());
    }

    @And("kullanici sifre alanina kayitli sifresini {string} girer")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer(String string) {
        indexPage.textBoxSifreHosgeldinizIndex.sendKeys(string);
    }
    @And("kullanici e-posta alanina invalid {string} girer")
    public void kullaniciEPostaAlaninaInvalidGirer(String string) {
        indexPage.textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }

    @And("kullanici e-posta alanina kucuk-buyuk harf ve i harfini ı yaparak {string} girer")
    public void kullaniciEPostaAlaninaKucukBuyukHarfVeIHarfiniIYaparakGirer(String string) {
        indexPage.textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }

    @When("kullanici hesaptan cikis yapar")
    public void kullaniciHesaptanCikisYapar() {
        actions.moveToElement(indexPage.textMerhabaAccountIndex).perform();
        ReusableMethods.clickByJS(indexPage.cikisLinkAccountIndex);
    }

    @And("kullanici e-posta {string} girer")
    public void kullaniciEPostaGirer(String string) {
        indexPage.textBoxEpostaHosgeldinizIndex.sendKeys(string);
    }


    @And("kullanici sifre alanina invalid bir {string} girer")
    public void kullaniciSifreAlaninaInvalidBirGirer(String string) {
    }
}
