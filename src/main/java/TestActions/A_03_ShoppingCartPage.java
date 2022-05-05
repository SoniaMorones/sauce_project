package TestActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A_03_ShoppingCartPage {

    WebDriver driver = null;

    public A_03_ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement ShoppingCart_Click (){
        return driver.findElement(By.cssSelector(".shopping_cart_link"));

    }

    public WebElement Checkout_Button () {
        return driver.findElement(By.id("checkout"));
    }
}
