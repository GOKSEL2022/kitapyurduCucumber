package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.AllPages;
import static utilities.ReusableMethods.clickByJS;
public class US02_UyeOlStepDefs {
    AllPages allPages=new AllPages();    Faker faker = new Faker();
    @And("kullanici uye ol linkine tiklar")
    public void kullaniciUyeOlLinkineTiklar() {
        clickByJS(allPages.homePage().uyeOlLinkHome);
    }
    @And("kullanici uye ol butonuna tiklar")
    public void kullaniciUyeOlButonunaTiklar() {
        clickByJS(allPages.indexPage().uyeOlButonIndex);
    }
    @When("kullanici doldurulmasi gerekli alanlarin valid degerlerini gorur")
    public void kullaniciDoldurulmasiGerekliAlanlarinValidDegerleriniGorur() {
        assert allPages.indexPage().hataMesajiHesapOlusturIndex.isDisplayed();
    }
    @Given("kullanici ad alanina {string} girer")
    public void kullaniciAdAlaninaGirer(String string) {
        allPages.indexPage().textBoxAdHesapOlusturIndex.sendKeys(string);
    }
    @When("kullanici soyad alanina iki ile otuz karakter araliginda {string} deger girer")
    public void kullaniciSoyadAlaninaIkiIleOtuzKarakterAraligindaDegerGirer(String string) {
        allPages.indexPage().textBoxSoyadHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici e-posta alanina gecerli bir {string} girer")
    public void kullaniciEPostaAlaninaGecerliBirGirer(String string) {
        allPages.indexPage().textBoxEmailHesapOlusturIndex.sendKeys(faker.name().firstName() + "@gmail.com");
    }
    @And("kullanici sifre alanina sekiz ile yirmi araliginda bir {string} girer")
    public void kullaniciSifreAlaninaSekizIleYirmiAraligindaBirGirer(String string) {
        allPages.indexPage().textBoxSifreHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici yazmis oldugu sifreyi{string} girer")
    public void kullaniciYazmisOlduguSifreyiGirer(String string) {
        allPages.indexPage().textBoxSifreTekrariHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici kisisel verilerin korunmasi checkboxi isaretler")
    public void kullaniciKisiselVerilerinKorunmasiCheckboxiIsaretler() {
        allPages.indexPage().checkboxKisiselVerilerinKorunmasiHesapOlusturIndex.click();
    }
    @When("kullanici ad alani iki ile otuz karakter olmali uyarisini gorur")
    public void kullaniciAdAlaniIkiIleOtuzKarakterOlmaliUyarisiniGorur() {
        assert allPages.indexPage().adAlaniHataMesajHesapOlusturiIndex.isDisplayed();
    }
    @Given("kullanici ad alani {string} girer")
    public void kullaniciAdAlaniGirer(String string) {
        allPages.indexPage().textBoxAdHesapOlusturIndex.sendKeys(string);
    }
    @When("kullanici hesabiniz olusturuldu mesajini gorur")
    public void kullaniciHesabinizOlusturulduMesajiniGorur() {
        assert allPages.indexPage().textHesabinizOlusturulduIndex.isDisplayed();
    }
    @When("kullanici soyad alanina {string} girer")
    public void kullaniciSoyadAlaninaGirer(String string) {
        allPages.indexPage().textBoxSoyadHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici sifre alanina {string} girer")
    public void kullaniciSifreAlaninaGirer(String string) {
        allPages.indexPage().textBoxSifreHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici sifre tekrari alanina {string} girer")
    public void kullaniciSifreTekrariAlaninaGirer(String string) {
        allPages.indexPage().textBoxSifreTekrariHesapOlusturIndex.sendKeys(string);
    }
    @When("kullanici soyad alanina iki ile otuz karakter araliginda olmali hata mesajini gorur")
    public void kullaniciSoyadAlaninaIkiIleOtuzKarakterAraligindaOlmaliHataMesajiniGorur() {
        assert allPages.indexPage().soyadAlaniHataMesajHesapOlusturiIndex.isDisplayed();
    }
    @Then("kullanici gecerli e-posta girmelisiniz mesajini gorur")
    public void kullaniciGecerliEPostaGirmelisinizMesajiniGorur() {
        assert allPages.indexPage().epostaAlaniHataMesajHesapOlusturiIndex.isDisplayed();
    }
    @And("kullanici e-posta alanina invalid bir {string} girer")
    public void kullaniciEPostaAlaninaInvalidBirGirer(String string) {
        allPages.indexPage().textBoxEmailHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici sifre alanina valid {string} girer")
    public void kullaniciSifreAlaninaValidGirer(String string) {
        allPages.indexPage().textBoxSifreHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici sifre tekrari alanina valid {string} girer")
    public void kullaniciSifreTekrariAlaninaValidGirer(String string) {
        allPages.indexPage().textBoxSifreTekrariHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici sifre alanina invalid {string} girer")
    public void kullaniciSifreAlaninaInvalidGirer(String string) {
        allPages.indexPage().textBoxSifreHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici sifre tekrari alanina invalid {string} girer")
    public void kullaniciSifreTekrariAlaninaInvalidGirer(String string) {
        allPages.indexPage().textBoxSifreTekrariHesapOlusturIndex.sendKeys(string);
    }
    @When("kullanici sifreniz sekiz ile yirmi karakter arasinda olmali mesajini gorur")
    public void kullaniciSifrenizSekizIleYirmiKarakterArasindaOlmaliMesajiniGorur() {
        assert allPages.indexPage().sifreAlaniHataMesajHesapOlusturiIndex.isDisplayed();
    }
    @When("kullanici sifreniz birbiriyle uyusmuyor mesajini gorur")
    public void kullaniciSifrenizBirbiriyleUyusmuyorMesajiniGorur() {
        assert allPages.indexPage().sifreTekrariHataMesajHesapOlusturiIndex.isDisplayed();
    }
    @And("kullanici hesap olustur e-posta alanina gecerli bir {string} girer.")
    public void kullaniciHesapOlusturEPostaAlaninaGecerliBirGirer(String string) {
        allPages.indexPage().textBoxEmailHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici hesap olustur sifre alanina {string} girer")
    public void kullaniciHesapOlusturSifreAlaninaGirer(String string) {
        allPages.indexPage().textBoxSifreHesapOlusturIndex.sendKeys(string);
    }
    @And("kullanici hesap olustur sifre tekrari alanina {string} girer")
    public void kullaniciHesapOlusturSifreTekrariAlaninaGirer(String string) {
        allPages.indexPage().textBoxSifreTekrariHesapOlusturIndex.sendKeys(string);
    }
    @When("kullanici e_posta adresi ile daha once kayit yapilmis mesajini gorur")
    public void kullaniciE_postaAdresiIleDahaOnceKayitYapilmisMesajiniGorur() {
        assert allPages.indexPage().ePostaAdresiIleDahaOnceKayitOlunmusturAlertIndex.isDisplayed();
    }
}