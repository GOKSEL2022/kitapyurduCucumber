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

    @FindBy(xpath = "//*[@id='description_text']")
    public WebElement ilkUrunDescriptionTextKitap;

    @FindBy(xpath = "//*[@class='attributes']")
    public WebElement ilkUrunKitapBilgileriKitap;

    @FindBy(xpath = "//p[@class='pr_view-review-text']")
    public WebElement ilkUrunYorumlarKitap;

    @FindBy(xpath = "//*[@class='price__item']")
    public WebElement urunFiyatiKitap;

    @FindBy(xpath = "//*[@id='js-cart']")
    public WebElement sepeteGitButonKitap;



}
