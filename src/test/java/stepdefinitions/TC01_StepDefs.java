package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_StepDefs {
    HomePage homePage=new HomePage();
    MyAccountPage myAccountPage=new MyAccountPage();
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
        homePage.signinButtonHome.click();
    }
    @When("kullanici doldurulacak alanlari goruntuler")
    public void kullaniciDoldurulacakAlanlariGoruntuler() {
        Assert.assertTrue(myAccountPage.textBoxUsernameSigninMyAccount.isDisplayed());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
