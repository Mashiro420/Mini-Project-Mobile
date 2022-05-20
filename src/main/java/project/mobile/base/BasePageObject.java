package project.mobile.base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.mobile.driver.AndroidDriverInit;

import java.time.Duration;

public class BasePageObject {

    public AndroidDriver<AndroidElement> getDriver(){
        return AndroidDriverInit.driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 30, 1000);
    }

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public AndroidElement waitUntilClickable(By by){
        return (AndroidElement) onWait().until(ExpectedConditions.elementToBeClickable(by));
    }

    public AndroidElement waitUntilPresence(By by){
        return (AndroidElement) onWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public AndroidElement waitUntilVisible(By by){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void click(By locator){
        find(locator).click();
    }

//    public void click(By by){
//        waitUntilClickable(by).click();
//    }

    public void sendKeys(By locator, String input){
        find(locator).sendKeys(input);
    }

//    public void onType(By by CharSequence... keysToSend) {
//        waitUntilPresence(by).sendKeys(keysToSend);
//    }

    public void clear(By locator){
        find(locator).clear();
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public String getText(By locator){
        return find(locator).getText();
    }

    public void swipeHorizontal(){
        TouchAction action = new TouchAction(AndroidDriverInit.driver);
        Dimension sizeDevice = AndroidDriverInit.driver.manage().window().getSize();
        action.press(PointOption.point((int) (sizeDevice.getWidth() * 0.8), sizeDevice.getHeight()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point((int) (sizeDevice.getWidth()* 0.2), sizeDevice.getHeight()))
                .release().perform();
    }

    public void swipeVertical(){
        TouchAction action = new TouchAction(AndroidDriverInit.driver);
        Dimension sizeDevice = AndroidDriverInit.driver.manage().window().getSize();
        action.press(PointOption.point((sizeDevice.getWidth()), (int) (sizeDevice.getHeight() * 0.8)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point((sizeDevice.getWidth()), (int) (sizeDevice.getHeight() * 0.2)))
                .release().perform();
    }

    public void scrollText(String text){

    }
}
