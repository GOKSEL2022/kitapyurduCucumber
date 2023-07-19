package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Sign_Up_Page {
    public Sign_Up_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='reg_username']")
    public WebElement usernameSignupRegister;

    @FindBy(xpath = "(//*[@name='email'])[1]")
    public WebElement emailSignupRegister;

    @FindBy(xpath = "//*[@id='reg_password']")
    public WebElement passwordSignupRegister;

    @FindBy(xpath = "(//*[@type='checkbox'])[2]")
    public WebElement checkboxSignupRegister;

    @FindBy(xpath = "//*[@name='register']")
    public WebElement signupButtonSignupRegister;

    @FindBy(xpath = "//*[.='Please enter a valid account username.']")
    public WebElement textPleaseEnterAValidAccountUsername;
}
