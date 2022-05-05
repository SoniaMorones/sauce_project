package Objects;

import TestActions.A_05_CheckoutStepTwoPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class B_05_CheckoutStepTwoPage {

WebDriver driver = null;
A_05_CheckoutStepTwoPage checkouts02 =null;

    public B_05_CheckoutStepTwoPage (WebDriver driver) {
        this.driver = driver;
        checkouts02 = new A_05_CheckoutStepTwoPage(driver);

}

  public void FinishButton () {

      Assert.assertTrue("Continue button was not displayed", driver.findElement(By.cssSelector("#finish")).isDisplayed());

      checkouts02.ClickFinishButton().click();


  }

}
