package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.*;
import utilities.DriverManager;
public class BuzzFeedSteps {

    DashboardPage dashboardPage = new DashboardPage(DriverManager.getDriver().driver);
    BuzzFeedPage buzzFeedPage = new BuzzFeedPage(DriverManager.getDriver().driver);
    @Then("I click on Buzz tab")
    public void clickOnBuzzTab(){
        dashboardPage.clickOnBuzzFeed();
    }
    @And("I set the message field with {string} to post")
    public void setMessageToPost(String message) throws InterruptedException {
        Thread.sleep(3000);
        buzzFeedPage.setMessage(message);
    }
    @Then("I click on Post button")
    public void clickOnPostButton() throws InterruptedException {
        Thread.sleep(3000);
        buzzFeedPage.clickOnPostButton();
    }
    @Then("The post should be displayed")
    public void isPostDisplayed() throws InterruptedException {
        buzzFeedPage.isPostDisplayed();
        Thread.sleep(3000);
    }

}
