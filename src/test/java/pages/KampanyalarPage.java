package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KampanyalarPage {
    public KampanyalarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='js-btn-filter campaign-filter-btn campaign-filter-btn-active']")
    public WebElement tumKampanyalarTextKampanyalar;
}
