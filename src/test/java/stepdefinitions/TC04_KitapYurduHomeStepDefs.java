package stepdefinitions;

import io.cucumber.java.en.And;
import pages.HomePage;
import utilities.ReusableMethods;

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
}
