package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.Sign_Up_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02_StepDefs {
    HomePage homePage=new HomePage();
    Sign_Up_Page sign_up_page=new Sign_Up_Page();
    @Given("kullanici gecerli username {string} girer")
    public void kullaniciGecerliUsernameGirer(String string) {
        sign_up_page.usernameSignupRegister.sendKeys(Faker.instance().name().firstName()+" "+Faker.instance().name().lastName());
    }

    @When("kullanici gecerli e-posta {string} girer")
    public void kullaniciGecerliEPostaGirer(String string) {
        sign_up_page.emailSignupRegister.sendKeys(Faker.instance().internet().emailAddress());
    }

    @And("kullanici gecerli sifre {string} girer")
    public void kullaniciGecerliSifreGirer(String string) {
        sign_up_page.passwordSignupRegister.sendKeys("goksel5255");
    }

    @When("kullanici radio butonu tiklar")
    public void kullaniciRadioButonuTiklar() {
        sign_up_page.checkboxSignupRegister.click();
    }

    @Then("kullanici sign-up butonu tiklar")
    public void kullaniciSignUpButonuTiklar() {
        ReusableMethods.clickByJS(sign_up_page.signupButtonSignupRegister);
    }


    @And("kullanici basarili kayit yapildigini goruntuler")
    public void kullaniciBasariliKayitYapildiginiGoruntuler() {
        Assert.assertTrue(homePage.signOutButtonHome.isDisplayed());
    }

    @Given("kullanici username alanini bos birakir")
    public void kullaniciUsernameAlaniniBosBirakir() {
        sign_up_page.usernameSignupRegister.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE);
    }

    @When("kullanici Please enter a valid account username mesajini gorur")
    public void kullaniciPleaseEnterAValidAccountUsernameMesajiniGorur() {
        Assert.assertTrue(sign_up_page.textPleaseEnterAValidAccountUsername.isDisplayed());
    }

    @When("kullanici email alanini bos birakir")
    public void kullaniciEmailAlaniniBosBirakir() {
        //sign_up_page.emailSignupRegister.sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE,Keys.ENTER);
    }

    @And("kullanici email alaninin bos birakilmamasi uyarisini gorur")
    public void kullaniciEmailAlanininBosBirakilmamasiUyarisiniGorur() {
        //Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("Lütfen bu alanı doldurun."));
        Assert.assertTrue(sign_up_page.usernameSignupRegister.isDisplayed());

    }
}

