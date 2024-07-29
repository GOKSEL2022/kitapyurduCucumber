package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.clickByJS;

public class TC11_ListelerimStepDefs {
    AllPages allPages=new AllPages();
    Actions actions=new Actions(Driver.getDriver());
    @And("kullanici listelerim dropdown uzerine gelir")
    public void kullaniciListelerimDropdownUzerineGelir() {
        actions.moveToElement(allPages.homePage().listelerimLinkHome).perform();
    }

    @And("kullanici acilan menuden favorilerimi secer")
    public void kullaniciAcilanMenudenFavorilerimiSecer() {
        clickByJS(allPages.homePage().favorilerimSecenegiListelerimLinkHome);
    }
}
