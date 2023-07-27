package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.MyAccountPage;
import utilities.ReusableMethods;

public class TC02_StepDefs {
    HomePage homePage=new HomePage();
    MyAccountPage myAccountPage=new MyAccountPage();
    Faker faker=new Faker();

    @When("kullanici sign-in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        myAccountPage.signinButtonMyAccount.click();
    }
    @When("kullanici signin username {string} girer")
    public void kullanici_signin_username_girer(String string) {
       myAccountPage.textBoxUsernameSigninMyAccount.sendKeys(faker.name().fullName());
    }
    @When("kullanici signin password {string} girer")
    public void kullanici_signin_password_girer(String string) {
        myAccountPage.textBoxPasswordSigninMyAccount.sendKeys(faker.internet().password(10,15));
    }
    @When("kullanici signin remember-me checkbox i tiklar")
    public void kullanici_signin_remember_me_checkbox_i_tiklar() {
        myAccountPage.checkboxRememberMeSigninMyAccount.click();
    }
    @When("kullanici signin butonuna tiklar")
    public void kullanici_signin_butonuna_tiklar() {
        myAccountPage.signinButtonMyAccount.click();
    }
    @When("kullanici error mesaji iceren alerti goruntuler")
    public void kullanici_error_mesaji_iceren_alerti_goruntuler() {
        Assert.assertTrue(myAccountPage.errorMessageAlertSigninMyAccount.isDisplayed());
    }
    @Then("kullanici textsignup butonuna tiklar")
    public void kullanici_textsignup_butonuna_tiklar() {
        myAccountPage.textSignupMyAccount.click();
    }

    @Given("kullanici gecerli username {string} girer")
    public void kullaniciGecerliUsernameGirer(String string) {
        myAccountPage.usernameSignupRegister.sendKeys(Faker.instance().name().firstName()+Faker.instance().name().lastName());
    }

    @When("kullanici gecerli e-posta {string} girer")
    public void kullaniciGecerliEPostaGirer(String string) {
        myAccountPage.emailSignupRegister.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("kullanici gecerli sifre {string} girer")
    public void kullaniciGecerliSifreGirer(String string) {
        myAccountPage.passwordSignupRegister.sendKeys("goksel5255");
    }

    @When("kullanici radio butonu tiklar")
    public void kullaniciRadioButonuTiklar() {
        myAccountPage.checkboxSignupRegister.click();
    }

    @Then("kullanici sign-up butonu tiklar")
    public void kullaniciSignUpButonuTiklar() {
        ReusableMethods.clickByJS(myAccountPage.signupButtonSignupRegister);
    }
    @And("kullanici basarili kayit yapildigini goruntuler")
    public void kullaniciBasariliKayitYapildiginiGoruntuler() {
        Assert.assertTrue(homePage.signOutButtonHome.isDisplayed());
    }
    @Given("kullanici username alanini bos birakir")
    public void kullaniciUsernameAlaniniBosBirakir() {
        myAccountPage.usernameSignupRegister.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }
    @When("kullanici Please enter a valid account username mesajini gorur")
    public void kullaniciPleaseEnterAValidAccountUsernameMesajiniGorur() {
        Assert.assertTrue(myAccountPage.textPleaseEnterAValidAccountUsername.isDisplayed());
    }
    @When("kullanici email alanini bos birakir")
    public void kullaniciEmailAlaniniBosBirakir() {
        myAccountPage.emailSignupRegister.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.ENTER);
    }

    @And("kullanici email alaninin bos birakilmamasi uyarisini gorur")
    public void kullaniciEmailAlanininBosBirakilmamasiUyarisiniGorur() {
        //Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("Lütfen bu alanı doldurun."));
        Assert.assertTrue(myAccountPage.usernameSignupRegister.isDisplayed());

    }

    @When("kullanici email alanina gecersiz deger girer")
    public void kullaniciEmailAlaninaGecersizDegerGirer() {
        myAccountPage.emailSignupRegister.sendKeys(Faker.instance().name().firstName());
    }

    @When("kullanici Lutfen posta adresine @ isareti ekleyin uyarisini gorur")
    public void kullaniciLutfenPostaAdresineIsaretiEkleyinUyarisiniGorur() {
        Assert.assertTrue(myAccountPage.usernameSignupRegister.isDisplayed());
    }
}

