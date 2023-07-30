package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}
