package TestActions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_05_CheckoutStepTwoPage {

    WebDriver driver = null;

    public A_05_CheckoutStepTwoPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement ClickFinishButton() {

        return driver.findElement(By.id("finish"));


    }
}
