package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.Sign_Up_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_StepDefs {
    HomePage homePage=new HomePage();
    Sign_Up_Page sign_up_page=new Sign_Up_Page();
    @Given("kullanici url ye gider")
    public void kullaniciUrlYeGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("kullanici sayfanin acildigini dogrular")
    public void kullaniciSayfaninAcildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("hubcomfy"));
    }

    @And("kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        homePage.registerButtonHome.click();
    }

    @When("kullanici doldurulacak alanlari goruntuler")
    public void kullaniciDoldurulacakAlanlariGoruntuler() {
        Assert.assertTrue(sign_up_page.usernameSignupRegister.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
