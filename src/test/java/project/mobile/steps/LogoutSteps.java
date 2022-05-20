package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.LogoutPage;

public class LogoutSteps {

    LogoutPage logoutPage = new LogoutPage();

    @Given("I click a login button")
    public void iClickALoginButton() {
        logoutPage.clickLoginButton();
    }

    @When("I input the {string} email")
    public void iInputEmail(String email) throws InterruptedException {
        logoutPage.inputEmailLogin(email);
    }

    @And("I input the {string} password")
    public void iInputPassword(String password) throws InterruptedException {
        logoutPage.inputPassword(password);
    }

    @And("I click again the login button")
    public void iClickAgainLoginButton() {
        logoutPage.clickAgainButtonLogin();
    }

    @Then("I get a result")
    public void iGetTheResult() {
        logoutPage.verifyHomeTitleDisplayed();
    }

    @And("I click logout button")
    public void iClickLoginButtonAgainForNextTestCase() {
        logoutPage.clickLogoutButton();
    }
}
