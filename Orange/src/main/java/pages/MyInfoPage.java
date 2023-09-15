package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MyInfoPage {
    WebDriver driver;

    @FindBy(xpath = "(//a[@data-v-8cad1ea8])[3]")
    WebElement contactDetailsTab;
    @FindBy(xpath = "(//button[@data-v-10d463b7])[1]")
    WebElement addContactButton;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[2]")
    WebElement contactName;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[3]")
    WebElement contactRelationship;
    @FindBy(xpath = "(//input[@data-v-1f99f73c])[5]")
    WebElement contactMobile;
    @FindBy(xpath = "(//button[@data-v-10d463b7])[2]")
    WebElement saveButton;
    @FindBy(xpath = "(//div[@data-v-0d5ef602])[1]")
    WebElement contactDisplayed;
    public MyInfoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnEmergencyContacts(){contactDetailsTab.click();}
    public void clickOnAddEmergencyContact(){addContactButton.click();}
    public void setContactName(String name){contactName.sendKeys(name);}
    public void setContactRelationship(String relationship){contactRelationship.sendKeys(relationship);}
    public void setContactMobile(String number){contactMobile.sendKeys(number);}
    public void clickOnSaveContact(){saveButton.click();}
    public boolean isContactDisplayed(){
        return contactDisplayed.isDisplayed();
    }

}
