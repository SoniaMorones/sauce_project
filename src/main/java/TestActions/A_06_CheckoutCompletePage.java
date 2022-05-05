package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_06_CheckoutCompletePage {

    WebDriver driver = null;

    public A_06_CheckoutCompletePage (WebDriver driver) {
        this.driver =driver;
    }

    public WebElement PurchasedCompleted () {
        return driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));

    }
}
