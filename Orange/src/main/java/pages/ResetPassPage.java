package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPassPage {
    WebDriver driver;

    @FindBy(className = "oxd-input")
    WebElement userNameTextBox;

    @FindBy(xpath = "(//button[@data-v-10d463b7])[2]")
    WebElement resetButton;

    public ResetPassPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setUserNameTextBox(String userName){
        userNameTextBox.sendKeys(userName);
    }
    public void clickOnResetPassword(){
        resetButton.click();
    }
}
