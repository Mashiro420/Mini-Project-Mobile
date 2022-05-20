package project.mobile.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.mobile.pages.ProductPage;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        productPage.verifyHomeTitleDisplayed();
    }

    @When("I click {string}")
    public void iClick(String buy) {
        switch (buy) {
            case "satu":
                productPage.clickBuyButton1();
                break;
            case "dua":
                productPage.clickBuyButton2();
                break;
            case "tiga":
                productPage.clickBuyButton3();
                break;
        }
    }

    @Then("I validate the {string}")
    public void iValidateThe(String result) {
        switch (result) {
            case "1":
                productPage.bubbleNumResult1();
                break;
            case "2":
                productPage.bubbleNumResult2();
                break;
            case "3":
                productPage.bubbleNumResult3();
                break;
        }
    }
}
