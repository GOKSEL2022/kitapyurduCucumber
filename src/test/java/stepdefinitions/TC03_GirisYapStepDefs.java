package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.IndexPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC03_GirisYapStepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    @And("kullanici giris yap linkine tiklar")
    public void kullaniciGirisYapLinkineTiklar() {
        homePage.girisYapLinkHome.click();
    }

    @And("kullanici e-posta alanina kayitli e-posta girer")
    public void kullaniciEPostaAlaninaKayitliEPostaGirer() {
        indexPage.textBoxEpostaHosgeldinizIndex.sendKeys(ConfigReader.getProperty("e_posta"));
    }

    @And("kullanici sifre alanina kayitli sifresini girer")
    public void kullaniciSifreAlaninaKayitliSifresiniGirer() {
        indexPage.textBoxSifreHosgeldinizIndex.sendKeys(ConfigReader.getProperty("sifre"));
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
}
