package project.mobile.pages;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class LoginPage extends BasePageObject {

    By loginButton(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    By fieldEmailLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    By fieldPasswordLogin(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    By buttonLoginAgain(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    By loginErrorMessage(){
        return MobileBy.AccessibilityId("Email atau password tidak valid.");
    }

    By homePage(){
        return MobileBy.AccessibilityId("Products");
    }

    public void clickLoginButton(){
        click(loginButton());
    }

    public void inputEmailLogin(String email) throws InterruptedException {
        click(fieldEmailLogin());
        Thread.sleep(3000);
        sendKeys(fieldEmailLogin(), email);
    }

    public void inputPassword(String password) throws InterruptedException {
        click(fieldPasswordLogin());
        Thread.sleep(3000);
        sendKeys(fieldPasswordLogin(), password);
    }

    public void clickAgainButtonLogin(){
        click(buttonLoginAgain());
    }

    public void verifyHomeTitleDisplayed(){
        Assertions.assertTrue(find(homePage()).isDisplayed());
    }

    public void getErrorMessage(){
        Assertions.assertTrue(find(loginErrorMessage()).isDisplayed());
    }

    public void clickLoginButtonAgain(){
        click(loginButton());
    }
}
