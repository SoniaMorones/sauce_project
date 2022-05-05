package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_04_CheckoutStepOnePage {

    WebDriver driver = null;

    public A_04_CheckoutStepOnePage (WebDriver driver) {
        this.driver=driver;
    }

    public WebElement WriteFirstName (){
        return driver.findElement(By.id("first-name"));
    }

    public WebElement WriteLastName () {
       return driver.findElement(By.id("last-name"));
    }

    public WebElement WriteZipCode () {

        return driver.findElement(By.id("postal-code"));

    }

    public WebElement ClickOnContinueButton () {

        return  driver.findElement(By.id("continue"));

    }

    public WebElement PurchaseCompleted () {
        return driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span"));
    }
}
