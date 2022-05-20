package project.mobile.pages;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import project.mobile.base.BasePageObject;

public class ProductPage extends BasePageObject {

    By homePage(){
        return MobileBy.AccessibilityId("Products");
    }

    By buyButton1(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }

    By buyButton2(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    }

    By buyButton3(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }

    By bubbleNum1(){
        return MobileBy.AccessibilityId("1");
    }

    By bubbleNum2(){
        return MobileBy.AccessibilityId("2");
    }

    By bubbleNum3(){
        return MobileBy.AccessibilityId("3");
    }

    public void verifyHomeTitleDisplayed(){
        Assertions.assertTrue(find(homePage()).isDisplayed());
    }

    public void clickBuyButton1(){
        click(buyButton1());
    }

    public void clickBuyButton2(){
        click(buyButton2());
    }

    public void clickBuyButton3(){
        click(buyButton3());
    }

    public void bubbleNumResult1(){
        Assertions.assertTrue(find(bubbleNum1()).isDisplayed());
    }

    public void bubbleNumResult2(){
        Assertions.assertTrue(find(bubbleNum2()).isDisplayed());
    }

    public void bubbleNumResult3(){
        Assertions.assertTrue(find(bubbleNum3()).isDisplayed());
    }
}
