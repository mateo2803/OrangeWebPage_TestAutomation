package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.jupiter.api.Assertions;
import pages.LoginPage;
import pages.ResetPassPage;
import pages.ResetPassSucceedPage;
import utilities.DriverManager;

public class ResetPassSteps {
    ResetPassPage resetPassPage = new ResetPassPage(DriverManager.getDriver().driver);
    ResetPassSucceedPage resetPassSucceedPage = new ResetPassSucceedPage(DriverManager.getDriver().driver);
    LoginPage loginPage = new LoginPage(DriverManager.getDriver().driver);

    @When("I click on forgot password")
    public void clickOnForgotPassword() throws InterruptedException{
        Thread.sleep(2000);
        loginPage.clickOnForgotPassword();
    }

    @Given("I set the username text field with {string}")
    public void setUserName(String userName) throws InterruptedException {
        Thread.sleep(5000);
        resetPassPage.setUserNameTextBox(userName);
    }

    @And("I click on the Reset Password")
    public void clickOnResetPassword() throws InterruptedException {
        Thread.sleep(2000);
        resetPassPage.clickOnResetPassword();
    }

    @Then("The operation succeed message should be displayed")
    public void messageIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        resetPassSucceedPage.messageIsDisplayed();
    }
}
