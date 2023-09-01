package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PuanKataloguPage {
    public PuanKataloguPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@href='https://www.kitapyurdu.com/index.php?route=product/points_catalog&sort=purchased&order=DESC']")
    public WebElement puanKataloguTextPuanKatalogu;
}
