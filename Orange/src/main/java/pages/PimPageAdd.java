package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.transform.sax.SAXResult;
import java.time.Duration;

public class PimPageAdd {
    WebDriver driver;
    @FindBy(name = "lastName")
    WebElement lastNameTextBox;
    @FindBy(name = "middleName")
    WebElement middleNameTextBox;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[5]")
    WebElement employeeIdTextBox;
    @FindBy(xpath = "(//span[@data-v-8e4757dc])[1]")
    WebElement loginDetailsSwitch;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[6]")
    WebElement username;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[7]")
    WebElement password;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[8]")
    WebElement confirmPassword;
    @FindBy(className = "orangehrm-left-space")
    WebElement saveButton;
    @FindBy(xpath = "//h6[text()='Personal Details']")
    WebElement personalDetailsDisplayed;
    public PimPageAdd(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setFirstNameTextBox(String userName){
        WebElement firstNameTextBox = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
        firstNameTextBox.sendKeys(userName);
    }
    public void setLastNameTextBox(String userName){
        lastNameTextBox.sendKeys(userName);
    }
    public void setMiddleNameTextBox(String userName){
        middleNameTextBox.sendKeys(userName);
    }
    public void setEmployeeIdTextBox(String userName){
        employeeIdTextBox.sendKeys(userName);
    }
    public void clickLoginDetails(){loginDetailsSwitch.click();}
    public void setUsername(String userName){username.sendKeys(userName);}
    public void setPassword(String pass){password.sendKeys(pass);}
    public void setConfirmPassword(String pass){confirmPassword.sendKeys(pass);}
    public void clickSaveButton(){saveButton.click();}
    public boolean isPersonalDetailsDisplayed(){
         WebElement personalDetailsTittle = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()='Personal Details']")));
         return personalDetailsTittle.isDisplayed();
    }
}
