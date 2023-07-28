package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.IndexPage;
import utilities.ReusableMethods;

public class TC02_StepDefs {
    HomePage homePage=new HomePage();
    IndexPage indexPage=new IndexPage();
    Faker faker=new Faker();
    @And("kullanici uye ol linkine tiklar")
    public void kullaniciUyeOlLinkineTiklar() {
        ReusableMethods.clickByJS(homePage.uyeOlLinkHome);
    }

    @And("kullanici uye ol butonuna tiklar")
    public void kullaniciUyeOlButonunaTiklar() {
        ReusableMethods.clickByJS(indexPage.uyeOlButonIndex);
    }

    @When("kullanici doldurulmasi gerekli alanlarin valid degerlerini gorur")
    public void kullaniciDoldurulmasiGerekliAlanlarinValidDegerleriniGorur() {
        Assert.assertTrue(indexPage.hataMesajiHesapOlusturIndex.isDisplayed());
    }

    @Given("kullanici soyad alanina iki ile otuz karakter araliginda deger girer")
    public void kullaniciSoyadAlaninaIkiIleOtuzKarakterAraligindaDegerGirer() {
        indexPage.textBoxSoyadHesapOlusturIndex.sendKeys(Faker.instance().lorem().characters(2,30));
    }

    @When("kullanici e-posta alanina gecerli bir deger girer")
    public void kullaniciEPostaAlaninaGecerliBirDegerGirer() {
        indexPage.textBoxEmailHesapOlusturIndex.sendKeys(faker.name().firstName()+"@gmail.com");
    }

    @And("kullanici sifre sekiz ile yirmi araliginda bir deger girer")
    public void kullaniciSifreSekizIleYirmiAraligindaBirDegerGirer() {
        indexPage.textBoxSifreHesapOlusturIndex.sendKeys(""+1234567890);
    }

    @And("kullanici yazmis oldugu sifreyi tekrar girer")
    public void kullaniciYazmisOlduguSifreyiTekrarGirer() {
        indexPage.textBoxSifreTekrariHesapOlusturIndex.sendKeys(""+1234567890);
    }

    @And("kullanici kisisel verilerin korunmasi checkboxi isaretler")
    public void kullaniciKisiselVerilerinKorunmasiCheckboxiIsaretler() {
        ReusableMethods.clickByJS(indexPage.checkboxKisiselVerilerinKorunmasiHesapOlusturIndex);
    }

    @When("kullanici ad alani iki ile otuz karakter olmali uyarisini gorur")
    public void kullaniciAdAlaniIkiIleOtuzKarakterOlmaliUyarisiniGorur() {
        Assert.assertTrue(indexPage.adAlaniHataMesajHesapOlusturiIndex.isDisplayed());
    }
}
