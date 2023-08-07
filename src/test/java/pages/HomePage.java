package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='search-input']")
    public WebElement searchTextBoxHome;

    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=account/register']")
    public WebElement uyeOlLinkHome;

    @FindBy(xpath = "//*[@class='menu-top-button login']")
    public WebElement girisYapLinkHome;

    @FindBy(xpath = "//*[@id='bottom-button']")
    public WebElement enAltaInYonButonHome;

    @FindBy(xpath = "//*[@id='top-button']")
    public WebElement enUsteCikYonButonHome;

    @FindBy(xpath = "//img[@class='swiper-lazy swiper-lazy-loaded']")
    public List<WebElement> anasayfaKaydiriciResimlerHome;

    @FindBy(xpath = "//*[@class='swiper-button-next common-sprite desktop-banner-next']")
    public WebElement sagYonKaydiriciButonHome;

    @FindBy(xpath = "//*[@class='swiper-button-prev common-sprite desktop-banner-prev']")
    public WebElement solYonKaydiriciButonHome;
}
