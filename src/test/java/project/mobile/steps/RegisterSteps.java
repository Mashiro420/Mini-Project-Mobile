package project.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.RegisterPage;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    @Given("I click login button")
    public void iClickLoginButton() {
        registerPage.clickLoginButton();
    }

    @And("I click linked text register")
    public void iClickLinkedTextRegister() {
        registerPage.clickLinkedTextRegister();
    }

    @When("I input {string} username")
    public void iInputUsername(String fullname) throws InterruptedException {
        registerPage.inputUsernameRegister(fullname);
    }

    @And("I input an {string} email")
    public void iInputAnEmail(String email) throws InterruptedException {
        if (email.equals("new")){
            registerPage.inputNewEmailRegister();
        } else {
            registerPage.inputEmailRegister(email);
        }
    }

    @And("I input a {string} password")
    public void iInputAPassword(String password) throws InterruptedException {
        registerPage.inputPasswordRegister(password);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerPage.clickAgainButtonRegister();
    }

    @Then("I get {string}")
    public void iGet(String result) {
        switch (result) {
            case "home page":
                registerPage.verifyHomeTitleDisplayed();
                break;
            case "fullname can not empty":
                registerPage.getFullnameErrorMessage();
                registerPage.clickBackButton();
                break;
            case "email can not empty":
                registerPage.getEmailErrorMessage();
                registerPage.clickBackButton();
                break;
            case "password can not empty":
                registerPage.getPasswordErrorMessage();
                registerPage.clickBackButton();
                break;
        }
    }
}
