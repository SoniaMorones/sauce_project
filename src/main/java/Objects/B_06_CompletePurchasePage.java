package Objects;

import TestActions.A_06_CheckoutCompletePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class B_06_CompletePurchasePage {

    WebDriver driver = null;
    A_06_CheckoutCompletePage CompletePurchase = null;


    public B_06_CompletePurchasePage (WebDriver driver) {

        this.driver=driver;
        CompletePurchase = new A_06_CheckoutCompletePage (driver);

    }

      public void OrderCompleted () {

        CompletePurchase.PurchasedCompleted();
           Assert.assertEquals("The purchase was not completed ",
                  "THANK YOU FOR YOUR ORDER",
                  driver.findElement(By.cssSelector(".complete-header")).getText());
      }
}
