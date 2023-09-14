package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ResetPassSucceedPage {
    WebDriver driver;

    @FindBy(className = "orangehrm-card-container")
    WebElement messageDisplayed;
    public ResetPassSucceedPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void messageIsDisplayed(){
        messageDisplayed.isDisplayed();
    }
}
