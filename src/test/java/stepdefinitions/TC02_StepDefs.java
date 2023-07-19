package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.Sign_Up_Page;
import utilities.ConfigReader;

public class TC02_StepDefs {
    HomePage homePage=new HomePage();
    Sign_Up_Page sign_up_page=new Sign_Up_Page();
    @Given("kullanici gecerli username {string} girer")
    public void kullaniciGecerliUsernameGirer(String string) {
        sign_up_page.usernameSignupRegister.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("kullanici gecerli e-posta {string} girer")
    public void kullaniciGecerliEPostaGirer(String string) {
        sign_up_page.emailSignupRegister.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("kullanici gecerli sifre {string} girer")
    public void kullaniciGecerliSifreGirer(String string) {
        sign_up_page.passwordSignupRegister.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("kullanici radio butonu tiklar")
    public void kullaniciRadioButonuTiklar() {
        sign_up_page.checkboxSignupRegister.click();
    }

    @Then("kullanici sign-up butonu tiklar")
    public void kullaniciSignUpButonuTiklar() {
        sign_up_page.signupButtonSignupRegister.click();
    }


    @And("kullanici basarili kayit yapildigini goruntuler")
    public void kullaniciBasariliKayitYapildiginiGoruntuler() {
        Assert.assertTrue(homePage.signOutButtonHome.isDisplayed());
    }
}
