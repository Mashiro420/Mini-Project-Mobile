package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("I click the login button")
    public void iClickALoginButton() {
        loginPage.clickLoginButton();
    }

    @When("I input {string} email")
    public void iInputEmail(String email) throws InterruptedException {
        loginPage.inputEmailLogin(email);
    }

    @And("I input {string} password")
    public void iInputPassword(String password) throws InterruptedException {
        loginPage.inputPassword(password);
    }

    @And("I click again login button")
    public void iClickAgainLoginButton() {
        loginPage.clickAgainButtonLogin();
    }

    @Then("I get the {string}")
    public void iGetThe(String result) {
        if (result.equals("home page")){
            loginPage.verifyHomeTitleDisplayed();
        } else {
            loginPage.getErrorMessage();
        }
    }

    @And("I click login button again for next test case")
    public void iClickLoginButtonAgainForNextTestCase() {
        loginPage.clickLoginButtonAgain();
    }
}
