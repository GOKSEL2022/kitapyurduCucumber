package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KitapPage {
    public KitapPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@id='button-cart']")
    public WebElement sepeteEkleButonKitap;

    @FindBy(xpath = "//*[@class='swal2-title ky-swal-title-single']")
    public WebElement sepetinizdeAlertKitap;

    @FindBy(xpath = "//*[@id='cart-items']")
    public WebElement sepetimButonKitap;

    @FindBy(xpath = "//*[@id='js-checkout']")
    public WebElement satinAlButonKitap;

}
