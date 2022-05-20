package project.mobile.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class RegisterPage extends BasePageObject {
    public String random = "";

    By loginButton(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    By linkedTextRegister(){
        return MobileBy.AccessibilityId("Register");
    }

    By fieldUsernameRegister(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    By fieldEmailRegister(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    By fieldPasswordRegister(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }

    By buttonRegisterAgain(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    By homePage(){
        return MobileBy.AccessibilityId("Products");
    }

    By fullnameErrorMessage(){
        return MobileBy.AccessibilityId("fullname can not empty");
    }

    By emailErrorMessage(){
        return MobileBy.AccessibilityId("email can not empty");
    }

    By passwordErrorMessage(){
        return MobileBy.AccessibilityId("password can not empty");
    }

    By backButton(){
        return MobileBy.AccessibilityId("Back");
    }

    public void clickLoginButton(){
        click(loginButton());
    }

    public void clickLinkedTextRegister(){
        click(linkedTextRegister());
    }

    public void inputUsernameRegister(String fullname) throws InterruptedException {
        click(fieldUsernameRegister());
        Thread.sleep(3000);
        clear(fieldUsernameRegister());
        sendKeys(fieldUsernameRegister(), fullname);
    }

    public void inputNewEmailRegister() throws InterruptedException {
        click(fieldEmailRegister());
        Thread.sleep(3000);
        clear(fieldEmailRegister());
        Faker faker = new Faker();
        random = faker.name().firstName();
        sendKeys(fieldEmailRegister(), random + "@gmail.com");
    }

    public void inputEmailRegister(String email) throws InterruptedException {
        click(fieldEmailRegister());
        Thread.sleep(3000);
        clear(fieldEmailRegister());
        sendKeys(fieldEmailRegister(), email);
    }

    public void inputPasswordRegister(String password) throws InterruptedException {
        click(fieldPasswordRegister());
        Thread.sleep(3000);
        clear(fieldPasswordRegister());
        sendKeys(fieldPasswordRegister(), password);
    }

    public void clickAgainButtonRegister(){
        click(buttonRegisterAgain());
    }

    public void verifyHomeTitleDisplayed(){
        Assertions.assertTrue(find(homePage()).isDisplayed());
    }

    public void getFullnameErrorMessage(){
        Assertions.assertTrue(find(fullnameErrorMessage()).isDisplayed());
    }

    public void getEmailErrorMessage(){
        Assertions.assertTrue(find(emailErrorMessage()).isDisplayed());
    }

    public void getPasswordErrorMessage(){
        Assertions.assertTrue(find(passwordErrorMessage()).isDisplayed());
    }

    public void clickBackButton(){
        click(backButton());
    }
}
