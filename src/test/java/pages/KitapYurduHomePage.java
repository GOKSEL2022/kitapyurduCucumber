package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KitapYurduHomePage {
    public KitapYurduHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='swal2-title ky-swal-title-single']")
    public WebElement sepetinizdeAlertKitap;
}
