package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class OnayliYorumPage {
    public OnayliYorumPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href='https://www.kitapyurdu.com/index.php?route=module/approved_review'])[1]")
    public WebElement onayliYorumlariInceleyinLinkOnayliYorumlar;

    @FindBy(xpath = "(//a[@href='https://www.kitapyurdu.com/index.php?route=product/best_sellers&list_id=1520&sort=purchased&order=DESC'])[1]")
    public WebElement onayliYorumBulunanKitaplarLinkOnayliYorumlar;

    @FindBy(xpath = "//a[@href='https://www.youtube.com/watch?v=m6jz_1eoRZ8']")
    public WebElement onayliYorumlarIleYenidenKesfedinLinkOnayliYorumlar;
}
