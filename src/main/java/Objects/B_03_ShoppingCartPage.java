package Objects;

import TestActions.A_03_ShoppingCartPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class B_03_ShoppingCartPage {

    WebDriver driver = null;

    A_03_ShoppingCartPage CartPage =null;

    public B_03_ShoppingCartPage (WebDriver driver) {
        this.driver = driver;
        CartPage = new A_03_ShoppingCartPage(driver);
    }



    public void ClickOnShoppingCart () {

        CartPage.ShoppingCart_Click().click();
        Assert.assertEquals("The Shopping Cart page was not displayed", "YOUR CART", driver.findElement(By.cssSelector(".title")).getText());

    }

    public void ClickOnCheckoutButton () {
       CartPage.Checkout_Button().click();
        Assert.assertEquals("The Checkout page was not displayed", "CHECKOUT: YOUR INFORMATION", driver.findElement(By.cssSelector(".title")).getText());
    }


}
