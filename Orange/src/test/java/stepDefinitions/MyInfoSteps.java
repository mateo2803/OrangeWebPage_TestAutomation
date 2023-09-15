package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.*;
import utilities.DriverManager;

public class MyInfoSteps {
    DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver().driver);
    MyInfoPage myInfoPage = new MyInfoPage(DriverManager.getDriver().driver);

    @Then("I click on My Info tab")
    public void clickOnMyInfoTab() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.clickOnMyInfoTab();
        Thread.sleep(2000);
    }
    @And("I click on Emergency Contacts")
    public void clickOnEmergencyContacts() throws InterruptedException {
        Thread.sleep(2000);
        myInfoPage.clickOnEmergencyContacts();
        Thread.sleep(2000);
    }
    @And("I click on Add Emergency Contact")
    public void clickOnAddEmergencyContact(){myInfoPage.clickOnAddEmergencyContact();}
    @Then("I set the name of my emergency contact with {string}")
    public void setContactName(String name) throws InterruptedException {
        myInfoPage.setContactName(name);
    }
    @And ("I set the relationship with my emergency contact with {string}")
    public void setContactRelationship(String relationship) throws InterruptedException {
        myInfoPage.setContactRelationship(relationship);
    }
    @And("I set the mobile of my contact with {string}")
    public void setContactMobile(String number){
        myInfoPage.setContactMobile(number);
    }
    @Then("I click on save the contact")
    public void clickOnSaveContact() throws InterruptedException {
        Thread.sleep(3000);
        myInfoPage.clickOnSaveContact();
    }
    @And("Emergency Contact should be displayed")
    public void isContactDisplayed() throws InterruptedException {
        myInfoPage.isContactDisplayed();
        Thread.sleep(3000);
    }

}
