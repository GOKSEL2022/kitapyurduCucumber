package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import utilities.ReusableMethods;

import java.util.List;

public class TC04_KitapYurduHomeStepDefs {
    HomePage homePage=new HomePage();
    @And("kullanici anasayfanin en altina gelir")
    public void kullaniciAnasayfaninEnAltinaGelir() {
        homePage.enAltaInYonButonHome.click();
    }

    @And("kullanici anasayfanin en üst kismina gider")
    public void kullaniciAnasayfaninEnÜstKisminaGider() {
        homePage.enUsteCikYonButonHome.click();
    }

    @And("kullanici bir saniye bekler")
    public void kullaniciBirSaniyeBekler() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Given("kullanici sag yon tusuna tiklar")
    public void kullaniciSagYonTusunaTiklar() {
        for (int i=1;i<homePage.anasayfaKaydiriciResimlerHome.size();i++){
            homePage.sagYonKaydiriciButonHome.click();
        }
    }
    @When("kullanici sag yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSagYonTusununErisilebilirOldugunuDogrular() {
        Assert.assertTrue(homePage.sagYonKaydiriciButonHome.isEnabled());
    }
    @And("kullanici sol yon tusuna tiklar")
    public void kullaniciSolYonTusunaTiklar() {
        for (int i=1;i<homePage.anasayfaKaydiriciResimlerHome.size();i++) {
            homePage.solYonKaydiriciButonHome.click();
        }
    }

    @And("kullanici sol yon tusunun erisilebilir oldugunu dogrular")
    public void kullaniciSolYonTusununErisilebilirOldugunuDogrular() {
        Assert.assertTrue(homePage.solYonKaydiriciButonHome.isEnabled());
    }

    @And("kullanici anasayfada birden fazla resim oldugunu dogrular")
    public void kullaniciAnasayfadaOnBesAdetKaydiriciOldugunuDogrular() {
       Assert.assertTrue(homePage.anasayfaKaydiriciResimlerHome.size()>1);
    }

}
