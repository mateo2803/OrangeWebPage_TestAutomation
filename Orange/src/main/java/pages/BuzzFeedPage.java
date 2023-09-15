package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
public class BuzzFeedPage {
    WebDriver driver;

    @FindBy(xpath = "(//textarea[@data-v-03a5ee57])[1]")
    WebElement message;
    @FindBy(xpath = "(//button[@data-v-10d463b7])[1]")
    WebElement postButton;
    @FindBy(xpath = "(//div[@data-v-8a31f039])[2]")
    WebElement postDisplayed;

    public BuzzFeedPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setMessage(String input){
        message.sendKeys(input);
    }
    public void clickOnPostButton(){
        postButton.click();
    }
    public boolean isPostDisplayed(){
        return postDisplayed.isDisplayed();
    }
}
