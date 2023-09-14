package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(name="username")
    WebElement userNameTextBox;

    @FindBy(name="password")
    WebElement passwordTextBox;

    @FindBy(className = "oxd-button")
    WebElement loginButton;

    @FindBy(className = "oxd-icon")
    WebElement errorMessage;

    @FindBy(className = "orangehrm-login-forgot")
    WebElement forgotPassword;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserNameTextBox(String userName){
        userNameTextBox.sendKeys(userName);
    }

    public void setPasswordTextBox(String password){
        passwordTextBox.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void errorMessageIsDisplayed(){
        errorMessage.isDisplayed();
    }

    public void clickOnForgotPassword(){
        forgotPassword.click();
    }
}
