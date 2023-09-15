package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import pages.PasswordPage;
import utilities.DriverManager;

import javax.swing.*;

public class ChangePassSteps {

    PasswordPage passwordPage = new PasswordPage(DriverManager.getDriver().driver);

    @Then("I click on Change Password")
    public void clickOnChangePass() throws InterruptedException {
        passwordPage.clickOnChangePass();
    }
    @And("I type my current password {string}")
    public void typeMyPass(String password) throws InterruptedException {
        passwordPage.myCurrentPass(password);
    }
    @Then("I set my new password in password field with {string}")
    public void setNewPass(String password) throws InterruptedException {
        passwordPage.setNewPassword(password);
    }
    @And("I confirm my {string}")
    public void confirmNewPass(String password) throws InterruptedException {
        passwordPage.confirmPassword(password);
    }
    @Then("I click on Save button")
    public void clickOnSaveButton() throws InterruptedException {
        passwordPage.clickOnSaveButton();
    }
}
