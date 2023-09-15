package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordPage {
    WebDriver driver;
    @FindBy(xpath = "//a[@class='oxd-userdropdown-link' and @role='menuitem'][contains(text(),'Change Password')]")
    WebElement changePassButton;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[2]")
    WebElement currentPass;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[3]")
    WebElement newPass;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[4]")
    WebElement confirmNewPass;
    @FindBy(xpath = "(//button[@data-v-10d463b7])[2]")
    WebElement saveButton;
    public PasswordPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnChangePass() throws InterruptedException {
        changePassButton.click();
        Thread.sleep(2000);
    }
    public void myCurrentPass(String pass) throws InterruptedException {
        currentPass.sendKeys(pass);
        Thread.sleep(2000);
    }
    public void setNewPassword(String pass) throws InterruptedException {
        newPass.sendKeys(pass);
        Thread.sleep(2000);
    }
    public void confirmPassword(String pass) throws InterruptedException {
        confirmNewPass.sendKeys(pass);
        Thread.sleep(2000);
    }
    public void clickOnSaveButton() throws InterruptedException {
        saveButton.click();
        Thread.sleep(2000);
    }
}
